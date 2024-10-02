public class NumberExplosion {
    public static void main(String[] args) {
        int randomNumber;
        Game number = new Game("Number Explosion Game", 2);
        while ((number.getScore() > 9) == false){
            System.out.println("Player 1's turn");
            randomNumber = (int) Math.random()* 10 + 1;
            System.out.println("Player 1 got " + randomNumber);
            number.increaseScore(randomNumber);
            System.out.println("Current Score: " + number.getScore());

            if(number.getScore() > 9) {
                System.out.println("Player 1 lost");
            }

            else{
                System.out.println("Player 2's turn");
                randomNumber = (int) Math.random()* 10 + 1;
                System.out.println("Player 2 got " + randomNumber);
                number.increaseScore(randomNumber);
                System.out.println("Current Score: " + number.getScore());
                if(number.getScore() > 9) {
                    System.out.println("Player 2 lost");
                }
            }
     
        }
    }
}
