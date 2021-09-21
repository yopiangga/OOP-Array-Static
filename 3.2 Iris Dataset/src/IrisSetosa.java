
// Anak class Iris
public class IrisSetosa extends Iris{
    static Iris Centroid;

    public IrisSetosa(float sl, float sw, float pl, float pw){
        super(sl, sw, pl, pw);
    }

    public static void setCentroid(float sl, float sw, float pl, float pw){
        //instance titik pusat
        Centroid = new Iris((float)sl, (float)sw, (float)pl, (float)pw);
    }

    public float getJarak(){
        float result;

        result = (float)Math.pow((this.sl - Centroid.sl), 2) + 
                (float)Math.pow((this.sw - Centroid.sw), 2) + 
                (float)Math.pow((this.pl - Centroid.pl), 2) + 
                (float)Math.pow((this.pw - Centroid.pw), 2);

        result = (float)Math.sqrt(result);

        return(result);
    }

}
