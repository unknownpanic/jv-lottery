package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] arrayOfBalls = new Ball[3];

        for (int i = 0; i < arrayOfBalls.length; i++) {
            arrayOfBalls[i] = lottery.getRandomBall();
            System.out.println(arrayOfBalls[i].toString());
        }
    }
}
