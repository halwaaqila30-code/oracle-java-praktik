# 5-2: Control Statement - Jawaban Praktik

## Kosakata
1. **`do-while` loop** — Post-test loop yang dieksekusi sebanyak jumlah yang tidak diketahui hingga suatu kondisi terpenuhi, tetapi selalu dieksekusi untuk pertama kalinya.
2. **`for` loop** — Pre-test loop yang menggunakan iterator untuk melacak berapa kali sebuah loop akan dieksekusi.
3. **`continue`** — Kata kunci yang digunakan untuk melewatkan kode yang tersisa dalam sebuah loop dan mengembalikan kontrol program ke awal loop untuk dieksekusi kembali.
4. **`while` loop** — Pre-test loop yang dieksekusi sebanyak jumlah yang tidak diketahui hingga suatu kondisi terpenuhi.
5. **`break`** — Kata kunci yang digunakan untuk menghentikan eksekusi loop sebelum kondisi loop terpenuhi.

---

## Latihan Praktik

### 1. Menguraikan Pesan Rahasia
Dikerjakan pada file **`PesanRahasia.java`** menggunakan loop dan `switch` untuk memetakan angka `1–7` menjadi huruf (`1=D, 2=W, 3=E, 4=L, 5=H, 6=O, 7=R`) serta meminta input ulang jika angka belum terpecahkan.

---

### 2. Penggunaan `break` vs `continue` Saat Mencari Spasi Pertama
- **Gunakan `break`.** Karena begitu karakter spasi pertama ditemukan, pencarian harus langsung dihentikan dan keluar dari loop tanpa memeriksa karakter berikutnya.
- **Mengapa tidak menggunakan `continue`?** Kata kunci `continue` hanya melewati sisa iterasi saat ini dan tetap melanjutkan loop ke karakter berikutnya, sehingga pencarian tidak akan berhenti saat spasi pertama ditemukan.

---

### 3. Mencetak Hari untuk Setiap Hari dalam Setahun (Bukan Tahun Kabisat)
- **Dapatkah diketahui sebelum dieksekusi?** **Ya**, jumlah harinya sudah pasti diketahui yaitu **365 kali** (karena diasumsikan bukan tahun kabisat).
- **Jenis loop yang sebaiknya digunakan:** **`for` loop**, karena jumlah iterasinya sudah diketahui secara pasti (`1` sampai `365`) sehingga iterator dapat digunakan secara terstruktur untuk menghitung hari.

---

### 4. Pengecekan Anagram
Dikerjakan pada file **`CekAnagram.java`** dengan mengabaikan spasi dan tanda baca sebelum membandingkan susunan karakter kedua string.