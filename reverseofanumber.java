class sample    
{  
public static void main(String args[])  
{  
int n=Integer.parseInt(args[0]);
int digit, sum = 0;  
System.out.print("Enter the number: ");    
while(n> 0)  
{      
digit = n % 10;    
sum = sum*10 + digit;    
n = n / 10;  
} 
System.out.println("reverse of Digits: "+sum);  
}  
}