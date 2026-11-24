# 7-3: Modifier static dan Nested Class - Jawaban Praktik

## Kosakata
1. **Class method (`static` method)** — Sebuah method yang tersedia untuk digunakan tanpa terlebih dahulu membuat sebuah instance dari class dan dideklarasikan dengan modifier `static`.
2. **Inner class** — Sebuah class apa pun yang diimplementasikan sebagai nested class di dalam class lain dan menjadi anggota container class melalui komposisi.
3. **Class variable (`static` variable)** — Sebuah variable tingkat class Java yang dideklarasikan dengan modifier `static`, sehingga hanya ada satu instance di JVM terlepas dari jumlah instance class.
4. **`static`** — Sebuah kata kunci yang membuat variable, method, atau inner class tersedia tanpa terlebih dahulu membuat instance dari class/variable.
5. **Inner class (Komposisi)** — Didefinisikan di dalam parent atau container class dan merupakan anggota container class melalui komposisi.
6. **Static nested class** — Sebuah inner class yang tersedia untuk digunakan tanpa terlebih dahulu membuat instance dari container class dan dideklarasikan dengan modifier `static`.
7. **Method (`static` method)** — Method Java dengan modifier `static` yang dapat diakses sesuai access modifier-nya (`public`, `protected`, default, atau `private`) tanpa membuat instance class.
8. **Variable (`static` variable)** — Variable yang dideklarasikan dengan modifier `static` dan dapat diakses tanpa membuat instance dari class tersebut.

---

## Latihan Praktik

### 1–4. Implementasi `Vehicle`, `TestVehicle`, dan `Engine`
Dikerjakan pada package `vehicles` melalui file **`Vehicle.java`** dan **`TestVehicle.java`**.

### Catatan Pengujian Penting (Soal 1e & 4f)
- **Soal 1e:** Mengakses instance variable `chassisNo` secara langsung dari `static main` sebelum membuat object `Vehicle` akan menyebabkan error kompilasi karena instance variable terikat pada object/instance, bukan pada class.
- **Soal 4f:** Object `vehicle1` dan `vehicle2` bertipe `Vehicle` biasa, sehingga tidak memiliki method/atribut khusus milik `Vehicle.Engine` (`getEngineMake()` dan `getCapacity()`) tanpa casting atau menggunakan instance `Vehicle.Engine`.