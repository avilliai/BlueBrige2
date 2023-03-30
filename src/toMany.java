public class toMany {
    public static void main(String[] args) {
        int num=2019;
        int count=0;
        for (int i = 1; i < num&&i>=0; i++) {
            String str=String.valueOf(i);
            if (str.contains("2")||str.contains("4")){
                continue;
            }
            for (int j = i+1; j < num-i&&j>=0; j++) {
                int k=num-i-j;
                String str1=String.valueOf(j);
                if (str1.contains("2")||str1.contains("4")){
                    continue;
                }
                String str2=String.valueOf(k);
                if (str2.contains("2")||str2.contains("4")){
                    continue;
                }
                if (i!=j&&i!=k&&j!=k&&k>0){
                    count+=1;
                }

            }
        }
        System.out.println(count/3);
        
    }
}
