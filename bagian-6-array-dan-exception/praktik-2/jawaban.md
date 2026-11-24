# 6-2: Penanganan Error - Jawaban Praktik

## Kosakata
1. **`catch`** — Sebuah kata kunci dalam Java yang menandakan bahwa blok kode berikutnya menangani sebuah exception tertentu.
2. **Unchecked exception** — Sebuah exception yang penanganannya bersifat opsional.
3. **Checked exception** — Sebuah exception yang HARUS ditangani.
4. **Compile-time error / Syntax error** — Menunjukkan bahwa terdapat masalah dalam menginterpretasikan program Anda.
5. **`throw`** — Ini menghentikan interpreter dari menjalankan sisa kode hingga menemukan sebuah `catch`.
6. **Syntax error** — Sebuah error yang menunjukkan masalah pada format penulisan kode.
7. **Runtime error / Exception** — Sebuah error yang terjadi saat program sedang berjalan, juga dikenal sebagai exception.
8. **Logic error** — Sebuah error yang terjadi akibat logika pemrograman yang salah.
9. **Exception handler (`catch` block)** — Sebuah blok kode yang menangani exception dengan menyelesaikan exception tersebut ketika ia di-throw.
10. **Exception** — Error-error yang terjadi selama runtime dan dapat dikoreksi atau ditangani oleh kode Anda.

---

## Latihan Praktik

### 1. Perbedaan Syntax Error, Logic Error, dan Exception
- **Syntax error:** Kesalahan aturan tata bahasa/format penulisan kode Java (seperti lupa tanda `;` atau kurung `{}`), sehingga program gagal dikompilasi.
- **Logic error:** Program berhasil dikompilasi dan dijalankan, tetapi hasil atau perilakunya keliru karena kesalahan logika algoritma/rumus.
- **Exception:** Kejadian tidak normal saat program sedang berjalan (*runtime*) yang dapat mengganggu alur eksekusi, namun bisa ditangkap dan ditangani menggunakan mekanisme `try-catch`.

---

### 2. Analisis Kesalahan pada Kode Soal Nomor 2
Kode pada soal memiliki beberapa kesalahan:
1. Deklarasi `String str "Hello World";` kurang operator `=`.
2. Pada header `for(int i=0 i<4; i++);`, kurang titik koma (`;`) setelah `int i=0` dan terdapat titik koma (`;`) di akhir `for(...)` yang membuat perulangan berhenti kosong.
3. `System.out.println(str);` berada di luar blok `{ ... }` dan dieksekusi sebelum `str += "!";`, serta tanda kurung kurawal `{ ... }` berdiri sendiri tanpa pasangan blok kondisional/perulangan.

---

### 3. Pengalaman Exception dan Penanganannya dengan `try/catch`
Contoh umum saat menjalankan program adalah pembagian dengan nol (`ArithmeticException`) atau salah memasukkan tipe data saat membaca input (`InputMismatchException` pada `Scanner`). Dengan membungkus kode berisiko di dalam blok `try` dan menangkap jenis exception-nya di blok `catch`, program tidak langsung berhenti mendadak dan dapat menampilkan pesan error yang informatif kepada pengguna

---

### 4. Segmen Kode Syntax Error, Logic Error, dan Exception
Disediakan contohnya pada komentar di **`ContohPenangananError.java`**

---

### 5. Perbedaan Checked Exception dan Unchecked Exception
- **Checked exception:** Exception yang diperiksa oleh compiler saat kompilasi dan **wajib** ditangani (dengan `try-catch` atau dideklarasikan dengan `throws`), misalnya `IOException`
- **Unchecked exception:** Exception yang **tidak wajib** ditangani secara eksplisit saat kompilasi (turunan `RuntimeException`), biasanya muncul akibat kesalahan logika/penggunaan saat runtime, seperti `ArithmeticException` atau `NullPointerException`