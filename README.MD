## 👨‍💻 Author

NAMA: RIZKA DZULIYATUN N

NIM : F1D02510025

---

# Bank ABC - Java Banking System

## 📌 Deskripsi Project

**Bank ABC** adalah program simulasi sistem perbankan sederhana berbasis console yang dibuat menggunakan bahasa pemrograman Java. Program ini menerapkan konsep Object-Oriented Programming (OOP) dengan memisahkan pengelolaan bank, customer, dan rekening ke dalam beberapa class.

## ✨ Fitur

- **Tambah Customer** — Menambahkan customer baru beserta nama depan, nama belakang, dan saldo awal rekening.
- **Lihat Customer** — Menampilkan daftar customer yang terdaftar.
- **Deposit** — Menambahkan saldo ke rekening customer.
- **Withdraw** — Melakukan penarikan saldo dengan validasi nominal dan saldo yang tersedia.
- **Cek Saldo** — Menampilkan saldo rekening customer.
- **Validasi Input** — Memeriksa pilihan customer, rekening, dan nominal transaksi.


## 📂 Struktur Project

```text
Bank-ABC/
├── Account.java
├── Customer.java
├── Bank.java
├── Bankdemo.java
└── README.md
```

## 🧩 Penjelasan Class

| Class | Deskripsi |
|---|---|
| `Bank` | Mengelola daftar customer dan menyediakan akses ke data customer. |
| `Customer` | Menyimpan informasi nama customer dan daftar rekening yang dimiliki. |
| `Account` | Mengelola saldo serta proses deposit dan withdraw. |
| `Bankdemo` | Menjalankan program utama dan menangani interaksi dengan pengguna melalui terminal. |


## 🖥️ Menu Program

```text
=======================
   WELCOME TO BANK ABC
=======================
1. Tambah Customer
2. Lihat Customer
3. Deposit
4. Withdraw
5. Cek Saldo
0. Keluar
Pilih menu:
```


