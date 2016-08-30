package guvi;

public class subpart {
	public static void main(String arg[]){
		String x="bat";
		String y="abate";
		String sa=y.replaceAll(x,"");
		System.out.println(sa);
		if(sa.equals(y)){
			System.out.println("no substring");
		}else{
			System.out.println("there is subpart");
		}
		}
}
