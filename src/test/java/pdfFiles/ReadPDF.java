package pdfFiles;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.fasterxml.jackson.databind.DatabindException;

public class ReadPDF {

	public static void main(String[] args) throws IOException {

		File pdFile = new File("./data/walmart.pdf");
		// Load pdf document
		// PDDocument doc=PDDocument.load(pdfFile); //2.x version

		PDDocument doc = Loader.loadPDF(pdFile);// 3.x Version

		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String text = pdfTextStripper.getText(doc);

		doc.close();

		System.out.println(text);
	}

}
