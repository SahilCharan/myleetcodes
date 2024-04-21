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

        
        // performing dfs algo here
        //  return dfs(adjList, vis, source, destination);
        return bfs(adjList, source, destination);
    }
    // public boolean dfs(ArrayList<ArrayList<Integer>> graph, int[] visited, int start, int end) {
    //     if (start == end) return true; // Base case: Reached the destination node

    //     // Mark the current node as visited
    //     visited[start] = 1;

    //     // Explore all unvisited neighbors of the current node
    //     for (int neighbor : graph.get(start)) {
    //         if (visited[neighbor] == 0 && dfs(graph, visited, neighbor, end)) {
    //             return true; // Path found from neighbor
    //         }
    //     }

    //     // No path found from current node
    //     return false;
    // }

    public boolean bfs(ArrayList<ArrayList<Integer>>graph,  int start, int end)
    {
        // creating a queue
        int visited[] = new int[graph.size()];// creating a visited aary
        Queue<Integer> q = new LinkedList<>();
        q.add(start);// adding the source to the queuw
        visited[start] =1;// source k address ko 1 kr do thatis it is visited
        while(!q.isEmpty())
        {
            int curr = q.poll(); // extract the 1st element
            if(curr == end)// same h to h exist, to leave
            return true;

            for(int neighbour : graph.get(curr)) /// nhi to add the element in the queue
            {
                if(visited[neighbour]==0)
                {
                    visited[neighbour] = 1;
                    q.add(neighbour);

                }
            }
        }
        return false;

    }
}
