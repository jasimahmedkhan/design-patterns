package BehaviourPatterns.MomentoPattern.GameExample;

public class Main {

    public static void main(String[] args) {

        GameSession game = new GameSession();

        // You're playing
        game.Level = 5;
        game.Points = 3000;
        game.PowerUps.add("Shield");
        System.out.println(game.Level+ " " + game.Points + " " + game.PowerUps);

        // Save before boss fight
        GameMemento checkpoint = game.saveState();  // 💾 Save point create

        // Fight boss - things go badly
        game.Level = 6;
        game.Points = 1500;  // Lost points
        game.PowerUps.remove("Shield");  // Lost shield
        System.out.println(game.Level+ " " + game.Points + " " + game.PowerUps);

        // You died - load last save
        game.loadState(checkpoint);  // 🔄 Load save file
        System.out.println(game.Level+ " " + game.Points + " " + game.PowerUps);
    }


}

