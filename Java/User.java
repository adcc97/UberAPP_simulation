class User extends Account{
    public User(String name, String document, String password,String email) {
        super(name, document, password, email);


    }

    void PrintDataUser(){
        System.out.println("Document: driver: " + document + "Name: driver: " + name
        + "Password: " + password + "Email: " + email);
    }
}