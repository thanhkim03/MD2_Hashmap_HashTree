package HashMap_LinkedHashMap_TrueMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        HashMap theo quy tắc hash map
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Thành",1);
        hashMap.put("Hùng",6);
        hashMap.put("Việt",7);
        hashMap.put("Nam",5);
        hashMap.put("Anh",2);
        System.out.println("danh sách học sinh CodeGym");
        System.out.println(hashMap+"\n");
//        TrueMap theo thứ tự tăng dần
        Map<String,Integer> trueMap= new TreeMap<>(hashMap);
        System.out.println("sau truemap: ");
        System.out.println(trueMap);
//        LinkedHashMap sắp xếp theo đúng thứ tự nhập vào
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Thành",1);
        linkedHashMap.put("Hùng",6);
        linkedHashMap.put("Việt",7);
        linkedHashMap.put("Nam",5);
        linkedHashMap.put("Anh",2);
        System.out.println("sau LinkedHashMap");
        System.out.println(linkedHashMap);
    }
}
