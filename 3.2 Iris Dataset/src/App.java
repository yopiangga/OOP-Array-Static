public class App {
    public static void main(String[] args) throws Exception {
        
        // Parsing data ke class masing masing
        IrisSetosa.setCentroid((float)4.7, (float)3.2, (float)1.3, (float)0.2);
        IrisSetosa irisSetosa1 = new IrisSetosa((float)5.1, (float)3.5, (float)1.4, (float)0.2);
        IrisSetosa irisSetosa2 = new IrisSetosa((float)4.9, (float)3, (float)1.4, (float)0.2);
        IrisSetosa irisSetosa3 = new IrisSetosa((float)4.7, (float)3.2, (float)1.3, (float)0.2);
        IrisSetosa irisSetosa4 = new IrisSetosa((float)4.6, (float)3.1, (float)1.5, (float)0.2);
        IrisSetosa irisSetosa5 = new IrisSetosa((float)5, (float)3.6, (float)1.4, (float)0.2);
        
        IrisVersiColor.setCentroid((float)5.5, (float)2.3, (float)4, (float)1.3);
        IrisVersiColor irisVersiColor1 = new IrisVersiColor((float)7, (float)3.2, (float)4.7, (float)1.4);
        IrisVersiColor irisVersiColor2 = new IrisVersiColor((float)6.4, (float)3.2, (float)4.5, (float)1.5);
        IrisVersiColor irisVersiColor3 = new IrisVersiColor((float)6.9, (float)3.1, (float)4.9, (float)1.5);
        IrisVersiColor irisVersiColor4 = new IrisVersiColor((float)5.5, (float)2.3, (float)4, (float)1.3);
        IrisVersiColor irisVersiColor5 = new IrisVersiColor((float)6.5, (float)2.8, (float)4.6, (float)1.4);

        IrisVirginica.setCentroid((float)7.1, (float)3, (float)5.9, (float)1.1);
        IrisVirginica irisVirginica1 = new IrisVirginica((float)6.3, (float)3.3, (float)6, (float)2.5);
        IrisVirginica irisVirginica2 = new IrisVirginica((float)5.8, (float)2.7, (float)5.1, (float)1.9);
        IrisVirginica irisVirginica3 = new IrisVirginica((float)7.1, (float)3, (float)5.9, (float)2.1);
        IrisVirginica irisVirginica4 = new IrisVirginica((float)6.3, (float)2.9, (float)5.6, (float)1.8);
        IrisVirginica irisVirginica5 = new IrisVirginica((float)6.5, (float)3, (float)5.8, (float)2.2);
        
        // Parsing object menjadi satu dengan data lain
        new DataIrisSetosa(irisSetosa1);
        new DataIrisSetosa(irisSetosa2);
        new DataIrisSetosa(irisSetosa3);
        new DataIrisSetosa(irisSetosa4);
        new DataIrisSetosa(irisSetosa5);

        new DataIrisVersiColor(irisVersiColor1);
        new DataIrisVersiColor(irisVersiColor2);
        new DataIrisVersiColor(irisVersiColor3);
        new DataIrisVersiColor(irisVersiColor4);
        new DataIrisVersiColor(irisVersiColor5);

        new DataIrisVirginica(irisVirginica1);
        new DataIrisVirginica(irisVirginica2);
        new DataIrisVirginica(irisVirginica3);
        new DataIrisVirginica(irisVirginica4);
        new DataIrisVirginica(irisVirginica5);

        // Tampilkan data object yang tersimpan
        System.out.println("=========================================");
        System.out.println("Jarak IrisSetosa dengan Centroid 1");
        System.out.println("=========================================");
        for(int i=0; i<5; i++){
            System.out.println("IrisSetosa"+ (i+1) +" : " + DataIrisSetosa.arrIrisSetosa[i].getJarak());
        }
        System.out.print("\n");

        System.out.println("=========================================");
        System.out.println("Jarak IrisVersiColor dengan Centroid 2");
        System.out.println("=========================================");
        for(int i=0; i<5; i++){
            System.out.println("IrisVersiColor"+ (i+1) +" : " + DataIrisVersiColor.arrIrisVersiColor[i].getJarak());
        }
        System.out.print("\n");

        System.out.println("=========================================");
        System.out.println("Jarak IrisVirginica dengan Centroid 3");
        System.out.println("=========================================");
        for(int i=0; i<5; i++){
            System.out.println("IrisVirginica" + (i+1) + " : " + DataIrisVirginica.arrIrisVirginica[i].getJarak());
        }
        System.out.print("\n");
    }
}
