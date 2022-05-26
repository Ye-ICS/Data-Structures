/**
 * 
 * What does the 'add' method do?
 * 1. Outline the overall steps of the method. Write down an algorithm or a flowchart.
 * 2. This code has no comments. Write the appropriate code comments for the 'add' method and the steps inside it.
 * 3. Using the outline you came up with, re-implement this method on your own in a new class, and test it out.
 * 
 */
import java.util.Scanner;

public class ExpandArrayDemo
{
    static String[] array = new String[0];
    
    public static void main(String[] args)
    {
        System.out.println(array.length);
        printArray();

        add("Red");
        add("Blue");
        add("Gold");
        
        System.out.println(array.length);
        printArray();
        
        /*Scanner scanner = new Scanner(System.in);
        
        while (true)
        {
            String newString = scanner.nextLine();
            add(newString);
            print();
        }*/
    }
    
    public static void add(String string)
    {
        int n = array.length;
        String[] newArray = new String[n + 1];
        
        for (int i = 0; i < n; i++)
        {
            newArray[i] = array[i];
        }
        
        newArray[n] = string;
        
        array = newArray;
    }
    
    public static void printArray()
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
}
