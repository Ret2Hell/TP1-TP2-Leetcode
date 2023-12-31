public class CustomArrayList {

    private Object[] array;
    private int size;

    public CustomArrayList()
    {
        this.array=new Object[10];
        this.size=0;
    }

    public CustomArrayList(int initialSize)
    {
        this.array=new Object[initialSize];
        this.size=0;
    }

    public void add(Object obj) {
        if (size == array.length)
        {
            Object[] newArray=new Object[array.length*2];
            System.arraycopy(array,0,newArray,0,size);
            array=newArray;
        }
        array[size] = obj;
        size++;
    }

    public void add(int index,Object x)
    {
        if (size==array.length)
        {
            Object[] newArray =new Object[array.length*2];
            System.arraycopy(array, 0, newArray, 0, size);
            array=newArray;
        }
        System.arraycopy(array,index,array,index + 1,size-index);
        array[index]=x;
        size++;
    }

    public Object get(int index)
    {
        return array[index];
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public boolean isIn(Object x)
    {
        for (int i=0;i<size;i++)
        {
            if (array[i].equals(x))
            {
                return true;
            }
        }
        return false;
    }

    public int find(Object x)
    {
        for (int i=0;i<size;i++)
        {
            if (array[i].equals(x))
            {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object x)
    {
        int index=find(x);
        if (index != -1)
        {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[size - 1] = null;
            size--;
        }
    }
}
