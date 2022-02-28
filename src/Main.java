import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {

        Scanner intReader = new Scanner(System.in);
        Scanner stringReader = new Scanner(System.in);

        DoggieKennel[] kennelArray = new DoggieKennel[10];


        System.out.println("Hello! Welcome to Doggie Day Care \uD83D\uDC3E\n1. Add a dog to a specific kennel number.\n2. Remove a dog from a kennel.\n3. List occupied kennel numbers along with the name & breed\n4. Options \n5. Exit");

        int input = intReader.nextInt();

        while (input != 6)
        {
            switch (input)
            {
                case 1:
                    System.out.println("\nPlease enter a kennel number from 1 to 10");
                    add(kennelArray, stringReader, intReader.nextInt() - 1);
                    input = -1;
                    break;
                case 2:
                    System.out.print("What Dog would you like to remove?");
                    if (remove(kennelArray, stringReader.nextLine()))
                        System.out.println("Dog was removed ");
                    else
                        System.out.println("Oh, no. That Dog was Not Found in are System!");
                    input = -1;
                    break;
                case 3:
                    System.out.print(printAll(kennelArray));
                    input = -1;
                    break;
                case 4:
                    System.out.println("1. Add a dog to a specific kennel number.\n2. Remove a dog from a kennel.\n3. List occupied kennel numbers along with the name & breed \n4. Options \n5. Exit");
                    input = -1;
                    break;
                case 5:
                    System.out.println("Thanks for Visiting, have a great day");
                    input++;
                    break;
                default:
                    System.out.println("\nPlease select another option \n\033[3m(if you are not sure press [4])\033[0m");
                    input = intReader.nextInt();
                    break;
                }


            }




    }

    private static void add(DoggieKennel[] inputArray, Scanner stringReader, int input)
    {

        if (!(inputArray[input] == null))
        {
            System.out.println("Sorry the Kennel, is Occupied, " + inputArray[input].getName());
        } else
        {
            inputArray[input] = new DoggieKennel();
            System.out.println("Good News! The Kennel is available! \nWhat is the dog's name?");
            inputArray[input].setName(stringReader.nextLine());
            System.out.println("What is the dog's breed?");
            inputArray[input].setBreed(stringReader.nextLine());
            System.out.println(inputArray[input].getName() + (" has been taken to Kennel [" + (input + 1) + "]"));
        }
    }
   private static boolean remove(DoggieKennel[] inputArray, String name)
    {
        for (int i = 0; i < inputArray.length - 1; i++)
        {
            if (!(inputArray[i] == null) && inputArray[i].getName().equals(name))
            {
                inputArray[i] = null;
                return true;
            }
        }
        return false;
    }

    private static String printAll(DoggieKennel[] inputArray)
    {

        String output = "The Dogs in are Kennel Currently are \n";

        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] != null)
                output += "Kennel [" + (i + 1) + "] is " + inputArray[i] + "\n";
            else
                output +=  "Kennel [" + (i + 1) + "] is Empty \n";
        }
        return output;
    }
}