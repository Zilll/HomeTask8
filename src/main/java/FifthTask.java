public class FifthTask {
public static void main(String[] args) {
	int a = min(2,2);
	int a2=min(3,1,5,6);
	int gg = Math.min(a,a2);

	System.out.println(gg);
}
public static int min(int a, int b, int c, int d) {
	int val;
	if (a < b || a<c || a<d){
		val = a;
	} else
		val = b;
	return val;
}
	public static int min ( int a, int b){
		int val;
		if (a < b){
			val = a;
		} else
			val = b;
		return val;
	}
}






