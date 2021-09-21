public class Deret {

    public static int[] fibonacci(int x){
        int arrFib[] = new int[x];
        int i = 0;
        int j;

        for(j=0; i<x; j++){
            if(j == 0 || j == 1)
                arrFib[i] = j;
            else
                arrFib[i] = arrFib[i-2] + arrFib[i-1];
            i++;
        }

        return(arrFib);
    }

    public static int[] prima(int x){
        int arrPrim[] = new int[x];
        int i = 0;
        int j = 0;

        for(j=2; i<x; j++){
            if(cekPrima(j)){
                arrPrim[i] = j;
                i++;
            }
        }
        
        return(arrPrim);
    }

    private static boolean cekPrima(int x){
        int i;
        int bagi = 0;
        for(i=1; i<=x; i++){
            if(x%i == 0)
                bagi++;
            if(bagi > 2)
                break;
        }
        
        if(bagi > 2){
            return(false);
        } else {
            return(true);
        }

    }

    public static int[] ganjil(int x){
        int arrGanjil[] = new int[x];
        int i = 0;
        int j = 0;

        for(j=0; i<x; j++){
            if(j % 2 != 0){
                arrGanjil[i] = j;
                i++;
            }
        }
        
        return(arrGanjil);
    }

}
