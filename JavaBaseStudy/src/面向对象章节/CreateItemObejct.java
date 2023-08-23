package 面向对象章节;

public class CreateItemObejct {
    public static void show(Item it){
        System.out.println("物品叫:"+it.name+"  "+"价格是:"+it.price);
    }
    public static void main(String[] args) {
        Item BloodBottle =new Item("血瓶",50);
        Item GlassShoes= new Item("草鞋",300);
        Item Sowrd =new Item("长剑",350);
        show(BloodBottle);
        show(GlassShoes);
        show(Sowrd);



    }


}
