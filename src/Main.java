
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomDice = new Random();
        Dice dice = new Dice();
        Roll roll = new Roll();
        Cheating cheat = new Cheating();


        for (int j = 1; j <= 3; j++) {

            System.out.println("<<<<<<<<<< SRART GAME >>>>>>>>>>>>\n");
            System.out.println("predict the amount of points (2 ... 12) ");
            System.out.println("User rolls the dice");
            int scanNumber = scanner.nextInt();
            System.out.println("do you want to cheat (1 - yes | 0 - no)");
            int choice2 = scanner.nextInt();


            if (scanNumber < 2) {
                System.err.println("not less than 0 and not great than 12");
                break;
            } else if (scanNumber > 12) {
                System.err.println("not less than 0 and not great than 12");
                break;
            }

            if (choice2 == 1) {
                cheat.Cheat(scanNumber);
            }

            if (choice2 == 1 && cheat.cheat == 1) {
                System.out.println(" 😈 User successfully cheated 😈");
                dice.dicePrint(cheat.ChangeDice);
                dice.dicePrint(cheat.ChangeDice2);
                roll.numberFromUser(scanNumber, choice2);
            }

            if (choice2 != 1 || cheat.cheat != 1) {
                for (int i = 0; i < 2; i++) {
                    int x = randomDice.nextInt(1, 7);
                    dice.dicePrint(x);
                }
                roll.numberFromUser(scanNumber, choice2);
            }

        Computer(dice, roll, cheat);
        if (j == 3) {
            roll.ScoreTable();
        }
    }
    }



    public static void Computer(Dice a, Roll b , Cheating c ){
        Random ran = new Random();
        int ComputerChoice = ran.nextInt(1,3);
        int ranNum = ran.nextInt(2,13);
        System.out.println("computer predicted : " + ranNum + "\n" + "Computer rolls the dice");

         if (ComputerChoice == 1){c.Cheat(ranNum);}

        if(ComputerChoice == 1 && c.cheat == 1) {
            System.out.println("😈Computer successfully cheated😈");
            a.dicePrint(c.ChangeDice );
            a.dicePrint(c.ChangeDice2);
            b.numberFromUser(ranNum,ComputerChoice);
        }

        if (ComputerChoice != 1 || c.cheat != 1){
            for (int i = 0; i < 2; i++) {
                a.dicePrint(ran.nextInt(1, 7));
            }

        b.numberFromUser(ranNum,ComputerChoice);
    }

        }
    }