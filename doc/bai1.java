
package ONcodebasic;

public class bai1 {
    private static boolean KiemTraSNT(int n)
    {
        double k=Math.sqrt(n);
        if(n<2) return false;
        for(int i=2;i<=k;i++)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
//            if(KiemTraSNT(46)==true)
//                System.out.println("La so nguyen to");
//            else
//                System.out.println("Ko la so nguyen to");
// http://www.numberempire.com/primenumbers.php check so nguyen to online
        int count = 0;
        int  i=1;
        while(count<1000)
        {
            if(KiemTraSNT(i)==true)
            {
                count++;
                System.out.println(count + "  ["+i+"]");
            }
            i++;
        }
    }
    
}
