package guvi;

public class maxlenstr {
	public static void main(String [ ] arg){
	String s="hello hai how are uuuuu";
	String[] sp=s.split(" ");
	int c[]=new int[sp.length];
	for(int i=0;i<sp.length;i++){
		c[i]=sp[i].length();
		//System.out.println(c[i]);
	}
	for(int q=0;q<c.length;q++){
		for(int w=q+1;w<c.length;w++){
			if(c[q]>c[w]){
				int tmp=c[q];
				c[q]=c[w];
				c[w]=tmp;
				
			}
		}
	}
	int size=c[c.length-1];
	for(int i=0;i<sp.length;i++){
		if(sp[i].length()==size){
		System.out.println(sp[i]+" "+size);
	}
	}
	}
}
