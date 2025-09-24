public class Vet {
    public String Name;
    public String Gender;
    public int Age;
    public String Title;
    public boolean isAvailible;

    public Vet(String name, String gender, int age, String title, boolean isAvailible){
        this.Name = name;
        this.Gender = gender;
        this.Title = title;
        this.isAvailible = isAvailible;
    }

    /**the vet needs to assign how long the pet should take the pill for in 
     * order for the owner to know if they even need refills or not */

}
