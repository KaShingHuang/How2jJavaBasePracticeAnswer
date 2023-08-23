package 接口与继承章节;

import 面向对象章节.Hero;

public class Support extends Hero implements Healer {

    @Override
    public void heal() {
        System.out.println("治愈了");
    }
}
