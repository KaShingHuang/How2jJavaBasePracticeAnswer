package 数字与字符串章节;

public class Character {
    public static void main(String[] args) {
        String string = "Hf1860JghlabfiU57Dv";
        char cs[]=string.toCharArray();

        for (char ch:cs) {
            if(java.lang.Character.isDigit(ch)|| java.lang.Character.isUpperCase(ch))
                System.out.print(ch);

        }
    }
}
