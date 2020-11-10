
package game;


public class Game {
    String name;
    int speed;
    int healthPoin;

    void run(){
        System.out.println(name +" Mau Kemana...");
        System.out.println("speed; "+ speed);
    }
    
    boolean mati(){
        if (healthPoin <= 0) return true;
        return false;
    }
    
}
