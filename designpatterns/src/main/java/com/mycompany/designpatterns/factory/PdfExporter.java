package com.mycompany.designpatterns.factory;

 class PdfExporter implements FileExporter{
    @Override
    public  String export(String content) {
        return "PDF ->"+content;
    }
}
