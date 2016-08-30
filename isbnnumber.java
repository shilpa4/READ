package guvi;

public class isbnnumber {
	public static void main(String arg[]){
		String x="0201103311";int y=10;int out,sum=0,ss;
	if(x.length()==10){
		for(int i=0;i<x.length();i++){
			ss=(Integer.parseInt(String.valueOf(x.charAt(i))))*y;
			sum=sum+ss;
			y--;
		}
	}
	if(sum%11==0){
		System.out.println("isbn number");
	}
	else{
		System.out.println("not isbn");
	}
	
	
	}
}
