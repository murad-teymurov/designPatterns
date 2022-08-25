package com.mycompany.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
       String file = FileExporterFactory.getİnstance(FileExporterFactory.FileType.PDF)
               .export("test content");

        System.out.println(file);
    }
}
