package 接口与继承章节;

import 面向对象章节.Item;

public class MagicPotiion extends Item {

    public void effect() {
        System.out.println("蓝瓶使用后，可以回魔法");
    }

    public static void main(String[] args) {
        MagicPotiion magicPotiion = new MagicPotiion();
        magicPotiion.effect();
    }


}
