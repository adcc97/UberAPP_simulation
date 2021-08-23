class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver,String brand, String model) {
/*Herencia en java*/ 
        super(license,driver);
        this.brand = brand;
        this.model = model;

        

        
    }
   
}
