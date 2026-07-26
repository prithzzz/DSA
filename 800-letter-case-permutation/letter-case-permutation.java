//Time complexity: O(2^n) //2^n permutations for a string of length n


class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        result.add(""); //if u dont initiate result with empty str, then the list is empty and any new char is not appended to list
        //If you started with zero words ([]), there would be nothing to append characters to. 

        for(char c : s.toCharArray()){
            List<String> temp = new ArrayList<>();

            if (Character.isLetter(c)){
                for(String curr : result){
                    temp.add(curr + Character.toUpperCase(c));
                    temp.add(curr + Character.toLowerCase(c));
                }
            }
            else {
                for(String curr : result){
                    temp.add(curr + c);
                }
            }

            result = temp;
        }

        return result;
    }
}