package Pekan3_2511531015;
import java.util.ArrayList;
 class Siswa_2511531015 {
	 String nama;
	 int nim;
	 
	 public Siswa_2511531015(String nama, int nim) {
		 this.nama = nama;
		 this.nim = nim;
		 
		 
	 }
	 
	 @Override
	 public String toString() {
		 return "Nim: " + nim + ", Nama: " + nama;
		 
		 
	 }

}
public class SiswaStack_2511531015<Siswa> {
	private ArrayList<Siswa_2511531015> stack;
	
	public SiswaStack_2511531015() {
		stack = new ArrayList<>();
		
	}
	public void push_1015 (Siswa_2511531015 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511531015 pop() {
		if  (!isEmpty()) {
			return stack.remove(stack.size()-1);
			
		}
		return null;
		
		
	}
	public Siswa_2511531015 peek( ) {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
			
			
		}
		return null;	
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public void tampilkanSiswaStack_2511531015( ) {
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
			
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511531015 studentStack = new SiswaStack_2511531015();
		
		Siswa_2511531015 mhs1 = new Siswa_2511531015("Ali", 1);
		Siswa_2511531015 mhs2 = new Siswa_2511531015("Boby", 2);
		Siswa_2511531015 mhs3 = new Siswa_2511531015("Charles", 3);
		
		studentStack.push_1015(mhs1);
		studentStack.push_1015(mhs2);
		studentStack.push_1015(mhs3);
		
		System.out.println("Siswa di dalam stack:");
		studentStack.tampilkanSiswaStack_2511531015();
		
		System.out.println("siswa teratas " + studentStack.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack.pop());
		System.out.println("daftar siswa setelahdi pop:");
		studentStack.tampilkanSiswaStack_2511531015();
		
		
		
	}
}