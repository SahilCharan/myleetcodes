class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true; // Base case: If source and destination are the same, there's a path

        // Create an adjacency list to represent the graph
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<Integer>()); // Initialize inner lists for each node (representing connections)
        }

        // Build the adjacency list based on edges
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v); // Add connection from u to v
            adjList.get(v).add(u); // Since it's an undirected graph, add connection from v to u as well
        }

        // Visited array to track explored nodes during DFS
        int[] visited = new int[n];

        // Perform DFS starting from the source node
        return dfs(adjList, visited, source, destination);
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
