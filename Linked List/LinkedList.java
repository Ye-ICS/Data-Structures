
/**
 * Generic linked list.
 * Each node in the list is linked to the next node.
 */
public class LinkedList<T>
{
    /**
     * The first node in the linked list.
     */
    LinkedListNode<T> firstNode;
    
    /**
     * Number of elements.
     */
    int size = 0;
    
    
    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList()
    {
    }
    
    
    /**
     * Returns size.
     */
    public int size()
    {
        return size;
    }

    
    /**
     * Adds node with specifiec value to the beginning of the linked list.
     */
    public void addFirst(T value)
    {
        if (firstNode == null)
        {
            firstNode = new LinkedListNode<T>(value, null);
        }
        else
        {
            firstNode = new LinkedListNode<T>(value, firstNode);
        }
        
        size++;
    }
    
    
    /**
     * Returns value of node at specified index.
     * Index starts from 0.
     */
    public T get(int index)
    {
        if (index < 0 || index > size - 1)
        {
            throw new IndexOutOfBoundsException();
        }
        
        return getNode(index).value();
    }
    
    
    /**
     * Returns the node at the specified index.
     */
    private LinkedListNode<T> getNode(int index)
    {
        // Traverse through list until node specified index is reached.
        LinkedListNode<T> node = firstNode;
        for (int i = 0; i < index; i++)
        {
            node = node.next();
        }
        
        return node;
    }
    
    
    /**
     * Sets value of node at specified index.
     */
    public boolean set(int index, T value)
    {
        if (index < 0 || index > size - 1)
        {
            return false;
        }
        
        getNode(index).setValue(value);
        return true;
    }
    
    
    /**
     * Inserts new node with specified value at specified index.
     */
    public boolean insert(int index, T value)
    {
        if (index < 0 || index >  size)
        {
            return false;
        }
        
        if (index == 0)
        {
            addFirst(value);
            return true;
        }
        
        // Get the node just before the specified index.
        LinkedListNode<T> prevNode = getNode(index - 1);
        LinkedListNode<T> newNode = new LinkedListNode<T>(value, null);
        if (prevNode.next() != null)
        {
            // Link new node to the prevNode's next node.
            newNode.setNext(prevNode.next());
        }
        
        // Link prevNode to the new node.
        prevNode.setNext(newNode);
        
        return true;
    }
    
    
    /**
     * Removes node at specified index.
     */
    public boolean remove(int index)
    {
        return false;
    }
}
