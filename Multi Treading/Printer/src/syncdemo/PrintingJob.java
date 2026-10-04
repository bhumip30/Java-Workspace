package syncdemo;
	//thread
	//printing data with the help of printer
	//1
	public class PrintingJob implements Runnable {
		//2
		private Thread t;
		private Printer p;
		private String header, body, footer;
		
		//3
		public PrintingJob(Printer p, String header, String body, String footer) {
			super();
			this.p = p;
			this.header = header;
			this.body = body;
			this.footer = footer;
			this.t = new Thread(this);
		}	

		//4
		public void run() {
			//p.print(header, body, footer);   //async behavior
			p.syncPrint(header, body, footer);   //sync behavior
		}
		
		//5
		public Thread getT() {
			return t;
		}

}
