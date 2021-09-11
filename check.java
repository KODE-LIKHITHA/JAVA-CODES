class Test{
public static void main(String args[]) {
int a=Integer.parseInt(args[0]);
if((a>=65 && a<=90)||(a>=97 && a<=122))
System.out.println("alphabet");
else if(a>=0 && a<=10)
System.out.println("alphabet");
else
System.out.println("special character");
}
}