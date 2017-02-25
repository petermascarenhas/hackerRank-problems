class Main {
  public static void main(String[] args) {
    String result=isSubStringPalindrome("peterracecarMascarenha");
    System.out.println(result);
  }
  
  
  public static String isSubStringPalindrome(String palindrome){
    int n=palindrome.length();
    int start=0;
    int end=1;
    boolean[][] table= new boolean[n][n];
    for(int i=0;i<n;i++){
      table[i][i]=true;
    }
    for(int i=0;i<n-1;i++){
      if(palindrome.charAt(i)==palindrome.charAt(i+1)){
        table[i][i+1]=true;
        start=i;
        end=2;
      }
    }
    
    for(int pos=3;pos<=n;pos++){
      for(int i=0;i<n-pos+1;i++){
        int j=i+pos-1;
        if(palindrome.charAt(i) == palindrome.charAt(j) && table[i+1][j-1]){
          table[i][j]=true;
          start = i;
          end = pos;
               
        }
      }
    }
    
    return palindrome.substring(start,end+start);
  }
  
}