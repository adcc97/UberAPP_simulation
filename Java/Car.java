class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
    /*Estas variables son locales al metodo car*/ 
        this.license = license;
        this.driver = driver;
        

    }
    
    void printDataCar(){
        System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenger: " + passenger + " Email: " + driver.email);
    }
        
}
