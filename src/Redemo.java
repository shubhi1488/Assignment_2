//Regular Expressions
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Redemo {
    public static void main(String[] args){
       // String str="b%#@abcdbbb9087 &";
        //String str="the quick999999jdbc abc@gmail.com brown787878 foxx ju234523mps jdbc";
        //Pattern p=Pattern.compile("[b]+");//pattern provided here
        //Pattern p=Pattern.compile("[b]*");
        //Pattern p=Pattern.compile("[b]?");
        //Pattern p=Pattern.compile("\\s");
        //Pattern p=Pattern.compile("\\d");
        //Pattern p=Pattern.compile("\\w");
        //Pattern p=Pattern.compile("\\W");
        /*

        int ctr=0;
        Matcher m=p.matcher(str);//target string is provided here
        while(m.find())
        {
            System.out.println(m.start()+"----------"+m.end()+"---"+m.group());
            ctr++;

        }
        System.out.println("no of counts="+ctr);*/
        String str="neer";
        System.out.println(str.matches("[a-z]{4}"));
    }



}
class Stu23
{
    String name;
    boolean result;

}
