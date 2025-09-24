public class inflammationMedicine extends Medication implements Service{
    /** There's no reason to re-modify the medication names and price */
    private final String medicationName = "Inflammmation Medicine";
    private final double price = 100.0;
    private final int numOfPillsPerBottle = 30;


    @Override
    public String toHeal() {
       return "Healed inflammation";
    }

    //still need to consider insurance. or maybe do insurance after the final cost
    @Override
    public double getCost(){
        return this.price;
    }

    @Override
    public String getDescription(){
        return medicationName + "to help with burning sensations and ripped tissues\n" 
        + numOfPillsPerBottle + "pills in total - take twice a day";
    }


}
