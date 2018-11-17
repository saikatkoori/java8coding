package org.mitre.web;

import java.util.LinkedHashSet;

public class Duplicatechar {
	
		public void style(String s){
          LinkedHashSet<Character> c = new LinkedHashSet<Character>();
          char[] ch = s.toCharArray();
          for(Character c2 : ch){
        	  c.add(c2);
          }
          System.out.print(c);
		}
		public static void main(String args[]){
			Duplicatechar c = new Duplicatechar();
			c.style("helfeertgretrelo");
		}
	}

