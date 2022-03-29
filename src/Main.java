/*
  ------------------------------------------------
 | @Project DoggieDayCare                       |
 | @By Tyler Romanowski      @Created  2.17.22  |
 | @File Main.java           @Modified 3.21.22  |
 | @P-Comment : An Array Exercise, that handles |
 | input, removal, indexing, and printing       |
 |----------------------------------------------|
 | @Comment: The Runner class for DoggieDaycare |
 | handles the menu, user input, adding,        |
 | removing, and listing occupied kennels.      |
 | Along with that it also handles invalid      |
 | detection, and overall manipulation of the   |
 | array in witch the dog information is stored |
 | The main purpose of this class is to inform  |
 | the user, and allow multiplication of the    |
 | array in a user simplified approach          |
 ------------------------------------------------

*/

import java.util.Scanner;

class Main
{

    final static int MAX_KENNEL_SIZE = 10;
    final private static Scanner intReader = new Scanner(System.in);
    final private static Scanner stringReader = new Scanner(System.in);
    final private static Dog[] kennelArray = new Dog[MAX_KENNEL_SIZE];

    
    //-------------------------------------------------
    // @Method  - Main
    // @Args    - String[] args
    // @Comment - Main Methods, Prints out the
    // Greetings, and the brings the code to the
    // optionsLoop
    // ------------------------------------------------
    public static void main(String[] args)
    {

        System.out.print("Hello! Welcome to Doggie Day Care \n" +
                "1. Add a dog to a specific kennel number.\n" +
                "2. Remove a dog from a kennel.\n" +
                "3. List occupied kennel numbers & dog info \n" +
                "4. Options  \n" +
                "5. Exit\n" +
                "Input? ");
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
        while (input != -999)
        {
            switch (input)
            {

                // Add Dog
                case 1:
                    System.out.println("\nPlease enter a kennel number from 1 to 10");
                    System.out.print(add(intReader.nextInt() - 1));
                    input = -1;
                    break;


                //Remove Dog
                case 2:
                    System.out.println("What Kennel is the Dog in? ");
                    System.out.println(remove(intReader.nextInt() - 1));
                    input = -1;
                    break;


                // Prints occupied kennels
                case 3:
                    System.out.print(printAll());
                    input = -1;
                    break;


                // Prints out the Options
                case 4:
                    System.out.println("" +
                            "1. Add a dog to a specific kennel number.\n" +
                            "2. Remove a dog from a kennel.\n" +
                            "3. List occupied kennel numbers & dog info \n" +
                            "4. Options \n" +
                            "5. Exit");
                    input = -1;
                    break;


                // Exit
                case 5:
                    System.out.println("Thanks for Visiting, have a great day");
                    input = -999;
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
    private static String add(int input)
    {
        if(input >= MAX_KENNEL_SIZE || input < 0)
        {
            return "Invalid Input";
        }

        if (!(kennelArray[input] == null))
            return "Sorry the Kennel, is Occupied" + kennelArray[input];


        kennelArray[input] = new Dog();
        System.out.println("Good News! The Kennel is available! \nWhat is the dog's name?");
        kennelArray[input].setName(stringReader.nextLine());
        System.out.println("What is the dog's breed?");
        kennelArray[input].setBreed(stringReader.nextLine());
        return kennelArray[input] + (" has been taken to Kennel [" + (input + 1) + "]");

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
        if(input >= MAX_KENNEL_SIZE || input < 0)
            return "Not A Valid Index";
        if(kennelArray[input] == null)
            return "Oh, no. There is no Dog in the Kennel!";

        String output = "";

        output += "Dog Removed, " + kennelArray[input ];
        kennelArray[input] = null;

        return output;

    }


    //-------------------------------------------------
    // @Method  - printAll
    // @Post - returns the current state of all the
    // kennels
    // @Comment - Prints the Status of all the kennels
    // ------------------------------------------------
    private static String printAll()
    {
        int count = 0;
        String output = "The Dogs in the Kennel Currently :  \n";

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
            return "\nAll Kennels are Empty";

        return output;
    }
}
