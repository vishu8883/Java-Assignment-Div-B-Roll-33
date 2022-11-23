public class fuelpoweredequipment extends equipment{

    int MaximumDays=500;
    private int usage;
    
    public void setUsage(int usage) {
        this.usage = usage;
    }
    public int getUsage() {
        return usage;
    }

    fuelpoweredequipment(String make, String model, int year, int usage) {
        super(make, model, year);
        this.usage = usage;
    }
    public  int replacementYear(){
        int replacementYear = this.MaximumDays / this.usage + super.getYear();
        return replacementYear;
    }

}