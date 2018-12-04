package com.java8.test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
 

public class Main {
    public static void main(String[] ARGS) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }
 
    void solve() {
        ScanReader in = new ScanReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        OliverAndTheGame oliverandthegame = new OliverAndTheGame();
        oliverandthegame.solve(1, in, out);
        out.close();
    }
 
    static class OliverAndTheGame {
        ArrayList<Integer>[] arrayList;
        boolean[] visited;
        int n;
        int timer = 0;
        int[] starttime;
        int[] endtime;
 
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            n = in.scanInt();
            arrayList = new ArrayList[n + 1];
            visited = new boolean[n + 1];
            starttime = new int[n + 1];
            endtime = new int[n + 1];
            for (int i = 0; i <= n; i++) arrayList[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int x = in.scanInt();
                int y = in.scanInt();
                arrayList[x].add(y);
            }
 
 
            DFS(1);
 
            int q = in.scanInt();
            int type, x, y;
            boolean f1, f2;
            while (q-- > 0) {
                type = in.scanInt();
                x = in.scanInt();
                y = in.scanInt();
                f1 = isvaild(x, y);
                f2 = isvaild(y, x);
                if (f1 || f2) {
 
                    if (type == 0) {
                        if (f1)
                            out.println("YES");
                        else
                            out.println("NO");
                    } else {
                        if (f2)
                            out.println("YES");
                        else
                            out.println("NO");
                    }
                } else {
                    out.println("NO");
                }
            }
 
 
        }
 
        boolean isvaild(int x, int y) {
            if (starttime[x] < starttime[y] && endtime[x] > endtime[y]) return true;
            else return false;
        }
 
        void DFS(int s) {
            visited[s] = true;
            starttime[s] = timer++;
            for (int i = 0; i < arrayList[s].size(); i++) {
                int t = arrayList[s].get(i);
                if (!visited[t]) {
                    DFS(t);
                }
            }
            endtime[s] = timer++;
            return;
        }
 
    }
 
    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int Total_Char;
 
        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }
 
        private int scan() {
            if (index >= Total_Char) {
                index = 0;
                try {
                    Total_Char = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (Total_Char <= 0) return -1;
            }
            return buf[index++];
        }
 
        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }
 
        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }
 
    }
}