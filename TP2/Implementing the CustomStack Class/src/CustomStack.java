public class CustomStack {
    private int capacity;
    private int[] stack;
    private int size;

    public CustomStack(int capacity)
    {
        this.capacity=capacity;
        this.stack=new int[capacity];
        this.size=0;
    }
    public void AddElement(int e)
    {
        if (size < capacity)
        {
            stack[size++]=e;
        }
        else
        {
            System.out.println("Stack is full");
        }
    }
    public void RemoveElement()
    {
        if (!StackIsEmpty())
        {
            stack[--size]=0;
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    public int LastInStack()
    {
        if (!StackIsEmpty())
        {
            return(stack[size-1]);
        }
        else
        {
            System.out.println("Stack is empty");
            return(-1);
        }
    }
    public boolean StackIsEmpty()
    {
        return(size==0);

    }

    public boolean StackIsFull()
    {
        return(size==capacity);
    }
}