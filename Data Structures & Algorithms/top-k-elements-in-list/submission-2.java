class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Min heap: element with smaller frequency comes first
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Keep only k elements
        for (int n : map.keySet()) {
            pq.offer(n);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Build answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}