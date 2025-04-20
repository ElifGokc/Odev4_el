public class Employee {
    public String name;
    public String lastName;
    public int age;
    public long phone;

    Employee(String name, String lastName, int age, long phone) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.phone=phone;

    }
    public void yazdir(){
        System.out.println("Employee name is:"+ name);
        System.out.println("Employee last name is:"+ lastName);
        System.out.println("Employee age:"+ age);
        System.out.println("Employee phone number:"+ phone);
    }


}
