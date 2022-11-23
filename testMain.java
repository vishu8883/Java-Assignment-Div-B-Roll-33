import java.util.Scanner;

class testMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x, y, ans;
        int i,j;
        double d=0.0;
       

        BatteryPoweredEquipment bp1 = new BatteryPoweredEquipment(); 
        BatteryPoweredEquipment bp2 = new BatteryPoweredEquipment(); 
        
        System.out.println("Enter brand : ");
        x = sc.next();
        System.out.println("Enter model : ");
        y = sc.next();
        System.out.println("Enter Purchase Year : ");
        i = sc.nextInt();
        System.out.println("Enter Purchase Warranty : ");
        j = sc.nextInt();
        

        bp1.setMake(x);
        bp1.setModel(y);
        bp1.setPurchaseYear(i);
        bp1.setWarranty(j);
        d=bp1.replacementYear();
        System.out.println("d="+d);
        ans=bp1.showDetails();
        System.out.println(ans);

        System.out.println("Enter brand : ");
        x = sc.next();
        System.out.println("Enter model : ");
        y = sc.next();
        System.out.println("Enter Purchase Year : ");
        i = sc.nextInt();
        System.out.println("Enter Purchase Warranty : ");
        j = sc.nextInt();

        bp2.setMake(x);
        bp2.setModel(y);
        bp2.setPurchaseYear(i);
        bp2.setWarranty(j);
        d=bp2.replacementYear();
        System.out.println("d="+d);
        ans=bp2.showDetails();
        System.out.println(ans);


        FuelPoweredEquipment fp1 = new FuelPoweredEquipment();
        FuelPoweredEquipment fp2 = new FuelPoweredEquipment();
        
        System.out.println("Enter brand : ");
        x = sc.next();
        System.out.println("Enter model : ");
        y = sc.next();
        System.out.println("Enter Purchase Year : ");
        i = sc.nextInt();
        System.out.println("Enter Usage : ");
        j = sc.nextInt();

        fp1.setMake(x);
        fp1.setModel(y);
        fp1.setPurchaseYear(i);
        fp1.setUsage(j);
        d=fp1.replacementYear();
        System.out.println("d="+d);
        ans=fp1.showDetails();
        System.out.println(ans);

        System.out.println("Enter brand : ");
        x = sc.next();
        System.out.println("Enter model : ");
        y = sc.next();
        System.out.println("Enter Purchase Year : ");
        i = sc.nextInt();
        System.out.println("Enter Usage : ");
        j = sc.nextInt();

        fp2.setMake(x);
        fp2.setModel(y);
        fp2.setPurchaseYear(i);
        fp2.setUsage(j);
        d=fp2.replacementYear();
        System.out.println("d="+d);
        ans=fp2.showDetails();
        System.out.println(ans);
        

        StandardEquipment s1 = new StandardEquipment();
        StandardEquipment s2 = new StandardEquipment();
        double k;

        System.out.println("Enter brand : ");
        x = sc.next();
        System.out.println("Enter model : ");
        y = sc.next();
        System.out.println("Enter Purchase Year : ");
        i = sc.nextInt();
        System.out.println("Enter Durability : ");
        k = sc.nextDouble();

        s1.setMake(x);
        s1.setModel(y);
        s1.setPurchaseYear(i);
        s1.setDurability(k);
        d=s1.replacementYear();
        System.out.println("d="+d);
        ans=s1.showDetails();
        System.out.println(ans);

        System.out.println("Enter brand : ");
        x = sc.next();
        System.out.println("Enter model : ");
        y = sc.next();
        System.out.println("Enter Purchase Year : ");
        i = sc.nextInt();
        System.out.println("Enter Durability : ");
        k = sc.nextDouble();

        s2.setMake(x);
        s2.setModel(y);
        s2.setPurchaseYear(i);
        s2.setDurability(k);
        d=s2.replacementYear();
        System.out.println("d="+d);
        ans=s2.showDetails();
        System.out.println(ans);
    }
}
    
abstract class Equipment{

    String make, model;
    int purchaseYear;
    double rYear;

    public Equipment(){ }

    public Equipment(String x, String y, int z){
        this.make = x;
        this.model = y;
        this.purchaseYear = z;
    }



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

class StandardEquipmentReplacementException extends Exception{
    public String toString(){
        return "Standard Equipment's Warranty has expired!!!";
    }
}
class BatteryPoweredEquipmentReplacementException extends Exception{
    public String toString(){
        return "Battery Powered Equipment's warranty has expired!!!";
    }

}