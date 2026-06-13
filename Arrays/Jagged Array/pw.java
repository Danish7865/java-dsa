public class pw 
{
    public static void main(String[] args) 
    {
        int num[][]=new int[3][];
        num[0]= new int[4];
        num[1]=new int[2];
        num[2]=new int[3];
        num[0][0]=4;
        num[0][1]=6;
        num[0][2]=7;
        num[0][3]=8;
        num[1][0]=9;
        num[1][1]=10;
        num[2][0]=7;
        num[2][1]=8;
        num[2][2]=9; 
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
         System.out.println(" ");
        int nums[][]={
                        {5,8,7,4,5,5},
                        {5,2},
                        {7,4,6},
                        {5}
                     };
        for(int i=0; i<=3; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                System.out.print(nums[i][j] +" ");
            }
           System.out.println();
        }
    }
}
