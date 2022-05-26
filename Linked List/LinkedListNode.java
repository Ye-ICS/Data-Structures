
/**
 * Class for a single node in a linked list
 */
public class LinkedListNode<T>
{
    /**
     * Value stored in this node.
     */
    T value;
    
    /**
     * Reference to node this node is linked to.
     */
    LinkedListNode<T> next;

    
    /**
     * Constructor.
     */
    public LinkedListNode(T newValue, LinkedListNode<T> nextNode)
    {
        value = newValue;
        next = nextNode;
    }
    
    
    /**
     * Returns stored value.
     */
    public T value()
    {
        return value;
    }
    
    
    /**
     * Sets value stored in this node.
     */
    public void setValue(T newValue)
    {
        value = newValue;
    }
    
    
    /**
     * Returns the node this node is linked to.
     */
    public LinkedListNode<T> next()
    {
        return next;
    }
    

    /**
     * Sets node this node is linked to.
     */
    public void setNext(LinkedListNode<T> nextNode)
    {
        next = nextNode;
    }
}
