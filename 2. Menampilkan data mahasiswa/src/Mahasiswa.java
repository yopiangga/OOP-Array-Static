public class Mahasiswa {
    int nrp;
    String nama;
    int rpl;
    int bd;
    int pbo;

    public Mahasiswa(int nrp, String nama, int rpl, int bd, int pbo){
        this.nrp = nrp;
        this.nama = nama;
        this.rpl = rpl;
        this.bd = bd;
        this.pbo = pbo;
    }

    public double IPK(){
        double mean;
        mean = (this.rpl + this.bd + this.pbo) / 3;
        return(mean);
    }
}
