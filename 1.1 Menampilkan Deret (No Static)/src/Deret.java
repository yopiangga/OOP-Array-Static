public class Deret {
    public int x;
    public Deret(int x){
        this.x = x;
    }

    public int[] fibonacci(){
        int arrFib[] = new int[this.x];
        int i = 0;
        int j;

        for(j=0; i<this.x; j++){
            if(j == 0 || j == 1)
                arrFib[i] = j;
            else
                arrFib[i] = arrFib[i-2] + arrFib[i-1];
            i++;
        }

        return(arrFib);
    }

    public int[] prima(){
        int arrPrim[] = new int[this.x];
        int i = 0;
        int j = 0;

        for(j=2; i<this.x; j++){
            if(cekPrima(j)){
                arrPrim[i] = j;
                i++;
            }
        }
        
        return(arrPrim);
    }

    private boolean cekPrima(int x){
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

    public int[] ganjil(){
        int arrGanjil[] = new int[this.x];
        int i = 0;
        int j = 0;

        for(j=0; i<this.x; j++){
            if(j % 2 != 0){
                arrGanjil[i] = j;
                i++;
            }
        }
        
        return(arrGanjil);
    }

}
