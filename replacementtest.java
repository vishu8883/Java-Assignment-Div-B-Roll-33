public class replacementtest{
    public static void main(String[] args){
            try {
                equipment standardFuelEquipment = new stdequipment("Binnings Rake","model01",2017,0.6);
                equipment standardFuelEquipments = new stdequipment("Binnings Spade","model02",2019,0.3);
                
                equipment batteryPoweredEquipment = new batterypowerequipment("Botch Mower","model03",2020,2);
                equipment batteryPoweredEquipments = new batterypowerequipment("Havana Chain Saw","model04",2019,1);
                
                equipment fuelEquipment = new fuelpoweredequipment("Nikita Edge Trimmer","ewe",2021,50);
                equipment fuelEquipments = new fuelpoweredequipment("Nikita  Trimmer","eee",2010,600);
                
                standardFuelEquipment.showDetails();
                standardFuelEquipments.showDetails();
                
                batteryPoweredEquipment.showDetails();
                batteryPoweredEquipments.showDetails();
                
                fuelEquipment.showDetails();
                fuelEquipments.showDetails();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }    
    }
}