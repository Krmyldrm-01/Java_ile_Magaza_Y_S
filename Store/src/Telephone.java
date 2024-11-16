import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Telephone implements Comparable<Telephone>
{
    private int battery;
    private String color;

    private int id;
    private double price;
    private int discountRate;
    private int stock;
    private String name;
    private String bradName;
    private int ram;
    private int ssd;
    private double screenSize;


    public Telephone(int id, String name, double price, String bradName, int ssd, double screenSize,int battery ,int ram, String color,int stock, int discountRate)
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
        this.battery=battery;
        this.color=color;
    }

    public Telephone()
    {

    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public static TreeSet<Telephone> telephoneList = new TreeSet<>();
    static
    {


        telephoneList.add(new Telephone(1,"SAMSUNG GALAXY A51 ",3199.0  ,"Samsung",128,6.5,4000,6,"Siyah",100,12));
        telephoneList.add(new Telephone(2,"iPhone 11 64 GB",7379.0 ,"Apple",64,6.1,3046,6,"Mavi",100,12));
        telephoneList.add(new Telephone(3,"Redmi Note 10 Pro 8GB ",4012.0 ,"Xiaomi",128,6.5,4000,6,"Beyaz",100,12));

    }

    private static Scanner input = new Scanner(System.in);

    public void telephoneControl()
    {

        boolean control = true;
        while (control)
        {

            System.out.println("***********************");
            System.out.println("Telefon işlemleri : ");
            System.out.println("1 - Telefon Ürünlerini Listele");
            System.out.println("2 - Telefon Ürün ekleme");
            System.out.println("3 - Telefon Ürün Silme");
            System.out.println("4 - çıkış");
            int selected = input.nextInt();

            switch (selected)
            {
                case 1:
                    telephoneListining();
                    break;
                case 2:
                    telephonetoAdd();
                    break;
                case 3:
                    telephoneCancel();
                    break;
                case 4:
                    System.out.println("Bu bölüm üzerinden çıkış yapmaktasınız...");
                    control = false;
                    break;

            }

        }
    }


    public void telephoneListining()
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Batarya     | RAM    |Renk");
        for (Telephone o : telephoneList)
        {
            System.out.println("| " + o.getId() + " | " + o.getName() + " | " + o.getPrice() + " | " + o.getBradName() + " | " + o.getSsd() + " | " + o.getScreenSize() + " | " + o.getBattery() + " | " + o.getRam() + " | " + getColor() + " " + o.getStock() + " | " + o.getDiscountRate() + " | " );

        }
        System.out.println("----------------------------------------------------------------------------------------\n");

    }

    public void telephonetoAdd()
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
        System.out.println("Ürünün Bataryası :");
        int bat = input2.nextInt();
        System.out.println("Ürünün RAM boyutu (GB) : ");
        int gb = input2.nextInt();
        System.out.println("Ürünün Rengi : ");
        String col = input3.nextLine();
        System.out.println("Ürünün Stok Miktarı : ");
        int stock = input2.nextInt();
        System.out.println("Ürünün İndirim Oranı : ");
        int discountrate = input2.nextInt();

        telephoneList.add(new Telephone(id,name,price,brad,ssd,inc,bat,gb,col,stock,discountrate));

        System.out.println("Ürün ekleme işlemi başarıyla tamamlanmıştır.");
        System.out.println("==============================================================");

    }

    public void telephoneCancel()
    {
        System.out.println("==============================================================");
        System.out.println("Ürün silme paneline hoşgeldiniz . ");
        Scanner cancel = new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün adını giriniz : ");
        String productNameToDelete = cancel.nextLine();


        boolean removed = false;

        Iterator<Telephone> iterator = telephoneList.iterator();
        while (iterator.hasNext()) {
            Telephone telephone = iterator.next();
            if (telephone.getName().equals(productNameToDelete)) {
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
    public int compareTo(Telephone o) {
        return this.getId();
    }

}
