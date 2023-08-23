package 类和对象章节;

public class Item { //饿汉单例模式
    private Item(){}
    private static Item instance=new Item();
    public Item getInstance(){
        return instance;
    }
}
