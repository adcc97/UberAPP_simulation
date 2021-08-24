class Main{
    public static void main(String[] args){
    System.out.println("Estamos iniciando tu viaje........");
    System.out.println("Car");
    // Car car = new Car("AMW123", new Account("Andrea Parra", "FRE255","anpa@gmail.com","12365"));
    // // car.passenger = 4; se eliminaron porque se hizo encapsulamiento en Car
    // car.printDataCar();

    System.out.println("UberVan");
    // UberX UberX = new UberX("MKL185", new Account("Maria Soler", "JKLO345","maso@outlook.com", "0986"),
    //  "Volkswagen", "Vento");
    //  UberX.setPassenger(4);
    //  //  UberX.passenger = 6;
    //  UberX.printDataCar();

    UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123","anhe@outlook.com","8765"));
     uberVan.setPassenger(6);
     uberVan.printDataCar();

        }
    }

