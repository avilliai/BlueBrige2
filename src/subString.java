import java.util.HashSet;
import java.util.Set;

public class subString {
    public static void main(String[] args) {
        /*String target = "0100110001010001";
        Set<String> sub = new HashSet<String>();
        for (int step = 0; step <= target.length() - 1; step++) {
            System.out.println("----------------");
            for (int beginIndex = 0, endIndex = 1 + step; endIndex <= target.length(); beginIndex++, endIndex++) {
                System.out.println("be:"+beginIndex+" end:"+endIndex);
                sub.add(target.substring(beginIndex, endIndex));
            }
        }
        System.out.println(sub.size());*/
        String s= "abcabcbb";
        Solution so=new Solution(s);
        System.out.println(so.lengthOfLongestSubstring(so.s));

    }

}


class Solution {
    String s;
    public Solution(String s){
        this.s=s;
    }
    public int lengthOfLongestSubstrings(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i),flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }


    public int lengthOfLongestSubstring(String s) {
        String target = s;
        int longest=0;
        for (int step = 1; step <= target.length() - 1; step++) {
            for (int beginIndex = 0, endIndex = 1 + step; endIndex <= target.length(); beginIndex++, endIndex++) {
                String subEd=target.substring(beginIndex, endIndex);

                char[] char1=subEd.toCharArray();
                int temp=0;
                for (char cha:char1){
                    int count=0;
                    for (int i=0;i<subEd.length();i++) {
                        if (subEd.charAt(i) == cha){//计算cha在subEd中出现的次数
                            count++;
                        }
                    }
                    System.out.println("字符："+cha+" 在subEd:"+subEd +" 中出现了："+count+" 次");
                    if (count>1){
                        temp=0;
                        break;//跳出循环，切换到下一个字符串
                    }else {
                        temp=subEd.length();
                    }
                }
                if (temp!=0){
                    longest=temp;
                }

                System.out.println("-----------------------------------");


            }
        }
        System.out.println(longest);
        return longest;

    }
}

