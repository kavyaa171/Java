public class Eagle extends Bird{
    public String beak;
    public String color;
    public void fly(){//Method Overriding
        System.out.println("eagle is flying");
    }
    public Eagle(String name, String beak,String color){
        super(name,beak); //gives error without calling Bird constructor bcz a default constructor will be cakking. If the Bird class doesn't have a default constructor then error.
        this.color = color;
    }

}
