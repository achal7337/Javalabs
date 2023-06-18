import java.util.Arrays;

/**
 * @author Andriy Pavlovych
 * The class is meant to illustrate a couple of image-processing algorithms:
 * Gaussian blurring and simple edge detection
 */
public class ImageFilter{
	//TODO prevent object creation, as this is a utility class
	
	/**
	 * Method implements Gaussian blurring
	 * @param imageData array of image pixels
	 * @param width image width
	 * @param sigma parameter of the Gaussian distribution
	 */
	public static void blur (int[] imageData, int width, double sigma){
		//TODO your task is to replace this stub code with the proper implementation of the method
		//create a temporary array to store the result
		final int MAX_KERNEL_SIZE = 15;
		double kernel [] = new double [MAX_KERNEL_SIZE];
		
		for (int i = 0; i <= MAX_KERNEL_SIZE / 2 ; i++){
			kernel [MAX_KERNEL_SIZE / 2 + i] = Math.exp(-0.5 * i * i / sigma / sigma);
			kernel [MAX_KERNEL_SIZE / 2 - i] = Math.exp(-0.5 * i * i / sigma / sigma);
		}
		double kernelSum = 0;
		for (int i = 0; i < MAX_KERNEL_SIZE; i++) kernelSum += kernel [i]; //compute the sum
		for (int i = 0; i < MAX_KERNEL_SIZE; i++) kernel [i] /= kernelSum; //normalize by that sum
		System.out.println(Arrays.toString(kernel));
		
		
		int [] resultImageData = null; //TODO NO, it should not be null!
		//TODO apply convolution in one dimension

		//TODO repeat for the other dimension
		
		//TODO store the result back in the original imageData array
		//one way to store the result back 
		//System.arraycopy(resultImageData, 0, imageData, 0, imageData.length);
	}

	/**
	 * Method implements simple edge detection
	 * @param imageData imageData array of image pixels
	 * @param width image width
	 */
	public static void edgeDetection(int[] imageData, int width) {
		//TODO your task is to replace this stub code with the proper implementation of the method 
		//The code below merely demonstrates how to extract RGB pixel values from the image and how to write them them back
		for (int i=0; i<imageData.length; i++){
			int red, green, blue;
			red 	= (imageData[i] & 0x00FF0000)>>16; //try 0.0 * (imageData[i] & 0x00FF0000)>>16 here
			green 	= (imageData[i] & 0x0000FF00)>>8;
			blue 	= (imageData[i] & 0x000000FF);

		//one way to store the result back
		imageData[i] = red<<16 | green <<8 | blue;
		}
	}


}
