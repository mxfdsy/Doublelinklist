/**
 * Created by 没想法的岁月 on 2018/3/27.
 */
public class DoubleLinkListDmeo extends  DoubleLinkList{
    public static void main(String[] args) {
        DoubleLinkListDmeo  List =new DoubleLinkListDmeo();
        List.addLast("A");
        List.addFirst("B");
        List.addFirst("B");
        List.search("A");
        System.out.println(List.size);
    }
}
