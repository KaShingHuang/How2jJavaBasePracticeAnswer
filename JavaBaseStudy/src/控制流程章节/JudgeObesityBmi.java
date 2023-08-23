package 控制流程章节;

import java.util.Scanner;

public class JudgeObesityBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高(m):");
        double Height= scanner.nextDouble();
        System.out.println("请输入体重(kg):");
        double Weight= scanner.nextDouble();
        double Bmi=Weight/(Height*Height);
        System.out.println("当前的BMI是:"+Bmi);
        System.out.print("身体状态是:");
        if(Bmi<18.5) System.out.println("体重过轻");
        else if (18.5<=Bmi && Bmi<24) System.out.println("正常范围");
        else if (24<=Bmi && Bmi<27) System.out.println("体重过重");
        else if (27<=Bmi && Bmi<30) System.out.println("轻度肥胖");
        else if (30<=Bmi && Bmi<35) System.out.println("中度肥胖");
        else System.out.println("重度肥胖");
    }
}
