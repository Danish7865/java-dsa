enum Result1
{
    PASS, FAIL, NR;
}

public class Demo8 
{
    public static void main(String[] args) 
    {
        Result1 res=Result1.PASS;
        switch (res) 
        {
            case PASS:System.out.println("Passed!");
            break;
            case FAIL:System.out.println("Failed!");
            break;
            case NR:System.out.println("No Result!");
            break;
        
            default:
            break;
            //enum aur switch ek sath kam kar skte h
        }
    }
}
