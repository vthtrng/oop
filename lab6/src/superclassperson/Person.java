package superclassperson;

public class Person {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Person[name=")
                .append(this.name)
                .append(",address=")
                .append(this.address)
                .append("]");
        return description.toString();
    }
}
