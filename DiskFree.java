package com.srspencer.Monitoring;
import java.io.File;

public class DiskFree{
	public File[] f;

	public DiskFree(){
		f = File.listRoots();
	}

}
