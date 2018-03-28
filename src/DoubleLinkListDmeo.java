import java.util.ArrayList;
import java.util.List;

/**
 * Created by 没想法的岁月 on 2018/3/27.
 */
public class DoubleLinkListDmeo {
    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();
        //增加第一个节点
        list.addFirst("A");
        //获取当前的节点数
        System.out.println(list.getSize());
        // 增加最后一个节点
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");

        System.out.println(list.getSize());
        //打印出当前节点的toString
        System.out.println(list);
        //删除带有这个元素的节点且返回这个值
        System.out.println(list.remove("A"));
        System.out.println(list);
    }
}
