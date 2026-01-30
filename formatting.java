import java.text.NumberFormat;
import java.util.Locale;

public class formatting {
    public static void main(String[] args) {
        NumberFormat currencyinstance=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Salary:- "+ currencyinstance.format(10000000));
    }
}
