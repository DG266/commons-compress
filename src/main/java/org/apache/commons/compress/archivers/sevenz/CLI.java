/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 * Usage: archive-name [list]
 */
public class CLI {

    private static final Logger LOGGER = Logger.getLogger(CLI.class.getName());
    private static final Level LEVEL = Level.SEVERE;

    private enum Mode {
        LIST("Analysing") {
            private String getContentMethods(final SevenZArchiveEntry entry) {
                final StringBuilder sb = new StringBuilder();
                boolean first = true;
                for (final SevenZMethodConfiguration m : entry.getContentMethods()) {
                    if (!first) {
                        sb.append(", ");
                    }
                    first = false;
                    sb.append(m.getMethod());
                    if (m.getOptions() != null) {
                        sb.append("(").append(m.getOptions()).append(")");
                    }
                }
                return sb.toString();
            }

            @Override
            public void takeAction(final SevenZFile archive, final SevenZArchiveEntry entry) {
                LOGGER.info(entry.getName());
                if (entry.isDirectory()) {
                    LOGGER.info(" dir");
                } else {
                    LOGGER.info(" " + entry.getCompressedSize() + "/" + entry.getSize());
                }
                if (entry.getHasLastModifiedDate()) {
                    LOGGER.info(" " + entry.getLastModifiedDate());
                } else {
                    LOGGER.info(" no last modified date");
                }
                if (!entry.isDirectory()) {
                    LOGGER.info(" " + getContentMethods(entry));
                } else {
                    LOGGER.info("");
                }
            }
        };

        private final String message;

        Mode(final String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public abstract void takeAction(SevenZFile archive, SevenZArchiveEntry entry) throws IOException;
    }

    private static Mode grabMode(final String[] args) {
        if (args.length < 2) {
            return Mode.LIST;
        }
        return Enum.valueOf(Mode.class, args[1].toUpperCase());
    }

    public static void main(final String[] args) throws Exception {
        if (args.length == 0) {
            usage();
            return;
        }
        final Mode mode = grabMode(args);
        LOGGER.log(LEVEL, mode.getMessage(), args[0]);
        final File f = new File(args[0]);
        if (!f.isFile()) {
            LOGGER.log(LEVEL, "This file doesn't exist or is a directory");
        }
        try (final SevenZFile archive = new SevenZFile(f)) {
            SevenZArchiveEntry ae;
            while ((ae = archive.getNextEntry()) != null) {
                mode.takeAction(archive, ae);
            }
        }
    }

    private static void usage() {
        LOGGER.info("Parameters: archive-name [list]");
    }

}
