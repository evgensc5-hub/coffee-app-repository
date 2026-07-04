public class Coffee {
    //props
    private int temp;
    private int conc;

    //constructorul
    public Coffee(int temp, int conc) {
        this.temp = temp;
        this.conc = conc;
    }
    //getters


    public int getConc() {
        return conc;
    }

    public int getTemp() {
        return temp;
    }
    @Override new*

    @Override
    public String toString() {
        return "[temperatura cafelei = " +temp + ":concentratia = "+ conc + "]";
    }
}
