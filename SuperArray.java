public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public void clear() {
    size = 0;
    data = new String[10];
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean add(String str) {
  	if (size < data.length) {
  		data[size] = str;
  		size += 1;
  		return true;
  	}
  	return false;
  }
  public String toStringDebug() {
    String joke = "[";
	    for (int i = 0; i < data.length-1;i++) {
	        joke += data[i];
	        joke += ", ";
	      }
	    joke += data[data.length-1];
    joke += "]";
    return joke;
  }
  public String toString() {
    String joke = "[";
    if (data[0] != null) {
	    for (int i = 0; i < size-1;i++) {
	        joke += data[i];
	        joke += ", ";
	      }
	    joke += data[size-1];
	    }
    joke += "]";
    return joke;
  }
  public String get(int i) {
    if (i < 0 || i >= size()) {
      return null;
    }
    return data[i];
  }
  public String set(int i, String s) {
    if (i < 0 || i >= size()) {
      return null;
    }
    else {
      String oldVal = data[i];
      data[i] = s;
      return oldVal;
    }
  }


}
