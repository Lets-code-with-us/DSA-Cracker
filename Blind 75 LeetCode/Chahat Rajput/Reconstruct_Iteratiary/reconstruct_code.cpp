class Solution {
public:
    std::vector<std::string> findItinerary(std::vector<std::vector<std::string>>& tickets) {
        std::unordered_map<std::string, std::multiset<std::string>> graph;
        std::vector<std::string> itinerary;
        
        // Build the graph
        for (const auto& ticket : tickets) {
            graph[ticket[0]].insert(ticket[1]);
        }
        
        dfs("JFK", graph, itinerary);
        
        // Reverse the itinerary to get the correct order
        std::reverse(itinerary.begin(), itinerary.end());
        
        return itinerary;
    }
    
    void dfs(const std::string& airport, std::unordered_map<std::string, std::multiset<std::string>>& graph, std::vector<std::string>& itinerary) {
        while (!graph[airport].empty()) {
            std::string nextAirport = *graph[airport].begin();
            graph[airport].erase(graph[airport].begin());
            dfs(nextAirport, graph, itinerary);
        }
        itinerary.push_back(airport);
    }
};