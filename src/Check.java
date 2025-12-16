import java.util.Scanner;
class Palindrome {
    int n;
    Palindrome(int n) {
        this.n = n;
    }
    void check() {
        int a = n;
        int b = 0;
        while (n!=0) {
            b = 10*b + (n%10);
            n = n/10;
        }
        if (b==a) {
            System.out.println("Given number is a palindrome");
        }
        else {
            System.out.println("Given number is not a palindrome");
        }
    }
}

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        Palindrome p1 = new Palindrome(n);
        p1.check();
    }
}