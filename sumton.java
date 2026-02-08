public class sumton 
{
  public static  int calc(int n )
  {
    if (n==1)
    {
        return 1;
    }
    return n+calc(n-1);
  }  

  public static void main(String[]args)
  {
    System.out.println(calc(90));
  }
}
