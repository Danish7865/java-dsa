import java.util.*;
import java.io.*;
public class RotationMatrix 
{
      public static void rotatedMatrix(int[][]arr)
      {
        //transpose the 2d arrays
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<m; i++)
        {
            for(int j=i; j<n; j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Step2: Swap the left and right side elements
        for(int i=0; i<n; i++)
        {
            int li=0;
            int ri=n-1;

            while(li<ri)
            {
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;

                li++;
                ri--;
            }
        }
      }
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,2,4,6},
            {5,8,9,6},
            {8,7,9,5},
            {14,5,41,4}
        };
        rotatedMatrix(arr);
        System.out.println("Rotation Matrix");
        for(var mat:arr)
        {
            System.out.println(Arrays.toString(mat));
        }
    }
}
