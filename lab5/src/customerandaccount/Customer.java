package customerandaccount;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(this.name)
                .append("(")
                .append(this.ID)
                .append(")");
        return description.toString();
    }
}
