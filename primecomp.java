public class primecomp {
   public static void main(String[] args) 
   {
    int a=8;
    int div = 2;
    boolean composite = false;
   for(div;div<a/2;div++)
   {
    if(a%div==0)
    {
        composite = true;
        break;
    }
    else
    {
        div++;
    }
   }
   if(composite== true) System.out.println("Composite");
   else System.out.println("Prime ");
}
}
