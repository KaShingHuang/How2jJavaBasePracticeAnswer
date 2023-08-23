package 接口与继承章节;

public class Cat extends Animal implements Pet {
    public String Name;
    public Cat(String name){
        super(4);
        this.Name=name;
    }

    public Cat(){
        this("");
    }


    @Override
    public void eat() {
        System.out.println("猫吃东西");

    }

    @Override
    public void getName() {
        System.out.println(this.Name);

    }

    @Override
    public void SetName(String name) {
        this.Name=name;
    }

    @Override
    public void play() {
        System.out.println("猫在玩");

    }
}
