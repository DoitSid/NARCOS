import java.util.Scanner;
interface A
{
void display();
}
class B implements A
{
public void display()
{
int i=1;
while(i>=10)
{
i++;

}
System.out.println("This is not hidden"+i);
}
}
public class interface1
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int i;
System.out.println("Enter number=");
i=input.nextInt();

B b1=new B();
b1.display();
}
}