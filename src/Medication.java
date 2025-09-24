public abstract class Medication implements Service{
    /** There's no reason to re-modify the medication names and price */
    public abstract String toHeal();
    public abstract double getCost();
    public abstract String getDescription();

    /**attributes: Appointment object? acquiredDate, expirationDate 
     * acquiredDate(), getexpirationDate();
    */

    //need to gather the date from the appointment class and then calculate when refill date is
    //public void calculateRefill();
    


    
    
}
