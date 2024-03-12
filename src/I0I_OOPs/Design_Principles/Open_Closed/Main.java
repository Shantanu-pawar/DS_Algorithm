package I0I_OOPs.Design_Principles.Open_Closed;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // we've to add our class like this
        int ans = cal.CalculateNumbers(12, 21, new Subtract());
        System.out.println(ans);
    }
}
