public class Player {
    private String Name ;
    private int total ; 
    private Dice[] dice ;

    public Player(String Name, int Count, int sides){
        this.Name= Name  ;
        this.total= 0;
        this.dice = new Dice[Count];
        for (int i = 0 ; i < this.dice.length; i++){
            this.dice[i]= new Dice(sides);
        }
    }
    public void roll(){
        for (int i =0; i<this.dice.length;i++){
            this.total += this.dice[i].roll();
        }
    }

    public void roll(int index ){
        this.total -= this.dice[index].getValue();
        this.total += this.dice[index].roll() ;
    }
    public int getTotal(){
        return this.total;
    }
    
    public void cheatRoll(){
        int lower = 0;
        // Performing Linear search on the array to find the dice with lower value (Step 1)
        for ( int i = 0 ; i < this.dice.length; i++){
            if ( this.dice[i].getValue() < this.dice[lower].getValue()){
                lower = i ;
            }
        }
        int lowVal = this.dice[lower].getValue();
        int newVal = this.dice[lower].roll();
        while (newVal <= lowVal ){
            newVal = this.dice[lower].roll(); // (Step 3)
            }
         this.total -= lowVal; // (Step 2)
         this.total += newVal ; // (Step 4)
    }

    @Override
    public String toString() {
        String s = "The player " + this.Name
             + " has " + this.dice.length
             + " dices with total: " + this.total + "\n";

        for (int i = 0; i < this.dice.length; i++) {
            s += "The dice " + i + " has "+ this.dice[i].toString() + "\n";
        }

        return s;
    }
}
