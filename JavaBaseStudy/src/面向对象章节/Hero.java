package 面向对象章节;

public class Hero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public void legendary(){}//超神
    public Hero(String name){
        this.name=name;
    }
    public  Hero(){}

    public float getHp(){  // 获取当前血量
        return this.hp;
    }

    public void recovery(float blood){
        this.hp+=blood;
    } //本次回复的血量
}
