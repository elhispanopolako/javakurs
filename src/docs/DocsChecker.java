package docs;

import dokument.Dokument;
import dokument.ExcelDokument;
import dokument.PdfDocument;

public class DocsChecker {
    public static void main(String[] args) {
        Dokument doke=new ExcelDokument();
        Dokument dokp=new PdfDocument();
        doke.getDescription();
        dokp.getDescription();

    }
}
