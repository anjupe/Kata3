package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es",10);
        histogram.increment("hotmail.com",5);
        histogram.increment("ull.es",2);
        histogram.increment("gmail.com",7);
        new HistogramDisplay(histogram).execute();
    }
    
}