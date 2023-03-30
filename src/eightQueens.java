public class eightQueens {
    public static void main(String[] args) {
        int[][] chess=new int[8][8];
        show(chess);
    }
    public static void show(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean setQueens(int[][] chess,int i){
        if (i==8){
            show(chess);
            return true;
        }else {
            return true;
        }
    }
}
