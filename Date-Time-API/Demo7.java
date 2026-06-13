enum Result
{
    PASS, FAIL,NR;
    //public static final Result PASS=new Result();one
    //public static final Result FAIL=new Result();two
    //public static final Result NR=new Result();three time constructor call
    // enum ke under veriable method constructor are allow
    int marks;
    Result()
    {
        System.out.println("Constructor in Enum");
    }
    void setMarks(int marks)
    {
        this.marks=marks;
    }
    int getMarks()
    {
        return marks;
    }
}



public class Demo7 
{
    public static void main(String[] args) 
    {
        Result.PASS.setMarks(50);
        int m1=Result.PASS.getMarks();
        System.out.println(m1);

        int m2=Result.FAIL.getMarks();
        System.out.println(m2);

        Result.NR.setMarks(45);
        int m3=Result.NR.getMarks();
        System.out.println(m3);
    }
}
