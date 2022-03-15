/*
  ------------------------------------------------
 | @Project DoggieDayCare                       |
 | @By Tyler Romanowski      @Created  2.17.22  |
 | @File Dog.java            @Modified 2.28.22  |
 | @P-Comment : An Array Exercise, that handles |
 | input, removal, indexing, and printing       |
 | -------------------------------------------- |
 | @Methods setName(String), setBreed(String)   |
 | getName(), getBreed()                        |
 |--------------------------------------------- |
 | @Comment Dog class, creates a new dog, and   |
 | stores its name and Breed.                   |
 -----------------------------------------------
*/

class Dog
{

    private String name;
    private String breed;

    Dog()
    {
        name = "";
        breed = "";
    }


    Dog(String inputName, String inputBreed)
    {
        name = inputName;
        breed = inputBreed;
    }


    //-------------------------------------------------
    // @Method  - setName
    // @Args    - String inputName
    // @Pre     - Any String
    // @Comment - Sets the Name
    // ------------------------------------------------
    void setName (String inputName)
    {
        name = inputName;
    }


    //-------------------------------------------------
    // @Method  - setBreed
    // @Args    - String inputName
    // @Pre     - Any String
    // @Comment - Sets the Breed
    // ------------------------------------------------
    void setBreed(String inputBreed)
    {
        breed = inputBreed;
    }


    //-------------------------------------------------
    // @Method  - setBreed
    // @Post    - Returns Name
    // @Comment - Returns the Name
    // ------------------------------------------------
    String getName()
    {
        return name;
    }


    //-------------------------------------------------
    // @Method  - getBreed
    // @Post    - Returns Breed
    // @Comment - Returns the Breed
    // ------------------------------------------------
    String getBreed()
    {
        return breed;
    }

    //-------------------------------------------------
    // @Method  - toString
    // @Post    - Returns String with Obj information
    // @Comment - Returns the Dogs Name & Breed
    // ------------------------------------------------
    public String toString()
    {
        return " Named: (" + getName() + ") Breed: ("  + getBreed() +")";
    }
}
