package org.yun.mstts.demo;


import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sco = new Scanner(System.in);
                MSTTS mstts = new MSTTS();) {
            System.out.println("your text:");
            String text;
            while (sco.hasNextLine()) {
                text = sco.nextLine();
                if ("quit".equals(text) || "exit".equals(text)) {
                    break;
                }
                byte[] mp3btye = mstts.gen(text);
                System.out.println(new String(Base64.getEncoder().encode(mp3btye)));
            }
        }
    }
}
