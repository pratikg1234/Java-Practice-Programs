import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferedreader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a value: ");
        // int num=System.in.read();
        // System.out.println(num-48);
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf= new BufferedReader(in);  
        // int num = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
