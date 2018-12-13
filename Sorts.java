public class Sorts{
//  public static void insert(ary,current,new){
  //  int tobeinserted=ary[current];
  //  for(int i= current; i>new;i--){
    //  ary[i]=ary[i-1];
    //}
    //ary[new]=tobeinserted;
  //}
  public static void swap(int[] ary,int a,int b){
    int h1=ary[a];
    int h2=ary[b];
    ary[a]=h2;
    ary[b]=h1;
  }
  public static void selectionSort(int [] ary){
    for(int i=0;i<ary.length;i++){
      for(int j=i;j<ary.length;j++){
        if(ary[i]>ary[j])swap(ary,i,j);
      }
    }
  }
  public static void bubbleSort(int[] ary){
	  int current=0;
	  int next=0;
  	Boolean swap=true;
  	while(swap){
      swap=false;
	  	for(int i=0;i<ary.length-1;i++){
	  		current=ary[i];
	  		next=ary[i+1];
		  	if(current>next){
		    	ary[i]=next;
		    	ary[i+1]=current;
          swap=true;
		  	}
		  }
  }}
  public static void insertionSort(int[] ary){
  }
  public static void main(String[] args){
    int [] ary={5,6,9,8,2,4,6,3,2,89647,32,0};
    bubbleSort(ary);
    for(int i=0;i<ary.length;i++){
      System.out.println(""+ary[i]);
    }
  }
}
