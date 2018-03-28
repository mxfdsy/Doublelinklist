import javax.xml.soap.Node;

/**
 * @author 没想发的岁月
 * 需求：编写一个双向链表
 * Created by 没想法的岁月 on 2018/3/27.
 */
public class DoubleLinkList  {
    //第一个节点
    Node first;
    //第二个节点
    Node last;
    //节点数
    int size;

    public Object  remove(Object ele) {
        // 先找到这个要被删除的节点
        if (size == 0) {
            return "当前的集合中没有任何的元素";
        }else{
            Node current = this.first;
            for (int i = 0; i <size ; i++) {
                if (!current.ele.equals(ele)) {
                    if (current.next == null){
                        return "集合中不存在含有此元素的节点";
                    }
                }
                current = current.next;
            }
            //删除的节点
            if (current == first){
                current.next.prev =null;
                current.next = first;
            }else if (current == last){
                current.prev.next =null;
                current.prev =last;
            }else{
                current.prev =current.next.prev;
                current.next= current.prev.next;
            }
            size--;
            return "成功删除含有元素"+ current.ele + "的节点";
        }
    }

    //使用类来描述 接点这类输入
    class Node{
        //表示上一个节点
        Node  prev;
        //表示下一个节点
        Node next;
        //当前节点中存在的元素
        Object ele;

        public Node(Object ele) {
            this.ele = ele;
        }
    }
    //获取当前的节点数
    public  int getSize(){
        return size;
    }
    //在第一个位置增加一个节点
    public void addFirst(Object ele) {
        Node node = new Node(ele);
        if (size == 0){
            this.first = node;
            this.last = node;
        }else{
            this.first.prev = node;
            node.next =this.first;
            this.first = node;
        }
        size++;
    }

    //在最后添加一个节点
    public void addLast(Object ele) {
        Node node = new Node(ele);
        if (size == 0){
            this.first =node;
            this.last = node;
        }else{
            this.last.next= node;
            node.prev = this.last;
            this.last =node;
        }
        size++;
    }
    //list的toString
    @Override
    public String toString(){
        if (size == 0) {
            return "[]";
        }else{
            Node current = this.first;
           StringBuilder sb = new StringBuilder(size*2-1);
           sb.append("[");
            for (int i = 0; i <size ; i++) {
                sb.append(current.ele);
                if (i!=size-1) {
                    sb.append(",");
                }else {
                    sb.append("]");
                }
                current = current.next;
            }
            return sb.toString();
        }
    }
}
