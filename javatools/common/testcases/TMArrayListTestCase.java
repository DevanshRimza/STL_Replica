import com.thinking.machines.util.*;
class TMArrayListTestCase
{
public static void main(String gg[])
{
TMArrayList<Integer> list1=new TMArrayList<Integer>();
list1.add(10);
list1.add(20);
list1.add(30);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
TMArrayList<Integer> list2=new TMArrayList<Integer>();
list2.copyFrom(list1);
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
}
}