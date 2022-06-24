class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> Arr=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int[][] dep=new int[numRows][numRows];
        temp.add(1);
        Arr.add(temp);
        dep[0][0]=1;
        for(int i=1;i<numRows;i++)
        {
            temp=new ArrayList<>();
            for(int j=0;j<numRows;j++)
            {
                if(j==0)
                {
                    dep[i][j]=1;
                    temp.add(1);
                }
                else
                {
                    dep[i][j]=dep[i-1][j]+dep[i-1][j-1];
                    if(dep[i][j]!=0)
                    {
                    temp.add(dep[i][j]);
                    }
                    else
                    {
                        break;
                    }
                }
            }
     
            Arr.add(temp);
        }
        return Arr;
    }
}