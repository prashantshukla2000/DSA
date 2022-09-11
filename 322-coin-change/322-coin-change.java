class Solution {
    public int coinChange(int[] arr, int x) {
         Queue<Integer> q = new LinkedList<>();
    // Base value in queue
    q.add(x); 
    // Boolean array to check if  a number has been visited before
    HashSet<Integer> v = new HashSet<Integer>();
    // Variable to store depth of BFS
    int d = 0;int n=arr.length;
    while (q.size() > 0)
    {
        int s = q.size();
        while (s-- > 0)
        {
            int c = q.peek();             // Front most element of the queue
            // Base case
            if (c == 0)
                return d;
            q.remove();
            if (v.contains(c) || c < 0)
                continue;
            v.add(c);            // Setting current state as visited
            for (int i = 0; i < n; i++)            // Pushing the required states in queue
              q.add(c - arr[i]);
        }
        d++;
    }
    return -1;
    }
}