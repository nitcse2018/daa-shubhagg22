/*Author: Shubham Aggarwal
//Roll number:181210021
Branch: CSE 2nd year*/
/*Problem: Given two integers x and n, write a function to compute x^n.
 We may assume that x and n are small and overflow doesn’t happen. */
 #include<bits/stdc++.h>
 using namespace std;
class DnC 
{ 
      
public: 
int power(int a,  int b) 
{ 
    if (y == 0) 
        return 1; 
    else if (y % 2 == 0) 
        return power(a, b / 2) * power(a, b / 2); 
    else
        return a * power(a, b / 2) * power(a, b / 2); 
} 
}; 
  
/* Driver code */
int main() 
{ 
    DnC c; 
    int a,b;
	cout<<" input the value of a and b: "<<endl;
	cin>>a;
	cin>>b;
  
    cout << c.power(a, b); 
   return 0;
}
