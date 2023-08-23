package 接口与继承章节;

public class Spider extends Animal{
    public Spider(int legs){
        super(legs);
    }

    @Override
    public void eat(){
        System.out.println("蜘蛛吃东西啦");
    }
}
