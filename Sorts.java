public class Sorts{
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
    for(int i=1;i<ary.length;i++){
      Boolean rightplace=false;
      for(int j=i;!rightplace && j>0;j--){
        if(ary[j]<ary[j-1])swap(ary,j,j-1);
        else rightplace=true;
      }
    }
  }}
