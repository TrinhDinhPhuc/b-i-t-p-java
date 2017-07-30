package ONcodebasic;
public class bai5 
{
    private static boolean Even_VS_Odd_number(int n)
    {
        if(n%2==0) return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        int a[] = {4, 2, 17, 4, 65845, 878784, 87, 8, 92, 10, 144, 12, 13, 84, 15, 754, 17, 201, 19, 266};
        for(int i=0; i<a.length;i++)
        {
            if(Even_VS_Odd_number(a[i])==true)
                System.out.println("i="+i+"  ["+a[i]+"]");
        }
    }
}
