package com.java8.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class nodeA{
	int value;
	int size; // keeps track of no. of nodes
	nodeA next = null;
	nodeA(int v){
		value = v;
	}
}
class nodeB{
	int value;
	boolean visited = false;
	HashSet<Integer> H = new HashSet<Integer>();
	nodeB(int v){
		value= v;
	}
}
public class HideAndSeekHacker {
	int counter = 0;
	Map<Integer,nodeA> toList = new HashMap<Integer,nodeA>();
	nodeB[] toNode;
	HideAndSeekHacker(int n){
		toNode = new nodeB[n+1];
	}
	void addToLinkedList(int a, nodeA N, nodeA x){
		x.next = N;
		toList.put(new Integer(a), x);
	}
	void addToList(int a, int x){
		if(toNode[a] == null){
			toNode[a] = new nodeB(a);
		}
		if(toNode[x] == null){
			toNode[x] = new nodeB(x);
		}
		if(toList.containsKey(a)){
			nodeA X = new nodeA(x);
			nodeA N = toList.get(a);
			X.size = N.size+1;
			addToLinkedList(a, N, X);
			
		}else{
			nodeA N = new nodeA(x);
			N.size = 1;
			toList.put(new Integer(a), N);
		}
		
		
	}
	void modifiedDFS(int a){
		
	}
	
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		HideAndSeekHacker O = new HideAndSeekHacker(N);
		for(int i=0;i<N-1;i++){
			line = br.readLine();
			O.addToList(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1]));
		}
	}

}
