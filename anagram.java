  //o(nlogn) ordered can be treemap can be linkedhashmap
	public static ArrayList<ArrayList<String>> anagram(String[] list){
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		Comparator<String>  cmp = new Comparator<String>(){
			public int compare(String e1,  String e2){
				return e2.compareTo(e1);
			}
		};
		TreeMap<String,ArrayList<String>> map = new TreeMap<String,ArrayList<String>>(cmp);
		//o(n) partial order
//		LinkedHashMap<String,ArrayList<String>> map = new LinkedHashMap<String,ArrayList<String>>();
		for(String s:list){
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String str = new String(temp);
			if(map.containsKey(str)){
				 map.get(str).add(s);
				
			}else{
				ArrayList<String> array = new ArrayList<String>();
				array.add(s);
				map.put(str, array);
			}
		}
		for(ArrayList<String> t : map.values())
			res.add(t);
		
		return res;
	}
	//o(n) unordered hashmap
	public static ArrayList<ArrayList<String>> anagramHash(String[] list){
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		HashMap<String,ArrayList<String>> map =new HashMap<String,ArrayList<String>>();
		for(String s:list){
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String str = new String(temp);
			if(map.containsKey(str)){
				map.get(str).add(s);
			}else{
				ArrayList<String> array = new ArrayList<String>();
				array.add(s);
				map.put(str, array);
			}
		}
		for(ArrayList<String> t:map.values())
			res.add(t);
		return res;
	}
	//o(n) ordered self-created linkedmap, can be sorted
	public static ArrayList<ArrayList<String>> anagramOrder(String[] list){
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		HashMap<String,ArrayList<String>> map =new HashMap<String,ArrayList<String>>();
		LinkedList<String> order = new LinkedList<String>();
		for(String s:list){
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String str = new String(temp);
			if(map.containsKey(str)){
				map.get(str).add(s);
			}else{
				order.add(str);
				ArrayList<String> array = new ArrayList<String>();
				array.add(s);
				map.put(str, array);
			}
		}
//		//o(mlogm)
//		Comparator<String> cmp = new Comparator<String>(){
//			public int compare(String s1, String s2){
//				return s2.compareTo(s1);
//			}
//		};
//		Collections.sort(order,cmp);
		
		for(String s:order)
			res.add(map.get(s));
		return res;
	}
