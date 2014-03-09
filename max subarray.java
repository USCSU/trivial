//O(1) space and linear time
public static int maxArray(int[] A){
		int max = A[0];
		int temp = A[0];
		for(int i = 1 ; i< A.length; i++){
			temp = Math.max(A[i], temp+A[i]);
			max = max<temp?temp:max;
		}
		return max;
	}
	
	//o(n) Space and linear time
	 public int maxSubArray(int[] A) {
      
        
        int[] res = new int[A.length];
        int max = Integer.MIN_VALUE;
        res[0] = A[0];
        max = res[0];
        for(int i =1;i<A.length;i++){
            
            res[i] = Math.max(A[i],res[i-1]+A[i]);
            if(res[i] > max)
            max = res[i];
        }
        return max;
    
    
    }
