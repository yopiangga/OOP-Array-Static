public class DataMahasiswa {
    static Mahasiswa arrMahasiswa[] = new Mahasiswa[10];
    static int i = 0;

    public DataMahasiswa(Mahasiswa x) {
        arrMahasiswa[i] = x;
        i = i + 1;
    }

    public static float[] toMeanMK() {
        int j;
        float arrMeanMK[] = new float[3];
        float RPL = 0;
        float BD = 0;
        float PBO = 0;

        for (j = 0; j < i; j++) {
            RPL = RPL + arrMahasiswa[j].rpl;
            BD = BD + arrMahasiswa[j].bd;
            PBO = PBO + arrMahasiswa[j].pbo;
        }

        arrMeanMK[0] = RPL / (float) j;
        arrMeanMK[1] = BD / (float) j;
        arrMeanMK[2] = PBO / (float) j;

        return (arrMeanMK);
    }

}
