package labTest;

public class SignalProcessing {



public static double [] autoCorrelation(double [] signal) {
	double count;
	double[] newArray = new double[signal.length];
	for(int i = 0; i<signal.length;i++) {
		count =0;
		for(int j = 0;j<signal.length;j++) {
			count += signal[j]*signal[(i+j)%signal.length];
		}
		newArray[i] = count;
	}
	return newArray;
}

public static double rms(double [] signal) {
	double count = 0;
	for(int i = 0; i<signal.length;i++) {
		count += signal[i]*signal[i];
	}
	double result =  count/signal.length;
	double answer = Math.sqrt(result);
	return answer;
	
}







}
