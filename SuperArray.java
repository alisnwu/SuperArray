public class SuperArray{
  private static int initialCapacity = 10;
  private String[] data;
  private int size = data.length;
  public void clear(){
    String[] cleared = new String[initialCapacity];
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    for(int i = 0; i < size; i++){
      if(data[i] != null){
        return false;
      }
    }
    return true;
  }
  public boolean add(String element){
    String[] d1 = new String[size + 1];
    for(int i = 0; i < size; i++){
      d1[i] = data[i];
    }
    d1[size] = element;
    return true;
  }
  public String get(int index){
    if(index >= size){
      throw new ArrayIndexOutOfBoundsException("Index array out of bounds.");
    }
    return data[index];
  }
  public String set(int index, String element){
    if(index >= size){
      throw new ArrayIndexOutOfBoundsException("Index array out of bounds.");
    }
    String old = data[index];
    data[index] = element;
    return old;
  }
  public String toString(){
    String array = "";
    for(int i = 0; i < size; i++){
      array.concat(data[i] + ", ");
    }
    return "[" + array + "]";
  }
  public boolean contains(String element){
    for(int i = 0; i < size; i++){
      if(data[i].equals(element)){
        return true;
      }
    }
    return false;
  }
  public  void add(int index, String element){
    if(index >= size){
      throw new ArrayIndexOutOfBoundsException("index array out of bounds");
    }
    String[] data1 = new String[size+1];
    for(int i = index; i < size; i++){
      data1[i+1] = data[i];
    }
    for(int i = 0; i < index; i++){
      data1[i] = data[i];
    }
    data1[index] = element;
  }
  public int IndexOf(String element){
    for(int i = 0; i < size; i++){
      if(element == data[i]){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String element){
    for(int i = size-1; i >= 0; i--){
      if(element == data[i]){
        return i;
      }
    }
    return -1;
  }
  public String remove(int index){
    if(index >= size){
      throw new ArrayIndexOutOfBoundsException("index array out of bounds");
    }
    String removed = data[index];
    String[] d2 = new String[size - 1];
    for(int i = 0; i < index; i++){
      d2[i] = data[i];
    }
    for(int i = index + 1; i < size; i++){
      d2[i-1] = data[i];
    }
    return removed;
  }
  public boolean remove(String element){
    String[] d3 = new String[size - 1];
    for(int i = 0; i < size; i++){
      if(element == data[i]){
        int index = i;
        for(int j = 0; j < index; j++){
          d3[j] = data[j];
        }
        for(int j = index + 1; j < size; j++){
          d3[j-1] = data[j];
        }
        return true;
      }
    }
    return false;
  }
}
