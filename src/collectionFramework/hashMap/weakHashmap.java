package collectionFramework.hashMap;

import javax.imageio.ImageWriter;

import java.util.WeakHashMap;

public class weakHashmap {
	public static void main(String[] args) {
		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		/*
		 * an entry in a weakHashMap will already be removed when its key is no longer
		 * in ordinary use
		 */

		// making non-literal keys :
		/*
		 * String k1 = new String("Image 1"); String k2 = new String("Image 2");
		 */

		// img1 and img2 are strong referenced since the keys are string literals and
		// are stored in String pool , and literals (string) are strong referenced
		// throughout the program. java will keep these literals in the memory even
		// though they are not being utilised.

		imageCache.put(new String("Image 1"), new Image("Image 1"));
		imageCache.put(new String("Image 1"), new Image("Image 2"));

		System.out.println(imageCache);

		simulatApplicationRunning();
		System.gc();
		System.out.println("Cache after running(some entries may be cleared) : " + imageCache);
	}

	private static void simulatApplicationRunning() {
		try {
			System.out.println("Simulation application running...");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Image {
	private String name;

	public Image(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Image : {" + "name='" + name + '\'' + '}';
	}
}
