public class SuperArray{
  private String[] arr;
  private int size;
  public SuperArray(String[] array){
    arr = array;
    size = array.length;
  }
  public String toString(){
    String arr1 = "";
    for(int i = 0; i < size; i ++){
      arr1 = arr1.concat(arr[i]  +",");
    }
    return "["+ arr1 + "]";
  }
  public void resize(int pivot){
    String[] arr2 = new String[size + 1];
    size ++;
    for(int i = 0; i < pivot; i ++){
      arr2[i] = arr[i];
    }
    for(int i = pivot; i < size; i ++){
      arr2[i] = arr[i - 1];
    }
    arr = new String[size];
    arr = arr2;
  }
  public void cut(int pivot){
    String[] arr2 = new String[size - 1];
    size --;
    for(int i = 0; i < pivot; i ++){
      arr2[i] = arr[i];
    }
    for(int i = pivot; i < size; i ++){
      arr2[i] = arr[i + 1];
    }
    arr = new String[size];
    arr = arr2;
  }
  public void clear(){
    arr = new String[size];
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    for(int i = 0; i < size; i ++){
      if(arr[i] != null){
        return false;
      }
    }
    return true;
  }
  public boolean add(String element){
    resize(size);
    arr[size - 1] = element;
    return true;
  }
  public String get(int index){
    try{
      return arr[index];
    }
    catch(ArrayIndexOutOfBoundsException e){
      return("array index out of bounds");
    }
  }
  public String set(int index, String element){
    String old = arr[index];
    try{
      arr[index] = element;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("array index out of bounds");
    }
    return old;
  }
  public boolean contains(String element){
    for(int i = 0; i < size; i ++){
      if(arr[i].equals(element)){
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element){
    if(index > size){
      System.out.println("index out of bounds");
      return;
    }
    resize(index);
    arr[index] = element;
  }
  public int IndexOf(String element){
    for(int i = 0; i < size; i ++){
      if(element == arr[i]){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String element){
    for(int i = size-1; i >= 0; i --){
      if(element == arr[i]){
        return i;
      }
    }
    return -1;
  }
  public String remove(int index){
    if(index >= size){
      System.out.println("array index out of bounds");
      System.exit(0);
    }
    String removed = arr[index];
    cut(index);
    return removed;
  }
  public boolean remove(String element){
    for(int i = 0; i < size; i ++){
      if(arr[i] == element){
        cut(i);
        return true;
      }
    }
    return false;
  }
}
