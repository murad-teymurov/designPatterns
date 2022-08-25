package com.mycompany.designpatterns.factory;

public class FileExporterFactory {

    public static FileExporter getİnstance(FileType fileType){
        switch (fileType){
            case PDF:
                return new PdfExporter();
            case EXCEL:
                return new ExcelExporter();
            default:
                throw new UnsupportedOperationException();

        }

    }

    public enum FileType{
        PDF,EXCEL;
    }



}
