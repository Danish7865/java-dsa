//function interface
@FunctionalInterface //function interface me single method hota 
//annotetion ka use krne se compiler ke pass bhi information jata h agar koi isue ho to compile time error show krta h
interface Demo
{
    void disp();
    //void disp();
}

//this is parent class 
@Deprecated
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
}

//this is child class or subclass
class CargoPlane extends Plane
{
    //overriden method from parent class 
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("cargoplane flies low");
    }

}




public class Demo9 
{
    public static void main(String[] args) 
     {
        //object of child class
        Plane cp=new CargoPlane();
        cp.planeFliesAtGoodHeight();
    }
}
