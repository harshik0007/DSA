class MyLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {

    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public boolean is_empty() {
        return head == null;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }

        if (index == 0) {
            return head.val;
        }

        int i = 0;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (size == 0 || head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (size == 0 || head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (size == index) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        int idx = 0;
        Node temp = head;

        while (idx < index - 1) {
            temp = temp.next;
            idx++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }

        if (index == 0 && size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        if(index==0){
            head=head.next;
            size--;
            return;
        }

        if (index == size - 1) {
            int i = 0;
            Node temp = head;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }

            tail = temp;
            tail.next = null;
            size--;
            return;
        }

        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */