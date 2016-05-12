public class FreeMem{
	String free;
	String max;
	long f;
	public FreeMem(){
		f = Runtime.getRuntime().freeMemory();
		free = Long.toString(f);
		f = Runtime.getRuntime().maxMemory();
		max = Long.toString(Runtime.getRuntime().maxMemory());
	}

	public String getMax(){
		return max;
	}	

	public String getFree(){
		return free;
	}
}
