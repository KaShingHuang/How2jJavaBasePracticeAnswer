package 操作符章节;

import java.util.Scanner;

public class CompareTwoValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FirstNum=scanner.nextInt();
        System.out.println("第一个整数:"+FirstNum);
        int SecondNum=scanner.nextInt();
        System.out.println("第二个整数:"+SecondNum);

        System.out.print("比较5>8:");
        if(FirstNum>SecondNum) System.out.println(true);
        else System.out.println(false);

        System.out.print("比较5>=8:");
        if(FirstNum>=SecondNum) System.out.println(true);
        else System.out.println(false);

        System.out.print("比较5<8:");
        if(FirstNum<SecondNum) System.out.println(true);
        else System.out.println(false);

        System.out.print("比较5<=8:");
        if(FirstNum<=SecondNum) System.out.println(true);
        else System.out.println(false);

        System.out.print("比较5==8:");
        if(FirstNum==SecondNum) System.out.println(true);
        else System.out.println(false);

        System.out.print("比较5!=8:");
        if(FirstNum!=SecondNum) System.out.println(true);
        else System.out.println(false);

    }
}
