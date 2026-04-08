package Pekan3_2511531015;

public class stackArrayDriver_2511531015 {

	public static void main(String[] args) {
		stackArray_2511531015 s = new stackArray_2511531015();
		s.push (10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " dikeluarkan dari stackk");
		System.out.println("Elemen teratas adalah: " + s.peek());
		System.out.println("Elemen pada stack: ");
		s.print();
	}

}
