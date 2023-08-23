package 数字与字符串章节;

public class GuessPassWord {
    public static void main(String[] args) {
        char ch[]=new char[3];
        for (int i = 0; i < 3; i++) {
            ch[i]= (char)((int)(Math.random()*('z'-'a'))+'a');
            System.out.print(ch[i]);
        }
        System.out.println();
        String string = new String(ch);
        char PassWord[]=new char[3];
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<27;j++){
                if ((char)('a'+j)==string.charAt(i)) {
                    PassWord[i]=(char)('a'+j);
                    break;
                }
            }

        }
        for (char cha:PassWord
             ) {
            System.out.print(cha);

        }
    }



}
