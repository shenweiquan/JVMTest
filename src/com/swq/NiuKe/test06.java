package com.swq.NiuKe;

public class test06 {

    public static void main(String[] args) {
        char[] matrix = new char[]{'A','B','C','E','S','F','C','S','A','D','E','E'};
        char[] str = new char[]{'A','B','C','C','E','D'};
        System.out.println(hasPath(matrix,3,4,str));
    }
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean[] isvirsted = new boolean[matrix.length];


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(judge(matrix,i,j,rows,cols,isvirsted,str,0)){
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean judge(char[] matrix,int i,int j,int rows,int cols,boolean[] flag,char[] str,int k) {
        {

            //先根据i和j计算匹配的第一个元素转为一维数组的位置
            int index = i * cols + j;
            //递归终止条件
            if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || flag[index] == true)
                return false;
            //若k已经到达str末尾了，说明之前的都已经匹配成功了，直接返回true即可
            if (k == str.length - 1)
                return true;
            //要走的第一个位置置为true，表示已经走过了
            flag[index] = true;

            //回溯，递归寻找，每次找到了就给k加一，找不到，还原
            if (judge(matrix, i - 1, j, rows, cols, flag, str, k + 1) ||
                    judge(matrix, i + 1, j, rows, cols, flag, str, k + 1) ||
                    judge(matrix, i, j - 1, rows, cols, flag, str, k + 1) ||
                    judge(matrix, i, j + 1, rows, cols, flag, str, k + 1)) {
                return true;
            }
            //走到这，说明这一条路不通，还原，再试其他的路径
            flag[index] = false;
            return false;
        }
    }

}
