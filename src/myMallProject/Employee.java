package myMallProject;

public class Employee {
    private String name;
    private int age;

    private boolean isMale;
    private double salaryInDram;
    private String position;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getSalaryInDram() {
        return salaryInDram;
    }

    public void setSalaryInDram(double salaryInDram) {
        this.salaryInDram = salaryInDram;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //   Role role;  global in which shop works

}

