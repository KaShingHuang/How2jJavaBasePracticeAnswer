package 接口与继承章节;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();

    public void walk(){
        System.out.println(this.legs+"条腿的动物是这样走的");
    }
}
