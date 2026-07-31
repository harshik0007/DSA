class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        
        int matchs = 0;
        for(int i = 0; i < items.size(); i++){
            if(ruleValue.equals(items.get(i).get(ind))){
                matchs++;
            }
        }
        return matchs;
    }
}