public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---------------- Alfian Prisma Yopiangga ----------------\n");

        Deret a = new Deret(10);

        int i;
        int arrFib[] = new int[a.x];
        int arrPrim[] = new int[a.x];
        int arrGanjil[] = new int[a.x];

        arrFib = a.fibonacci();
        arrPrim = a.prima();
        arrGanjil = a.ganjil();

        System.out.print("Bilangan Fibonacci : ");
        for(i=0; i<a.x; i++){
            System.out.print(arrFib[i] + " ");
        }

        System.out.print("\nBilangan Prima : ");
        for(i=0; i<a.x; i++){
            System.out.print(arrPrim[i] + " ");
        }

        System.out.print("\nBilangan Ganjil : ");
        for(i=0; i<a.x; i++){
            System.out.print(arrGanjil[i] + " ");
        }
        System.out.print("\n");

        System.out.println("\n---------------------- End Program ----------------------\n");
    }
}
