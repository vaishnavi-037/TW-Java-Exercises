import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    private int sum;

    public PythagoreanTriplet(){}
    
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }
    
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int num) {
            this.sum = num;
            return this;
    }
    
    public PythagoreanTriplet thatSumTo(int num) {
            this.sum = num;
            return this;
    }
    
    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> list = new ArrayList<>();
            for(int a = 1;a < sum/2;a++) {
                for(int b = a + 1;b <sum - a;b++) {
                   if(b!=a){
                    int c = sum - a - b;
                        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                            list.add(new PythagoreanTriplet(a, b, c));
                        }
                    }
                }
            }
            return list;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        PythagoreanTriplet actual = (PythagoreanTriplet) o;
        return a == actual.a &&
                b == actual.b &&
                c == actual.c;
    }
}