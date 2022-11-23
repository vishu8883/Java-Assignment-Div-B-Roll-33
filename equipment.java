abstract class Equipment{
    // abtract class ka object nhi bana sakte matlabh it cannot be instantiated
    String make, model;
    int purchaseYear;
    double rYear;

    public Equipment(){ }

    public Equipment(String x, String y, int z){
        this.make = x;
        this.model = y;
        this.purchaseYear = z;
    }


    // Setters are also known as Mutators.
    // Getters are also known as Accessors.
    public void setMake(String x){ 
        this.make = x;
    }
    public String getMake(){
        return this.make;
    }
    public void setModel(String x){
        this.model = x;
     }
    public String getModel(){ 
        return this.model;
    }
    public void setPurchaseYear(int x){
        this.purchaseYear = x;
     }
    public int getPurchaseYear(){ 
        return this.purchaseYear;
    }
    public abstract double replacementYear(); 
    // abstract method ko body nhi hoe sakti hence no curly braces ^

    public String showDetails(){
        return this.make+"\t"+this.model+"\t"+this.purchaseYear+"\t"+this.rYear;
     }
    
}

class BatteryPoweredEquipment extends Equipment{
    private int warranty;
    
    public BatteryPoweredEquipment(){
        
     }

    public BatteryPoweredEquipment(String w, String x, int y, int z){
    this.make = w;
    this.model = x;
    this.purchaseYear = y;
    // sending parameters to super class ka constructor
    this.warranty = z;
    }

    public double replacementYear(){
        try{
        rYear = this.warranty + super.purchaseYear;
            if(rYear<0||rYear==0||rYear>1){
                throw new BatteryPoweredEquipmentReplacementException();
            }
            else{
                System.out.println("rYear = "+rYear);
            }
        }
        catch(BatteryPoweredEquipmentReplacementException e3){
            System.out.println(e3);
        }
        return rYear;
    }

    public void setWarranty(int x){
        this.warranty=x;
     }

    public int getWarranty(){
        return this.warranty;
     }
}

class FuelPoweredEquipment extends Equipment{
    private int usage;
    int MaximumDays=500;

    public FuelPoweredEquipment(){ }

    public FuelPoweredEquipment(String w, String x, int y, int z){
    this.make = w;
    this.model = x;
    this.purchaseYear = y;
    this.usage = z;
    }

    public double replacementYear(){
        rYear = (this.MaximumDays/this.usage) + super.purchaseYear;
        return rYear;
    }

    public void setUsage(int x){
        this.usage = x;
    }
    public int getUsage(){
        return this.usage;
    }

}

class StandardEquipment extends Equipment{
    private double durability;
    int maximumRetention=7;

    public StandardEquipment(){ }

    public StandardEquipment(String w, String x, int y, int z){
    this.make = w;
    this.model = x;
    this.purchaseYear = y;
    this.durability = z;
    }

    public double replacementYear(){
        try{
        rYear = (this.maximumRetention*this.durability) + super.purchaseYear;
            if(rYear<0||rYear==0||rYear>1){
                throw new StandardEquipmentReplacementException();
            }
            else{
                System.out.println("rYear = "+rYear);
            }
        }
        catch(StandardEquipmentReplacementException e4){
            System.out.println(e4);
        }
        return rYear;
    }

    public void setDurability(double x){
        this.durability = x;
    }

    public double getDurability(){
        return this.durability;
    }
}

