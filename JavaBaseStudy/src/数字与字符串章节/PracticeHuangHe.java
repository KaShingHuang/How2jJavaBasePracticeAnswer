package 数字与字符串章节;

import java.util.Scanner;

public class PracticeHuangHe {
    public static void main(String[] args) {
        String AddressName,CompanyTpye,CompanyName,BossName,Price,Product,PricePerKilo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地名");
        AddressName=scanner.next();

        System.out.println("请输入公司类型");
        CompanyTpye=scanner.next();

        System.out.println("请输入公司名称");
        CompanyName=scanner.next();

        System.out.println("请输入老板名称");
        BossName=scanner.next();

        System.out.println("请输入金额");
        Price=scanner.next();

        System.out.println("请输入产品");
        Product=scanner.next();

        System.out.println("请输入价格计量单位");
        PricePerKilo=scanner.next();


        String string = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!%s王八蛋，" +
                "你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(string,AddressName,CompanyTpye,CompanyName,BossName,Price,Product,PricePerKilo,PricePerKilo,PricePerKilo,Product,BossName);
    }
}
