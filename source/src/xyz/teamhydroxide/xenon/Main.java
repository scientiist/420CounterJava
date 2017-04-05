package xyz.teamhydroxide.xenon;

public class Main {
	 
	public static void main (String[] args) {
	 
int x = 0;
while(true){
x = x + 1;
System.out.println(x);
try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	
}
if(x == 420) {
	System.out.println("Bow wow wow yippie yo yippie yay, Snoop doggy dog in the house!");
	
}
}
	}
}
	 
	 


