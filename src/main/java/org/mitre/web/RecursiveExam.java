package org.mitre.web;

public class RecursiveExam {

	public static void main(String[] args) {
		String a = "Greetings";
		RecursiveExam a1 = new RecursiveExam();
		a1.printingRe(a);
	}

	private void printingRe(String a) {
		int i=1,j=2;
		if(a.length()<=1){
			System.out.println(a);
		}else{
			while(i<=a.length()){
				System.out.println(a.substring(0, a.length()-i));
				i++;
			}
			while(j<=a.length()){
				System.out.println(a.substring(0, j));
				j++;
			}
		}
		
	}

}
