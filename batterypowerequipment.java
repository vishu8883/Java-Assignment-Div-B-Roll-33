public class batterypowerequipment extends equipment {
    private int warranty;

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty)throws Exception {
        if(warranty<=0){
            throw new Exception("warranty cannot be 0 or less");
        }else{
            this.warranty = warranty;
        }
    }

    batterypowerequipment(String make, String model, int year, int warranty)throws Exception {
        super(make,model,year);
        if(warranty<=0){
            throw new Exception("warranty cannot be 0 or less");
        }else{
            this.warranty = warranty;
        }
    }

    public int replacementYear(){
        int replacementYear = this.warranty + super.getYear();
        return replacementYear;
    }
}