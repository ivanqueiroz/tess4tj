package com.ivanqueiroz.tess4tj.app;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;

public class LerImagem {

    public static void main(String[] args) throws IOException {
        File imageFile = new File("./src/main/resources/teste.png");
        Tesseract tess4j = new Tesseract();
        tess4j.setDatapath("/usr/share/tesseract-ocr/4.00/tessdata");
        tess4j.setLanguage("por");
        try {
            String result = tess4j.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }

}
