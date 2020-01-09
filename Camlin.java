/*The following java program demonstrates how  to compare the state of two objects without using comparator*/
import java.util.*;
class myException extends Exception
{
myException(String s)
{
super(s);
}
}
public class Camlin
{
public static void main(String args[])
{
try
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the details of a first student:");
System.out.println("Enter name:");
String s1=s.next();
System.out.println("Enter id:");
int s2=s.nextInt();
if(s2<0 ||s2>60)                                               
{
throw new myException(" ");
}
System.out.println("Enter marks:");
int s3=s.nextInt();
if(s3<35 ||s3>80)
{
throw new myException(" ");
}
System.out.println("Enter the details of a second student:");
System.out.println("Enter name:");
String s4=s.next();
System.out.println("Enter id:");
int s5=s.nextInt();
if(s2<0 ||s2>60){                                             
throw new myException(" ");
}
System.out.println("Enter marks:");
int s6=s.nextInt();
if(s6<35 || s6>80)                                            
{
throw new myException(" ");
}
Student b1=new Student(s1,s2,s3);
Student b2=new Student(s4,s5,s6);
System.out.println(b1.equals(b2));
}
catch(myException ex)
{
System.out.println("Wrong input");
}}
static class Student
{
private String name;
private int id;
private int marks;
public Student(String name,int id,int marks)
{
this.name=name;
this.id=id;
this.marks=marks;
}
public boolean equals(Object o)
{
if(o==null || getClass()!=o.getClass())
{
return false;
}
Student a1=(Student) o;
return id==a1.id&&
marks==a1.marks&&
        name.equals(a1.name);
}
}
}
