package guvi;

public class date {
	public static void main(String arg[]){
		String s1="02-05-1998";
		String s2="13-02-2013";
int sub=Integer.parseInt(s1.substring(6));
int sub1=Integer.parseInt(s2.substring(6));
int d1,d2;String out="";
if(sub<sub1){
	d1=Integer.parseInt(s1.substring(0,2));
	d2=Integer.parseInt(s1.substring(3,5));
char c='/';
out=out+d2+c+d1+c+sub;
System.out.println(out);
}
else if(sub1<sub){
	d1=Integer.parseInt(s2.substring(0,2));
	d2=Integer.parseInt(s2.substring(3,5));
char c='/';
out=out+d2+c+d1+c+sub1;
System.out.println(out);
}
}
}
