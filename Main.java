package MultiplicationTable;

import java.util.Scanner;

public class Main {

    static void main() {
        Scanner sc = new Scanner(System.in);
        UserInput ui = new UserInput();

        System.out.println("Choose a between 1 to 10.");

        short userInput = sc.nextShort();
        boolean VERIFICATION = (userInput < ui.MINIMUM_USER_INPUT || userInput > ui.MAXIMUM_USER_INPUT);

        while (VERIFICATION) {
            System.out.println("Choose a number between 1 to 10, please.");
            userInput = sc.nextShort();

            VERIFICATION = ((userInput < ui.MINIMUM_USER_INPUT) || (userInput > ui.MAXIMUM_USER_INPUT));
        }

        System.out.println();

        for (short i = 0; i < 11; i++) {
            short timesTable = (short) (userInput * i);
            System.out.println(userInput + " times " + i + " is: " + timesTable);
        }

        sc.close();
        System.exit(0);
    }
}
