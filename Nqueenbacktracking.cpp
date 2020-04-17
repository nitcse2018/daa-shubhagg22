/*Author: Shubham Aggarwal
//Roll number:181210021
Branch: CSE 2nd year*/

/* Problem: N Queens Problem using Backtracking
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other. */

#include<bits/stdc++.h>
using namespace std;

bool canPlace(char board[][100],int row,int col,int n){

    for(int i=0;i<n;i++){
        if(board[row][i]=='Q'){
            return false;
        }
    }
    for(int i=0;i<n;i++){
        if(board[i][col]=='Q'){
            return false;
        }
    }

    int i=row,j=col;
    while(i>=0&&j>=0){
        if(board[i][j]=='Q'){
            return false;
        }
        i--;
        j--;
    }

    i=row,j=col;
    while(i>=0 && j<n){
        if(board[i][j]=='Q'){
            return false;
        }
        i--;
        j++;
    }

    return true;
}



bool solveNQueen(char board[][100],int n,int row){
    if(row==n){

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                cout<<board[x][y]<<" ";
            }
            cout<<endl;

        }

        return true;
    }

    for(int pos=0;pos<n;pos++){

            if(canPlace(board,row,pos,n)){
                    board[row][pos]='Q';

                    bool agliQueenRakhPayeKya = solveNQueen(board,n,row+1);
                    if(agliQueenRakhPayeKya==true){
                        return true;
                    }

                    board[row][pos]='.';
            }

    }
    return false;
}

int main(){

    char board[100][100];

    int n;
    cin>>n;

    for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                board[x][y]='.';
            }

        }
    solveNQueen(board,n,0);

return 0;
}
 
