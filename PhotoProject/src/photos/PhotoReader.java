package photos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import pictureObj.Pixel;

public class PhotoReader {
	private static Charset UTF8 = Charset.forName("UTF-8");

	public static void main(String[] args) throws IOException {

		photoReader("photos/test.jpg");

	}

	public static void writesPhotosValueToFile(ArrayList<Pixel> listOfPixels) throws IOException {

		PrintWriter writer = new PrintWriter("outputfiles/test.txt", "UTF8");
//		System.out.println("Hello from writer method " + listOfPixels.size());
		int i = 0;
		try {
			for (int j = 0; j < listOfPixels.size(); j++) {
				writer.print(listOfPixels.get(i));
				writer.println();
				i++;
			}
		} finally {
			writer.close();
		}

	}

	public static void photoReader(String path) {
		ArrayList<Pixel> listOfPixels = new ArrayList<>();
		BufferedImage img = null;
		File f = null;
		int x = 0;
		int y = 0;

		// reads the image
		try {
			f = new File("photos/test.jpg");
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

		// gets the pixels...theoretically. And creates new pixel object on
		// every iteration...again theoretically
		do {
			for (int i = 0; i < img.getWidth(); i++) {
				// as of 7/25/17, assigns the ARGB values of the first pixel to every other
				// pixel thereafter...no idea why
				Pixel p = null;
				p = new Pixel();

				p.setAlpha(a);
				p.setBlue(b);
				p.setGreen(g);
				p.setRed(r);
				p.setxCoordinate(x);
				p.setyCoordinate(y);
				
				
				 System.out.println("Pixel values at X Y: " + x + "," + y);
				 System.out.println("alpha " + a);
				 System.out.println("red " + r);
				 System.out.println("green " + g);
				 System.out.println("blue " + b);
				 System.out.println();

				listOfPixels.add(p);

				x++;

				if (x - 1 == img.getWidth()) {
					x = 0;
					y++;
				}

			}
		} while (y < img.getHeight());

		try {
			writesPhotosValueToFile(listOfPixels);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}