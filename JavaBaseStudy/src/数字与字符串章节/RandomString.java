package 数字与字符串章节;

public class RandomString {
    public static void main(String[] args) {
        char[] cs = new char[5];
        for(int j = 0; j < 5; j++) {
            int i = (int)(Math.random()*3);
            switch(i) {
                case 0:
                    cs[j] = (char)(Math.random()*('9' - '0' + 1) + '0');
                    break;
                case 1:
                    cs[j] = (char)(Math.random()*('z' - 'a' + 1) + 'a');
                    break;
                case 2:
                    cs[j] = (char)(Math.random()*('Z' - 'A' + 1) + 'A');
                    break;
            }
        }
        String s = new String(cs);
        System.out.println(cs);
    }
}
