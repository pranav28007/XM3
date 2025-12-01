class Buffer{
	int data;
	boolean isEmpty=false;

	  synchronized  void produce(int value)
	{
		while(isEmpty)
		{
			try{
				wait();
			}
			catch(InterruptedException e){

			}
		}
		 data=value;
		System.out.println("producer produced"+value);
		isEmpty=true;
		notify();
	}


	synchronized  int consume()
	{
		while(!isEmpty)
		{
			try{
				wait();
			}
			catch(InterruptedException e)
			{
			}
		}
			System.out.println("consumer consumed"+data);
			isEmpty=false;
			notify();
			return data;
	}
}

class Producer implements Runnable{
	Buffer b;
	Producer(Buffer b){
		this.b=b;
	}
	public void run()
	{
		int i=1;
		while(1<=5)
		{
			b.produce(i);
			i++;
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

	class Consumer implements Runnable{
		Buffer b;
		Consumer(Buffer b){
			this.b=b;
		}
		public void run()
		{
			int i=1;
			while(i<=5)
			{
				b.consume();
				i++;
				try{Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
				}
			}
		}
	}



	public class producer{
		public static void main(String args[])
		{
			Buffer b=new Buffer();
			Thread t1=new Thread(new Producer(b));
			Thread t2=new Thread(new Consumer(b));
			t1.start();
			t2.start();
		}
	}
