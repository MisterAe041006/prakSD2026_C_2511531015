package pekan4_2511531015;

public class QueueArray_2511531015 {
int front_1015, rear_1015, size_1015;
int capacity_1015;
int array[];

public QueueArray_2511531015(int capacity) {
	this.capacity_1015 = capacity;
	front_1015 = this.size_1015 = 0;
	rear_1015 = capacity - 1;
	array = new int [this.capacity_1015];
	
}
boolean isFull(QueueArray_2511531015 queue) {
	return (queue.size_1015 == queue.capacity_1015);
}
boolean isEmpty(QueueArray_2511531015 queue) {
	return (queue.size_1015 == 0);
}
void enqueue(int item) {
	if (isFull(this))
		return;
	this.rear_1015 = (this.rear_1015 + 1) % this.capacity_1015;
	this.array[this.rear_1015] = item;
	System.out.println(item + " enqueue to queue");
	
	
}
int dequeue( ) {
	if(isEmpty(this))
		return Integer.MIN_VALUE;
	int item = this.array[this.front_1015];
	this.front_1015 = (this.front_1015 + 1) % this.capacity_1015;
	this.size_1015 = this.size_1015 - 1;
	return item;
	
}
int front_1015() {
	if (isEmpty(this))
		return Integer.MIN_VALUE;
	return this.array[this.front_1015];
	
}
int rear_1015() {
	if(isEmpty(this))
		return Integer.MIN_VALUE;
	return this.array[this.rear_1015];
}
//mencetak elemen antrian
void display() {
	int i;
	if (front_1015 == rear_1015) {
		System.out.println("\nAntrian Kosong\n");
		return;
	}
	//kunjungi dari belakang dan cetak
	for (i = front_1015; i < rear_1015; i++) {
		System.out.printf(" %d <-- ", array[i]);
	}
	return;
	
}

}
