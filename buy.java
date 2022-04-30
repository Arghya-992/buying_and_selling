import java.util.*;
public class buy{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int bats = 10;
        int balls = 10;
        int helmets = 10;

        while(true){
            System.out.println("Welcome to Batters - the best cricket equipment store around! Please press 1 to purchase, 2 to wholesale, 3 to see our stock and 4 to exit.");
            int user = sc.nextInt();

            switch(user){
                case 1:
                System.out.println("What do you want to purchase?");
                System.out.println("Number of bats in stock are: "+bats);
                System.out.println("Number of balls in stock are: "+balls);
                System.out.println("Number of helmets in stock are: "+helmets);
                System.out.println("Press a to buy bat, b to buy ball, and c to buy helmet");
                String user1 = sc.next();

                if (user1.equals("a")){
                    if (bats<=10 & bats > 0){
                        bats=bats-1;
                        System.out.println("You have successfully bought a bat.");
                    }}
                     else if (user1.equals("b")){
                        if (balls<=10 & balls > 0){
                        balls=balls-1;
                        System.out.println("You have successfully bought a ball.");
                    }}
                    else if (user1.equals("c")){
                        if (helmets<=10 & helmets >0){
                            helmets=helmets-1;
                            System.out.println("You have successfully bought a helmet.");
                        } }
                     break;

                    case 2: 
                    System.out.println("You want to wholesell. Please input a to sell bat, b to sell ball, c to sell helmet. ");
                    String user2=sc.next();
                    
                    if(user2.equals("a")){
                      if(bats<=10 & bats>0){
                          bats=bats+1;
                          System.out.println("You have successfully sold a bat to us.");
                      } else if(user2.equals("b")){
                          if(balls<=10 & balls>0){
                              balls = balls +1;
                              System.out.println("You have successfully sold a ball to us.");
                          } else if(user2.equals("c")){
                              if(helmets<=10 & helmets>0){
                                  helmets = helmets +2;
                                  System.out.println("You have successfully sold a helmet to us.");
                              }
                          }
                      }
                    } break;
                    case 3:
                    System.out.println("The number of bats left in our stock are:"+bats);
                    System.out.println("The number of bats left in our stock are:"+balls);
                    System.out.println("The number of bats left in our stock are:"+helmets);
                    break;

                    case 4:
    System.exit(0);
    default:
    System.out.println("Please enter a valid number");
            }
        }
    }
}