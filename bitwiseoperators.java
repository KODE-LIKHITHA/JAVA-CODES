class Sample
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a&b;
int d=a|b;
int e=a^b;
System.out.println("c="+c);
System.out.println("d="+d);
System.out.println("e="+e);
}
}
