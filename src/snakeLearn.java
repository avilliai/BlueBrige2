public class snakeLearn {
    static int sum=0;
    static int number=0;
    static int[][] a=new int[4][4];
    static void dfs(int r,int c,int[][] a,int number){
        if (r<0||c>3||c<0||r>3){
            return;
        }
        if (a[r][c]==1){
            return;
        }
        if (number>15){
            sum++;
        }
        a[r][c]=1;
        dfs(r-1,c,a,number++);
        dfs(r+1,c,a,number++);
        dfs(r,c-1,a,number++);
        dfs(r,c+1,a,number++);
        a[r][c]=0;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                dfs(i,j,a,0);
            }
        }
        System.out.println(sum);
    }
}
