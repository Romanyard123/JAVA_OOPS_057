public class Main {
    public static void main(String[] args) {
        //Create sara with 2 dices each having 6 sides .
        Player player = new Player("Sara",2,6);

        player.roll() ; //Die 1 = 3 Die 2 = 2 Random values
        System.out.println(player);
        System.out.println("Initial Total : "+ player.getTotal());

        System.out.println("================\n");

        player.roll(1);
        System.out.println(player);
        System.out.println("new total : " + player.getTotal());

        System.out.println("================\n");

        player.cheatRoll();
        System.out.println(player);
        System.out.println("total after cheating : " + player.getTotal());

        System.out.println("================\n");

    }
}
