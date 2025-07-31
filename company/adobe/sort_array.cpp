// Sort an array containing 0s and 1s in single pass, O(n) time and O(1) space complexity. 

// C++ code to Segregate 0s and 1s in an array 
#include <bits/stdc++.h> 
using namespace std; 

// Function to segregate 0s and 1s 
void segregate0and1(int arr[], int n) 
{ 
	int count = 0; // Counts the no of zeros in arr 

	for (int i = 0; i < n; i++) { 
		if (arr[i] == 0) 
			count++; 
	} 

	// Loop fills the arr with 0 until count 
	for (int i = 0; i < count; i++) 
		arr[i] = 0; 

	// Loop fills remaining arr space with 1 
	for (int i = count; i < n; i++) 
		arr[i] = 1; 
} 
void print(int arr[], int n) 
{ 
	cout << "Array after segregation is "; 

	for (int i = 0; i < n; i++) 
		cout << arr[i] << " "; 
} 
int main() 
{ 
	int arr[] = { 0, 1, 0, 1, 1, 1 }; 
	int n = sizeof(arr) / sizeof(arr[0]); 
	
	segregate0and1(arr, n); 
	print(arr, n); 
	
	return 0; 
} 