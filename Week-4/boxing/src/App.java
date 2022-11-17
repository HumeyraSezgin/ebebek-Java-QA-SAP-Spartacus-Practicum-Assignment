import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
        List<Fighter> fighters = new ArrayList<Fighter>();
        fighters.add(marc);
        fighters.add(alex);
        double randomNumber = Math.random() * 1.0;
        System.out.println(randomNumber);
        Fighter firstPlayer;
        Fighter secondPlayer;
        if (randomNumber < 0.5) {
            firstPlayer = fighters.get(1);
            secondPlayer = fighters.get(0);
        } else {
            firstPlayer = fighters.get(0);
            secondPlayer = fighters.get(1);
        }

        if (firstPlayer != null || secondPlayer != null) {
            Ring r = new Ring(firstPlayer, secondPlayer, firstPlayer.weight, secondPlayer.weight);
            r.run();
        } else {
            System.out.println("Error");
        }
    }
}
