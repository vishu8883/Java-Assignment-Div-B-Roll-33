public class stdequipment extends equipment{
    int MaximumRetention=7;
    private double durability;
    
    public double getDurability() {
        return durability;
    }
    public void setDurability(double durability) throws Exception {
        if (durability <= 0 || durability > 1)
            throw new Exception("Durability cannot be 0 or less or greater than 1");
        else    
            this.durability = durability;
     }

    stdequipment(String make, String model, int year, double durability) throws Exception{
        super(make, model, year);
        if (durability <= 0 || durability > 1)
            throw new Exception("Durability cannot be 0 or less or greater than 1");
        else
            this.durability = durability;
    }

    public int replacementYear() {
        int replacementYears = MaximumRetention * (int)Math.round(durability) + super.getYear();
        return replacementYears;
    }
}