#include<bits/stdc++.h>

using namespace std;
int main() {
    int n = 6; 
    vector<vector<int>> edges = {{1, 2, 2}, {1, 3, 4}, {2, 4, 5}, {2, 5, 6}, {3, 5, 7}, {4, 6, 8}, {5, 6, 9}};
    int src=1;
    vector<int> dist(n+1,INT_MAX);
    dist[src]=0;
    for(int i=0;i<n-1;i++){
        for(const auto &it:edges){
            int u=it[0];
            int v=it[1];
            int z=it[2];
            if(dist[u]+z<dist[v]){
                dist[v]=dist[u]+z;
            }
        }
        
        
    }
    
    for (int i = 1; i <= n; ++i) {
        cout << "distance from node 1 to node " << i << " is: " << dist[i] << endl;
    }

    return 0;
}
