import java.util.Scanner;

public class StackQueueDemo {

    static class Stack {
        int top = -1;
        int size;
        int[] arr;

        Stack(int size) {
            this.size = size;
            arr = new int[size];
        }

        void push(int x) {
            if (top == size - 1) {
                System.out.println("Stack Overflow!");
            } else {
                arr[++top] = x;
                System.out.println(x + " pushed into stack");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow!");
            } else {
                System.out.println(arr[top--] + " popped from stack");
            }
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack elements: ");
                for (int i = top; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    static class Queue {
        int front = 0, rear = -1, size;
        int[] arr;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        void push(int x) {   // enqueue using push
            if (rear == size - 1) {
                System.out.println("Queue Overflow!");
            } else {
                arr[++rear] = x;
                System.out.println(x + " inserted into queue");
            }
        }

        void pop() {   // dequeue using pop
            if (front > rear) {
                System.out.println("Queue Underflow!");
            } else {
                System.out.println(arr[front++] + " removed from queue");
            }
        }

        void display() {
            if (front > rear) {
                System.out.println("Queue is empty");
            } else {
                System.out.print("Queue elements: ");
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        Stack stack = new Stack(sc.nextInt());

        System.out.print("Enter queue size: ");
        Queue queue = new Queue(sc.nextInt());

        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Stack Push");
            System.out.println("2. Stack Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Queue Push");
            System.out.println("5. Queue Pop");
            System.out.println("6. Display Queue");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.print("Enter element: ");
                    queue.push(sc.nextInt());
                    break;
                case 5:
                    queue.pop();
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
