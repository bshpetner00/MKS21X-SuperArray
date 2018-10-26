public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public void clear() {
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean add(String str) {
  	int i = 0;
  	for (String s: data) {
  		if (s.equals(null) == false) {
  			i += 1;
  		}
  		i += 1;
  	}
  	data[i] = str;
  	return true;
  }
  public String toStringDebug() {
    String joke = "[";
    for (String x:data) {
      joke += x;
      joke += ", ";
    }
    joke += "]";
    return joke;
  }
  public String toString() {
    String joke = "[";
    for (String x:data) {
      if (x.equals(null) == false) {
        joke += x;
        joke += ", ";
      }
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
      data[i] = s;
      return data[i];
    }
  }


}
