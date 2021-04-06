import java.util.*;

class MolibeNumber{
    public static List<String> letterCombination(String digits){
        List<String> result =new ArrayList<>();

        if((digits == null)|| digits.equals("")){
            return result;
        }
        Map<Character,char[]> letteMap=new HashMap<>();
        letteMap.put('0',new char[]{}); 
        letteMap.put('1',new char[]{}); 
        letteMap.put('2',new char[]{'a','b','c'}); 
        letteMap.put('3',new char[]{'d','e','f'}); 
        letteMap.put('4',new char[]{'g','h','i'}); 
        letteMap.put('5',new char[]{'j','k','l'}); 
        letteMap.put('6',new char[]{'m','n','o'}); 
        letteMap.put('7',new char[]{'p','q','r','s'}); 
        letteMap.put('8',new char[]{'t','u','v'}); 
        letteMap.put('9',new char[]{'w','x','y','z'}); 

         StringBuilder sb = new StringBuilder();
         letterCombinationHelper(digits,sb,letteMap,result);  
        return result;
    }
    private static void letterCombinationHelper(String digits,StringBuilder sb,Map<Character,char[]> letteMap,List<String> result){
        if(sb.length()==digits.length()){
            result.add(sb.toString());
            return;
        }
        for(char ch : letteMap.get(digits.charAt(sb.length()))){
            sb.append(ch);
            letterCombinationHelper(digits, sb, letteMap, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
       public static void main(String[] args) {
            System.out.println(letterCombination("23"));
    }   
}