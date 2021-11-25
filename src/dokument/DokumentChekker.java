package dokument;

public class DokumentChekker {
    public static void main(String[] args) {
        Dokument excelDokument=new ExcelDokument();
        Dokument pdfDokument=new PdfDocument();

        excelDokument.getDescription();
        pdfDokument.getDescription();
    }
}
