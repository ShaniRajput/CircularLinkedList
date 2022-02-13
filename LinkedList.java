public class LinkedList {
    Node last;

    void insertStart(int value) {
        if (last == null) {
            last = new Node(value);
            last.next = last;
        } else {
            Node new_node = new Node(value);
            new_node.next = last.next;
            last.next = new_node;
        }
    }

    void insertByPosition(int value, int position) {
        if (last == null) {
            last = new Node(value);
            last.next = last;
        } else {
            Node temp = last;
            if (position == 1) {
                insertStart(value);
            } else if (size() >= position) {
                for (int i = 0; i < position - 1; i++) {
                    temp = temp.next;
                }
                Node new_node = new Node(value);
                new_node.next = temp.next;
                temp.next = new_node;
            } else {
                insertEnd(value);
            }
        }
    }

    void insertEnd(int value) {
        insertStart(value);
        last = last.next;
    }

    void removeByValue(int value) {
        if (last.next.value == value) {
            last.next = last.next.next;
        }
        Node temp = last.next;
        while (temp.next != last) {
            if (temp.next.value == value) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        if (last.value == value) {
            temp = last.next;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

    void removeByPosition(int position) {
        if (position == 1) {
            last.next = last.next.next;
        } else {
            Node temp = last.next;
            if (size() >= position) {
                if (position == size()) {
                    temp = last.next;
                    while (temp.next != last) {
                        temp = temp.next;
                    }
                    temp.next = last.next;
                    last = temp;
                    return;
                }
                for (int i = 1; i < position - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }
    }

    void show() {
        Node temp = last.next;
        while (temp != last) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.print(temp.value);
        System.out.println();
    }

    int size() {
        int count = 0;
        if (last != null) {
            Node temp = last.next;
            while (temp != last) {
                count++;
                temp = temp.next;
            }
            count++;
        }
        return count;
    }
}