package it.esempio.prova;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class Controller {

    String fileName = "RunWindows.zip";

    @RequestMapping(value = "download", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> getDownload(HttpServletResponse response) throws IOException {

        // Get your file stream from wherever.
        InputStream myStream = getInputStream();

        // Set the content type and attachment header.

        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=" + fileName)
                .contentType(MediaType.parseMediaType("APPLICATION/OCTET-STREAM"))
                .body(new InputStreamResource(myStream));
    }

    private InputStream getInputStream() throws IOException {
        File file = new File("src/main/resources/RunWindows.zip");
        if (!file.exists()) {
            System.out.println("file not found");
        }
        return new FileInputStream(file);
    }
}
