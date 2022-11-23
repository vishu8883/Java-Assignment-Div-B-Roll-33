import java.util.Scanner;
class testMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x, y, ans;
        int i,j;
        double d=0.0;
        sc.close();

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