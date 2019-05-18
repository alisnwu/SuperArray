public class SuperArray{
  private String[] arr;
  private int size;
  public SuperArray(){
    arr = new String[10];
  }
  public void clear(){
    arr = new String[0];
  }
  public int size(){
    int counter = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != null){
        counter++;
      }
    }
    return counter;
  }
  public boolean isEmpty(){
    int counter = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != null){
        counter++;
      }
    }
    if(counter == 0){
      return true;
    }
    else{
      return false;
    }
  }
  public void resize(){
    String[] arr1 = new String[arr.length + 1];
    for(int i = 0; i < arr.length; i++){
      arr1[i] = arr[i];
    }
    String[] arr = new String[arr1.length];
    for(int j = 0; j < arr1.length; j++){
      arr[j] = arr1[j];
    }
  }
  public boolean add(String element){
    if(arr[arr.length - 1] == null){
      for(int i = arr.length - 1; i >= 0; i--){
        if(arr[i] != null){
          arr[i+1] = element;
          return true;
        }
      }
    }
    this.resize();
    arr[arr.length - 1] = element;
    return true;
  }
  public String get(int index){
    try{
      return arr[index];
      }
    catch (ArrayIndexOutOfBoundsException e){
      return("array index out of bounds");
    }
  }
  public String set(int index, String element){
    String st = "";
    try{
      st = arr[index];
      arr[index] = element;
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
    return st;
  }
  public String toString(){
    String format = "[";
    for(int i=0; i<arr.length;i++){
      format = format + arr[i];
      if(i < arr.length - 1){
          format = format + ",";
      }
    }
    return format;
  }
  public boolean contains(String element){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == element){
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element){
    try{
      for(int i = arr.length - 1; i > index; i--){
        arr[i] = arr[i-1];
      }
      arr[index] = element;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
  }
  public int indexOf(String element){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == element){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String element){
    for(int i = arr.length - 1; i >= 0; i--){
      if(arr[i] == element){
        return i;
      }
    }
    return -1;
  }
  public String remove(int index){
    String str ="";
    try{
      str = arr[index];
      for(int i = index; i < arr.length; i++){
        arr[i] = arr[i+1];
      }
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("this is the error for remove 1: " + e.getMessage());
    }
    return str;
  }
  public boolean remove(String element){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == element){
        for(int j = i; j < arr.length - 1; j++){
          arr[j] = arr[j+1];
        }
        arr[arr.length - 1] = null;
        return true;
      }
    }
    return false;
  }
}
