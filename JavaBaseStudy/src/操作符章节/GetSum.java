package 操作符章节;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a=scanner.nextInt();
        System.out.println("第一个整数:"+a);
        b=scanner.nextInt();
        System.out.println("第二个整数:"+b);
        System.out.println("两个数的和是："+(a+b));
    }
}
