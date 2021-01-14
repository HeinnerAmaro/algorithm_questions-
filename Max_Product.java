class Solution
{
 public int maxProduct(int[] arr)
 {
    int max1 = 0;
    int max2 = 0;
    for (int i :arr)
    {
      if(i > max1)
      {
        max2 = max1;
        max1 = i;
      }
      else if(i > max2)
      {
        max2 = i;
      }
    }
    return (max1 - 1) * (max2 - 1);
 }
}
