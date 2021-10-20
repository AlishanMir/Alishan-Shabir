class A extends Thread
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread()+"From A="+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(e.toString());
}
}
}
class B extends Thread
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread()+"From B="+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(e.toString());
}
}
}
class C extends Thread
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread()+"From C="+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(e.toString());
}
}
}
public class ThreadTest
{
public static void main(String[] args)
{
new A().start();
new B().start();
new C().start();
}
}