import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1,num2,num3;

        Scanner number=new Scanner(System.in);

        System.out.println("Number1 giriniz:");
        num1=number.nextInt();
        System.out.println("Number2 giriniz:");
        num2=number.nextInt();
        System.out.println("Number3 giriniz:");
        num3=number.nextInt();

        if(num1<num2 && num1<num3)
        {
            if (num2<num3)
            {
                System.out.println("num1<num2<num3");
            }else
            {
                System.out.println("num1<num3<num2");
            }
        }
        else if(num2<num1 && num2<num3)
        {
            if(num1<num3)
            {
                System.out.println("num2<num1<num3");
            }
            else
            {
                System.out.println("num2<num3<num1");
            }
        }
        else
        {
            if(num1<num2)
            {
                System.out.println("num3<num1<num2");
            }
            else
            {
                System.out.println("num3<num2<num1");
            }
        }
        }
    }
