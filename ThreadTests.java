class A extends Thread
{
public void run()
{
int x=20,y=10,c;
c=x+y;
System.out.println(Thread.currentThread()+"From A="+c);
}
}
class B extends Thread
{
public void run()
{
int x=20,y=10,c;
c=x-y;
System.out.println(Thread.currentThread()+"From B="+c);
}
}
class C extends Thread
{
public void run()
{
int x=20,y=10,c;
c=x*y;
System.out.println(Thread.currentThread()+"From C="+c);
}
}
public class ThreadTests
{
public static void main(String[] args)
{
new A().start();
new B().start();
new C().start();
}
}