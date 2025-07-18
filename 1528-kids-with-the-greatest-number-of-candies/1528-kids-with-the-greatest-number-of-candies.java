class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int MaxCandy = 0;
        for(int arr:candies)
        {
            MaxCandy = Math.max(MaxCandy,arr);
        }
        ArrayList<Boolean>List = new ArrayList<>();
        for(int arr:candies)
        {
            if(arr+extraCandies>=MaxCandy)
            {
                List.add(true);
            }
            else
            {
                List.add(false);
            }
        }
        return List;
    }
}
