public class EightEmpresses {

    public static void main(String[] args) {
        int[][] chessboard = new int[8][8];
        Tools tool = new Tools();
        int[] count = new int[1];
        //从第0行开始尝试
        //put这个方法就是要找到所有解
        tool.put(0, chessboard, count);
        System.out.println("count=  " + count[0]);
    }
}

class Tools {
    public void put(int n, int[][] chessboard, int[] count) {
        for (int m = 0; m < 8; m++) {
            //如果这里不能放就找下一列
            if (ifPut(n, m, chessboard)) {
                //先置为1(如果不能找到解，或者找到了解要找下一个解时，就置为0）
                chessboard[n][m] = 1;
                if (n == 7) {
                    //找到一个解
                    //计数，打印
                    count[0]++;
                    Print(chessboard, 8, 8);
                    //然后寻找下一个解
                    chessboard[n][m] = 0;
                    return;
                }
                //不管找到与否，chessboard[n][m]都要置为0，然后寻找下一列
                put(n + 1, chessboard, count);
                //这个时候已经找到了第n行第m列的所有解，所以要继续寻找下一列
                chessboard[n][m] = 0;
            }
        }
        //如果都不能放就返回false，表示这个放法不可行
    }

    //判断（i，j）位置上放置皇后是否可行
    public boolean ifPut(int i, int j, int[][] chessboard) {
        for (int p = 0; p < i; p++) {
            if (chessboard[p][j] == 1) return false;
            else {
                for (int t = 0; t < 8; t++) {
                    if (t == j) continue;
                    //这里要注意整数除法问题
                    if (Math.abs((p - i) / (t - j + 0.0)) == 1.0 && chessboard[p][t] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public void Print(int[][] chessboard, int i, int j) {

        System.out.println("===================");
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {
                System.out.print(chessboard[m][n]);
            }
            System.out.println();
        }
    }
}
