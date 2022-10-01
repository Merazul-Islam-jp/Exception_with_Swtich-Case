import java.util.Scanner;

public class ExcepTion {
    static Scanner user_input = new Scanner(System.in);

    static void prln(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {
        prln("Enter a value:");
        int first_number = user_input.nextInt();
        prln("Enter a oparator:");
        char oparator = user_input.next().charAt(0);
        prln("Enter a second value:");
        int second_number = user_input.nextInt();
        try {
            switch (oparator) {
                case '+':
                    prln(first_number + second_number);
                    break;
                case '-':
                    prln(first_number - second_number);
                case '*':
                    prln(first_number * second_number);
                    break;
                case '/':
                    prln(first_number / second_number);// program end..

                case '%':
                    prln(first_number % second_number);
                    break;

                default:
                    prln("please a valide number!!");
                    break;
            }

        } catch (Exception e) {
            prln(e);
        }

        prln("program end..");
    }
}
