#include<bits/stdc++.h>

using namespace std;

vector<vector<pair<int, int>>> createGraph(int n, vector<vector<int>>& edges) {
    vector<vector<pair<int, int>>> adjList(n + 1);
    for (const auto& edge : edges) {
        int u = edge[0], v = edge[1], w = edge[2]; 
        adjList[u].push_back({v, w});
    }

    return adjList;
}

int main() {
    int n = 6; 
    vector<vector<int>> edges = {{1, 2, 2}, {1, 3, 4}, {2, 4, 5}, {2, 5, 6}, {3, 5, 7}, {4, 6, 8}, {5, 6, 9}};
    vector<vector<pair<int, int>>> adjList = createGraph(n, edges);
    priority_queue<pair<int,pair<int,int>>,vector<pair<int,pair<int,int>>>,greater<pair<int,pair<int,int>>>> pq;
    vector<int> dist(n+1, INT_MAX); 
    int k = 2; 
    pq.push({1, {0, 0}});
    dist[1] = 0; 
    while (!pq.empty()) {
        int node = pq.top().first;
        int distance = pq.top().second.first;
        int steps = pq.top().second.second;
        pq.pop();
        for (const auto& neighbor : adjList[node]) {
            int v = neighbor.first;
            int w = neighbor.second;
            if (dist[node] + w < dist[v] && steps== k) {
                steps++;
                dist[v] = dist[node] + w;
                pq.push({v, {dist[v], steps}}); 
            }
        }
    }
    
    for (int i = 1; i <= n; ++i) {
        if(dist[i]==INT_MAX)cout<<"no path available"<<endl;
        else{
            cout << "distance from node 1 to node " << i << " is: " << dist[i] << endl;
        }
    }

    return 0;
}
