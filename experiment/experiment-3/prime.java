public class prime {
  public static void main(String[] args){
    for(int i=10;i<=100;i++){
      int count=0;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          count++;
          break;
        }
      }
      if(count==0){
        System.out.println(i);
    }
    }
  }  
} 
