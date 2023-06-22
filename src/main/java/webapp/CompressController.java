package webapp;

import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;

import java.io.*;

@Controller
public class CompressController {

    @GetMapping("/")
    public String listUploadedFiles() {
        return "index";
    }

    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<Resource> compressFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam("compression-method") String compressionMethod) throws IOException, CompressorException {
        byte[] result;
        CompressorStreamFactory factory = new CompressorStreamFactory();
        String extension = "";

        if (compressionMethod.equals("gz")) {
            extension = ".gz";
        } else {
            extension = ".bz2";
        }

        try(ByteArrayOutputStream bout = new ByteArrayOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(bout);
            CompressorOutputStream cout = factory.createCompressorOutputStream(compressionMethod, out);
            InputStream in = file.getInputStream()) {

            final byte[] buffer = new byte[8192];
            int numBytes = 0;

            while (-1 != (numBytes = in.read(buffer))) {
                cout.write(buffer, 0, numBytes);
            }

            cout.close();

            result = bout.toByteArray();
        }

        ByteArrayResource compressedFile = new ByteArrayResource(result);

        return ResponseEntity.ok().
                header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getOriginalFilename() + extension  + "\"")
                .contentLength(result.length)
                .contentType(MediaType.valueOf("application/gzip"))
                .body(compressedFile);
    }

}