//extend from center to two sides
	public static String getPalindrome(String s, int low ,int high){
		while(low>=0 && high< s.length() && s.charAt(low) == s.charAt(high)){
			low--;
			high++;
		}
		return s.substring(low+1,high);
	}
	public static String maxString(String s1, String s2){
		return s1.length()>s2.length()?s1:s2;
	}
	public static String longestPalidrome(String s){
		if(s == null) return null;
		if(s.length()<2) return s;
			
		String result = "";
		for(int i =0;i<s.length();i++){
			String temp = maxString(getPalindrome(s,i-1,i+1),getPalindrome(s,i,i+1));
			result = maxString(result,temp);
		}
		return result;
	}
