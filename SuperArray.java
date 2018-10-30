public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public SuperArray(int capacity) {
  	size = 0;
  	data = new String[capacity];
  	try {
  		data = new String[capacity];
  		size = 0;
  	} 
  	catch(NegativeArraySizeException e) {
      System.out.println("Size can't be negative... try again fam.");
    }
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
      throw new IndexOutOfBoundsException();
    }
    return data[i];
  }
  public String set(int i, String s) {
  	String oldVal = data[i];
    if (i < 0 || i >= size()) {
      throw new IndexOutOfBoundsException();
    }
    else {
      data[i] = s;
      return oldVal;
    }
  }
  private void resize() {
  	String[] resizedArray = new String [data.length*2+1];
  	int i = 0;
  	for (String s:data) {
  		resizedArray[i] = data[i];
  		i++;
  	}
  	data = resizedArray;
  }
  public boolean contains(String str) {
  	boolean bool = false;
  	for (int i = 0;i < size(); i++){
  		if (str.equals(data[i])) {
  			bool = true;
  		}
  	}
  	return bool;
  }
  public int indexOf(String str) {
  	int i = 0;
  	while (i < data.length-1) {
  		if (str.equals(data[i])) {
  			return i;
  		}
  		i++;
  	}
  	return -1;
  }
  public int lastIndexOf(String str) {
  	int i = data.length-1;
  	while (i > 0) {
  		if (str.equals(data[i])) {
  			return i;
  		}
  		i -= 1;
  	}
  	return -1;
  }
  public void add(int i, String s) {
    if (i < 0 || i > size()) {
      throw new IndexOutOfBoundsException();
    }
    resize();
    String[] pebbles = new String[data.length];
    int special = 0;
    int index = 0;
    while (index < pebbles.length) {
      if (index == i) {
      	pebbles[index] = s;
      	index++;
      }
      else {
      	pebbles[index] = data[special];
      	special++;
      	index++;
      }
    }
    data = pebbles;
  }
  public String remove(int index) {
  	if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException();
    }
  	String deadMan = data[index];
  	String[] shorty = new String[data.length];
  	int i = 0;
  	int oldEye = 0;
  	while (oldEye < data.length) {
  		if (oldEye != index) {
  			shorty[i] = data[oldEye];
  			i++;
  			oldEye++;
  		}
  		else {
  			oldEye++;
  		}
  	}
  	data = shorty;
  	return deadMan;
  }
  public boolean remove(String deadMan) {
  	if (this.contains(deadMan)) {
  		this.remove(this.indexOf(deadMan));
  		return true;
  	}
  	else {
  		return false;
  	}
  }
}
