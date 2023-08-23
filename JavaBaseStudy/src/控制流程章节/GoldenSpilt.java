package 控制流程章节;

public class GoldenSpilt {
    public static void main(String[] args) {
        //寻找某两个数相除，其结果 离黄金分割点 0.618最近
        //
        //分母和分子不能同时为偶数
        //分母和分子 取值范围在[1-20]
        int fenzi=0,fenmu=0;
        double MinMinus=Double.MAX_VALUE;
        for(int i=1;i<=20;i++){
            for (int j=1;j<=20;j++){
                if(Math.abs((double)((double)i/j)-0.618)<MinMinus){
                    MinMinus=Math.abs((double)((double)i/j)-0.618);
                    fenzi=i;
                    fenmu=j;
                }
            }
        }
        System.out.println("离黄金分割点(0.618)最近的两个数相除是："+fenzi+"/"+fenmu+"="+(double)((double)fenzi/fenmu));

    }
}
