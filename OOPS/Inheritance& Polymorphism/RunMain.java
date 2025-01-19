import java.util.*;
public class RunMain{
    public static void main(String[] args){
        //bird1
        //Eagle g = new Eagle("beeee","Boo","Yellow");
        //g.fly();
        //bird2
        //Penguin p = new Penguin();
        //Polymorphism comes into Picture.

        Bird g = new Eagle("Beeee","Beaked","Black");
        Bird p = new Penguin();
        List<Bird> birds = new ArrayList<>();
        birds.add(g);
        birds.add(p);
        BirdManagerClass bi = new BirdManagerClass();
        bi.flyAllBirds(birds);
    } 
}
