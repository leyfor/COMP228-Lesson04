import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Person person = new Person(1.0);
        String prompt;
        do {
            System.out.println("Please Make a Selection");
            System.out.println("-------------------");
            System.out.println("1. Enter Your Age");
            System.out.println("2. Exit");
            System.out.println("-------------------");
            Scanner input = new Scanner(System.in);
            prompt = input.nextLine();
            switch (prompt) {
                case "1":
                    setAge(person);
                    break;
                case "2":
                    break;

            }

            clearConsole();
        } while (!prompt.equals("2"));


    }

    // Set person's age
    private static void setAge(Person person) {
        while (!person.getIsValid()) {

            Scanner input = new Scanner(System.in); // create input scanner

            System.out.println("Please enter your age: ");
            person.setAge(input.nextLine());

            if (person.getIsValid()) {
                System.out.println(person.toString());
            } else {
                System.out.println();
            }

        }
    }


    // Clear console
      private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }

        } catch (final Exception e) {
            // TODO: handle exception
        }
    }

}
