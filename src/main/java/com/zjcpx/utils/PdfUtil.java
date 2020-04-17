package com.zjcpx.utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PdfUtil {

	public void createHelloPDF() {
		PDDocument doc = null;
		PDPage page = null;

		try {
			doc = new PDDocument();
			page = new PDPage();
			doc.addPage(page);
			PDFont font = PDType1Font.HELVETICA_BOLD;
			PDPageContentStream content = new PDPageContentStream(doc, page);
			content.beginText();
			content.setFont(font, 12);
			content.moveTextPositionByAmount(100, 700);
			content.drawString("hello");
			
			content.endText();
			content.close();
			doc.save("d:\\pdf\\pdfwithText.pdf");
			doc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
