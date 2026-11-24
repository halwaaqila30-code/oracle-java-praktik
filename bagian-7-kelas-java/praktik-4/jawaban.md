# 7-4: Inheritance - Jawaban Praktik

## Kosakata
1. **Default / Package-private access** — Ketika tidak ada access modifier; akses sama seperti `public`, kecuali tidak terlihat oleh package lain.
2. **Access modifier** — Kata kunci yang digunakan untuk mendeklarasikan sebuah class, method, atau variable sebagai `public`, `private`, atau `protected` (default jika tidak ada modifier).
3. **Subclass** — Class-class yang merupakan subset lebih spesifik dari class lain dan mewarisi method serta field dari class yang lebih umum.
4. **`extends`** — Kata kunci dalam Java yang memungkinkan Anda secara eksplisit mendeklarasikan superclass dari class saat ini.
5. **Encapsulation** — Filosofi pemrograman yang mendorong perlindungan data dan penyembunyian implementasi untuk menjaga integritas data dan method.
6. **`private`** — Hanya terlihat oleh class tempat ia dideklarasikan.
7. **Hierarchy** — Struktur yang mengkategorikan dan mengorganisasi hubungan antara ide, konsep, atau hal-hal dengan komponen paling umum di atas dan yang lebih spesifik di bawah.
8. **`public`** — Terlihat oleh semua class.
9. **Superclass** — Class-class yang meneruskan method mereka ke class-class yang lebih spesifik.
10. **Inheritance** — Konsep OOP yang memungkinkan class mendapatkan method dan data dengan memperluas field dan method dari class lain.
11. **`protected`** — Terlihat oleh package tempat ia dideklarasikan dan oleh subclass di package lain.
12. **UML (Unified Modeling Language)** — Bahasa standar untuk memodelkan sistem dan struktur dalam pemrograman.
13. **`super`** — Kata kunci yang memungkinkan subclass mengakses method, data, dan constructor dari parent class mereka.
14. **Node / Leaf** — Istilah yang berguna untuk mengonseptualisasikan hubungan antara node atau daun dalam hierarki inheritance.

---

## Latihan Praktik

### 1. Applet Hitam, Putih, dan Abu-abu
Dikerjakan pada file **`DrawShapes.java`**.

### 2. Diagram UML Sederhana
- **Pohon:**
  ```text
          Tree
         /    \
  Hardwood    Softwood
   /    \      /     \
Birch  Ash  Cedar   Pine
                      |
                   Red Pine