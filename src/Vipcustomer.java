public class Vipcustomer {
    private String name;
    private int creditLimit;
    private String email;

    public Vipcustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Vipcustomer(String name, String email) {
        this(name,95,email);
    }

    public Vipcustomer() {
        this("Akash",100,"Akash@gmail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
