/**
 * This is a data structure backed by an array that allows programmers
 * * to add and remove any number of elements.
 * 
 * 1. Figure out what each method does, and add appropriate code comments. Don't forget the constructors and the variables.
 * 2. Test out all the methods in the AutoResizingStringArrayDemo class.
 * 3. This data structure only stores Strings. What do you change so that it can store, say, client accounts, like in your previous summative?
 */

public class AutoResizingStringArray
{
    String[] array;
    
    
    public AutoResizingStringArray()
    {
        array = new String[0];
    }
    
    
    public AutoResizingStringArray(String[] newArray)
    {
        array = newArray;
    }
    
    
    int size()
    {
        return array.length;
    }
    
    
    void prettyPrint()
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    
    String get(int index)
    {
        if (index < 0 || index > array.length - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        
        return array[index];
    }
    
    
    void add(String newElement)
    {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
        newArray[array.length] = newElement;
        array = newArray;
    }
    
    
    boolean set(int index, String value)
    {
        if (index < 0 || index >= array.length)
        {
            return false;
        }
        
        array[index] = value;
        
        return true;
    }
    
    
    boolean remove(int index)
    {
        if (index < 0 || index >= array.length)
        {
            return false;
        }
        
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < index; i++)
        {
            newArray[i] = array[i];        
        }
        for (int i = index; i < array.length - 1; i++)
        {
            newArray[i] = array[i + 1];
        }
        array = newArray;
        
        return true;
    }
    
    
    boolean insert(int index, String newElement)
    {
        if (index < 0 || index > array.length)
        {
            return false;
        }
        
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < index; i++)
        {
            newArray[i] = array[i];
        }
        newArray[index] = newElement;
        for (int i = index; i < array.length; i++)
        {
             newArray[i + 1] = array[i];   
        }
        array = newArray;
        
        return true;
    }
}
