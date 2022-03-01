package bank.test.entities;

public class Client {

    private Long id;

    private String firstname;

    private String lastname;

    public Client(){
        this.id = 1L + (long) (Math.random() * (10L - 1L));
    }

    public Client(String firstname, String lastname) {
        this.id = 1L + (long) (Math.random() * (10L - 1L));
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
