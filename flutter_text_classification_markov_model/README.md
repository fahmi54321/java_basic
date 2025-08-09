# Poetry Text Classifier App

Aplikasi Flutter sederhana untuk menganalisis sebuah baris puisi dan memprediksi apakah puisi tersebut ditulis oleh **Edgar Allan Poe** atau **Robert Frost** menggunakan model klasifikasi Markov Chain berbasis API Flask.

---

## Deskripsi Singkat

Aplikasi ini memungkinkan pengguna memasukkan sebuah kalimat puisi, lalu mengirimkan teks tersebut ke backend API untuk dilakukan prediksi penyairnya. Backend menggunakan model klasifikasi Markov Chain yang dilatih dengan kumpulan puisi dari kedua penyair tersebut.

Fitur utama:

- Input teks puisi secara langsung di aplikasi Flutter.
- Prediksi nama penyair (Edgar Allan Poe atau Robert Frost) secara realtime.
- Tampilan modern dengan efek blur dan animasi loading shimmer.

---

## Dataset

Dataset puisi yang digunakan dalam pelatihan model merupakan kumpulan puisi dari Edgar Allan Poe dan Robert Frost. Kamu dapat menggunakan dataset dummy berikut sebagai contoh:

- [Edgar Allan Poe Dataset (Dummy)](https://example.com/dataset/edgar_allan_poe.txt)
- [Robert Frost Dataset (Dummy)](https://example.com/dataset/robert_frost.txt)

---

## API Repository

Backend API yang menjalankan model klasifikasi tersedia di:

- [Poetry Classifier API Repository (Dummy)](https://github.com/username/poetry-classifier-api)

API ini dibuat dengan Flask dan menyediakan endpoint `/predict` yang menerima teks puisi dan mengembalikan prediksi penyairnya.

---

## Screenshot

Berikut adalah contoh tampilan aplikasi Flutter ini:

![Screenshot 1](https://example.com/screenshots/screenshot1.png)  
_Halaman utama input teks dan tombol analisa_

![Screenshot 2](https://example.com/screenshots/screenshot2.png)  
_Hasil prediksi nama penyair setelah analisa_

![Screenshot 3](https://example.com/screenshots/screenshot3.png)  
_Animasi loading shimmer saat proses prediksi berjalan_

---

## Cara Menjalankan

1. Clone repo API dan jalankan server Flask terlebih dahulu.
2. Jalankan aplikasi Flutter dan pastikan URL API di Flutter sudah mengarah ke server Flask.
3. Masukkan baris puisi di aplikasi dan tekan tombol "Analyze Text" untuk melihat prediksi.

---

## Lisensi

Proyek ini menggunakan lisensi MIT. Silakan gunakan dan modifikasi sesuai kebutuhan.

---

Jika ada pertanyaan atau ingin berkontribusi, jangan ragu untuk menghubungi saya.
