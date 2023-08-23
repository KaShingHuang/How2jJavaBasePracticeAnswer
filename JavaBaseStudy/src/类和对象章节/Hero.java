package 类和对象章节;

public class Hero {  //懒汉单例模式
    private Hero(){}
    private static Hero Instance;
    public Hero getGetInstance(){
        if(Instance==null) Instance=new Hero();
        return Instance;
    }
}

