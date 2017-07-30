package ONcodebasic;

import java.util.Scanner;

public class bai4 {
    private static void GiaiPTB2(int a, int b, int c)
    {
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                    System.out.println("Vo so nghiem");
                else
                    System.out.println("pt Vo nghiem");
            }
            else
            {
                System.out.println("pt co 1 ngiem duy nhat la x= "+ (float)(-c/b));
            }
        }
        else
        {
            double delta = Math.pow(b, 2)-4*a*c;
            double x1,x2;
            if(delta<0) System.out.println("Vo nghiem roi!");
            else if(delta>0)
            {
                x1=(-b-Math.sqrt(delta))/(2*a);
                x2=(-b+Math.sqrt(delta))/(2*a);
                System.out.println("x1= "+ x1);
                System.out.println("x2= "+ x2);
            }
            else
                System.out.println("Phuong trinh co nghiem kep: x1=x2= "+(-b/(2*a)));
        } 
    }
    public static void main(String[] args)
    {
        System.out.println("Nhap a,b,c di nao: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        GiaiPTB2(a,b,c);
    }
}
/* thu voi Nhap a,b,c di nao: 
3
-4
1
x1= 0.3333333333333333
x2= 1.0
*/