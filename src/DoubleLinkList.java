import javax.xml.soap.Node;

/**
 * 需求：编写一个双向链表
 * Created by 没想法的岁月 on 2018/3/27.
 */
public class DoubleLinkList  {
    //链表集合的第一个节点
    Node first;
    //最后一个节点
    Node last;
    int size;


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
        Node last = node;
        size++;
    }

    public void addFirst(Object ele) {
        Node node = new Node(ele);
        Node first = node;
        size++;
    }
}
