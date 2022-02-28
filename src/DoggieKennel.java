/*
  ------------------------------------------------
 | @Name DoggieDayCare                          |
 | @By Tyler Romanowski      @Created  2.17.22  |
 | @File DoggieKennel.java   @Modified 2.28.22  |
 | @Comment : An Array Exercise, that handles   |
 | input, removal, indexing, and printing       |
 | -------------------------------------------- |
 | @Methods setName(String), setBreed(String)   |
 | getName(), getBreed()                        |
 -----------------------------------------------
*/

class DoggieKennel
{

    private String name;
    private String breed;

    DoggieKennel()
    {
        name = "";
        breed = "";
    }

    DoggieKennel(String inputName, String inputBreed)
    {
        name = inputName;
        breed = inputBreed;
    }
    void setName (String inputName)
    {
        name = inputName;
    }
    void setBreed(String inputBreed)
    {
        breed = inputBreed;
    }
    String getName()
    {
        return name;
    }
    String getBreed()
    {
        return breed;
    }
    public String toString()
    {
        return "Named, " + getName() + " Breed, "  + getBreed();
    }
}
