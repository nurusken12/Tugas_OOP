
package game;


public class user {
        
    public static void main(String[] args) {
        Game adaapa = new Game();
        adaapa.name = "Amin";
        adaapa.speed = 389;
        adaapa.healthPoin = 0;
        
        adaapa.run();
        if (adaapa.mati()){
            System.out.println("Mau Ngapain");
        }
    }
}
