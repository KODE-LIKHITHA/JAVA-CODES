class sample{
static void conditionalSum(int l[], int a, int b) {
int sum = 0;
boolean add = true;
for (int i=0; i<l.length; i++) {
if (l[i] != a && add == true)
sum = sum + l[i];
else if (l[i] == a)
add = false;
else if (l[i] == b)
add = true;
}
System.out.println(sum);
}
public static void main(String[] args) {
int arr[] = {1,2,3,4,6,5,4,3};
int a = 6;
int b = 7;
conditionalSum(arr,a,b);
}
}
