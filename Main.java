public class Main{
	public static void main(String[] args){
		JavaVersion v = new JavaVersion();
		System.out.println(v.getJavaVersion());
		FreeMem f = new FreeMem();
		System.out.println(f.getFree());
		System.out.println(f.getMax());
//		EnvMap e = new EnvMap();
	}
}
