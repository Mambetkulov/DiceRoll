
public class Roll extends Dice{
    int score;
    int index1 = 0;
    int index2 = 0;
    int copy;
    int number = 0;
    int count;
    int FinalPointU;
    int FinalPointC;
    int[] UserResult = new int[9];
    int[] ComputerResult = new int[9];










    public void numberFromUser (int y,int cheatY){
          count++;
          copy = y;


                 score = totalScore - Math.abs(totalScore - y) * 2;

                 System.out.println("\n"+ "on the dice fell " + totalScore + " points");
                 System.out.println("Result is " + totalScore + " - Math.abs( " + totalScore + " - " + y + " ) * 2 : " + score + " points");
                 if(cheatCopy != 1 && cheatY == 1){
                     score = score - 10;
                 System.out.println("Penalty for cheating - 10 : " + score );
                  }

                 resultS();
                 totalScore = 0;


           if(count == 2 || count==4 || count == 6){
               number += 2;
               if(count>2){ number++ ;}
              System.out.println("----------- Current score ----------- ");
                   System.out.println("User : " + UserResult[number] +
                                      " points \n" + "Computer : " + score + " points ");

               if (UserResult[number] > score) {
                   System.out.println("User is ahead by " + Math.abs(UserResult[number] - score) + " points");
               }else if (UserResult[number] == score){
                   System.out.println("draw in the game | User : " + UserResult[number] + " Computer : " + score);
               }else{
                   System.out.println("Computer is ahead by " + Math.abs(UserResult[number] - score) + " points \n");
               }
               }


      }



      public void resultS (){

          System.out.println(" ");
              if(count % 2 != 0) {
                  if(score > 0){FinalPointU += score;}
                  UserResult[index1++] = copy;
                  UserResult[index1++] = totalScore;
                  if ( index1 < 8 ){UserResult[index1++] = score;}
                  else{UserResult[index1] = score;}

              }else{
                  if(score >0){FinalPointC += score;}
                  ComputerResult[index2 ++] = copy;
                  ComputerResult[index2 ++] = totalScore;
                  if ( index1 < 8 ){ComputerResult[index2++] = score;}
                  else{ComputerResult[index2] = score;}
              }

      }



      public void ScoreTable(){
          index1 = 0;
          index2 = 0;
          count = 0;
          System.out.printf("""
                  \n---------------- Finish Game -----------------
                
                   Round  | User           | Computer
                   -------+----------------+----------------
                          |Predicted : %d   |Predicted : %d
                    - 1 - |Dice : %d        |Dice : %d
                          |Results : %d     |Results : %d
                   -------+----------------+----------------
                          |Predicted : %d   |Predicted : %d
                    - 2 - |Dice : %d        |Dice : %d
                          |Results : %d     |Results : %d
                   -------+----------------+----------------
                          |Predicted : %d   |Predicted : %d
                    - 3 - |Dice : %d        |Dice : %d
                          |Results : %d     |Results : %d
                   -------+----------------+----------------
                   Total  |Points : %d     |Points : %d
                
                """,UserResult[0],ComputerResult[0],UserResult[1],ComputerResult[1]
                   ,UserResult[2],ComputerResult[2],UserResult[3],ComputerResult[3],
                    UserResult[4],ComputerResult[4],UserResult[5],ComputerResult[5]
                   ,UserResult[6],ComputerResult[6],UserResult[7],ComputerResult[7],UserResult[8]
                   ,ComputerResult[8],FinalPointU,FinalPointC);
                    if(FinalPointC != FinalPointU) {
                        System.out.println(FinalPointU > FinalPointC ? "  User win " + Math.abs(FinalPointU - FinalPointC)
                                + " points more \n" : "Computer win " + Math.abs(FinalPointU - FinalPointC) + " points more \n");
                    }else{
                        System.out.println("Draw in the game | User : " + FinalPointU + " Computer : " + FinalPointC);
                    }
                        System.out.println("<<<<<<<<<<<<<<< END OF THE GAME >>>>>>>>>>>>>>>>>");

      }
}
