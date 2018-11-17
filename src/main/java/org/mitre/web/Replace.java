package org.mitre.web;


public class Replace {
	
		public void style(String s){
		
       for(int i =0 ; i<s.length();i++){
    	   if(s.charAt(i)==' '){
    		   String a = new StringBuffer(s).replace(i, i+1, "%20").toString();
    		    System.out.println(a);
    	   }
       }
       
          
		}
		public static void main(String args[]){
			Replace c = new Replace();
			c.style("helfeertg r  etrelo");
		}
	}

