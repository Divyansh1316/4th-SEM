#include<bits/stdc++.h>

using namespace std;

vector<vector<pair<int, int>>> createGraph(int n, vector<vector<int>>& edges) {
    vector<vector<pair<int, int>>> adjList(n + 1);
    for (const auto& edge : edges) {
        int u = edge[0], v = edge[1], w = edge[2]; 
        adjList[u].push_back({v, w});
        adjList[v].push_back({u, w});
    }

    return adjList;
}

int main() {
    int n = 6; 
    vector<vector<int>> edges = {{1, 2, 2}, {1, 3, 4}, {2, 4, 5}, {2, 5, 6}, {3, 5, 7}, {4, 6, 8}, {5, 6, 9}};
    vector<vector<pair<int, int>>> adjList = createGraph(n, edges);
    priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
    vector<int> dist(n+1, INT_MAX); 
    pq.push({1, 0});
    dist[1] = 0; 
    while (!pq.empty()) {
        int node = pq.top().first;
        pq.pop();
        for (const auto& neighbor : adjList[node]) {
            int v = neighbor.first;
            int w = neighbor.second;
            if (dist[node] + w < dist[v]) {
                dist[v] = dist[node] + w;
                pq.push({v, dist[v]}); 
            }
        }
    }
    
    for (int i = 1; i <= n; ++i) {
        cout << "distance from node 1 to node " << i << " is: " << dist[i] << endl;
    }

    return 0;
}
