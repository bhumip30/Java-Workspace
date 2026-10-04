package multithreading_communication;

public class Producer implements Runnable {
	private Thread t;
	private Stocks s;
	private boolean bRun;
	
	public Producer(Stocks s) {
		super();
		this.s = s;
		this.bRun = true;
		this.t = new Thread(this);
	}

	@Override
	public void run() {
		while(bRun)
			s.produce();
		
	}
	
	public Thread getT() {
		return t;
	}
	
	public void setbRun(boolean bRun) {
		this.bRun = bRun;
	}
	
}
