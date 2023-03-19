package it.esempio.prova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class ProvaApplication {

    public static void main(String[] args) throws MalformedURLException {
        SpringApplication.run(ProvaApplication.class, args);
    }

}
