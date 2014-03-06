public static HashMap<String, Integer> getFrequency(String[] strs){
		HashMap<String,Integer> map = new HashMap<String,Integer>(strs.length); 
		for(String s:strs){
			if(!map.containsKey(s)){
				map.put(s, 1);
			}else{
				map.put(s, map.get(s)+1);
			}
		}
		
		return map;
	}
	public static ArrayList<String> getTopK(HashMap<String, Integer> set, int k){
			ArrayList<String> array = new ArrayList<String>();
			//over-wirte comparator
			Comparator<Entry<String,Integer>> cmp = new Comparator<Entry<String,Integer>>(){
				public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2){
					if(e1.getValue()>e2.getValue())
						return 1;
					else if(e1.getValue()<e2.getValue())
						return -1;
					else {
						return e1.getKey().compareTo(e2.getKey());
					}
				}
				
			};
			PriorityQueue<Entry<String,Integer>> q = new PriorityQueue<Entry<String,Integer>>(k,cmp);
			Iterator<Entry<String,Integer>> it = set.entrySet().iterator();
			while(it.hasNext()){
				Entry<String,Integer> temp = it.next();
				if(q.size()<k){
					q.add(temp);
				}else{
					if(temp.getValue()>q.peek().getValue()){
						q.poll();
						q.add(temp);
					}	
				}
			}
			while(!q.isEmpty())
				array.add(q.poll().getKey());
			return array;
	}
