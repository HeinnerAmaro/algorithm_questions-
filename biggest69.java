class Solution {
    public int maximum69Number (int num) {
        //String builder solution,if we change the first digit that is not 9, by the  decimal places we know that the first 6 that is replaced with make the 
        number bigger. 
        StringBuilder numbers = new StringBuilder();
        numbers.append(num);
        for(int i = 0; i < numbers.length(); i++)
        {
            if(numbers.charAt(i) != '9')
            {
                 numbers.setCharAt(i,'9');
                 break; 
            }
        }
        return Integer.parseInt(numbers.toString());
        
    }
}
