package pdfFiles;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class CreatePDF {

	public static void main(String[] args) throws IOException {
		// create new pdf document
		PDDocument doc = new PDDocument();
		// create a new page
		PDPage page = new PDPage(PDRectangle.A4);

		doc.addPage(page);

		// create content stream
		PDPageContentStream contentStream = new PDPageContentStream(doc, page);

		// Font & Size
		PDType1Font font = new PDType1Font(Standard14Fonts.FontName.HELVETICA);
		contentStream.setFont(font, 20);
		contentStream.beginText();
		contentStream.newLineAtOffset(50, 700);
		contentStream.showText("Hello, Welcome to pdf box...");
		contentStream.endText();
		contentStream.close();

		// save pdf document
		doc.save("./data/sampleFile.pdf");
		doc.close();
		System.out.println("PDF created successfully.......");

	}
}
