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
    void bfs(t start)
    {
    	map<t,int>visited;
    	queue<t>q;
    	q.push(start);
    	visited[start]=true;
    	while(!q.empty())
    	{
    		t node=q.front();
    		q.pop();
    		cout<<node<<" ";
    		for( int itr:l[node])
    		{
    			if(!visited[itr])
    			{
    				q.push(itr);
    				visited[itr]=true;
				}
			}
		}
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
