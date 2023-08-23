package 面向对象章节;

public class Item {
    public String name;
    public int price;

    public Item(String name,int price){  //构造方法
        this.name=name;
        this.price=price;
    }
    public  Item(){}
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
}


