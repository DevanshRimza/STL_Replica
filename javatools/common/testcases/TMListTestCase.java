import com.thinking.machines.util.*;
class TMListTestCase
{
public static void main(String gg[])
{
TMArrayList<Integer> list1=new TMArrayList<Integer>();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.forEach((m)->{
System.out.println(m);
});
//   for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
TMLinkedList<String> list2=new TMLinkedList<String>();
//for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
list2.add("Ujjain");
list2.add("Indore");
list2.add("Goa");
list2.add("Pune");
list2.forEach((j)->{
System.out.println("City : "+j);
});

}
}