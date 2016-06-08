import java.io.File;

public class DiskFree{
	File[] f;

	public DiskFree(){
		f = File.listRoots();
	}

}
