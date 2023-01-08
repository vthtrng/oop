package superclassperson;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Staff[")
                .append(super.toString())
                .append(",school=")
                .append(this.school)
                .append(",pay=")
                .append(this.pay)
                .append("]");
        return description.toString();
    }
}
