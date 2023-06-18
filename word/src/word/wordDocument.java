package word;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import org.apache.poi.xwpf.usermodel.*;

public class wordDocument {
    public static void main(String[] args) {
        // create a new Word document
        XWPFDocument doc = new XWPFDocument();

        // set the start and end dates
        Calendar start = Calendar.getInstance();
        start.set(2022, 8, 7); // September is month 8 in Java's Calendar class
        Calendar end = Calendar.getInstance();
        end.set(2023, 3, 6); // April is month 3 in Java's Calendar class

        // iterate through the dates and add a new page for each date
        Calendar current = (Calendar) start.clone();
        while (current.compareTo(end) <= 0) {
            // add a new page
            doc.createParagraph().setPageBreak(true);

            // add the date and "Session" text
            XWPFParagraph paragraph = doc.createParagraph();
            paragraph.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run1 = paragraph.createRun();
            run1.setText(current.get(Calendar.DAY_OF_MONTH) + " "
                    + current.getDisplayName(Calendar.MONTH, Calendar.LONG, Calendar.SHORT) + " "
                    + current.get(Calendar.YEAR));
            XWPFRun run2 = paragraph.createRun();
            run2.setText("\nSession");

            // increment the current date by one day
            current.add(Calendar.DAY_OF_MONTH, 1);
        }

        // save the document
        try (FileOutputStream out = new FileOutputStream("dates.docx")) {
            doc.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
