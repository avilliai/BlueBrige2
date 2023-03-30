import java.util.HashSet;
import java.util.Map;

public class bb {
    public static void main(String[] args) {
        String s="DCCD";

        System.out.println(longestPalindrome1(s));
        /*char[] chars=s.toCharArray();

        int max=0;
        int count=0;
        HashSet<Character> hashSet=new HashSet<Character>();
        for (char ch:chars){
            hashSet.add(ch);
        }

        String s1="";
        for (char ch:hashSet) {
            count=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==ch){
                    count++;
                }
            }
            if (count>max){
                s1= String.valueOf(ch);
                max=count;
            }else if (count==max){
                s1=s1+String.valueOf(ch);
            }
        }
        System.out.println(s1);*/
    }
    public static String longestPalindrome1(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        int strLen = s.length();
        int left = 0;
        int right = 0;
        int len = 1;
        int maxStart = 0;
        int maxLen = 0;

        for (int i = 0; i < strLen; i++) {
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            while (left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)) {
                len = len + 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);

    }


    /*public static String longestPalindrome(String s) {
        char[] c = s.toCharArray();
        int longgest = 0;

        int i = 0;
        String sf="";
        for (int j = 0; j <= c.length-1; j++) {
            String s12=String.valueOf(s.charAt(j));
            int left;
            int right;
            int templeft=j;
            int tempright=j+1;
            String temp="";
            while (true){

                if (s.charAt(templeft)==s.charAt(tempright)){
                    temp=s.charAt(templeft)+temp+s.charAt(tempright);
                    templeft--;
                    tempright++;
                }else {
                    if (temp.length()>sf.length()){
                        sf=temp;
                        break;
                    }
                }
            }
            //System.out.println("当前字符" + s.charAt(j));
            /*while (true) {
                if (left < 0 || right >= c.length) {
                    //System.out.println("超限");
                    break;
                }
                if (c.length%2==0){

                    if (s.charAt(left2)==s.charAt(right2)){
                        //System.out.println("回文");
                        temp=String.valueOf(s.charAt(left2))+temp+String.valueOf(s.charAt(left2));
                        left2--;
                        right2++;
                        if (temp.length()>sf.length()){
                            sf=temp;
                        }

                    }else {
                        break;
                    }
                }else {

                    if (s.charAt(left) == s.charAt(right)) {
                        //System.out.println("回文");
                        s12 = (String.valueOf(s.charAt(left)) + s12 + String.valueOf(s.charAt(right)));
                        length++;
                        left--;
                        right++;
                    } else {
                        if (length > longgest) {
                            longgest = length;
                            sf = s12;
                            //System.out.println("当前最长" + longgest);

                        }
                        //System.out.println("不回文，换字符");
                        break;
                    }
                }
            }

        }
        return sf;
    }*/
}
