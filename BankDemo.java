import java.util.Scanner;

public class Bankdemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        int opsi;

        do{
            System.out.println(" =======================\n   WELCOME TO BANK ABC \n =======================");
            System.out.println("1. Tambah Customer");
            System.out.println("2. Lihat Customer");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Cek Saldo");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            opsi = input.nextInt();
            input.nextLine();

            switch (opsi){
                case 1: {
                    System.out.print("First Name: ");
                    String firstName = input.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = input.nextLine();

                    System.out.print("Saldo Awal: Rp ");
                    double saldoAwal = input.nextDouble();
                    input.nextLine();

                    Customer customer = new Customer(firstName, lastName);
                    Account rekening = new Account(saldoAwal);

                    customer.setAccount(rekening);
                    bank.addCustomer(customer);

                    System.out.println("Customer berhasil ditambahkan!");
                    break;
                }

                case 2: {
                    if(bank.getJumlahCustomer() == 0){
                        System.out.println("Belum ada customer.");
                    } else {
                        for(int i = 0; i < bank.getJumlahCustomer(); i++){
                            Customer test = bank.getCustomer(i);
                            System.out.println((i+1) + ". " + test.getFirstName() + " " + test.getLastName());
                        }
                    }
                    break;
                }

                
                case 3: {
                    if(bank.getJumlahCustomer() == 0){
                        System.out.println("Belum ada customer.");
                        break;
                    }

                    System.out.println("Daftar Customer:");
                    for (int i = 0; i < bank.getJumlahCustomer(); i++) {
                        Customer tes = bank.getCustomer(i);
                        System.out.println((i + 1) + ". " + tes.getFirstName() + " " + tes.getLastName());
                    }

                    System.out.print("Pilih customer: ");
                    int index = input.nextInt();
                    input.nextLine();

                    if(index < 1 || index > bank.getJumlahCustomer()){
                        System.out.println("Customer tidak ditemukan.");
                        break;
                    }

                    Customer customer = bank.getCustomer(index - 1);

                    if(customer.getAccounts().isEmpty()){
                        System.out.println("Belum ada rekening.");
                        break;
                    }

                    System.out.println("Daftar Rekening:");
                    for (int i = 0; i < customer.getAccounts().size(); i++){
                        System.out.println((i + 1) + ". Saldo Rp " + customer.getAccount(i).getBalance());
                    }

                    System.out.print("Pilih rekening: ");
                    int indexRekening = input.nextInt();
                    input.nextLine();

                    if(indexRekening < 1 || indexRekening > customer.getAccounts().size()){
                        System.out.println("Rekening tidak ditemukan.");
                        break;
                    }

                    Account rekening = customer.getAccount(indexRekening - 1);

                    System.out.print("Nominal deposit: Rp ");
                    double nominal = input.nextDouble();
                    input.nextLine();

                    if(rekening.deposit(nominal)){
                        System.out.println("Deposit berhasil!");
                    }else{
                        System.out.println("Deposit gagal! Nominal harus lebih dari 0.");
                    }

                    System.out.println("Saldo sekarang: Rp " + rekening.getBalance());
                    break;
                }

                case 4: {
                    if(bank.getJumlahCustomer() == 0){
                        System.out.println("Belum ada customer.");
                        break;
                    }

                    for(int i = 0; i < bank.getJumlahCustomer(); i++){
                        Customer test = bank.getCustomer(i);
                        System.out.println((i + 1) + ". " + test.getFirstName() + " " + test.getLastName());
                    }

                    System.out.print("Pilih customer: ");
                    int index = input.nextInt();
                    input.nextLine();

                    if (index < 1 || index > bank.getJumlahCustomer()) {
                        System.out.println("Customer tidak ditemukan.");
                        break;
                    }

                    Customer customer = bank.getCustomer(index - 1);

                    if(customer.getAccounts().isEmpty()){
                        System.out.println("Belum ada rekening.");
                        break;
                    }

                    System.out.println("Daftar Rekening:");

                    for(int i = 0; i < customer.getAccounts().size(); i++){
                        System.out.println((i + 1) + ". Saldo Rp " + customer.getAccount(i).getBalance());
                    }

                    System.out.print("Pilih rekening: ");
                    int indexRekening = input.nextInt();
                    input.nextLine();

                    if (indexRekening < 1 || indexRekening > customer.getAccounts().size()) {
                        System.out.println("Rekening tidak ditemukan.");
                        break;
                    }

                    Account rekening = customer.getAccount(indexRekening - 1);

                    System.out.print("Nominal withdraw: Rp ");
                    double nominal = input.nextDouble();
                    input.nextLine();

                    if(rekening.withdraw(nominal)){
                        System.out.println("Withdraw berhasil!");
                    } else {
                        System.out.println("Withdraw gagal! Saldo tidak cukup atau nominal tidak valid.");
                    }

                    System.out.println("Saldo sekarang: Rp "+ rekening.getBalance());
                    break;
                }

                case 5:{
                    if(bank.getJumlahCustomer() == 0){
                        System.out.println("Belum ada customer.");
                        break;
                    }

                    for(int i = 0; i < bank.getJumlahCustomer(); i++){
                        Customer tes2 = bank.getCustomer(i);
                        System.out.println((i + 1) + ". " + tes2.getFirstName() + " " + tes2.getLastName());
                    }

                    System.out.print("Pilih customer: ");
                    int index = input.nextInt();
                    input.nextLine();

                    if (index < 1 || index > bank.getJumlahCustomer()) {
                        System.out.println("Customer tidak ditemukan.");
                        break;
                    }

                    Customer customer = bank.getCustomer(index - 1);

                    if(customer.getAccounts().isEmpty()){
                        System.out.println("Belum ada rekening.");
                        break;
                    }

                    for(int i = 0; i < customer.getAccounts().size(); i++){
                        System.out.println((i + 1) + ". Saldo Rp " + customer.getAccount(i).getBalance());
                    }

                    System.out.print("Pilih rekening: ");
                    int indexRekening = input.nextInt();
                    input.nextLine();

                    if (indexRekening < 1 || indexRekening > customer.getAccounts().size()) {
                        System.out.println("Rekening tidak ditemukan.");
                        break;
                    }

                    Account rekening = customer.getAccount(indexRekening - 1);
                    System.out.println("Current Balance: Rp " + rekening.getBalance());
                    break;
                }

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (opsi != 0);

        input.close();
    }
}
