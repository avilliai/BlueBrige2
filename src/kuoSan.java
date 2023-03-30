import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class kuoSan {
    static int[][] map = new int[10000][10000];
    public static void main(String[] args) {
        map[0+3000][0+3000]=1;
        map[2020+3000][11+3000]=1;
        map[11+3000][14+3000]=1;
        map[2000+3000][2000+3000]=1;

        doit(3000,3000);
        doit(2020+3000,11+3000);
        doit(11+3000,14+3000);
        doit(2000+3000,2000+3000);

        int cnt = 0;
        for(int i=0;i<10000;i++)
            for(int j=0;j<10000;j++) if(map[i][j]==1) cnt++;
        System.out.println(cnt);//20312088
    }

    private static void doit(int x, int y) {
        int t = 0;
        for(int i=x-2020;i<=x-1;i++) {
            for(int j=y-t;j<=y+t;j++) map[i][j]=1;
            t++;
        }

        for(int j=y-2020;j<=y+2020;j++) map[x][j]=1;

        t = 2019;
        for(int i=x+1;i<=x+2020;i++) {
            for(int j=y-t;j<=y+t;j++) map[i][j]=1;
            t--;
        }
    }
}
