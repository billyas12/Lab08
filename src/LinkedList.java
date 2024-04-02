public class LinkedList implements LinkedListInterface {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void populatePrimeNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(i) && hasDigitThree(i)) {
                add(i);
            }
        }
    }

    public int getSumOfPrimeNumbersWithThree() {
        Node current = head;
        int total = 0;
        while (current != null) {
            total += current.data;
            current = current.next;
        }
        return total;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
            i += 6;
        }
        return true;
    }

    private boolean hasDigitThree(int num) {
        return String.valueOf(num).contains("3");
    }
}
