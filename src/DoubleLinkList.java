/**
 * 需求：编写一个双向链表
 * Created by 没想法的岁月 on 2018/3/27.
 */
public class DoubleLinkList  {
    //链表集合的第一个节点
    private Node first;
    //最后一个节点
    private Node last;
    int size;

    public boolean search(Object ele) {
        if (size == 0) {
           return false;
        }
        for (int i = 0; i <size ; i++) {

        }
        return false;
    }
    class Node{
        Node pre;
        Node next;
        Object ele;

        public Node(Object ele) {
            this.ele = ele;
        }
    }
    public void addLast(Object ele) {
        Node node = new Node(ele);
        if (size == 0) {
            Node first = node;
            Node last = node;
        }else {
            this.last.next =node;
            node.pre = this.last;
        }
        size++;
    }

    public void addFirst(Object ele) {
        Node node = new Node(ele);
        if (size == 0) {
            Node first = node;
            Node last = node;
        }else{
            node.next = this.first;
            this.first.pre =node;
        }
        size++;
    }
}
