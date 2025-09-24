public class coughingMedicine extends Medication implements Service{
/** There's no reason to re-modify the medication names and price */
    private final String medicationName = "CoughMedicine";
    private final double price = 50.0;
    private final int numOfPillsPerBottle = 40;


    @Override
    public String toHeal() {
       return "Healed coughing";
    }

    //still need to consider insurance. or maybe do insurance after the final cost
     @Override
    public double getCost(){
        return this.price;
    }

     @Override
     public String getDescription() {
        return medicationName + "to help with sore throats and sneezes\n" + numOfPillsPerBottle + 
        "pills in total - take twice a day";
     }
    
}
