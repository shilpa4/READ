package guvi;

public class sorted {
	public static void main(String arg[]){
		int c[]={8,4,9,2,1,45};
		int s[]=new int[10];int a=0;		for(int q=0;q<c.length;q++){
			for(int w=q+1;w<c.length;w++){
				if(c[q]>c[w]){
					int tmp=c[q];
					c[q]=c[w];
					c[w]=tmp;
					
				}
			}
			s[a]=c[q];
			System.out.println(s[a]);
			a++;
		}
		
	}
}
