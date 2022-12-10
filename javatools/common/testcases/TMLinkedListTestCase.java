import com.thinking.machines.util.*;
class TMLinkedListTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();

TMLinkedList list2=new TMLinkedList();
list2.add(1000);
list2.add(2000);
list2.add(3000);
list1.appendFrom(list2);
for(int i=0;i<list2.size();i++) System.out.println(list1.get(i));
list1.appendTo(list2);
System.out.println("Appending to list2 from list1");
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
}
}