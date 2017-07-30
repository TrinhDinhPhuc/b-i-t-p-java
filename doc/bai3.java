package ONcodebasic;
public class bai3 {
    private static boolean Check_Chan_3(int n)
    {
        if(n%2==0 && n%3==0){ return true;}
        return false;
    }
    
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0; i<a.length;i++)
        {
            if(Check_Chan_3(a[i])==true)
                System.out.println("["+a[i]+"]");
        }
    }
}
