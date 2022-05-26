/**
 * Demo/testing class for the AutoResizingStringArray class.
 */

public class AutoResizingStringArrayDemo
{
    public static void main(String[] args)
    {
        AutoResizingStringArray fruits = new AutoResizingStringArray(new String[]{"apple", "watermelon"});
        
        System.out.println(fruits.size());
        fruits.prettyPrint();
        
        fruits.add("blueberry");
        fruits.add("mulberry");
        fruits.add("goldberry");

        fruits.prettyPrint();
        
        fruits.remove(2);
        fruits.prettyPrint();
        
    }
}
