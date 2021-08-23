class Driver extends Account{

    public Driver(String name, String document, String password, String email) {
        super(name, document,password, email);

    }
        void PrintDataDriver(){
            System.out.println("Document: driver: " + document + "Name: driver: " + name
        + "Password: " + password + "Email: " + email);
        
        
    }
}