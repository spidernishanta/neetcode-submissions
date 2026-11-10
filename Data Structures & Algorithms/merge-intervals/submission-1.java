class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2)->Integer.compare(i1[0], i2[0]));
        int[] currentInterval=intervals[0];
        List<int[]> result=new ArrayList<>();
        result.add(currentInterval);
        for(int[] interval: intervals){
            int firstIntervalEnd=currentInterval[1];
            int secondIntervalStart=interval[0];
            int secondIntervalEnd=interval[1];
            if(firstIntervalEnd>=secondIntervalStart){
                currentInterval[1]=Math.max(firstIntervalEnd, secondIntervalEnd);
            }else{
                currentInterval=interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
