package com.app;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String text = "https://www.github.com/Eduardo499";
        String filePath = "qrcode.png";

        // Gerar QR Code
        QRCodeGenerator.generateQRCodeImage(text, 350, 350, filePath);
        System.out.println("QR Code gerado com sucesso!");

        // Ler QR Code
        try {
            String result = QRCodeReader.readQRCode(new File(filePath));
            System.out.println("Texto do QR Code: " + result);
        } catch (Exception e) {
            System.err.println("Erro ao ler QR Code: " + e.getMessage());
        }

    }
}
