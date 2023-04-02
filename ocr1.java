
import java.io.File;
  
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class ocr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Tesseract tesseract = new Tesseract();
        try {
  
            tesseract.setDatapath("C:\\Users\\Lenovo\\Downloads\\Tess4J\\tessdata");
  
            // the path of your tess data folder
            // inside the extracted file
            String text
                = tesseract.doOCR(new File("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\Tess4J\\\\tessdata\\\\image.jpg"));
  
            // path of your image file
            System.out.print(text);
        }
        catch (TesseractException e) {
            e.printStackTrace();
	}

}
}