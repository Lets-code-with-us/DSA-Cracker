class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adjList=new HashMap<>();
        int[] indegree=new int[numCourses];
        for(int[] prerequisite:prerequisites){
            int course=prerequisite[0];
            int dependentCourse=prerequisite[1];
            adjList.putIfAbsent(dependentCourse,new ArrayList<>());
            adjList.get(dependentCourse).add(course);
            indegree[course]++;
        } 
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        List<Integer> courseOrder=new ArrayList<>();
        int processedCourses=0;
        while(!queue.isEmpty()){
            int currentCourse=queue.poll();
            courseOrder.add(currentCourse);
            processedCourses++;
            if(adjList.containsKey(currentCourse)){
                for(int dependent:adjList.get(currentCourse)){
                    indegree[dependent]--;
                    if(indegree[dependent]==0){
                        queue.offer(dependent);
                    }
                }
            }
        }
        return processedCourses==numCourses ? courseOrder.stream().mapToInt(i->i).toArray():new int[0];
    }
}
