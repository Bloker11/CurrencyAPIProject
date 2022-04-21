package wsb;

import org.json.JSONObject;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------Homework------------------");
        Wallet wallet = new Wallet();
        System.out.println("Transactions stored in the database: ");

        wallet.loadTransactions();



    }
}
