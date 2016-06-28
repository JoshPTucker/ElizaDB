package elizaProDB;

public class QuestionInterrupt implements Runnable{
	@Override
	public void run(){
		Thread ct2 =Thread.currentThread();
		int count=1;
		
		while(count<5){
			try{
				Thread.sleep(50000);
				
			}catch (InterruptedException e){
				break;
			}
			ElizaDB.getRandomQuestion();
			count++;
		}
		System.out.println("Thanks for talking with me");
	}
}
