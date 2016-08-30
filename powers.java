package guvi;

public class powers {
	public static void main(String [ ] arg){
	int num=123;
	String s=String.valueOf(num);
	int a[]=new int[s.length()];
for(int i=0;i<s.length();i++){
	a[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
//System.out.println(a[i]);
}int sum=0;
for(int j=0;j<a.length-1;j++){
	int p=(int)Math.pow(a[j], a[j+1]);
	sum=sum+p;
	
}
sum=sum+((int)Math.pow(a[a.length-1], 0));
System.out.println(sum);
	
	
	
	
	
	
	
	
	}
}
