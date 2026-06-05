class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxF=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxF=Math.max(maxF,map.get(ch));
            while((i-l+1)-maxF > k){
                char leftCh=s.charAt(l);
                map.put(leftCh,map.get(leftCh)-1);
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}
