public class primecomp 
{
   public static void main(String[] args) 
   {
    int a=1;
    int div = 2;
    boolean composite = false;
    while(div<=a/2)
    {
        if(a%div==0)
        {
            composite = true;
            break;
        }
        div++;
    }
    if (a==1) System.out.println("Neither prime nor Composite ");
    else if (composite) System.out.println("Composite number");
    else  System.out.println("Prime number");

    }
}