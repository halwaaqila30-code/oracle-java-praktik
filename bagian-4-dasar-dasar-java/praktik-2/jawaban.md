# 4-2: Object Class dan Driver Class - Jawaban Praktik

## Kosakata
1. **Package** — Sekelompok class-class Java yang saling berkaitan.
2. **Code block / Block** — Bagian-bagian kode yang diapit oleh sepasang kurung kurawal `{}`.
3. **Upper camel case** — Huruf pertama kapital dan huruf pertama dari setiap kata internal juga kapital (contoh: `SavingsAccount`).
4. **Constant** — Sebuah nilai bernama yang tidak berubah.
5. **Lower camel case** — Huruf pertama huruf kecil dan huruf pertama dari setiap kata internal kapital (contoh: `studentFirstName`).
6. **Driver class** — Sebuah class yang berisi sebuah `main` method.
7. **Import statement** — Sebuah pernyataan kode dalam sebuah file class Java yang menyertakan kode Java dari package atau class lain.
8. **Object class** — Sebuah class yang mendefinisikan instance-instance object untuk digunakan di class lain.
9. **Comment (Komentar)** — Kode yang diawali dengan `//`, dipakai untuk memperjelas logika pemrograman dan diabaikan oleh compiler.
10. **Keyword** — Sebuah kata yang memiliki fungsi khusus dalam bahasa Java, dan tidak dapat digunakan sebagai nama untuk class, method, atau variable.
11. **Java API** — Library class-class Java yang tersedia untuk diimpor ke dalam class yang dibuat programmer.

## Coba dan Selesaikan (Definisi)
- **Class** — Kerangka dari sebuah object, termasuk class variable, constructor, dan method.
- **Constructor** — Sebuah jenis method khusus yang merupakan template untuk sebuah object.
- **Arguments** — Nilai-nilai yang dikirimkan ke sebuah method atau constructor untuk digunakan dalam kalkulasi atau digantikan dengan nilai-nilai dari class.
- **Data / Value & Object reference** — Nilai-nilai seperti angka, karakter, atau boolean, serta referensi ke object seperti object `BankAccount`.
- **Access modifier** — Kata kunci yang digunakan untuk menentukan aksesibilitas sebuah class (atau tipe) beserta anggota-anggotanya (contoh: `public`, `private`, `protected`, `default`).
- **Method** — Sebuah blok kode di dalam sebuah class yang digunakan untuk mengubah atau mengakses informasi tentang class tersebut.

## Latihan Praktik
### 1. Komponen File `.java` dan Urutannya
Urutan umum komponen dalam sebuah file `.java`:
1. Pernyataan `package` (opsional)
2. Pernyataan `import` (opsional)
3. Deklarasi `class` (dan di dalamnya terdapat variabel/atribut, constructor, serta method termasuk `main` method jika merupakan driver class)

### 2. Perbedaan Upper Camel Case dan Lower Camel Case
- **Upper camel case:** Awal kata pertama kapital dan awal kata berikutnya juga kapital (contoh: nama class seperti `Student`, `SavingsAccount`).
- **Lower camel case:** Awal kata pertama huruf kecil dan awal kata berikutnya kapital (contoh: nama variable atau method seperti `studentFirstName`, `stuId`).

### 3. Mengimpor Seluruh Package Utilitas Java
- Sintaks: `import java.util.*;`
- Jika sudah mengimpor seluruh package menggunakan tanda bintang (`*`), kita **tidak perlu** mengimpor class-class lain yang berada di dalam package yang sama secara terpisah.

### 4 & 5. Object Class `Student` dan Driver Class
Dikerjakan pada file `Student.java` dan `StudentDriver.java` di folder `praktik-2/`.

### 6. 10 Keyword Java
1. `package`
2. `import`
3. `class`
4. `public`
5. `private`
6. `void`
7. `static`
8. `new`
9. `int`
10. `double`

### 7 & 8. Lembar Kerja Tambahan
Menunggu lampiran lembar kerja dari soal nomor 7 dan 8 jika diwajibkan oleh guru.