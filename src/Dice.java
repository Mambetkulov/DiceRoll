public class Dice extends Cheating {
   static int totalScore ;






    public void dicePrint (int x){

        totalScore += x;
     switch(x){
                 case 1 :{
             System.out.println("""     
                                 ____________
                                 |          |
                                 |    #     |
                                 |          |
                                 |__________|""");
                           break;
                 }
                 case 2 :{
             System.out.println("""     
                                 ____________
                                 |    #     |
                                 |          |
                                 |    #     |
                                 |__________|""");
                           break;
                 }
                 case 3 :{
             System.out.println("""     
                                 ____________
                                 |    #     |
                                 |    #     |
                                 |    #     |
                                 |__________|""");
                           break;
                 }
                 case 4 :{
             System.out.println("""     
                                 ____________
                                 | #      # |
                                 |          |
                                 | #      # |
                                 |__________|""");
                            break;
                 }
                 case 5 :{
             System.out.println("""     
                                 ____________
                                 | #      # |
                                 |    #     |
                                 | #      # |
                                 |__________|""");
                            break;
                 }
                 case 6 :{
             System.out.println("""     
                                 ____________
                                 | #      # |
                                 | #      # |
                                 | #      # |
                                 |__________|""");
                            break;
                 }

     }
    }
}
