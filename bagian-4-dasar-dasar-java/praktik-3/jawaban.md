# 4-3: Tipe Data dan Operator - Jawaban Praktik

## Kosakata
1. **Variable** — Mekanisme penyimpanan primitif atau object bernama yang didefinisikan dalam sebuah program (nilainya bisa berubah atau tetap/konstanta).
2. **Arithmetic operators** — Simbol untuk penjumlahan, pengurangan, perkalian, pembagian, dan aritmatika modular dalam expression dan rumus matematika.
3. **Primitive data types** — Kelompok tipe data Java yang tidak memakai `new` saat dideklarasikan/diinisialisasi dan menyimpan nilai langsung di lokasi memori variabel.
4. **`byte`** — Tipe primitif Java terkecil (1 byte) untuk menyimpan nilai integer.
5. **`long`** — Tipe data integer terbesar (8 byte).
6. **Coding convention** — Standar pemformatan dan penamaan yang diikuti oleh sebagian besar programmer.
7. **`int`** — Tipe data primitif Java (4 byte) untuk menyimpan nilai integer.
8. **`double`** — Tipe data primitif Java (8 byte), primitif terbesar untuk nilai desimal.
9. **Initialization** — Saat sebuah variabel diberi nilai untuk pertama kalinya.
10. **`float`** — Tipe data primitif Java (4 byte) yang diinisialisasi dengan angka desimal berakhiran `f` (contoh: `float x = 3.5f;`).
11. **Literal** — Angka, teks, atau informasi lain yang mewakili nilai untuk menginisialisasi tipe primitif.
12. **Declaration** — Pernyataan Java saat variabel didefinisikan (belum tentu langsung diberi nilai), contoh `int x;`.
13. **Precedence** — Urutan/presedensi matematis operasi atau variabel dalam program Java.
14. **`char`** — Tipe data primitif Java (2 byte) untuk menyimpan karakter tunggal.
15. **Scope** — Blok kode `{}` tempat sebuah variabel berada dan dapat diakses dalam program.
16. **Explicit casting** — Modifikasi eksplisit satu tipe data menjadi tipe data berbeda.
17. **Floor** — Pembulatan ke bawah ke integer terdekat.
18. **Assignment operator (`=`)** — Tanda `=` untuk menetapkan nilai ke variabel.
19. **Type conversion** — Modifikasi satu tipe data ke tipe data lain (bisa implisit maupun eksplisit).
20. **`short`** — Tipe data primitif Java (2 byte) untuk integer dengan rentang lebih pendek daripada `int`.
21. **`boolean`** — Tipe primitif satu bit yang menyimpan nilai `true` atau `false`.

## Latihan Praktik
### 1. Luas Segitiga
Dikerjakan pada file `LuasSegitiga.java`.

### 2. Rumus Matematika dengan `Math`
- **a:** `Math.sqrt(Math.pow(x, 5) - 6) / 4`
- **b:** `Math.pow(x, y) - Math.pow(6, x)`
- **c:** `4 * Math.cos(z / 5) - Math.sin(Math.pow(x, 2))`
- **d:** `Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3))`
- **e:** `1 / (y - 1 / (x - Math.pow(2, y)))`
- **f:** `7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4))))`

*(Catatan: jika `x`, `y`, `z` bertipe `int`, gunakan `5.0`, `4.0`, `2.0`, dsb. agar pembagian tidak terpotong menjadi pembagian bilangan bulat).*

### 3. Perhitungan Bus dan Van
Dikerjakan pada file `BusDanVan.java`.

### 4. Nilai `true_false` (`i = 5`, `j = 6`)
1. `j < 5` -> `false`
2. `j > 3` -> `true`
3. `j < i` -> `false`
4. `i < 5` -> `false`
5. `j <= 5` -> `false`
6. `6 < 6` -> `false`
7. `i != j` -> `true`
8. `i == j || i < 50` -> `true`
9. `i == j && i < 50` -> `false`
10. `i > j || true_false && j >= 4` -> `false` (karena `true_false` sebelumnya `false`, `false && true` = `false`, `false || false` = `false`)
11. `!(i < 2 && j == 5)` -> `true` (`false && false` = `false`, dinegasi jadi `true`)
12. `!true_false` -> `false` (menegasikan nilai `true` dari langkah sebelumnya)

### 5 & 6. Daftar Kedua (Deklarasi & Konvensi Penamaan)
Pada file soal halaman 3 tercantum rujukan ke "daftar kedua", namun daftar deklarasinya tidak terlampir pada halaman tersebut. Jika ada lampiran daftar deklarasi dari guru, kirimkan agar bisa dilengkapi analisis kesalahan sintaks/tipe dan konvensi camelCase-nya.