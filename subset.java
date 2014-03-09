	public static ArrayList<ArrayList<Integer>> Allset(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int bit = 1<<set.size();
		for(int i = 0; i <bit ;i++){
			res.add(convertInt(i,set));
		}
		return res;
	}
	public static ArrayList<Integer> convertInt(int x, ArrayList<Integer> set) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int index = 0;//set.size()-1;
		for(int k = x ;k>0;k>>=1){
			if((k & 1) == 1)
			    res.add(set.get(index));
			index++  ;
			
		}
		return res;
	}
	//recursive way
	public static ArrayList<ArrayList<Integer>> getAllsubSet(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(index==-1){
			res.add(new ArrayList<Integer>());
			return res;
		}
		ArrayList<ArrayList<Integer>> subset = getAllsubSet(set,index-1);
		res.addAll(subset);
		for(ArrayList<Integer> sub:subset){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.addAll(sub);
			temp.add(set.get(index));
			res.add(temp);
		}
		return res;
	}
