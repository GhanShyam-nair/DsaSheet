import java.util.*;

class Program {

  public int[][] mergeOverlappingIntervals(int[][] intervals) 
  {
    // Write your code here.
    List<List<Integer>> res=new ArrayList<>();
    if(intervals.length<=1) return intervals;
    Arrays.sort(intervals,(i1,i2)-> Integer.compare(i1[0],i2[0]));
    int min=intervals[0][0];
    int max=intervals[0][1];
    for(int i=1;i<intervals.length;i++)
      {
        if(intervals[i][0]<=max)
        {
          if(max<=intervals[i][1])
          {
              max=intervals[i][1];
          }
          if(min>intervals[i][0])
          {
            min=intervals[i][0];
          }
        }
        else
        {
          List<Integer> arr=new ArrayList<>();
          arr.add(min);
          arr.add(max);
          res.add(arr);
          min=intervals[i][0];
          max=intervals[i][1];
          System.out.println(min+" Y "+max);
        }
      }
    List<Integer> arr=new ArrayList<>();
    arr.add(min);
    arr.add(max);
    res.add(arr);
    int[][] resar=new int[res.size()][2];
    for(int i=0;i<res.size();i++)
      {
        for(int j=0;j<2;j++)
          {
            resar[i][j]=(res.get(i)).get(j);
          }
      }
    return resar;
  }
}
