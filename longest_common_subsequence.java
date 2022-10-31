public class longest_common_subsequence {

int cs( char[] A, char[] B, int m, int n ) 
{ 
    if (m == 0 || n == 0) 
    return 0; 
    if (A[m-1] == B[n-1]) 
    return 1 + cs(A, B, m-1, n-1); 
    else
    return max(cs(A, B, m, n-1), cs(A, B, m-1, n)); 
} 
int max(int a, int b) 
{ 
    return (a > b)? a : b; 
} 
    
}
