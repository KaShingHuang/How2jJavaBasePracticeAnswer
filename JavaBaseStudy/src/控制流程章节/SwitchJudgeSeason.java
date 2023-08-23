package 控制流程章节;

import java.util.Scanner;

public class SwitchJudgeSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month =scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("冬天");
                break;
            case 2:
                System.out.println("东天");
                break;
            case 3:
                System.out.println("春天");
                break;
            case 4:
                System.out.println("春天");
                break;
            case 5:
                System.out.println("春天");
                break;
            case 6:
                System.out.println("夏天");
                break;
            case 7:
                System.out.println("夏天");
                break;
            case 8:
                System.out.println("夏天");
                break;
            case 9:
                System.out.println("秋天");
                break;
            case 10:
                System.out.println("秋天");
                break;
            case 11:
                System.out.println("秋天");
                break;
            case 12:
                System.out.println("冬天");
                break;
        }

    }
}
