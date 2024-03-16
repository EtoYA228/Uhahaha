import java.util.Scanner;
public class Scannerr {
   Scanner sc = new Scanner(System.in);
    DVDRomm dvd = new DVDRomm();
    HDDdd hdDdd = new HDDdd();

    public void ScanB(){ System.out.println("диск вставлен?");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number == 1){
                dvd.load();
                hdDdd.copyFromDVD(dvd);
            else if (number == 0) {
                dvd.unload();
            }
        }
    }}
    }
