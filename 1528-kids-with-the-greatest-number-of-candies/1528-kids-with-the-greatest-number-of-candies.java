class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max=0;

        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies<max){
                list.add(false);
            }else{
                list.add(true);
            }
        }
       return list;
    }
}

/*
 for(int i=0; i<candies.length; i++){
            candies[0]+=extraCandies;;
            if(candies[i]<min){
                min=candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i]==min){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
        */