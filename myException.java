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