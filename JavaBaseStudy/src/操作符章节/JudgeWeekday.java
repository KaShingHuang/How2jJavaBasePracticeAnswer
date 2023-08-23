package 操作符章节;

import java.util.Scanner;

public class JudgeWeekday {
    public static void main(String[] args) {
        //通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？
        Scanner scanner = new Scanner(System.in);
        System.out.println("今天是周几?");
        int day=scanner.nextInt();
        if(day<0 ||day>7 ) System.out.println("输入非法");
        else if(day<=5) System.out.println("今天是工作日");
        else System.out.println("今天是周末");
    }
}
