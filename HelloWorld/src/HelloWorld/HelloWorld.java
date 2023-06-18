package HelloWorld;

import java.util.Arrays;

public class HelloWorld
	{   
    
	

		public static float[] ProgramB (int n) {
            float r = 1.0f;
            int k = 1;
            int i =0;
            float[] arr1;
            float[] arr2;
            arr1 = new float[50];
            arr2 = new float[50];
         
             while ( k < n ) {
                r = r * k / ( k + 1);
                k = k + 1;
                arr1[i]=r;
                arr2[i]=k;
                i= i+1;
                }
        return arr1;
       //return arr2;
        
        
}
		public static float[] Program (int n) {
            float r = 1.0f;
            int k = 1;
            int i =0;
            float[] arr1;
            float[] arr2;
            arr1 = new float[50];
            arr2 = new float[50];
         
             while ( k < n ) {
                r = r * k / ( k + 1);
                k = k + 1;
                arr1[i]=r;
                arr2[i]=k;
                i= i+1;
                }
       // return arr1;
       return arr2;
        
        
}
public static void main(String[] args){
   System.out.println(Arrays.toString(ProgramB(15)));
   System.out.println(Arrays.toString(Program(15)));
}
}
