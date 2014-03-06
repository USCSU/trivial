	//---------------------------------------
	//bit munipulation with standard output
	public static void comb(String word) {
	    int digits = 1<<word.length();
	    char[][] dict = {word.toLowerCase().toCharArray(),word.toUpperCase().toCharArray()};
	    for(int i =0;i<digits;i++){
	    	for(int j =0;j<word.length();j++){
	    		System.out.print(dict[(i>>j)&1][j]);
	    	}
	    	System.out.println();
	    }
	}
	//----------------------------------------
	//With 2^n time complexity,bit munipulation with return arraylist
	public static ArrayList<String> combination(String word) {
		ArrayList<String> array = new ArrayList<String>();
	    int digits = 1<<word.length();
	    char[][] dict = {word.toLowerCase().toCharArray(),word.toUpperCase().toCharArray()};
	    for(int i =0;i<digits;i++){
	    	StringBuffer sb = new StringBuffer();
	    	for(int j =0;j<word.length();j++){
	    		sb.append(dict[(i>>j)&1][j]);
	    	}
	    	array.add(sb.toString());
	    }
	    return array;
	}
	//-------------------------------------------------------
	//recursive way
	public static void comb4(String word) {
		 
	    ArrayList<char[]> list = comb4(word,new char[word.length()],0,new ArrayList<char[]>());
	    for(char[] s:list)
	    	System.out.println(s);

	}    

	private static ArrayList<char[]> comb4(String word, char[] accu, int index,ArrayList<char[]> res){
	    if(index == word.length()) {
	       res.add(accu.clone());
	    } else {
	        char ch = word.charAt(index);
	        accu[index] = Character.toLowerCase(ch);
	        comb4(word, accu , index+1,res);
	        accu[index] = Character.toUpperCase(ch);
	        comb4(word, accu, index+1,res);
	    }
	    return res;
	}
