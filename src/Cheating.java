import java.util.Random;

public class Cheating {
    Random random = new Random();
    int numbersForR = 3;
    int countMethod;
    int cheat;
    int ChangeDice;
    int score;
    int ChangeDice2;
    static int cheatCopy;









    public void Cheat (int score) {
        this.score = score;
        countMethod ++;


        if (countMethod <= 2) {
            cheat = random.nextInt(1, numbersForR);
            cheatCopy = cheat;

                if (score % 2 == 0 && cheat == 1) {
                    ChangeDice = score / 2;
                    ChangeDice2 = ChangeDice;
                } else if(cheat == 1) {
                    ChangeDice = (score - 1) / 2;
                    ChangeDice2 = ChangeDice + 1;
                }


        } else if (countMethod <=  4) {

            numbersForR = 5;
            cheat = random.nextInt(1, numbersForR);
            cheatCopy = cheat;
                if ( score % 2 == 0 && cheat == 1) {
                    ChangeDice = score / 2;
                    ChangeDice2 = ChangeDice;
                } else if (cheat == 1){
                    ChangeDice = (score - 1) / 2;
                    ChangeDice2 = ChangeDice + 1;
                }


        } else {
            numbersForR = 7;
            cheat = random.nextInt(1, numbersForR);
            cheatCopy = cheat;
                if (score % 2 == 0 && cheat == 1) {
                    ChangeDice = score / 2;
                    ChangeDice2 = ChangeDice;
                } else if (cheat == 1) {
                    ChangeDice = (score - 1) / 2;
                    ChangeDice2 = ChangeDice + 1;
                }


        }


    }
}
