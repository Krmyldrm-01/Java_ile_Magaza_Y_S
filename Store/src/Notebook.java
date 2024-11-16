import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Notebook implements Comparable<Notebook>
{
    private int id;
    private double price;
    private int discountRate;
    private int stock;
    private String name;
    private String bradName;
    private int ram;
    private int ssd;
    private double screenSize;

    public Notebook(int id, String name, double price, String bradName, int ssd, double screenSize, int ram, int stock, int discountRate)
    {

        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.bradName = bradName;
        this.ram = ram;
        this.ssd = ssd;
        this.screenSize = screenSize;
    }


    public Notebook()
    {

    }



    public static   TreeSet<Notebook> nootbokeList = new TreeSet<>();
    static
    {


        nootbokeList.add(new Notebook(1,"HUAWEI Matebook 14",7000.0 ,"Huawei",512,14.0,16,100,12));
        nootbokeList.add(new Notebook(2,"LENOVO V14 IGL",3699.0 ,"Lenovo    ",1024,14.0,8,50,12));
        nootbokeList.add(new Notebook(3,"ASUS Tuf Gaming",8199.0 ,"Asus    ",2048,15.6,32,99,12));

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBradName() {
        return bradName;
    }

    public void setBradName(String bradName) {
        this.bradName = bradName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    private static Scanner input = new Scanner(System.in);
    public void NotebookControl()
    {

        boolean control = true;
        while (control)
        {

            System.out.println("***********************");
            System.out.println("NoteBook işlemleri : ");
            System.out.println("1 - NoteBook Ürünlerini Listele");
            System.out.println("2 - NoteBook Ürün ekleme");
            System.out.println("3 - NoteBook Ürün Silme");
            System.out.println("4 - çıkış");
            int selected = input.nextInt();

            switch (selected)
            {
                case 1:
                    noteBookListing();
                    break;
                case 2:
                    notebooktoadd();
                    break;
                case 3:
                    notebookCancel();
                    break;
                case 4:
                    System.out.println("Bu bölüm üzerinden çıkış yapmaktasınız...");
                    control = false;
                    break;

            }

        }
    }

    public void noteBookListing()
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM ");
        for (Notebook o : nootbokeList)
        {
            System.out.println("| " + o.getId() + " | " + o.getName() + " | " + o.getPrice() + " | " + o.getBradName() + " | " + o.getSsd() + " | " + o.getScreenSize() + " | " + o.getRam() + " | " + o.getStock() + " | " + o.getDiscountRate() + " | " );

        }
        System.out.println("----------------------------------------------------------------------------------------\n");

    }
    public void notebooktoadd()
    {
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Ürün ekleme paneline hoşgeldiniz . ");
        System.out.println("Lütfen Ürüne Ait Bilgileri Giriniz :");
        System.out.println("Ürün ID : ");
        int id = input2.nextInt();
        System.out.println("Ürün Adı : ");
        String name = input3.nextLine();
        System.out.println("Ürün Fiyatı : ");
        double price = input2.nextDouble();
        System.out.println("Ürünün Markası : ");
        String brad = input3.nextLine();
        System.out.println("Ürünün Depolama Alanı : ");
        int ssd = input2.nextInt();
        System.out.println("Ürünün Ekran Boyutu : ");
        double inc = input2.nextDouble();
        System.out.println("Ürünün RAM boyutu (GB) : ");
        int gb = input2.nextInt();
        System.out.println("Ürünün Stok Miktarı : ");
        int stock = input2.nextInt();
        System.out.println("Ürünün İndirim Oranı : ");
        int discountrate = input2.nextInt();

        nootbokeList.add(new Notebook(id,name,price ,brad,ssd,inc,gb,stock, discountrate));

        System.out.println("Ürün ekleme işlemi başarıyla tamamlanmıştır.");
        System.out.println("==============================================================");

    }

    public void notebookCancel()
    {
        System.out.println("==============================================================");
        System.out.println("Ürün silme paneline hoşgeldiniz . ");
        Scanner cancel = new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün adını giriniz : ");
        String productNameToDelete = cancel.nextLine();


        boolean removed = false;

        Iterator<Notebook> iterator = nootbokeList.iterator();
        while (iterator.hasNext()) {
            Notebook notebook = iterator.next();
            if (notebook.getName().equals(productNameToDelete)) {
                iterator.remove();
                System.out.println(productNameToDelete + " Ürün listesinden silindi .");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println(productNameToDelete + " Ürün Listesinde bulunamadı.");
        }

    }

    @Override
    public int compareTo(Notebook o) {
        return this.getId();
    }
}
