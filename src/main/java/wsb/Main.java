package wsb;

public class Main {
    public static void main(String[] args) {
        CurrencyAPIConnector connector = new CurrencyAPIConnector();
        System.out.println(connector.getHistoricalData("PLN","2022-04-01"));
    }
}
