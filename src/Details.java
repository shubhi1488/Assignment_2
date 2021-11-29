//access modifiers and getter and setter method.....
public class Details {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Details myobj=new Details();
        myobj.setName("Shubhi");
        System.out.println(myobj.getName());
        myobj.setAge(20);
        System.out.println(myobj.getAge());
    }
}

