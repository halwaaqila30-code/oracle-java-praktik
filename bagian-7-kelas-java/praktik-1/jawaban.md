# 7-1: Class, Object, dan Method - Jawaban Praktik

## Kosakata
1. **Class** — Sebuah template yang digunakan untuk membuat object-object Java.
2. **this** — Kata kunci opsional yang digunakan untuk mengakses anggota dan method dari sebuah class.
3. **Object** — Sebuah instance dari sebuah class.
4. **new** — Operator yang digunakan untuk membuat sebuah instance dari sebuah class.
5. **Garbage collection** — Fungsi bawaan dari Java VM yang membebaskan memori saat object-object tidak lagi dibutuhkan atau direferensikan.
6. **Mutator method (setter)** — Sebuah method yang mengubah state dari sebuah object.
7. **Accessor method (getter)** — Sebuah method yang mengembalikan informasi tentang sebuah object ke program yang memanggilnya.
8. **Method** — Sebuah procedure (yang mengubah state sebuah object) atau function (yang mengembalikan informasi tentang sebuah object) yang dienkapsulasi sebagai bagian dari sebuah class.
9. **Instantiate / Instantiation** — Sebuah kata kerja yang digunakan untuk mendeskripsikan tindakan membuat sebuah object class menggunakan kata kunci `new`.
10. **Initialization** — Proses menetapkan nilai default ke sebuah variable.
11. **Null reference** — Sebuah referensi object yang belum diinstansiasi.
12. **Finalize method (`finalize()`)** — Sebuah method opsional yang dipanggil sesaat sebelum sebuah object dihapus oleh garbage collector.
13. **Reference** — Nama dari sebuah variable yang dikaitkan dengan sebuah object.
14. **Constructor** — Sebuah method khusus yang digunakan untuk membuat sebuah instance dari sebuah class.

---

## Latihan Praktik

### 1. Class `Shape`
Dikerjakan pada file **`Shape.java`** dengan instance variable `numSides` dan `regular`, dua constructor, serta getter dan setter.

### 2. Identifikasi Bagian Kunci Class `Animal`
- **Instance variable (`*`):** `weight`, `height`, `speed`.
- **Constructor (`[kotak]`):** `Animal()` dan `Animal(int w, int h, int s)`.
- **Method selain constructor (`(signature)`):**
  - `public double getTime(double miles)` -> return type: `double`, parameter: `double miles`
  - `public int getWeight()` -> return type: `int`, parameter: tidak ada
  - `public int getHeight()` -> return type: `int`, parameter: tidak ada
  - `public double getSpeed()` -> return type: `double`, parameter: tidak ada

### 3. Dua Instance `Animal` dan Pencetakan Kecepatan
Dikerjakan pada file **`MainAnimal.java`**.

### 4–6. Class `Student`, Tiga Mahasiswa, dan Update `Ari Samala`
Dikerjakan pada file **`MainStudent.java`**.

### 7–8. Class `Card`, Kartu Acak, dan Loop Tambah Kartu
Dikerjakan pada file **`MainCard.java`**.