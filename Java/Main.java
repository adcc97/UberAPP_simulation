class Main{
    public static void main(String[] args){
    System.out.println("Estamos iniciando tu viaje........");
    System.out.println("Car");
    Car car = new Car("AMW123", new Account("Andrea Parra", "FRE255","anpa@gmail.com","12365"));
    car.passenger = 4;
    car.printDataCar();

    System.out.println("UberX");
    UberX UberX = new UberX("MKL185", new Account("Maria Soler", "JKLO345","maso@outlook.com", "0986"),
     "Volkswagen", "Vento");
     UberX.passenger = 6;
     UberX.printDataCar();
        }
    }

