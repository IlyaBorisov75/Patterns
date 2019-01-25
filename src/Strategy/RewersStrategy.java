package Strategy;

public class RewersStrategy  implements Strategy{

	@Override
	public void StringWorker(String s) {
		char[] c;
		c = s.toCharArray();
		char temp;
		int j=c.length;
		for (int i=0; i<c.length/2; i++) {
			if (i<j) {
				temp = c[i];
				c[i]=c[j];
				c[j]=temp;
				j--;
			}
		System.out.println(c);
		}
	}

}
