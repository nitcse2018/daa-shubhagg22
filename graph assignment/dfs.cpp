#include<bits/stdc++.h>
using namespace std;

template<typename t>
class graph{
	map<t,list<int>>l;
	public:
		void addedge(int x , int y)
		{
		   l[x].push_back(y);
		   l[y].push_back(x);	
		}
		void dfs_recurssion(t start , map<t,bool>&visited)
		{
			cout<<start<<" ";
		    visited[start]=true;
		    for(t irt:l[start])
		    {
		    	if(!visited[itr])
		    	{
		    		dfs_recurssion(itr,visited);
				}
			}
		}
		void dfs(t start)
		{
			map<t,bool>visited;
			for(auto p:l)
			{
				t node=p.first();
				visited[node]=false;
			}
			dfs_recurssion(start,visited);
		}
};

int main()
{
	graph<int>g;
	g.addedge(0,1);
	g.addedge(1,2);
	g.addedge(2,3);
	g.addedge(3,4);
	g.addedge(4,5);
	
	g.bfs(0);
	return 0;
}
