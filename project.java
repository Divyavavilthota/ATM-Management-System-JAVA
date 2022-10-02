
import java.util.*;

public class project {
    public static void main(String args[]) {
        int pin=123;
        System.out.println("ATM");
        System.out.println("insert your ATM card");
        System.out.println(
                "Hi!,pls do not remove your chip card . Leave your card inserted during the entire transaction: ");
        System.out.println("pleae select your language:");
        Scanner s = new Scanner(System.in);
        System.out.println("1.English");
        int n = s.nextInt();
        System.out.println("enter the pin:");
        int y = s.nextInt();
        if (y == pin) {
            int totalamount = 100000;
            float withdraw, deposit;
            System.out.println("1.Account balance");
            System.out.println("2. withdraw");
            System.out.println("3.deposit");
            System.out.println("choose an option in which u want to perform :");
            int z = s.nextInt();
            switch (z) {
                case 1: {
                    System.out.println("balance=" + totalamount);
                    break;
                }
                case 2: {
                    System.out.println("enter the amount:");
                    withdraw = s.nextInt();
                    if (withdraw <= totalamount) {
                        System.out.println("your account balance: " + (totalamount - withdraw));
                    } else {
                        System.out.println("oops something went wrong!");
                    }
                    break;

                }
                case 3: {
                    System.out.println("enter the amount ");
                    deposit = s.nextInt();
                    System.out.println("ur balence is" + (totalamount + deposit));
                    break;
                }
            }
        } 
        else 
        {
            System.out.println("incorrect pin");
        }
    }

}
