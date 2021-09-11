class Sample
{
public static void main(String args[])
{
char c1=args[0].charAt(0);
char c2=args[1].charAt(0);
if(c1>='A' && c1<='Z')
{
int i1=c1+32;
c1=(char)i1;
}
if(c2>='a' && c2<='z')
{
int i2=c2+32;
c2=(char)i2;
}
if(c1<c2)
{
System.out.println(c1+" "+c2);
}
else
{
System.out.println(c2+" "+c1);
}
}
}