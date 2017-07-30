package ONcodebasic;
public class bai2 {
    private static boolean Check_Chan_3(int n)
    {
        if(n%2==0 && n%3==0)
            return true;
        return false;
    }
    
    public static void main(String[] args) 
    {
//        if(Check_Chan_3(36)==true)
//            System.out.println("La so chan va chia het cho 3");
//        else
//            System.out.println("Ko la so chan va chia het cho 3");
        int count=0,i=1;
        while(count<1000)
        {
            if(Check_Chan_3(i)==true)
            {
                count++;
                System.out.println(count + "  ["+i+"]");
            }
            i++;
        }
        
    }
}
