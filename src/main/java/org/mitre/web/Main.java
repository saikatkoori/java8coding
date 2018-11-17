package org.mitre.web;

public class Main {

	public static void main(String args[]){
		
int arr[] = {1,3,2};
int temp = 0;
int count = 0;
 		for(int i =0; i<arr.length;i++){
 			for(int j = 1;j<arr.length;j++){
 				if(arr[j]<arr[i] && i!=j){
 					temp = arr[i];
 					arr[i]=arr[j];
 					arr[j]=temp;
 					count++;
 				}
 			}
 		}
 		System.out.println(count);
	}
}
