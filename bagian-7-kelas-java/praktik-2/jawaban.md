# 7-2: Parameter dan Overloading Method - Jawaban Praktik

## Kosakata
1. **`public`** — Sebuah jenis access modifier yang mengizinkan akses dari mana saja.
2. **Constructor** — Digunakan untuk menetapkan nilai awal pada instance variable dari sebuah class.
3. **Variable argument (varargs) method** — Sebuah cara untuk memanggil method dengan jumlah argument yang bervariasi.
4. **Overloading** — Memiliki lebih dari satu constructor atau method dengan nama yang sama tetapi argument yang berbeda.
5. **`private`** — Sebuah jenis access modifier yang mengizinkan akses hanya dari dalam class yang sama.
6. **Default / No-arg constructor** — Sebuah constructor yang tidak memiliki parameter apa pun.
7. **Access modifier** — Digunakan untuk menentukan aksesibilitas untuk variable, method, dan class.

---

## Latihan Praktik

### 1–3 & 5–8. Class `Fish` dan Method `nicestFish`
Dikerjakan pada file **`MainFish.java`**.

### 4. Mengapa Dimungkinkan Memiliki Lebih dari Satu Constructor dengan Nama Sama dan Argumen Berbeda?
Karena Java mendukung **constructor overloading**, di mana compiler membedakan setiap constructor berdasarkan jumlah, tipe data, atau urutan parameternya (*method/constructor signature*). Dengan begitu, object dapat dibuat dengan cara inisialisasi yang fleksibel sesuai kebutuhan.

### 9. Ikan Mana yang Dikembalikan Saat Menguji `nicestFish()` dengan Ikan pada Nomor 6?
Ikan yang dikembalikan adalah **Amber** (`AngelFish`), karena tingkat keramahannya bernilai **5** (sangat ramah), lebih tinggi dibandingkan **James** (`Guppy`) yang bernilai **3** (netral).

### 10. Access Modifier Terbaik
- **a. Class `Employee` (nama, alamat, gaji, nomor telepon):** Gunakan **`private`** untuk instance variable (`nama`, `alamat`, `gaji`, `nomorTelepon`) agar data sensitif seperti gaji dan kontak terlindungi (*encapsulation*), lalu sediakan method `public` (getter/setter) seperlunya.
- **b. Method penjumlahan di `BasicMath` yang juga dipakai di `Algebra`:** Gunakan **`public`** agar method tersebut dapat diakses oleh class lain di luar class `BasicMath` (termasuk `Algebra` meskipun berada di package berbeda).