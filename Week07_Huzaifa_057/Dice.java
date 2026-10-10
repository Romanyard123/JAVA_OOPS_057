import java.util.*;
public class Dice{
    private int sides ;
    private int value ; 
    Random rng = new Random();

    public Dice(int sides){
        if ( sides < 2 ){
            throw new IllegalArgumentException("Dice should have atleast 2 sides");
        }
        this.sides = sides ;
        this.value = 0 ; 
    }
    public int roll(){
        return this.value = rng.nextInt(1,this.sides+1) ;
    }
    public int rollAssignment(){
        this.value= (int)(this.sides* Math.random())+1;
        return this.value ;
    }

    public int getSides(){
        return this.sides;
    }
    public int getValue(){
        return this.value ;
    }

    public String toString(){
        return " Number of Sides "+ this.sides+
               " Value " + this.value ;
    }
}