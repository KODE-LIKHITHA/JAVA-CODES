import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;
public class takinginputs {
    public static void main(String[] args) throws IOException {
        /**BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write your name: ");
        String name = input.readLine();
        System.out.println("write a number: ");
        int num = Integer.parseInt(input.readLine());
        System.out.println(name);
        System.out.println(num);

        //1
        System.out.println("Enter today's temperature: ");
        float temp = Float.parseFloat(input.readLine());
        System.out.println(temp);**/

        // taking inputs using scanner
        /**Scanner input = new Scanner(System.in);
        System.out.println("enter student name: ");
        String name = input.nextLine();
        System.out.println("enter registration number: ");
        double ID = input.nextDouble();
        System.out.println("enter subject 1 marks");
        int s1 = input.nextInt();
        System.out.println("enter subject 2 marks");
        int s2 = input.nextInt();
        System.out.println("enter subject 3 marks");
        int s3 = input.nextInt();
        System.out.println("enter subject 4 marks");
        int s4 = input.nextInt();
        System.out.println("enter subject 5 marks");
        int s5 = input.nextInt();
        int sum = s1 + s2 + s3 + s4 + s5;
        float avg = (sum / 5);
        System.out.println(name);
        System.out.println(ID);
        System.out.println(sum);
        System.out.println(avg);**/

        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int x = input.nextInt();
            arr[i] = x;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
