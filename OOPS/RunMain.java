//package OOPS;
//import OOPS.src.com.Customer;
public class RunMain{
    private int t = 30;
    public int print(){
        int x = 10;
        return 0;
    }
    public static void main(String args[]){
        Customer c = new Customer("Neeru","Delhi",17,01062007);
        System.out.println(c.age);
        Customer b = c; //Shallow Copy
        c.age = 80;
        System.out.println(b.age);
        Customer d = new Customer(b);   //Deep Copy
        b.age = 50;
        System.out.println(b.age);
        System.out.println(d.age);
    }
} 
