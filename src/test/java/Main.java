class Main {
    static String demo(String s){
        String str ="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                str=str+s.charAt(i);
            }
        }
        return str;
        
    }
  static String palindrome(String str){
        //Main m =new Main();
        //String str = demo();
        String a="";
        for(int i=str.length()-1;i>=0;i--){
            a=a+str.charAt(i);
        }
        return a;
        
    }
    
    public static void main(String[] args) {
        String name="sayaaiswarya145@gmail.com";
       //Main n = new Main();
        String s1=demo(name);
        
        String s2=palindrome(s1);
        if(s1.equals(s2)) {
        	 System.out.println("pal");
        }
        else {
        	System.out.println("not pal");
        }
            
        
       
    }
}