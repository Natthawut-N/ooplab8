import java.text.DecimalFormat;
import java.math.BigInteger;
public class NumberNew {
    private double number;
    private String dot;
    DecimalFormat DF = new DecimalFormat("0.00");
    public NumberNew() {
        setValue((double) (Math.random() * 100));
    }

    public NumberNew(double n) {
        setValue(n);
    }

    public void setValue(double n) {
        number = n;
    }

    public double getValue() {
        return (number);
    }

    public String toString() {
        
        return DF.format(getValue());
    }

    public void setValue1(String n) {
        dot = n;
    }

    public String getValue1() {
        return (dot);
    }

    public void add(double n) {
        setValue(getValue() + n);
    }

    public void subtract(double n) {
        setValue(getValue() - n);
    }

    public void multiply(double n) {
        setValue(getValue() * n);
    }

    public void divide(double n) {
        setValue(getValue() / n);
    }
    public void per(double n) {
        setValue((getValue() *n)/100);
    }
    public void sqrtt(double n) {
        setValue((double)Math.sqrt(getValue())); 
    }
    public void minn(double n) {
        setValue(getValue() + n);
    }
    public void min(double n) {
        setValue (n-n-n);
    }
    
    public void hex(int n) {  
        setValue1(Integer.toHexString(n));
    }

    public void ten(Double n) {
        setValue(getValue() * Math.pow(10,n));
    }
}