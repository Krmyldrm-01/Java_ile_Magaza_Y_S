import java.util.Scanner;

public class Store
{
    public Store()
    {
    }

   private Scanner input = new Scanner(System.in);



    public void start()
    {

        System.out.println("** Patika Mağazasına Hoşgeldiniz **");
        while (true)
        {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("1 - Notebook işlemleri ");
            System.out.println("2 - Cep telefonu işlemleri  ");
            System.out.println("3 - Marka Listeme ");
            System.out.println("0 - Çıkış yap");
            int selected = this.input.nextInt();

            switch (selected)
            {
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.NotebookControl();
                    break;
                case 2:
                    Telephone telephone = new Telephone();
                    telephone.telephoneControl();
                    break;
                case 3:
                    Brad b = new Brad();
                    b.bradListPrint();
                    break;
                case 0:
                    break;
                    default:
                    System.out.println("Yanlış bir tuşlama yaptınız lütfen tekrar deneyiniz ..");
                    System.out.println("------------------------------------------------------->");

            }
        }
    }

}
