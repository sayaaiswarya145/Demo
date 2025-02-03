import org.testng.annotations.Test;

public class Practice {
	@Test
	public void function() {
		int max=1;
		int count=1;
		
		
		char ch[] = {'p','p','p','q','p','p','p','f','f','f','p'};
		int n= ch.length;
		//char ch[] = {'p','f','f','f','q'};
		for(int i=1;i<2*ch.length;i++) {
			//char  = ch[i%ch.length];
			if(ch[i%n]==ch[(i-1)%n]) {
				count =count+1;
			}
			else {
				if(count>max) {
					max = count;
				
				}
				count=1;
			}
			
			
		}
		if(count>max) {
			max =count;
		}
		System.out.println(max);
		
		}
	
		}
		
		
		
		


