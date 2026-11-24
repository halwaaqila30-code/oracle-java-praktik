# 4-4: String - Jawaban Praktik

## Kosakata
1. **String concatenation** — Menggabungkan beberapa object `String` bersama-sama.
2. **Escape sequence** — Karakter khusus yang diawali `\` dan diperlakukan sebagai fungsi tertentu seperti tab (`\t`) atau baris baru (`\n`).
3. **String assignment** — Menetapkan sebuah nilai ke referensi object `String`.
4. **Reference type** — Tipe data yang mereferensikan lokasi di memori tempat sebuah object disimpan, bukan nilai tunggal langsung
5. **Method** — Kode yang tersedia di Java API untuk memanipulasi atau mengembalikan nilai string
6. **`String`** — Tipe object yang menyimpan kalimat, kata-kata, atau beberapa karakter

## Latihan Praktik
### 1. Tiga Cara Mendeklarasikan dan Menginstansiasi `myString` (`"abc"`)
1. `String myString = "abc";` (string literal / *string pool*).
2. `String myString = new String("abc");` (membuat object baru dengan kata kunci `new`)
3. `String myString = new String(new char[]{'a', 'b', 'c'});` (membuat `String` dari array `char`)

### 2. Hasil Pernyataan pada `s1`, `s2`, dan `s3`
Diketahui `s1 = "ABC"`, `s2 = new String("DEF")`, dan `s3 = "AB" + "C"` (yang dievaluasi menjadi `"ABC"` pada *compile-time* di *string pool*)
- **a. `s1.compareTo(s2)`** -> **`-3`** (karakter `'A'` memiliki kode ASCII 65 dan `'D'` 68; $65 - 68 = -3$)
- **b. `s2.equals(s3)`** -> **`false`** (`"DEF"` tidak sama dengan `"ABC"`)
- **c. `s3 == s1`** -> **`true`** (keduanya merujuk ke literal `"ABC"` yang sama di *string pool*; catatan: jika salah satu dibuat dengan `new String("ABC")`, `==` akan mengembalikan `false` karena beda referensi object)
- **d. `s2.compareTo(s3)`** -> **`3`** (karakter `'D'` dikurangi `'A'`; $68 - 65 = 3$)
- **e. `s3.equals(s1)`** -> **`true`** (isi karakter keduanya sama-sama `"ABC"`)

### 3. Menggabungkan Dua Object `String` ke Object Ketiga
Dikerjakan pada file `LatihanString.java` menggunakan operator `+` (atau `concat()`)