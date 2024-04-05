class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
        return true;

        //creating an adjecency list

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<n;i++)
        {
            adjList.add( new ArrayList<Integer>());
        }
        //adding element in the adjency LIst

        for(int i=0;i<edges.length;i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        int vis[] = new int[n];
        // performing dfs algo here
         return dfs(adjList, vis, source, destination);
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> graph, int[] visited, int start, int end) {
        if (start == end) return true; // Base case: Reached the destination node

        // Mark the current node as visited
        visited[start] = 1;

        // Explore all unvisited neighbors of the current node
        for (int neighbor : graph.get(start)) {
            if (visited[neighbor] == 0 && dfs(graph, visited, neighbor, end)) {
                return true; // Path found from neighbor
            }
        }

        // No path found from current node
        return false;
    }
}
