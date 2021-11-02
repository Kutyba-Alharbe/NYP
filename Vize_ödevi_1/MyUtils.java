
package javaHomework;

public class MyUtils {
    
    
    // Üçgen çevresi 
    public static float trianglePerimeter(float a, float b, float c)
    {
        return a + b + c;
    }
    
    // Üçgen alanı
    // Kenar uzunlukları bilinen bir üçgenin alanını hesaplama.
    public static float triangleArea(float a, float b, float c)
    {
        
        float s = (a + b + c) / 2;
        float temp = s*(s - b)*(s - b)*(s - c);
        return (float) Math.sqrt(temp); 
    }
   
  
    
    public static float polygonPerimeter(float a, float b, float c, float d)
    {
        return a + b + c + d;
    }
    public static float polygonPerimeter(float a, float b, float c, float d, float e)
    {
        return a + b + c + d + e;
    }
    public static float polygonPerimeter(float a, float b, float c, float d, float e, float f)
    {
        return a + b + c + d + f;
    }
     public static float polygonPerimeter(float a, float b, float c, float d, float e, float f, float g)
    {
        return a + b + c + d + f + g;
    }
     
    public static float polygonArea(float sideLength, int sideNumber)
    {
       float temp = sideNumber * (sideLength*sideLength);
       float area = temp / (4 * (float)Math.tan(Math.PI / sideNumber));
       
       return area;
    }
   
    
    private static double getFirstFunctionResult(double x)
    {
        return 3 * x*x - 2 * Math.exp(x) + Math.sqrt(x);
    }
    
   
    private static double getSecondFunctionResult(double x)
    {
        return 1 / (1 + Math.exp(x));
    }
     
 
    public static double [] functionsResult(int [] array)
    {
        // result dizisi; fonkisyon sonçları saklamak için.
        // [i].index 1.fonkisyon, [i].index 2.fonksiyon sonucu şekilinde
        double [] result = new double[array.length*2];
        int index = 0;
        for(int i = 0; i < array.length; i ++)
        {
            result[index] = getFirstFunctionResult(i);
            index += 2;
        }
        
        index = 1;
         for(int i = 1; i < array.length; i ++)
        {
            result[index] = getSecondFunctionResult(i);
            index += 2;
        }
        return result;
    }
    
    
}
