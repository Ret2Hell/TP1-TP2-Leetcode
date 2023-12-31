import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        CustomStack customStack = new CustomStack(20);
        Random random = new Random();
        for(int i=0; i<20 ; i++)
        {
            customStack.AddElement(random.nextInt(100));
        }
        System.out.println("Last element " + customStack.LastInStack());
        customStack.RemoveElement();
        System.out.println("Last element " + customStack.LastInStack());
        System.out.println(customStack.StackIsEmpty());
        System.out.println(customStack.StackIsFull());

    }
}