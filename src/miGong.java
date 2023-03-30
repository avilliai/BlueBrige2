public class miGong {
    public static void main(String[] args) {
        int[][] map1=new int[8][7];
        //System.out.println(map1[0][0]);

        //System.out.println(map.length);
        for (int i = 0; i < 7; i++) {
            map1[0][i]=1;
            map1[7][i]=1;
        }
        for (int i = 0; i < 8; i++) {
            map1[i][0]=1;
            map1[i][6]=1;
        }
        map1[3][1]=1;
        map1[3][2]=1;
        findWay(map1,2,3);
        show(map1);

    }
    public static void show(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    /*map为地图
      i,j为出发位置
      目标【6，5】
      map[i,j]为0时代表没走过，为2时表示走过，3表示走过，但是走不通
      定义一个策略
      先走下，再走右，然后上，最后左，走不通就回溯
     */
    public static boolean findWay(int[][] map,int i,int j){
        if (map[6][5]==2){
            System.out.println("ok");
            //show(map);
            return true;
        }else {
            if (map[i][j]==0){
                map[i][j]=2;
                if (findWay(map,i+1,j)){
                    return true;
                }else if (findWay(map, i, j+1)){
                    return true;
                }else if (findWay(map, i-1, j)){
                    return true;
                }else if (findWay(map, i, j-1)){
                    return true;
                }else {
                    map[i][j]=3;
                    return false;
                }

            }else {
                return false;
            }
        }
    }
}
