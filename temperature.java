import java.util.Scanner;
public class temperature
{
    double c,f,k;
 void input()
 {
     Scanner ab=new Scanner(System.in);
     System.out.println("*****************TEMPERATURE CONVERTOR*********************");
     System.out.println("ENTER TEMPERATURE IN(CELSIUS) : ");
      c=ab.nextDouble();
 }
 void faren()
 {
      f=(c*1.8)+32;
 }
 void kel()
 {
    k=c+23.15; 
 }
 void display()
 {
     System.out.println("-------------TEMPERATURE IN CELCIUS-------------- : "+c);
     System.out.println("---------------------------------------------------------");
     System.out.println("-------------TEMPERATURE IN FAHRENHEIT-------------- : "+f);
     System.out.println("-------------TEMPERATURE IN KELVIN-------------- : "+k);
 }
 public static void main(String args[])
 {
     temperature obj=new temperature();
     obj.input();
     obj.faren();
     obj.kel();
     obj.display();
 }
}