public class Komputer {
    Paweerrrr paweerrrr = new Paweerrrr();
    DVDRomm dvd = new DVDRomm();
    HDDdd hdDdd = new HDDdd();

    void copy(){
        paweerrrr.on();
        dvd.load();
        hdDdd.copyFromDVD();
    }
}
