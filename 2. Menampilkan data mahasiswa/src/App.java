public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa ahmad = new Mahasiswa(1, "Ahmad", 81, 90, 62);
        Mahasiswa adang = new Mahasiswa(2, "Adang", 50, 83, 87);
        Mahasiswa dani = new Mahasiswa(3, "Dani", 89, 55, 66);
        Mahasiswa edi = new Mahasiswa(4, "Edi", 77, 70, 92);

        new DataMahasiswa(ahmad);
        new DataMahasiswa(adang);
        new DataMahasiswa(dani);
        new DataMahasiswa(edi);

        String tblData = "| %-3d | %-11s | %-5d | %-5d | %-5d | %-5.2f |%n";

        System.out.format("+-----+-------------+-------+-------+-------+-------+%n");
        System.out.format("| NRP | Nama        |  RPL  |  DB   |  PBO  |  Rata |%n");
        System.out.format("+-----+-------------+-------+-------+-------+-------+%n");

        for (int j = 0; j < DataMahasiswa.i; j++) {
            System.out.format(tblData, DataMahasiswa.arrMahasiswa[j].nrp, DataMahasiswa.arrMahasiswa[j].nama, DataMahasiswa.arrMahasiswa[j].rpl, DataMahasiswa.arrMahasiswa[j].bd, DataMahasiswa.arrMahasiswa[j].pbo, DataMahasiswa.arrMahasiswa[j].IPK());
        }
        System.out.format("+-----+-------------+-------+-------+-------+-------+%n");


        String tblMeanMK = "| %-11s | %-17.2f |%n";
        System.out.format("+-------------+-------------------+%n");
        System.out.format("| Mata Kuliah | Nilai Rata - rata |%n");
        System.out.format("+-------------+-------------------+%n");
        System.out.format(tblMeanMK, "RPL", DataMahasiswa.toMeanMK()[0]);
        System.out.format(tblMeanMK, "DB", DataMahasiswa.toMeanMK()[1]);
        System.out.format(tblMeanMK, "PBO", DataMahasiswa.toMeanMK()[2]);
        System.out.format("+-------------+-------------------+%n");
    }

}
