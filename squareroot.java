package DataAlgo;
//sqrtn+1=(sqrtn+(num/sqrtn))/2.0
public class Main {
    public static void main(String[] args) {
        int num =25;
        double temp;
        double sr=num/2;       
        do {
            temp =sr;
            sr = (temp+(num/temp))/2;
        }
        while ((temp -sr != 0));            //This condition needs to be satisfied until then the loop will keep executing
        System.out.println(sr);

    }
}
