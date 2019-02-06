package isiklar;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class IsiklarApp {

    public static void main(String[] args) {


        double sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize Notunu Giriniz..");
        double vize1=scanner.nextInt();
        System.out.print("Final Notunu Giriniz...");
        double final2=scanner.nextInt();

        sonuc=(vize1*0.40)+(final2*0.60);
        System.out.println("Ortalamanız = "+sonuc);
        if (sonuc>=60){
            System.out.println("Ortalamanız "+sonuc+" Geçtiniz...");

        }else
            System.out.println("Ortalamanız "+sonuc+" Kaldınız....");
        System.out.println("Bir sonraki sınav için daha çok çalışmanız dileğiyle...");
return;
    }



}
