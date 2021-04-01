package myMallProject;

public class Program {
    public static void main(String[] args) {
        Mall mall = new Mall();
        mall.name = "MyMall";
        mall.location = "Yerevan, Komitas";
        mall.taxPayerID = "12345";
        mall.floorCount=3;
        Employee employee1 = new Employee();
        employee1.setName("Ani Vardanyan");
        employee1.getName();
        employee1.setAge(20);
        employee1.getAge();
        employee1.setMale(false);
        employee1.isMale();
        employee1.setPosition("Sales Manager");
        employee1.getPosition();
        employee1.setAddress("Baghramyan");
        employee1.getAddress();
        employee1.setPhoneNumber("091919191");
        employee1.getPhoneNumber();
        employee1.setSalaryInDram(309000);
        employee1.getSalaryInDram();

        Employee employee2 = new Employee();
        employee2.setName("Armen Margaryan");
        employee2.getName();
        employee2.setAge(25);
        employee2.getAge();
        employee2.setMale(true);
        employee2.isMale();
        employee2.setPosition("Sales Assistant");
        employee2.getPosition();
        employee2.setAddress("Arshakunyats");
        employee2.getAddress();
        employee2.setPhoneNumber("095959595");
        employee2.getPhoneNumber();
        employee2.setSalaryInDram(205000);
        employee2.getSalaryInDram();

        Employee employee3 = new Employee();
        employee3.setName("Martin Mirzoyan");
        employee3.getName();
        employee3.setAge(21);
        employee3.getAge();
        employee3.setMale(true);
        employee3.isMale();
        employee3.setPosition("Sales Assistant");
        employee3.getPosition();
        employee3.setAddress("Mashtots");
        employee3.getAddress();
        employee3.setPhoneNumber("093939393");
        employee3.getPhoneNumber();
        employee3.setSalaryInDram(235000);
        employee3.getSalaryInDram();

        Employee employee4 = new Employee();
        employee4.setName("Liana Tovmasyan");
        employee4.getName();
        employee4.setAge(27);
        employee4.getAge();
        employee4.setMale(false);
        employee4.isMale();
        employee4.setPosition("Sales Assistant");
        employee4.getPosition();
        employee4.setAddress("Halabyan");
        employee4.getAddress();
        employee4.setPhoneNumber("077757575");
        employee4.getPhoneNumber();
        employee4.setSalaryInDram(155000);
        employee4.getSalaryInDram();

    }
}