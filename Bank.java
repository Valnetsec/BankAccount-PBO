import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> daftarCustomer;

    public Bank() {
        daftarCustomer = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        daftarCustomer.add(customer);
    }

    public Customer getCustomer(int index) {
        return daftarCustomer.get(index);
    }

    public int getJumlahCustomer() {
        return daftarCustomer.size();
    }
}
