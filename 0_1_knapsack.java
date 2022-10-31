import java.io.*;

import java.util.*;

//Backtracking and recursion approach for 0-1 knapsack problem
public class Main {


  static int max(int a, int b)
  {
    return (a > b) ? a : b;
  }

  static int knapSack(int cap, int weight[], int price[], int n)
  {
    // Base Case
    if (n == 0 || cap == 0)
      return 0;

    if (weight[n - 1] > cap)  //if weight of nth item is larger than the capacity then do not include it
      return knapSack(cap, weight, price, n - 1);

    else
      return max(price[n - 1] + knapSack(cap - weight[n - 1], weight, price, n - 1), knapSack(cap, weight, price, n - 1));
  }

  public static void main(String args[])
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int [] weight = new int[n];
    int [] price = new int[n];

    for (int i = 0; i < n; i++)
    {
      price[i] = scn.nextInt();
    }

    for (int i = 0; i < n; i++)
    {
      weight[i] = scn.nextInt();
    }
    int cap = scn.nextInt();

    int k = knapSack(cap, weight, price, n);
    System.out.println(k);
  }
}
