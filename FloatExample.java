class FloatExample {
public static void main(String args[])
{
float d=987654321.1234567f;
float c=6.123456789f;
int i1=10;
double d1=i1;
int i5=(int)d;
float i6=(float)d;
int i7=25565;
char c1=(char)i7;
System.out.println(d);
System.out.println(c);
System.out.println("widening casting int to double: "+d1);
System.out.println("narrow casting double to int: "+i5);
System.out.println("widening casting double to float: "+i6);
System.out.println("widening casting int to char: "+i7);
}
}