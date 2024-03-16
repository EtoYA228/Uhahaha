import java.util.ArrayList;
import java.util.Scanner;
public class Scannerr2 {
Scannerr scannerr = new Scannerr();
Scanner sc = new Scanner(System.in);
Paweerrrr paweerrrr = new Paweerrrr();
    public void ScanA(){ System.out.println("вкл/выкл компьютер?");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number == 1)
                paweerrrr.on();


            else if (number == 0) {
                paweerrrr.off();
            }
        }
    }

}
