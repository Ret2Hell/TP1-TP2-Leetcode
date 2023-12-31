public class RedheadDuck extends Duck implements Quackable,Flyable
{
    private Flyable fb;
    private Quackable qb;
    public RedheadDuck(Flyable fb,Quackable qb)
    {
        this.fb=fb;
        this.qb=qb;
    }
    public void fly()
    {
        fb.fly();
    }
    public void quack()
    {
        qb.quack();
    }
    public void display()
    {
        System.out.println("RedheadDucks are awesome");
    }

}