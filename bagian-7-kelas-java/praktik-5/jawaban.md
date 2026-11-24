# 7-5: Polymorphism - Jawaban Praktik

## Kosakata
1. **Polymorphism** — Sebuah konsep dalam OOP yang memungkinkan class-class memiliki banyak bentuk dan berperilaku seperti superclass mereka.
2. **Overriding** — Mengimplementasikan method dalam sebuah subclass yang memiliki prototype yang sama (parameter, nama method, dan tipe kembalian yang sama) dengan method lain dalam superclass.
3. **`final`** — Sebuah kata kunci dalam Java yang digunakan untuk membatasi subclass agar tidak dapat memperluas sebuah class, melakukan override pada method, atau mengubah data.
4. **Immutable / Final state (pada static class)** — Properti/pembatasan agar class tidak dapat diperluas atau datanya tidak dapat diubah.
5. **Overloading** — Mengimplementasikan sebuah method dengan nama yang sama dengan method lain dalam class yang sama tetapi memiliki parameter atau tipe kembalian yang berbeda.
6. **Dynamic method dispatch** — Proses di mana Java dapat menentukan method mana yang harus dipanggil ketika method-method telah di-override.
7. **`abstract`** — Sebuah kata kunci dalam Java yang memungkinkan class-class diperluas (`extends`), tetapi tidak dapat diinstansiasi secara langsung, dan ketika diterapkan pada method mengharuskan method tersebut diimplementasikan di semua subclass-nya.

---

## Latihan Praktik

### Output `DynamicDispatch`
```text
Inside Class B's Method!
Inside Class C's Method!
Inside Class A's Method!