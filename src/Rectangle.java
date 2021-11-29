/*
WAP to print the area of rectangle having sides (4,5) and (5,8) respectively by creating a class
named "Rectangle" with two instance variable length and breadth and a method named 'Area' which returns
the area . Initialize the object attributes by taking the input from the user in the constructor.
 */
public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void Area(){
        int area=length*breadth;
        System.out.println("area of length: "+length+" and breadth "+breadth+" is: "+area);
    }

    public static void main(String[] args) {
        Rectangle myobj=new Rectangle(4,5);
        Rectangle obj2=new Rectangle(5,8);
        myobj.Area();
        obj2.Area();
    }
}
