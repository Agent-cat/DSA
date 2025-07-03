package Dsajava.LinearDataStructures.CreateOwnArray;

/**
 * OwnArray
 */
public class OwnArray {

  private int[] array;
  private int currentIndex; // To keep the track of the insertion

 public OwnArray(int initialsize) {  // Initializing Array 

    this.array = new int[initialsize];
    this.currentIndex = 0; // Set current index to zero when we initiaize an array

  }

 public void insert(int insertValue) { //Insert 

    try {
      this.array[currentIndex] = insertValue;
      currentIndex++;

    } catch (Exception e) {
      System.out.println(e);
    }
  }

 public void insertAt(int pos,int value){  // Insert at Position 
  try {
    this.array[pos]=value;
  } catch (Exception e) {
    System.out.println(e);
  }
}

 public int getByIndex(int index ){  // Get By Index 
  int value=0;
  try {
    value= this.array[index];
  } catch (Exception e) {
    System.out.println("Not found"+ e);
  }
return value;
}

 public int indexOf(int value){ //IndexOf 
  try {
    for(int i=0;i<this.currentIndex;i++){
      if(this.array[i]==value)return i;
    }
  } catch (Exception e) {
    System.out.println(e);
  }
  return -1;
 }
 
 public void reverse(){
    int i=0;
    int j=this.currentIndex-1;
    
    while(i<=j){
      int temp=0;
       temp=array[i];
      array[i]=array[j];
      array[j]=temp;
     i++;
     j--;
      
    }
    
 } 

 public int Max(){ // Find max element 
    int max=this.array[0];
    for(int item: array){
      if(item>max){
        max=item;
      }
    }
    return max;
  }
 
 public int min(){ // Find Min element 
  int min =this.array[0];
  for(int i=0;i<currentIndex;i++ ){
    if(this.array[i]<min){
      min=this.array[i];
    }
    
  }
  return min;
 }
 
 public  void removeAt(int index){  //Delete By Index  
    try {
     for(int i=index;i<this.currentIndex-2;i++){
          this.array[i]=this.array[i+1];
          currentIndex--;
          this.array[currentIndex]=0;
     }
    } catch (Exception e) {
      System.out.println("Not found");
    }
 }

 public String toString() //toString 
  { // while printing a collection it will print from toString Method only
    String str = new String();
    for (int i=0 ;i<currentIndex;i++) {
      str = str + (this.array[i] + ",");
    }
    return "["+str+"]";
  }
}
