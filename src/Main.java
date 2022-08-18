import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.CompareResultWithPageOverflow;
import de.redsix.pdfcompare.PdfComparator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String expPdf = "resource\\137057-MXSW1047 OLD-AP.pdf";
        String actPdf = "resource\\137057-MXSW1047 NEW-AP.pdf";

        String resultPdf = "C:\\Users\\Admin\\Downloads\\Result.pdf";

        final PdfComparator pdfResult = new PdfComparator(expPdf, actPdf, new CompareResultWithPageOverflow());

        final CompareResult result = pdfResult.getResult();
        if (result.isNotEqual()) {
            System.out.println("Differences found!");
        }
        if (result.isEqual()) {
            System.out.println("No Differences found!");
        }
        if (result.hasDifferenceInExclusion()) {
            System.out.println("Differences in excluded areas found!");
        }
    }
    }