#B�i 1. Vi?t chuong tr�nh t�m u?c s? chung l?n nh?t, b?i s? chung nh? nh?t c?a hai s? t? nhi�n a v� b.
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

# H�y vi?t chuong tr�nh t�nh t?ng c�c ch? s? c?a m?t s? nguy�n b?t k?. V� d?: S?  8545604 c� t?ng c�c ch? s? l�: 8+5+4+5+6+0+4= 32.
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
# Vi?t chuong tr�nh ph�n t�ch m?t s? nguy�n th�nh c�c th?a s? nguy�n t?
#	V� d?: S? 28 du?c ph�n t�ch th�nh 2 x 2 x 7
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

#Vi?t chuong tr�nh li?t k� t?t c? c�c s? nguy�n t? nh? hon n cho tru?c.
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

