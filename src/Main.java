/*
  ------------------------------------------------
 | @Name DoggieDayCare                          |
 | @By Tyler Romanowski      @Created  2.17.22  |
 | @File Main.java           @Modified 3.08.22  |
 | @Comment : An Array Exercise, that handles   |
 | input, removal, indexing, and printing       |
 -----------------------------------------------
*/

import java.util.Scanner;

class Main
{
    final static int MAX_KENNEL_SIZE = 10;
    final private static Scanner intReader = new Scanner(System.in);
    final private static Scanner stringReader = new Scanner(System.in);
    final private static DoggieKennel[] kennelArray = new DoggieKennel[MAX_KENNEL_SIZE];

    //-------------------------------------------------
    // @Method  - Main
    // @Args    - String[] args
    // @Comment - Main Methods, Prints out the
    // Greetings, and the brings the code to the
    // optionsLoop
    // ------------------------------------------------
    public static void main(String[] args)
    {

        System.out.println("Hello! Welcome to Doggie Day Care \n1. Add a dog to a specific kennel number.\n2. Remove a dog from a kennel.\n3. List occupied kennel numbers \n4. Options  \n5. Exit ️");
        optionsLoop(intReader.nextInt());

    }


    //-------------------------------------------------
    // @Method  - OptionsLoop
    // @Args    - int input
    // @Pre     - Any #
    // @Comment - Gives the User a List of Options
    // ------------------------------------------------
    private static void optionsLoop(int input)
    {
        while (input != 6)
        {
            switch (input)
            {

                // Add Dog
                case 1:
                    System.out.println("\nPlease enter a kennel number from 1 to 10");
                    add(intReader.nextInt() - 1);
                    input = -1;
                    break;


                //Remove Dog
                case 2:
                    System.out.println("What Kennel is the Dog in ? ");
                    System.out.println(remove(intReader.nextInt()));
                    input = -1;
                    break;


                // Prints occupied kennels
                case 3:
                    System.out.print(printAll());
                    input = -1;
                    break;


                // Prints out the Options
                case 4:
                    System.out.println("1. Add a dog to a specific kennel number.\n2. Remove a dog from a kennel.\n3. List occupied kennel numbers along with the name & breed \n4. Options \n5. Exit");
                    input = -1;
                    break;


                // Exit
                case 5:
                    System.out.println("Thanks for Visiting, have a great day");
                    input++;
                    break;


                // Default
                default:
                    System.out.println("\nPlease select another option \n\033[3m(To Access Menu Type [4])\033[0m");
                    input = intReader.nextInt();
                    break;
            }
        }
    }

    //-------------------------------------------------
    // @Method  - add
    // @Args    - int input
    // @Pre     - Any int
    // @Comment - Adds the Dog to the kennel if the
    // selected input is not taken
    // ------------------------------------------------
    private static void add(int input)
    {

        if (!(kennelArray[input] == null))
            System.out.println("Sorry the Kennel, is Occupied, " + kennelArray[input].getName());

        else
        {
            kennelArray[input] = new DoggieKennel();
            System.out.println("Good News! The Kennel is available! \nWhat is the dog's name?");
            kennelArray[input].setName(stringReader.nextLine());
            System.out.println("What is the dog's breed?");
            kennelArray[input].setBreed(stringReader.nextLine());
            System.out.println(kennelArray[input].getName() + (" has been taken to Kennel [" + (input + 1) + "]"));
        }
    }


    //-------------------------------------------------
    // @Method  - Remove
    // @Args    - int input
    // @Pre     - Any int
    // @Comment - Removes the Dog to the kennel if the
    // selected kennel has a "Dog" in it
    // ------------------------------------------------
   private static String remove(int input)
    {
        String output = "";
        if(kennelArray[input - 1] != null)
        {
            output += "Dog Removed, " + kennelArray[input - 1];
            kennelArray[input - 1] = null;
        }
        else
            return "Oh, no. That Dog was Not Found in are System!";
        return output;

    }


    //-------------------------------------------------
    // @Method  - printAll
    // @Comment - Prints the Status of all the kennels
    // ------------------------------------------------
    private static String printAll()
    {
        int count = 0;
        String output = ("The Dogs in are Kennel Currently are \n");

        for (int i = 0; i < kennelArray.length; i++)
        {
            if (kennelArray[i] != null)
                output += "Kennel [" + (i + 1) + "] is " + (kennelArray[i]) + "\n";
            else
            {
                count++;
                output += "Kennel [" + (i + 1) + "] is Empty \n";
            }
        }

        if(count == MAX_KENNEL_SIZE)
            output = ("\nAll Kennels are Empty");
        return output;
    }
}