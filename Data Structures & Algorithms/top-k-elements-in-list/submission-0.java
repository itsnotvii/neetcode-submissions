class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        
        List<Integer> keys = new ArrayList<>(count.keySet());
        keys.sort((a, b) -> count.get(b) - count.get(a));
        
        return keys.subList(0, k).stream().mapToInt(i -> i).toArray();

    }
}
