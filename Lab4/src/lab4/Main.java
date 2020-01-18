package lab4;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        cal.Multiply();
        cal.Add(2, 2);
        System.out.println("Result : "+cal.oddEven());
        System.out.println("Grade :"+cal.Grade(50, 30,  90, 80));
    }
    
}
