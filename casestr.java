package guvi;

public class maxlenstr {
	public static void main(String [ ] arg){
	String s="Welcome tO guVI",sim="",out="";
	String ss[]=s.split(" ");
	for(int i=0;i<ss.length;i++){
	StringBuffer ff=new StringBuffer(ss[i]);
	ff.reverse();
	String dd=new String(ff);
	sim=sim+dd+" ";
	}
	System.out.println(sim);
	char c;
	String c1;
	for(int j=0;j<s.length();j++){
		c=s.charAt(j);
		c1=String.valueOf(sim.charAt(j));
		if(c>=65 && c<=90){
			String vv=c1.toUpperCase();
			out=out+vv;
		}
		else if(c>=97 && c<=122){
			String vv=c1.toLowerCase();
			out=out+vv;
		}
else if(c==32){
			String vv=" ";
			out=out+vv;
		}
	}
	
	System.out.println(out);
	
	
	
	
	}
}
