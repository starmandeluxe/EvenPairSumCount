
//find the number of pairs in an array, that when summed, is an even sum
public class EvenPairSumCount {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4,5}));

	}
	
	
	public static int solution(int[] A)
	{
		int evens = 0;
		int odds = 0;
		
		//find all the evens and odds first
		for (int i = 0; i < A.length; i++)
		{
			if (A[i]%2 == 0)
			{
				evens++;
			}
			else
				odds++;	
		}
		
		//N * (N-1)/2
		int N = evens;
		int M = odds;
		//calculate the number of sums for both evens and odds
		int result1 = M * (M-1)/2;
		int result2 = N * (N-1)/2;
		
		return result1 + result2;
		
	}
	
	/*alternative code
	 int sum = 0;

	int odd = 0;
	int even = 0;
	for(int j = 0; j < A.length; j++) {
	    if(A[j] % 2 == 0) {
	        sum += even;
	        even++;
	    } else {
	        sum += odd;
	        odd++;
	    }
	}
	*/

}
