public class SelectionSorts{
  public static void swap(int[] ary,int a,int b){
    int h1=ary[a];
    int h2=ary[b];
    ary[a]=h2;
    ary[b]=h1;
  }
  public static void selectionsort(int [] ary){
    for(int i=0;i<ary.length;i++){
      for(int j=i;j<ary.length;j++){
        if(ary[i]>ary[j])swap(ary,i,j);
      }
    }
  }
  public static void main(String[] args){
    int [] ary={5,6,9,8,2,4,6,3,2,89647,32,0};
    selectionsort(ary);
    for(int i=0;i<ary.length;i++){
      System.out.println(""+ary[i]);
    }
  }
  }
