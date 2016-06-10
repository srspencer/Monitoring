package com.srspencer.Monitoring;
public class FreeMem {

	String total;
	String free;
	String max;
	Long l;

	public FreeMem(){
		Runtime r = Runtime.getRuntime();
		l = r.freeMemory();
		free = l.toString();
		l = r.maxMemory();
		max = l.toString();
		l = r.totalMemory();
		total = l.toString();
	}
	
	public String getFree(){
		return(free);
	}

	public String getMax(){
		return(max);
	}

	public String getTotal(){
		return(total);
	}
}
