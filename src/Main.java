import java.util.Scanner;
import java.util.Random;
public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String YNResponse="";
        boolean done = false;
        boolean done1 = false;
        boolean done2=false;
        Random rnd = new Random();


        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            System.out.println("Now starting Craps GOOD LUCK!");
            int firstSum = die1+die2;
            System.out.println("your first role was "+firstSum);




             if (firstSum == 7){
                System.out.println("your roll was a natural! : "+firstSum);

            }
            else if (firstSum == 2){
                System.out.println("Bad luck! your roll was: "+firstSum);
            }
            else if (firstSum == 3){
                System.out.println("Bad luck! your roll was: "+firstSum);
            }
            else if (firstSum == 12){
                System.out.println("Bad Luck! Your roll was: "+firstSum);
            }
            else if (firstSum==11){
                do{
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done1=true;

                    }
                    else if (sum2==11){
                        System.out.println("you win! you rolled a "+sum2+" twice!");
                        done1=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }

                }while (!done1);
            }

            else if (firstSum==10){
                do{
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done1=true;

                    }
                    else if (sum2==10){
                        System.out.println("you win! you rolled a "+sum2+" twice!");
                        done1=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }

                }while (!done1);
            }
            else if (firstSum==9 ){
                do{
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done1=true;

                    }
                    else if (sum2==9){
                        System.out.println("you win! you rolled a "+sum2+" twice!");
                        done1=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }

                }while (!done1);
            }
            else if (firstSum==8){
                do{
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done1=true;

                    }
                    else if (sum2==8){
                        System.out.println("you win! you rolled a "+sum2+" twice!");
                        done1=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }

                }while (!done1);
            }
            else if (firstSum == 6){
                do{
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done1=true;

                    }
                    else if (sum2==6){
                        System.out.println("you win! you rolled a "+sum2+" twice!");
                        done1=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }

                }while (!done1);
            }
            else if (firstSum == 5){
                System.out.println("you rolled "+firstSum+ " you will now roll again until either a 7 or a "+firstSum);
                do {
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done2=true;

                    }
                    else if (sum2==5){
                        System.out.println("you win! you rolled a "+sum2);
                        done2=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }


                }while(!done2);
            }


            else if (firstSum ==4)
            {
                System.out.println("You rolled "+firstSum+ " you will now roll again until either a 7 or a "+firstSum);
                do {
                    int die4 = rnd.nextInt(6) + 1;
                    int die5 = rnd.nextInt(6) + 1;
                    int sum2 = die4+die5;
                    if (sum2 == 7){
                        System.out.println("You lose! You rolled a "+ sum2);
                        done1=true;

                    }
                    else if (sum2==4){
                        System.out.println("you win! you rolled a "+sum2);
                        done1=true;
                    }
                    else{
                        System.out.println("You rolled a "+sum2 +" so we will roll again");
                    }





                }while (!done1);


            }
            System.out.print("do you want to play again");
            YNResponse = in.nextLine();
            if (YNResponse.equalsIgnoreCase("N")){
                done = true;
            }



        }while (!done);

    }
}
