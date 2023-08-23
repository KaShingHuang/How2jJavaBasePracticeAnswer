package 控制流程章节;

import java.util.Scanner;

public class UseWhileCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num=scanner.nextInt();
        int sum=1;
        while(num!=0){
            sum*=num--;
        }
        System.out.println("阶乘是"+sum);
    }
}
