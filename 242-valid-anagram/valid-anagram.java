class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m)
            return false;

        char[] s_array = s.toCharArray();
        Arrays.sort(s_array);
        char[] t_array = t.toCharArray();
        Arrays.sort(t_array);

        if(Arrays.equals(s_array, t_array))
            return true;
        return false;
    }
}