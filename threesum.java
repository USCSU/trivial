public static ArrayList<ArrayList<Integer>> threeSumNew(int[] num, int target){
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			set.addAll(helper(num,i+1,num.length-1,num[i],target));
		}
		return new ArrayList<ArrayList<Integer>>(set);
	}
	public static ArrayList<ArrayList<Integer>> helper(int[] num, int low, int high, int val, int target){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		while(low<high){
			if(num[low]+num[high]<target - val)
				low++;
			else if(num[low]+num[high]>target -val)
				high--;
			else{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(num[low]);
				temp.add(num[high]);
				temp.add(val);
				Collections.sort(temp);
				res.add(temp);
				low++;
			}
		}
		return res;
	}
