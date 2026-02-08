import java.util.*;
public class tax 
{
    public static void main(String[] args)
    {   Scanner sc= new Scanner(System.in);
        float cup = sc.nextFloat();
        float book = sc.nextFloat();
        float gum = sc.nextFloat();
        float mint = sc.nextFloat();
        float bill = (cup+book+gum+mint);
        double bill_tax = ((cup+book+gum+mint)*1.22);
        System.out.println(bill+" Without tax");
        System.out.println(bill_tax+" With tax of 22% ");
        sc.close();
    }
}
