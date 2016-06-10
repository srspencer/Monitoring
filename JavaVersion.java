package com.srspencer.Monitoring;
public class JavaVersion{
	String v;

	public JavaVersion(){
		v = System.getProperty("java.version");
	}

	public String getJavaVersion(){
		return(v);
	}

	public static void main(String[] args){
		System.out.println(new JavaVersion().getJavaVersion());
	}
}
