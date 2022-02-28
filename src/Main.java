import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        System.out.println("Please enter a kennel number from 1 to 10 \nOr type [-1] to Leave");

        Scanner intReader = new Scanner(System.in);
        Scanner stringReader = new Scanner(System.in);

        DoggieKennel[] kennelArray = new DoggieKennel[10];
        int input = intReader.nextInt() - 1;

        while (input >= 0 && input < 10)
        {
            if (!(kennelArray[input] == null))
            {
                System.out.print("Sorry! Kennel is occupied by " + kennelArray[input].getName());
            }
            else
            {
                kennelArray[input] = new DoggieKennel();
                System.out.println("Good News! The Kennel is available! \nWhat is the dog's name?");
                kennelArray[input].setName(stringReader.nextLine());
                System.out.println("What is the dog's breed?");
                kennelArray[input].setBreed(stringReader.nextLine());
                System.out.println(kennelArray[input].getName() + ( " has been taken to Kennel [" + (input + 1)  +"]"));
            }

            System.out.println("\nPlease enter a kennel number from 1 to 10");
            input = intReader.nextInt() - 1;
        }
        System.out.println("Thanks for Visiting, have a great day");
    }
}