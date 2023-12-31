public class MallardDuck extends Duck implements Quackable,Flyable
{
    private Flyable fb;
    private Quackable qb;
    public MallardDuck(Flyable fb,Quackable qb)
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
        System.out.println("MallardDucks are awesome");
    }

	/*public void swim()
	{
		System.out.println("MallardDucks can swim");
	}*/

}