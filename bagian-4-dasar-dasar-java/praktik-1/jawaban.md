# 4-1: Memulai dengan Java - Jawaban Praktik

## Kosakata (Coba dan Selesaikan)
1. **Camel Case** — Konvensi penamaan untuk menghilangkan spasi dalam sebuah nama dengan tetap memudahkan keterbacaan menggunakan huruf kapital.
2. **Workspace** — Lokasi fisik tempat menyimpan dan mengelola file/project.
3. **Package** — Mekanisme di dalam project untuk mengorganisasi class Java ke dalam namespace atau container.
4. **Main method (`main`)** — Method di dalam class yang dijalankan ketika program Java dieksekusi.
5. **Class** — Konstruksi yang digunakan sebagai cetak biru (blueprint) untuk membuat object.
6. **Perspective** — Pilihan kombinasi tampilan (view) dan editor pada IDE.
7. **View** — Area di dalam Java IDE untuk menavigasi hierarki informasi dan memodifikasi elemen.

## Latihan Praktik
### 1. Presentasi View di Java IDE
- **a. Pengantar:** Menjelaskan tujuan mengenal fitur tampilan/navigasi pada Java IDE serta anggota tim yang mengerjakan.
- **b. Daftar View:** Package Explorer / Project Explorer, Editor, Console, Problems / Markers, dan Outline.
- **c. Alasan pemilihan:** Membantu navigasi file dan package, menulis kode, melihat output/error, serta membaca struktur class lebih cepat.
- **d. Proses pemilihan:** Membuka menu bantuan/tampilan IDE, mencoba fungsi tiap panel saat membuat project, lalu memilih lima panel yang paling sering dipakai.
- **e. Demonstrasi & deskripsi:** Menunjukkan letak tiap panel di layar IDE dan fungsinya (misalnya Console menampilkan output/input `Scanner`, Problems menampilkan error kompilasi).
- **f. Ringkasan:** Memahami panel utama di IDE membantu proses menulis, menguji, dan memperbaiki kode Java lebih efisien.

### 2 & 3. Program `GalToLit.java` (Konversi Galon ke Liter dengan `Scanner`)
- Menggunakan rumus `liters = gallons * 3.785` (1 galon AS = 3,785 liter).
- Menggunakan `Scanner` (`java.util.Scanner`) dan `in.nextDouble()` untuk menerima input angka desimal dari pengguna.

### 4. Tiga Cara Menguji Program `GalToLit`
1. **Menguji dengan nilai bilangan bulat (integer):** Misalnya memasukkan `10`, lalu memastikan hasil output sesuai perhitungan (`37.85`).
2. **Menguji dengan nilai desimal:** Misalnya memasukkan `2.5` atau `0.5`, untuk memastikan tipe data `double` dan `in.nextDouble()` bekerja dengan benar.
3. **Menguji batas / nilai khusus (seperti `0` atau input tidak valid):** Menguji input `0` (hasilnya `0.0`), serta mengecek perilaku program jika diberi input bukan angka (seperti huruf) agar tahu bagaimana program merespons.