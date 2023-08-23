package 操作符章节;

import java.util.Scanner;

public class BmiCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高(m):");
        double Height= scanner.nextDouble();
        System.out.println("请输入体重(kg):");
        double Weight= scanner.nextDouble();
        System.out.println("当前的BMI是:"+Weight/(Height*Height));

    }


}
