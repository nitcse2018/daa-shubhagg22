/*Author: Shubham Aggarwal
//Roll number:181210021
Branch: CSE 2nd year*/

/*Problem : Travelling and Salesman problem using DP
Given a set of cities and distance between every pair of cities,
the problem is to find the shortest possible route that visits every city exactly once and returns to the starting point. */


#include<bits/stdc++.h>
using namespace std;

#define INT_MAX 999999

int n=4;
int dist[10][10] = {
        {0,20,42,25},
        {20,0,30,34},
        {42,30,0,10},
        {25,34,10,0}
};
int VISITED_ALL = (1<<n) -1;

int dp[16][4];


int  tsp(int mask,int pos){
	
	if(mask==VISITED_ALL){
		return dist[pos][0];
	}
	if(dp[mask][pos]!=-1){
	   return dp[mask][pos];
	}
	int a = INT_MAX;

	for(int city=0;city<n;city++){

		if((mask&(1<<city))==0){

			int newans = dist[pos][city] + tsp( mask|(1<<city), city);
			a = min(a, newans);
		}

	}
	
	return dp[mask][pos] = a;
} 

int main(){
    for(int i=0;i<(1<<n);i++){
        for(int j=0;j<n;j++){
            dp[i][j] = -1;
        }
    }
	cout<<"distance travelled by the salesman is: "<<tsp(1,0);

return 0;
}
