public abstract class equipment{
    private String make;
    private String model;
    private int purchaseYear;
    equipment(){}
    equipment(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.purchaseYear = year;
    }

   public String getMake() { 		
        return make; 	
    }  	
    public void setMake(String make) { 		
        this.make = make; 	
    }  	

    public String getModel() { 		
        return model; 	
    }	
    public void setModel(String model) { 		
        this.model = model; 	
    }  	

    public int getYear() { 		
        return purchaseYear; 	
    }  	
    public void setYear(int year) { 		
        this.purchaseYear = year; 	
    }  	 	

    public abstract int replacementYear();		
    public String showDetails() { 		
        String output = "\nMake=" + make + ", Model=" + model + ", Year=" + purchaseYear + ", Replacement Year=" + this.replacementYear(); 		
        System.out.print(output); 		
        return output; 	
    }
}