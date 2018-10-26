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
  	else if (size >= data.length) {
  		resize();
  		add(str); //dank recursion >:)
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
  	String oldVal = data[i];
    if (i < 0 || i >= size()) {
      return null;
    }
    else {
      data[i] = s;
      return oldVal;
    }
  }
  private void resize() {
  	String[] resizedArray = new String [data.length+1];
  	int i = 0;
  	for (String s:data) {
  		resizedArray[i] = data[i];
  		i++;
  	}
  	data = resizedArray;
  }
  public boolean contains(String str) {
  	boolean bool = false;
  	for (String s:data) {
  		if (s.equals(str)) {
  			bool = true;
  		}
  	}
  	return bool;
  }
  public int indexOf(String str) {
  	int i = 0;
  	while (i < data.length-1) {
  		if (data[i].equals(str)) {
  			return i;
  		}
  		i++;
  	}
  	return -1;
  }
  public int lastIndexOf(String str) {
  	int i = data.length-1;
  	while (i > 0) {
  		if (data[i].equals(str)) {
  			return i;
  		}
  		i -= 1;
  	}
  	return -1;
  }
}
