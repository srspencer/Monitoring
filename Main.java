import java.io.File;
import com.srspencer.Monitoring.*;

public class Main{
	public static void main(String[] args){
		JavaVersion v = new JavaVersion();
		System.out.println(v.getJavaVersion());
		FreeMem f = new FreeMem();
		System.out.println(f.getFree());
		System.out.println(f.getMax());
//		EnvMap e = new EnvMap();
		CPULoad c = new CPULoad();
		System.out.println(c.getLoad());

		try{
		  DiskFree d = new DiskFree();	
		  for (int i=0; i< d.f.length; i++){
			File g = d.f[i];
			System.out.println(g.getCanonicalPath()+"  "+g.getFreeSpace());
		  }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
