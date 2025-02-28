public class pattern {
  public static void main(String[] args){
    for(int i=0;i<=5;i++){
      for(int j=1;j<=2*i+1;j++){
        char a = '?';
        char b = '#';
        if(i%2==0){
          System.out.print(b+" ");
        }
        else{
          System.out.print(a+" ");
        }
      }
      System.out.println();
    }
  }
}
