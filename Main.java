class Main {

  public static void solution(int n,String s){
    int count[] = new int[26];
    int occupied = 0;
    int ans = 0;
    for(int i=0;i<s.length();i++)
    {
      int index = s.charAt(i)-'A';      
      if(count[index]==0)
        {
          count[index] =1;
          if(occupied<n && occupied>=0)
            {
              occupied++;
              //count[index] =2;
            }
          else
            {
              ans ++;
            }
        }
      else
        {
          if(occupied >0)
          {
             occupied--;
          }         
          count[index] = 0;
        }
      }
    System.out.println(s+" "+ans+" Customers left");
  }
  public static void main(String[] args) {
    solution(2,"ABBAJJKZKZ");//0
    solution(3, "GACCBDDBAGEE");//1
    solution(3, "GACCBGDDBAEE");//0
    solution(1, "ABCBCA");//2
    solution(1, "ABCBCADEED");//3
  }
}