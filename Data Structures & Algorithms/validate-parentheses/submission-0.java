class Solution {
    public boolean isValid(String s) {
      
      var map = new HashMap<Character, Character>();
      map.put(')','(');
      map.put(']','[');
      map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(!map.containsKey(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char topE = stack.pop();
                if(topE != map.get(c)){
                    return false;
                }
            }
           
        }
        return stack.isEmpty();
    }
}
