class Solution {
    String printLargest(int n, String[] arr) {
        // code here
            Arrays.sort(arr,(a,b)->{
            String t=""+a+b;
            String m=""+b+a;
            return m.compareTo(t);
            
        });
        StringBuilder sb =new StringBuilder();
        for(String item:arr) sb.append(item);
        return sb.toString();
    }
}