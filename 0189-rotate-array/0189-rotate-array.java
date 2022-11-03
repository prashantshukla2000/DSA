class Solution {
    // Function to Rotate k elements to left
    public void rotate(int[] arr, int k) {
         int n=arr.length;
        if (n == 0)
    return;
  k = k % n;
  if (k > n)
    return;
  // Reverse first n-k elements
  Reverse(arr, 0, n - k - 1);
  // Reverse last k elements
  Reverse(arr, n - k, n - 1);
  // Reverse whole array
  Reverse(arr, 0, n - 1);
    }
  void Reverse(int arr[], int start, int end)
{
  while (start <= end)
  {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}

}