import java.util.Scanner;

class DETAILS
{
void display()
{
System.out.println("This is Details class");
}
}
class StudentName extends DETAILS
{
void display1()
{
System.out.println("Name=Levi Ackerman");
}
}
class StudentRoll extends DETAILS
{
void display2()
{
System.out.println("Roll No=23146");
}
}
class StudentAge 
{
void display3()
{
System.out.println("Student Age=18");
}
}
class StudentStd extends StudentAge
{
void display4()
{
System.out.println("STD=1st year");
}
}
public class inherit2
{
public static void main(String[] args)
{
Scanner orca=new Scanner(System.in);
StudentName s1=new StudentName();
StudentRoll s2=new StudentRoll();
StudentAge s3=new StudentAge();
StudentStd s4=new StudentStd();
System.out.println("Details=");
s1.display();
s1.display1();
s2.display2();
s3.display3();
s4.display4();
}
}



