import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: Neo
 * 日    期: 2018年04月19日  15:32:52
 * Q    Q: 1784286916
 * </pre>
 */
public class CollectionStu {

    Object object;
    Collection collection;
    List list;
    ArrayList arrayList;
    LinkedList linkedList;

    HashMap hashMap;


    public static void main(String[] args){
        System.out.println(1 << 3);
    }

    //<T> T[] toArray(T[] a)
    public static void main02(String[] args){
//        List<String> bookLs = new ArrayList<>();
//        bookLs.add("西游记");
//        bookLs.add("三国演义");
//        bookLs.add("水浒传");
//        bookLs.add("红楼梦");
//        //java.lang.ClassCastException
//        //String[] bookArr = (String[])bookLs.toArray();
//        String[] bookArr = bookLs.toArray(new String[0]);
//        System.out.println(bookArr.toString());

        String[] arr = new String[10];
        arr[0] = "zs";
        arr[1] = "ls";
        arr[2] = "ww";
        System.out.println(arr.length);//10
        System.out.println(ArrayUtil.arrayToString(arr));
    }

    //retainAll()
    public static void main01(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> list1=new ArrayList<String>();
        list1.add("a");
        list1.add("c");
        boolean ret=list.retainAll(list1);
        if(ret){
            System.out.println("元素被移除成功");
        }else{
            System.out.println("列表中不包含要移除的元素");
        }
    }
}
