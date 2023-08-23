package 面向对象章节;

import java.util.ArrayList;
import java.util.Iterator;

public class TryTest {
    public static void main(String[] args) {
        ArrayList Heros=new ArrayList<>();
        Hero h1=new Hero("hero1");
        Heros.add(h1);
        System.out.println(Heros.contains(h1));
        Heros.add(new Hero("hero2"));
        Iterator iterator = Heros.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            Hero hero = (Hero)object;
            if(hero.name=="hero1") System.out.println(1);
        }
    }
}
