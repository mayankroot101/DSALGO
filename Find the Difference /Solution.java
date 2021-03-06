class Solution{
      public char findTheDifference(String s,String t){
        //You are given two strings s and t.

        //String t is generated by random shuffling string s and then add one more letter at a random position.

        //Return the letter that was added to t.
        //We just have to return the extra character which is added to the string therefore in order to do that
        // we can use HashaMap.
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
          char c = s.charAt(i);
          if(map.containsKey(c)){
            map.put(c,map.getOrDefault(c,0)+1);
          }
        }
        for(int i = 0;i<t.length();i++){
          char c = t.charAt(i);
          if(!map.containsKey(c) || map.get(c)== 0){ // here we are checking if the character is present in the
            return c;                                // in the map or not. 
          }else{
            int curr = map.get(c)-1;
            map.put(c,curr);
          }
        }
        char ans = ' ';
        return ans;
      }
}
