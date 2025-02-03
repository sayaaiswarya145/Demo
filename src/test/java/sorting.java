import org.testng.annotations.Test;

public class sorting {
	@Test
public void sort() {
	String s = "impressive";
	char ch[]=s.toCharArray();
	
	for(int i=0;i<s.length()-1;i++) {
	
		for(int j=0;j<s.length()-1;j++) {
			char temp =ch[j];
			if(ch[j]>ch[j + 1]) {
				ch[j]=ch[j+1];
				ch[j+1]=temp;
				
			}
		}
	}
	for(char x:ch) {
		System.out.print(x);
	}
			
			
		}
	}

