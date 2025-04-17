package labor01;

public class Arrays {
	
	public static void main(String[] args) {
		Object[] a = new Object[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("["+a[i]+"]");
		}
		
		shiftElements(a, 2);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print("["+a[i]+"]");
		}
	}

	
	public static Object[] expandArray(Object[] a) {
		Object[] b = new Object[a.length * 2];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	public static void shiftElements(Object a[], int index) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------------");
		for (int i = a.length - 1; i >= index; i--) {
			a[i] = a[i - 1];
			
		}

	}
}
