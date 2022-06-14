package BackTracking;
public class WordSearch {
    static int m =  4, n = 4;
    SearchWord(char board[M][N],char word[],int i,int j,int m,int n,int index,int visited[M][N])
{
  if(index == strlen(word))
    return 1;
  if(i<0 || j<0 || i>=m || j>=n)
  {
    return 0;
  }
  if(board[i][j] != word[index] && visited[i][j] == 1)
  {
    return 0;
  }
  visited[i][j] = 1;
  if(SearchWord(board,word,i-1,j,m,n,index+1,visited) || SearchWord(board,word,i+1,j,m,n,index+1,visited) ||
    SearchWord(board,word,i,j-1,m,n,index+1,visited) || SearchWord(board,word,i,j+1,m,n,index+1,visited))
  {return 1;}
  visited[i][j] = 0;
  return 0;
}
int isFound(char board[M][N], char word[], int m, int n){
  int visited[M][N];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(board[i][j] == word[0])
      {
        if(SearchWord(board,word,i,j,m,n,0,visited))
        {
          return 1;
        }
      }
    }
  }
  return 0;
}

    public static void main(String[] args) {
        
    }
}
