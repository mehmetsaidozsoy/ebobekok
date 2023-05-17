import java.util.Scanner;
public class ebobekok {
    
public static void main(String[] args) {

    //EBOB ve EKOK değişkenleri
    int ebob=0, ekok, sayi1, sayi2;
    
    
    Scanner inp=new Scanner(System.in);

    System.out.println("1.sayıyı giriniz :");
    sayi1=inp.nextInt();

    System.out.println("2.sayıyı giriniz :");
    sayi2=inp.nextInt();

    while (sayi1>0&&sayi2>0) {

        if(sayi1<=sayi2)
        {
            for (int i = 1; i <= sayi1; i++) {
                if(sayi1%i==0&&sayi2%i==0){
                    System.out.println("bölen :"+i);
                    ebob=i;
                }                                
            }
            System.out.println("EBOB :"+ebob);
            

        }else{
            for (int i = 1; i <= sayi2; i++) {
                if (sayi2%i==0&&sayi1%i==0){
                    System.out.println("Bölen :"+i);
                    ebob=i;
                    
                }
                
            }
            System.out.println("EBOB :"+ebob);
        }
        ekok=(sayi1*sayi2)/ebob;

        System.out.println("EKOK :"+ekok);
        System.exit(0);

        
    }
   
}

}