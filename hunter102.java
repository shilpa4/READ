package guvi;

public class hunter102 {
	public static void main(String [ ] arg){
		int num=1234;
		String s=String.valueOf(num);
		int a[]=new int[s.length()];
	for(int i=0;i<s.length();i++){
		a[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
//System.out.println(a[i]);
	}int sum=0;
	for(int j=0;j<a.length;j++){
		for(int k=0;k<j+1;k++){
		sum=sum+a[k];
	}
	}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	}
}
