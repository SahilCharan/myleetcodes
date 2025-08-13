class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target){
            return 0;
        }
        HashMap<Integer, ArrayList<Integer>> adjList =  new HashMap<>();
        //create a map
        for(int r =0;r<routes.length;r++){
            for(int stop:routes[r]){
                ArrayList<Integer> route = adjList.getOrDefault(stop, new ArrayList<>());
                route.add(r);
                adjList.put(stop, route);
            }
        }
        if(adjList.get(source)==null || adjList.get(target)==null)
        return -1;

        Queue<Integer> q =  new LinkedList<>();
        Set<Integer> vis =  new HashSet<>(routes.length);

        for(int route: adjList.get(source)){
            q.add(route);
            vis.add(route);
        }

        int busCount  =1;
        while(!q.isEmpty())
        {
            int size = q.size();
             for(int i =0;i<size;i++){
                int route =q.remove();

                for(int stop:routes[route]){
                    if(stop == target){
                        return busCount;
                    }
                    for(int nextRoute: adjList.get(stop)){
                        if(!vis.contains(nextRoute)){
                            vis.add(nextRoute);
                            q.add(nextRoute);
                        }
                    }
                }
            }
            busCount++;
        }
        return -1;
        
    }      
}