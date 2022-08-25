class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
                List<Integer> res = new ArrayList<>();
        int[] seen = new int[n];// to set the indegree
        for (List<Integer> e: edges) //we check for each pair
            seen[e.get(1)] = 1; //we set the indegree of the destination as 1.
    List<Integer> al = new ArrayList<>();
    for (int i=0; i<seen.length; i++) { // if indegree is 0 add in arraylit
        if (seen[i] == 0) res.add(i);
    }
        return res;
    }
}