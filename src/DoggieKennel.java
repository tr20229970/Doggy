class DoggieKennel
{

    String name = "";
    String breed = "";

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
        return "Name, " + name + " Breed, "  + breed;
    }
}
