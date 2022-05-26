
/**
 * Auto-resizing data structure backed by an array.
 */
public class StringArrayList
{
    /**
     * Backing array to store the elements of this data structure.
     * Its size could be larger than needed.
     */
    String[] array;
    
    /**
     * Number of elements currently in the data structure.
     * Could be fewer than the size of the backing array.
     */
    int numElements;

    
    /**
     * Initializes data structure.
     * Initializes backing array to specified capacity.
     */
    public StringArrayList(int capacity)
    {
        if (capacity < 1)
        {
            capacity = 1;
        }
        
        array = new String[capacity];
        numElements = 0;
    }
    
    
    /**
     * Initializes data structure with given elements.
     */
    public StringArrayList(String[] initialElements)
    {
        this(initialElements.length);
        
        for (int i = 0; i < initialElements.length; i++)
        {
            add(initialElements[i]);
        }
        
        numElements = initialElements.length;
    }
    
    
    /**
     * Returns the number of elements currently in the data structure.
     */
    public int size()
    {
        return numElements;
    }

    
    /**
     * Adds new element.
     * Expands backing array if necessary.
     */
    public void add(String newElement)
    {
        if (numElements == array.length)// At capacity. Need to resize backing array. 
        {
            resize(2 * array.length);
        }
        
        array[numElements] = newElement;
        numElements++;
    }
    
    
    /**
     * Helper method to resize the backing array to specified new capacity.
     * If specified capacity is smaller than current number of elements, the extra elements after resizing are thrown away.
     */
    private void resize(int newCapacity)
    {
        String[] newArray = new String[newCapacity];
        
        if (newCapacity < numElements)  // If new size is smaller than current number of elements.
        {
            numElements = newCapacity;
        }
        
        // Copy elements to new array.
        for (int i = 0; i < numElements; i++)
        {
            newArray[i] = array[i];
        }
        
        // Set backing array to the new array.
        array = newArray;
    }
    
    
    /**
     * Prints the elements currently in the structure.
     */
    public void prettyPrint()
    {
        
    }
    
    
    /**
     * Gets element at specified index.
     */
    public String get(int index)
    {
        if (index < 0 || index > numElements - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        
        return array[index];
    }
    
    
    /**
     * Sets value for element at specified index.
     * Returns true and sets value if index within range.
     * Returns false and does nothing otherwise.
     */
    public boolean set(int index, String value)
    {
        if (index < 0 || index > numElements - 1)
        {
            return false;
        }
        
        array[index] = value;
        return true;
    }
    
    
    /**
     * Removes element at specified index.
     * Returns true and removes element if index within range.
     * Returns false and does nothing otherwise.
     */
    public boolean remove(int index)
    {
        if (index < 0 || index > numElements - 1)
        {
            return false;
        }
        
        // Shift all elements after index one position down.
        for (int i = index + 1; i < numElements; i++)
        {
            array[i - 1] = array[i];
        }
        // Decrease counter.
        numElements--;
        
        return true;
    }
    
    
    /**
     * Inserts element at specified index, shifting existing elements after specified index one position up.
     * Returns true and inserts element if index within range, false otherwise.
     */
    public boolean insert(int index, String newElement)
    {
        if (index < 0 || index > numElements - 1)
        {
            return false;
        }
        
        if (numElements == array.length)// At capacity. Need to resize backing array. 
        {
            resize(2 * array.length);
        }
        
        // Shift all elements starting at index one position up.
        for (int i = index + 1; i < numElements; i++)
        {
            array[i] = array[i - 1];
        }
        // Insert new element.
        array[index] = newElement;
        
        return true;
    }
}
