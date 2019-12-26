package com.swq.NiuKe;

public class Loading {
    static int n ;
    static int[] w;
    static int c;
    static int cw;
    static int bestw;
    static int r;
    static int[] x;
    static int[] bestx;
    public static void main(String[] args) {

    }
    public void backtrace(int i) {
        if (i > n)
        {
            if(cw > bestw) {
                cw = bestw;
                for (int j = 1; j < x.length; j++)
                {
                    bestx[j] = x[j];
                }
                return;
            }
            else
            {
                r -= w[i];
                if(cw + w[i] <= c)
                {
                    x[i] = 1 ;
                    cw += w[i];
                    backtrace(i+1);
                    cw -= w[i];
                }
                if(cw + r >= bestw)
                {
                    x[i] = 0;
                    backtrace(i+1);
                }
                r += w[i];
            }
        }
    }
}
