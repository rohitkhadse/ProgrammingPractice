// Last updated: 9/15/2025, 11:05:50 PM
class Solution {
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0]=1;
        if(n>=1) G[1]=1;

        for(int nodes = 2; nodes<=n;nodes++){
            int total = 0;

            for(int root=1;root<=nodes;root++){
                int left = root - 1;
                int right = nodes - root;
                int ways = G[left]*G[right];

                total += ways;
            }
            G[nodes]=total;
        }


        return G[n];
    }
}