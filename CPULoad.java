package com.srspencer.Monitoring;
import java.lang.management.*;

public class CPULoad{
	String s;
	OperatingSystemMXBean m;

	public CPULoad(){
		m= ManagementFactory.getOperatingSystemMXBean();	
		s = String.valueOf(m.getSystemLoadAverage());
	}

	public String getLoad(){
		return s;
	}
}
