#Bài 1. Vi?t chuong trình tìm u?c s? chung l?n nh?t, b?i s? chung nh? nh?t c?a hai s? t? nhiên a và b.
package bai01;

import java.util.Scanner;

public class Main {

    public static int nhap()
    {
        Scanner input = new Scanner(System.in);
        boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
    }
    public static int UCLN(int a, int b){
		while(a!= b){
			if(a>b) a= a-b;
			else b= b-a;
		}
		return (a);
	}
    public static void main(String[] args) {
        System.out.println("Nhap a");
		int a = nhap();
		System.out.println("Nhap b");
		int b= nhap();
		System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
		System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    }

}

# Hãy vi?t chuong trình tính t?ng các ch? s? c?a m?t s? nguyên b?t k?. Ví d?: S?  8545604 có t?ng các ch? s? là: 8+5+4+5+6+0+4= 32.
package bai03;

import java.util.Scanner;

public class Main {

    
    public static int nhap(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
    public static int tinhTong(long i){
		int sum=0;
		long n;
		while(i!=0){
			n= i%10;
			sum+= n;
			i/=10;
		}
		return (sum);
	}
    public static void main(String[] args){
                System.out.print("Nhap n");
		int n= nhap();
		System.out.println("Tong cua so "+n+" = " +tinhTong(n));
    }

}
# Vi?t chuong trình phân tích m?t s? nguyên thành các th?a s? nguyên t?
#	Ví d?: S? 28 du?c phân tích thành 2 x 2 x 7
package bai04;
import java.util.Scanner;
public class Main {

    
    public static void phanTich(int n){
		int i=2;
		while(n>1){
			if(cachamchung.checkSNT(i)){
				if(n%i==0){
					System.out.print(i+".");
					n/=i;
				}
				else i++;
			}
			else i++;
		}
	}
    public static int nhap(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
    public static void main(String[] args) {
        System.out.print("Nhap n");
		int n= nhap();
		System.out.print("n= " );
		phanTich(n);
    }

}

#Vi?t chuong trình li?t kê t?t c? các s? nguyên t? nh? hon n cho tru?c.
package bai05;
import java.util.Scanner;
public class Main {

    public static void lietKe(int n){
		System.out.print(" 2");
		for(int i=3;i<n;i+=2){
			if(cachamchung.checkSNT(i))System.out.print(" "+i);
		}
	}
    public static int nhap(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
    public static void main(String[] args) {
                System.out.print("Nhap n");
		int n= nhap();
		System.out.println("Cac so nguyen to nho hon "+n+ " ");
		lietKe(n);
    }

}

