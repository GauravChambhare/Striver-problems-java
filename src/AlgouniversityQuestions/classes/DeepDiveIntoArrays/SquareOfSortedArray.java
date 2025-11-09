/*
https://www.algouniversity.com/problem/262/?asid=1720
Given an array of N
 integers sorted in non-decreasing order. You square each of these integers and re-arrange them in non-decreasing order. Print newly obtained array.

Note: Come up with O(N)
 time complexity solution.


1≤N≤105


−104≤
 Each integer of array ≤104

INPUT
The first line contains a single integer N
 - number of integers in the given array.

The next line contains N
 space-separated integers representing the array.

OUTPUT
Output a single line containing N
 integers consisting of new array obtained by squaring each integer in original array arranged in non decreasing order.

EXAMPLE
Sample 1 INPUT:
4
-4 2 5 10
Sample 1 OUTPUT:
4 16 25 100
 * 
*/

import java.util.Scanner;
import java.util.Arrays;

public class SquareOfSortedArray {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int len = Integer.parseInt(sc.nextLine());
  int[] ip = new int[len];
  String inputstring = sc.nextLine();
  String[] token = inputstring.split(" "); //split on basis of empty space
  // System.out.print(Arrays.toString(token));
  for(int i=0; i<token.length; i++ ){
    ip[i] = Integer.parseInt(token[i]);
  }   
  if (len == 1) {
    System.out.print(ip[0] * ip[0]);
    return;
}
  // lets assume that I have the int[] ip,  now?
  int[] sqr= new int[len];
  for(int i=0; i<len; i++){
    sqr[i] = (int) Math.pow((double) ip[i], 2);
  }

  int lptr = 0;
  int rptr = len-1;
  int nrptr = rptr;
  int[] ans = new int[len];
  while(lptr <= rptr){
    if(sqr[lptr] > sqr[rptr]) {
      ans[nrptr] = sqr[lptr];
      nrptr -=1;
      lptr +=1;
    }
    else{
      ans[nrptr] = sqr[rptr];
      rptr  -=1;
      nrptr -=1;
    }
  }
  for (int num : ans) {
    System.out.print(num + " ");
}
// System.out.print(Arrays.toString(ans))
  }
}