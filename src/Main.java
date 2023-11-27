import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
////        list.add(33);
////        list.add(22);
//////        list.add("AA"); // 2
////
////        Integer i = list.get(2);
////
////        List<String> list2 = new ArrayList<>();
////        list2.add("asd");
////        list2.add(22);
//
//        List<Integer> listaVeche = new ArrayList<>();
//
//        listaVeche.add(22);
//        listaVeche.add(22);
//        listaVeche.add(22);
//        listaVeche.add(22);
//        listaVeche.add(22);
//        listaVeche.add(22);
//        listaVeche.add(22);
////        listaVeche.add("22");
//        listaVeche.add(22);
//        listaVeche.add(22);
//        listaVeche.add(22);
//
//        Set<Integer> set = new HashSet<>();   // generics = <Integer>
//        set.add("asda");
//        set.add(22);
//
//        Map<String, Integer> map = new HashMap<>(); // generics cu 2 parametri -> <String, Integer>
//        map.put("sds", 44);
//
//        Set<Integer> set1 = new HashSet();
//        set1.add(4454);
//
//
//        for (int i = 0; i < listaVeche.size(); i++) {
//            Integer nr = (Integer) listaVeche.get(i);
//        }
//
//        System.out.println(listaVeche);

        CustomList<Integer> customListImpl = new CustomListImpl<>();
        customListImpl.add(2);
        customListImpl.add(3);

//

//        customList.add("sds");
//        customList.add("Hello");
//        customList.add("World");

        CustomListImpl<String> customListImpl1 = new CustomListImpl<>();
        customListImpl1.add("Hello");
        customListImpl1.add("World");

        System.out.println(customListImpl);
        System.out.println(customListImpl1);
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("SDS");
//        list2.add("SDS");
//        list2.add(2);

//
//        List list = new ArrayList();
//        list.add("ss");
//        list.add(22);

//        System.out.println(customList);
//
//        CustomList customList1 = new CustomList();
//
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//
//        List<String> list1 = new ArrayList<>();
        
        CustomList<Integer> customList = new CustomListImpl<>();
        CustomList<String> customList2 = new CustomListImpl<>();

        CustomList<Integer> customList3 = new CustomListImpl<>();
        customList3.add(22);

        Map<String, Integer> map = new HashMap<>();
        map.put("sd", 22);
        map.put(22, "sds");

        CustomMap<Integer, String> customMap = new CustomHashMap<>(); //
        customMap.put("sd", 22);
        customMap.put(22, "sds");


        // Generics:
            // ce este ?  -> Restrictionare la adaugare de date, putem lucra cu date doar de un singur tip
            // la ce ne ajuta ? ->  CustomList<String> -> add(String)
            // cum se specifica tipul de date in CustomList -> CustomList<String>
            // T -> o variabila necunoscuta -> CustomList<String> -> T = String






    }
}