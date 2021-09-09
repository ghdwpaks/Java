package Study;

public class GenericArrayList<T> {
	private Object[] elementData = new Object[5];
	private int size;
	
	public void add(T value) {
		elementData[size++] = value;
	}
	
	public T get(int idx) {
		return (T) elementData[idx];
	}
	
	
	public static <T> void justprintpara(T para) {
		System.out.println(para);
	}
	
	public static <T extends CharSequence> void PrintFirstChar(T para) {
		System.out.println(para.charAt(0));
	}
	
	
}
