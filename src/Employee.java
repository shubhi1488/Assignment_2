/*
WAP that would print the information of three employees by creating a class named 'Employee' .
The output should be as follows:-
name year of joining address
aman   2021  chandigarh
 */
public class Employee {
    String name;
    int year_of_joining;
    String address;

    public Employee(String name, int year_of_joining, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }
    void info(){
        System.out.println(name+  year_of_joining  +  address );
    }

    public static void main(String[] args) {
        Employee myobj=new Employee("Aman",2021,"Chandigarh");
        Employee myobj1=new Employee("Sunil",2010,"Agra");
        myobj.info();
        myobj1.info();

    }
}
