package accessmod;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Customer() {

    }

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
