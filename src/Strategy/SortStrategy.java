package Strategy;

public class SortStrategy  implements Strategy{
	private char[] c;
	
	@Override
	public void StringWorker(String s) {
		c = s.toCharArray();
		doSort(0, c.length);
		System.out.println(c);
	}
	
	 private void doSort(int start, int end) {
	        if (start >= end)
	            return;
	        int i = start, j = end;
	        int cur = i - (i - j) / 2;
	        while (i < j) {
	            while (i < cur && (c[i] <= c[cur])) {
	                i++;
	            }
	            while (j > cur && (c[cur] <= c[j])) {
	                j--;
	            }
	            if (i < j) {
	                char temp = c[i];
	                c[i] = c[j];
	                c[j] = temp;
	                if (i == cur)
	                    cur = j;
	                else if (j == cur)
	                    cur = i;
	            }
	        }
	        doSort(start, cur);
	        doSort(cur+1, end);
	    }
}
