class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        Integer count = 1;
        for(int i = 0; i < n; i++){
            if(count % 3 == 0 && count % 5 == 0){
                l.add("FizzBuzz");
            } else if(count % 3 == 0 && count >= 3) {
                l.add("Fizz");
            } else if(count % 5 == 0 && count >= 3){
                l.add("Buzz");
            } else {
                l.add(count.toString());
            }

            count++;
        }
        return l;
    }
}