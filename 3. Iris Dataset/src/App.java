public class App {
    public static void main(String[] args) throws Exception {
        
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
        
        System.out.println("=========================================");
        System.out.println("Jarak IrisSetosa dengan Centroid 1");
        System.out.println("=========================================");
        System.out.println("IrisSetosa1 : " + irisSetosa1.getJarak());
        System.out.println("IrisSetosa2 : " + irisSetosa2.getJarak());
        System.out.println("IrisSetosa3 : " + irisSetosa3.getJarak());
        System.out.println("IrisSetosa4 : " + irisSetosa4.getJarak());
        System.out.println("IrisSetosa5 : " + irisSetosa5.getJarak());
        System.out.print("\n");

        System.out.println("=========================================");
        System.out.println("Jarak IrisVersiColor dengan Centroid 2");
        System.out.println("=========================================");
        System.out.println("IrisVersiColor1 : " + irisVersiColor1.getJarak());
        System.out.println("IrisVersiColor2 : " + irisVersiColor2.getJarak());
        System.out.println("IrisVersiColor3 : " + irisVersiColor3.getJarak());
        System.out.println("IrisVersiColor4 : " + irisVersiColor4.getJarak());
        System.out.println("IrisVersiColor5 : " + irisVersiColor5.getJarak());
        System.out.print("\n");

        System.out.println("=========================================");
        System.out.println("Jarak IrisVirginica dengan Centroid 3");
        System.out.println("=========================================");
        System.out.println("IrisVirginica1 : " + irisVirginica1.getJarak());
        System.out.println("IrisVirginica2 : " + irisVirginica2.getJarak());
        System.out.println("IrisVirginica3 : " + irisVirginica3.getJarak());
        System.out.println("IrisVirginica4 : " + irisVirginica4.getJarak());
        System.out.println("IrisVirginica5 : " + irisVirginica5.getJarak());
        System.out.print("\n");
    }
}
