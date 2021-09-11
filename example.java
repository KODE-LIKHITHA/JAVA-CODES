class sample
{
public static void main(String[] args)
{
String Gender = args[0];
int age = Integer.parseInt(args[1]);
if(args.length==0)
{
System.out.println("Empty Arguments");
}  
else
{
if(Gender=="Male" || Gender=="Female")
{
if(age>1 && age<=120)
{
if (Gender.equals("Female") && (age >= 1 && age <= 58)) 
{
System.out.println("Interest == 8.2%");
} 
else if (Gender=="Female" && (age >= 59 && age <= 120)) 
{
System.out.println("Interest == 7.6%");
} 
else if (Gender=="Male" && (age >= 1 && age <= 60)) 
{
System.out.println("Interest == 9.2%");
} 
else if (Gender=="Male" && (age >= 61 && age <= 120)) 
{
System.out.println("Interest == 8.3%");
}
}
}
}
}
}