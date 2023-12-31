public class Main {
    public static void main(String[] args)
    {
        Fly1 fly1=new Fly1();
        Fly2 fly2=new Fly2();
        Quack1 quack1=new Quack1();
        Quack2 quack2=new Quack2();
        MallardDuck mallardDuck=new MallardDuck(fly1,quack1);
        RedheadDuck redheadDuck=new RedheadDuck(fly1,quack1);
        RubberDuck rubberDuck=new RubberDuck(fly2,quack2);
        DecoyDuck decoyDuck=new DecoyDuck(fly2,quack2);


        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();


        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.fly();


        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();


        decoyDuck.display();
        decoyDuck.quack();
        decoyDuck.fly();


    }
}