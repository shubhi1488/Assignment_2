/*
WAP to accept gender and age from command line arguements and print the percentage of interest based ont he given
conditions:-
if gender==Female and age is between 1 and 58 the percenatge is 8.2%
if gender== Feamle and age is between 59 and 100 the percenatge is 9.2%
if gender ==Male and age is between 1 and 58 the percenatge is 8.4%
if gender==male and age is between 59 and 100 the percenatge is 10.5%
 */
import java.util.Objects;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your gender");
        String gender=sc.next();
        System.out.println("enter your age");
        int age=sc.nextInt();
        if((Objects.equals(gender, "Female"))&(age>=1 && age<=58))
            System.out.println("Simple interest is:8.2%");
        else if((Objects.equals(gender, "Female"))&(age>=59&&age<=100))
            System.out.println("Simple interest is:9.2%");
        else if((Objects.equals(gender, "Male"))&(age>=1&&age<=58))
            System.out.println("Simple interest is:8.4%");
        else if((Objects.equals(gender, "Male"))&(age>=59&&age<=100))
            System.out.println("Simple interest is:10.5%");
        else
            System.out.println("wrong information");


    }
}
