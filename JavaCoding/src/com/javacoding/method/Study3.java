package com.javacoding.method;

public class Study3 {
	
	    public static String[] getMembers() {
	        String[] members = { "최진혁", "최유빈", "한아람" };
	        return members;
	    }
	   
	    public static void main(String[] args) {
	        String[] members = getMembers();
	        for ( int i = 0; i < members.length; ++i ) {
	        	System.out.println(members[i]);
	        }
	        
	        
	    }
	 
	}
