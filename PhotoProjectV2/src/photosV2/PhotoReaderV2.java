package photosV2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class PhotoReaderV2 {
	public static void main(String[] args) {
		photoReaderV2("photosV2/test.jpg");
	}

	public static void photoReaderV2(String path) {
		BufferedImage img = null;
		File f = null;
		int x = 0;
		int y = 0;
		
		try {
			f = new File("photosV2/test.jpg");
			img = ImageIO.read(f);

		} catch (IOException e) {
			System.out.println("Failure from photo reader");
			System.out.println(e);
		}

		// gets the images width
		int imgWidth = img.getWidth();
		System.out.println("Width: " + imgWidth);

		// gets the images height
		int imgHeight = img.getHeight();
		System.out.println("Height: " + imgHeight);
		System.out.println();
		System.out.println();

		int pixel = img.getRGB(x, y);
		
		
		// gets the alpha values of the pixel
		int a = (pixel >> 24) & 0xFF;

		// gets the red values of the pixel
		int r = (pixel >> 16) & 0xFF;

		// gets the green values of the pixel
		int g = (pixel >> 8) & 0xFF;

		// gets the blue values of the pixel
		int b = pixel & 0xFF;
		
		do {
			for (int i = 0; i < imgWidth; i++) {
				// as of 7/25/17, assigns the ARGB values of the first pixel to every other
				// pixel thereafter...no idea why
				

				 System.out.println("x " + x);
				 System.out.println("y " + y);
				 System.out.println("red " + r);
				 System.out.println("green " + g);
				 System.out.println("blue " +b);
				 System.out.println();


				x++;

				if (x - 1 == img.getWidth()) {
					x = 0;
					y++;
				}

			}
		} while (y < img.getHeight());


	}
}