import java.util.*;

public class Brad
{

    public Brad() {
    }

    public static List<String> bradlist = new ArrayList<>();
    static
    {
        bradlist.add("Apple");
        bradlist.add("Samsung");
        bradlist.add("Lenova");
        bradlist.add("Huawei");
        bradlist.add("Casper");
        bradlist.add("Asus");
        bradlist.add("Hp");
        bradlist.add("Xiaomi");
        bradlist.add("Monster");

    }


    public void bradListPrint()
    {
        Collections.sort(bradlist);
        System.out.println("Markalar");
        System.out.println("Alfabetik sırası ile :");
        int a = 1;
        for(String M : bradlist)
        {
            System.out.println(a + " - " + M);
            a++;
        }
        System.out.println("------------------------------------------------>");

    }



}
