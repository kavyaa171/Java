///Shallow Copy and Deep Copy
//package src.com;
public class Customer{
    public String name = "swiggy";
    public String address = "";
    public int age = 0;
    public int yob = 0;
    public Customer(String name, String address, int age, int yob){
        this.name = name;
        this.address = address;
        this.age = age;
        this.yob = yob;
    }
    public Customer(Customer customer){

        this.age = customer.age;
    }
    public static void main(String args[]){
        Customer yash = new Customer("Kavya","Pendurthy",22,11062002);
        System.out.println(yash.age);
        yash.age = 10;
        System.out.println(yash.age);
    }
}
