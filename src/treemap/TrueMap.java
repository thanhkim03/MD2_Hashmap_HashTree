package treemap;

import java.util.*;

public class TrueMap {
    public static void main(String[] args) {
        String str = "anh em ngu ngon nhe mai hoc tiep yeu yeu yeu";
        String[] strings= str.split(" ");
        String key="";
        int value =0 ;
        Map<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            key=strings[i];
            if (map.containsKey(key)){
                value= map.get(key);
                map.remove(key);
                value++;
            }else value=1;
            map.put(key,value);
        }
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            key = (String)iterator.next();
            System.out.println("số lần xuất hiện của "+key+" trong chuỗi= "+map.get(key));
        }
        }

}
