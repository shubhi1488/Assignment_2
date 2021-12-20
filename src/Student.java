
//encapsulation- This tells us that we can wrap the code and data together by declaring the variables as private
//and just by using getter and setter method.
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.setName("shubhi");
        System.out.println(obj.getName());
    }
}
