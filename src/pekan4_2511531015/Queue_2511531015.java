package pekan4_2511531015;

public class Queue_2511531015 {
	
	    private int front;
	    private int rear;
	    private int max;
	    private String[] queue;

	    public Queue_2511531015(int max) {
	        this.max = max;
	        this.queue = new String[max];
	        this.front = 0;
	        this.rear = -1;
	    }

	    public boolean isEmpty() {
	        return rear < front;
	    }

	    public boolean isFull() {
	        return rear == max - 1;
	    }

	    public void enqueue(String nama) {
	        if (isFull()) {
	            System.out.println("Antrian penuh!");
	        } else {
	            rear++;
	            queue[rear] = nama;
	            System.out.println("Data berhasil ditambahkan ke antrian");
	        }
	    }

	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println(queue[front] + " telah dilayani");

	            for (int i = front; i < rear; i++) {
	                queue[i] = queue[i + 1];
	            }

	            queue[rear] = null;
	            rear--;
	        }
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println("Isi antrian:");
	            for (int i = front; i <= rear; i++) {
	                System.out.println((i + 1) + ". " + queue[i]);
	            }
	        }
	    }

	    public void reverse() {
	        if (isEmpty()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            int kiri = front;
	            int kanan = rear;

	            while (kiri < kanan) {
	                String temp = queue[kiri];
	                queue[kiri] = queue[kanan];
	                queue[kanan] = temp;

	                kiri++;
	                kanan--;
	            }

	            System.out.println("Antrian berhasil dibalik");
	        }
	    }
	}

