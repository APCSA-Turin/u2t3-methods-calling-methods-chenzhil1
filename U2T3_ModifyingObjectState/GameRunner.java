// public class GameRunner {
//     public static void main(String[] args) {
//         Game monopoly = new Game("monopoly", 4);
//         System.out.println(monopoly.getScore());
//         System.out.println(monopoly.getPlayers());
//         System.out.println(monopoly.isGameOver());
//         monopoly.addPlayer();
//         monopoly.addPlayer();
//         monopoly.increaseScore(8);
//         System.out.println(monopoly.getScore());
//         System.out.println(monopoly.getPlayers());
//         System.out.println(monopoly.isGameOver());
//         System.out.println(monopoly.averageScorePerPlayer());
//         monopoly.increaseScore(4);
//         System.out.println(monopoly.getScore());
//         System.out.println(monopoly.getPlayers());
//         System.out.println(monopoly.isGameOver());
//         System.out.println(monopoly.averageScorePerPlayer());
//     }
// }

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Dodge Ball", 5);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- UPDATING STATE OF GAME -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(8);
        game.increaseScore(3);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isGameOver());
    }
}
