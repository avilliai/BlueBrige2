//这个跟上面就是有一些地方写法不同，道理是一样的
import java.util.Scanner;
public class DFS1 {
    static int sum=0;    //结果：sum种方法
    static int number=0; //步数
    static int a[][]=new int[4][4];  //4*4的二维数组
    static void dfs(int r,int c,int a[][],int number) { //r行c列数组a
        if(r<0 || c<0 || r>3 || c>3)
            return;
        if(a[r][c]==1)    //位置已经被占
            return;
        if(number>=15)    //放满玩具蛇
            sum++;
        a[r][c]=1;        //=1就是被占
        dfs(r-1,c,a,number+1);  //上
        dfs(r+1,c,a,number+1);  //下
        dfs(r,c-1,a,number+1);  //左
        dfs(r,c+1,a,number+1);  //右
        a[r][c]=0;        //置回0
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //暴力枚举二维数组所有的位置
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                dfs(i,j,a,0);
            }
        }
        System.out.print(sum);
    }
}

