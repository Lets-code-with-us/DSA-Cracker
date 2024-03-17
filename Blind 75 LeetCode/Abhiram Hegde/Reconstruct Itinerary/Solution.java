class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> graph = new HashMap<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);
        }
        for (List<String> destinations : graph.values()) {
            destinations.sort(Collections.reverseOrder());
        }  
        List<String> itinerary = new ArrayList<>();
        dfs("JFK", graph, itinerary);     
        Collections.reverse(itinerary);
        return itinerary;
    }
    private void dfs(String airport, Map<String, List<String>> graph, List<String> itinerary) {
        List<String> destinations = graph.get(airport);
        while (destinations != null && !destinations.isEmpty()) {
            String next = destinations.remove(destinations.size() - 1);
            dfs(next, graph, itinerary);
        }
        itinerary.add(airport);
    }
}
