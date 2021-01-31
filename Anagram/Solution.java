class Solution{
     public boolean isValid(String s,String t){
          if(s.length()!= t.length())
               return false;
          HashMap<Character,Integer> maps = new HashMap<>();
          for(char c: s.toCharArray())
               maps.put(c,maps.getOrDefault(c,0)+1);
          HashMap<Character,Integer> mapt = new HashMap<>();
          for(char c : t.toCharArray())
               mapt.put(c,mapt.getOrDefault(c,0)+1);
          if(maps.equals(mapt))
               return true;
          else
               return false;
     }
}
