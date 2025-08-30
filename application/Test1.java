import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Welcome to food app");
        System.out.println("Please Create a password:");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("your password is:" + pass1);

        System.out.println("Please enter your password:");
        String pass2 = scan.next();

        while (!pass2.equals(pass1)) {
            System.out.println("Wrong Password. Please Retry");
            pass2 = scan.next();

        }
        System.out.println("Access Granted");
        System.out.println("Are you hungry?");
        String ans1 = scan.next();
        if (ans1.equalsIgnoreCase("yes") || (ans1.equalsIgnoreCase("Yes")) || (ans1.equalsIgnoreCase("y"))
                || (ans1.equalsIgnoreCase("Y"))) {
            System.out.println("Choose what you want to eat between pizza , burger or momo");
            String ans2 = scan.next();

            while (!ans2.equals("pizza") && (!ans2.equals("burger")) && (!ans2.equals("momo"))) {
                System.out.println("Sorry we do not have " + ans2);
                System.out.println("Choose between Pizza, burger and momo");
                ans2 = scan.next();

            }
            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("momo")) {
                System.out.println("Do you want something to drink?(Y/y/N/n)");
                String ans3 = scan.next();
                while ((!ans3.equalsIgnoreCase("Y")) || (!ans3.equalsIgnoreCase("n")) || (!ans3.equalsIgnoreCase("y"))
                        || (!ans3.equalsIgnoreCase("N"))) {
                    System.out.println("Wrong input. Please enter again:");
                    ans3 = scan.next();

                }
                if (ans3.equals("y") || (ans3.equals("Y"))) {
                    System.out.println(
                            "What would you like to have?(Coke/Juice/Water)[Enter J for Juice and C for Coke and W for water]:");
                    String ans4 = scan.next();
                    while (!ans4.equals("C") || (!ans4.equals("c")) || (!ans4.equals("J")) || (!ans4.equals("j"))
                            || (!ans4.equals("W")) || (!ans4.equals("w"))) {
                        System.out.println("Sorry we dont have " + ans4);
                        System.out.println("Choose between coke or juice or water(c/j/w):");
                        ans4 = scan.next();

                    }

                }
            }
            // if(ans2.equalsIgnoreCase("pizza") || ans2.equalsIgnoreCase("Pizza") ||
            // ans2.equalsIgnoreCase("P") || ans2.equalsIgnoreCase("p")){
            // System.out.println("Would you like cheese Burst?(Y/y):");
            // String ans3=scan.next();

        }

        else {
            System.out.println("Alright. Have a good time");
        }

    }
}