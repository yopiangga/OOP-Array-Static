public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---------------- Alfian Prisma Yopiangga ----------------\n");

        int x = 5;
        int y = 6;
        int z = 7;

        int i;
        int arrFib[] = new int[x];
        int arrPrim[] = new int[y];
        int arrGanjil[] = new int[z];

        arrFib = Deret.fibonacci(x);
        arrPrim = Deret.prima(y);
        arrGanjil = Deret.ganjil(z);

        System.out.print("Bilangan Fibonacci : ");
        for(i=0; i<x; i++){
            System.out.print(arrFib[i] + " ");
        }

        System.out.print("\nBilangan Prima : ");
        for(i=0; i<y; i++){
            System.out.print(arrPrim[i] + " ");
        }

        System.out.print("\nBilangan Ganjil : ");
        for(i=0; i<z; i++){
            System.out.print(arrGanjil[i] + " ");
        }
        System.out.print("\n");

        System.out.println("\n---------------------- End Program ----------------------\n");
    }
}
