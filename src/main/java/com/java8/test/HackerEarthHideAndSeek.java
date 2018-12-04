package com.java8.test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class HackerEarthHideAndSeek {
	
	public static void main(String[] args){
		new Thread(null, new Runnable(){
			public void run(){
				new HackerEarthHideAndSeek().solve();
			}
		},"1",1<<26).start();
	}

	 void solve() {
		ScanReader in = new ScanReader(System.in);	
		PrintWriter out = new PrintWriter(System.out);	
		HideAndSeekGame hideAndSeekGame = new HideAndSeekGame(); 
		hideAndSeekGame.solve(1,in, out);
	}
	 static class HideAndSeekGame{

		 ArrayList<Integer>[] arrayList;
		 int n;
		 boolean[] visited;
		 int timer =0;
		 int[] starttime;
		 int[] endtime;
		public void solve(int testNumber, ScanReader in, PrintWriter out) {
			n = in.scanInt();
			arrayList = new ArrayList[n+1];
			visited = new boolean[n+1];
			starttime = new int[n+1];
			endtime = new int[n+1];
			for(int i=0;i<=n;i++) arrayList[i] = new ArrayList<>();
			for(int i=0;i<n-1;i++){
				int x = in.scanInt();
				int y = in.scanInt();
				arrayList[i].add(y);
			}
			DFS(1);
			int q = in.scanInt();
			int type, x, y;
			boolean f1,f2;
			while(q-- > 0){
				
			}
			
		}
		private void DFS(int s) {
			visited[s] = true;
			starttime[s] = timer++;
			
			
		}
		 
	 }
	 class ScanReader{
		 
		 private byte[] buff = new byte[4*1024];
		 private int index;
		 private BufferedInputStream in;
		 private int Total_char;
		public ScanReader(InputStream iO) {
			in = new BufferedInputStream(iO);		}

		public int scanInt() {

			int integer = 0;
			int n =scan();
			while(isWhiteSpace(n)) n = scan();
			int neg = -1;
			if( n==-1){
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)){
				if(n>='0'&&n<='9'){
					integer*=10;
					integer +=n-'0';
					n =scan();
				}
			}
			return 0;
		}

		private boolean isWhiteSpace(int n) {
			if(n == ' ' || n=='\n'||n=='\r'||n=='\t'|| n==-1) return true;
			else return false;
		}

		private int scan() {
			if(index>=Total_char){
				index = 0;
				try{
					Total_char = in.read(buff);
				}catch(Exception e){
					e.printStackTrace();
				}
				if(Total_char<=0)return -1;
			}
			
			return buff[index++];
		}
			
	 }

}
