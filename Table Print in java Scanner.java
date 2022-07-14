package table;
import java.util.*;
public class Table 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Table For ");
        int firstnum = input.nextInt();
        System.out.print("End Limit ");
        int limitnum = input.nextInt();
        methodForTable(firstnum,limitnum);
    }
    public static void methodForTable(int firstnum,int limitnum)
    {
        for(int i = 1;i<=limitnum;i++)
        {
            System.out.println(firstnum + " x " + i + " = " + firstnum*i);
        }
    }
    
}
