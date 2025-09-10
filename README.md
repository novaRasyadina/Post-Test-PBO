# Post Test 1 PBO
# **Manajemen Pre-Order Kain Songket**
Program ini dibuat dengan aplikasi Java untuk mengelola data pre-order
kain songket. fitur yang tersedia meliputi menambah pesanan, melihat daftar pesanan, mengubah dan menghapus data. Sedangkan semua data disimpan dalam ArrayList. program berjalan berulang hingga pengguna memilih keluar. 

**# Penjelasan Alur Program #**

<img width="397" height="103" alt="Screenshot 2025-09-10 154646" src="https://github.com/user-attachments/assets/f4ca45ea-1c4a-4f55-bff3-36fd2ad294b2" />

Mengimpor beberapa package yang dibutuhkan antara lain package com.mycompany.main; yang berfungsi sebagai folder temoat program disimpan, import java.util.ArrayList digunakan untuk menampung daftar data pre-oreder, kemudian import java.util.Scanner digunakan agar program dapat membaca input.

<img width="313" height="37" alt="image" src="https://github.com/user-attachments/assets/2b6eea0c-0c0b-45c8-bbfd-ccdb53607172" />

Semua kode berada dalam class utama atau Main ini.

<img width="1003" height="346" alt="image" src="https://github.com/user-attachments/assets/cf3f7918-4523-41bb-b0a6-2bd76234864d" />

Kode di atas digunakan untuk membuat template data pre-order. seperti form pemesanan yang memiliki kolom. jika membat pesanan baru, kita dapat mengisi kolom-kolom tersebut melalui constructor.

<img width="747" height="78" alt="image" src="https://github.com/user-attachments/assets/1efaafbb-e5af-4c3e-ac2f-b393ff338271" />

kemudian program masuk ke bagian perulangan atau while (true). ini digunakan agar menu utama selalu muncul berulang sampai pengguna memilih keluar. di dalam perulangan ditanmpilkan menu pilihan berupa angka 1 sampai 5, masing-masing mewakili fitur tambah data, lihat daftar, ubah data, hapus data, dan keluar dari program. setelah menu ditampilkan, program membaca inputann angka dari pengguna memasukan data baru, lalu data lama langsung diganti dengan data baru pada objek yang sama. jika nomor tidak valid, program menampilkan pesan terdapat kesalahan.

<img width="855" height="267" alt="image" src="https://github.com/user-attachments/assets/afdea687-6008-465a-98ca-2b14de98caf3" />

Perulangan while (true) membuat menu ini muncul terus-menerus sampai pengguna memilih keluar. System.out.println digunakan untuk menampilkan teks menu. Kemudian program membaca pilihan pengguna dengan input.nextInt(). Karena nextInt() hanya membaca angka dan meninggalkan karakter newline, maka input.nextLine() dipanggil setelahnya supaya tempat penampungnya input bersih sebelum membaca teks berikutnya.
jika pengguna memilih angka satu, maka bagian tammbah data akan dijalankan.

<img width="840" height="387" alt="image" src="https://github.com/user-attachments/assets/823a8b23-c7ee-4270-95b5-f5840d50c513" />

program meminta pengguna untuk mengisi nama, jenis kain, jumlah, dan tanggal. data yang diketik langsung disimpan dalam variabel sementara (nama, jenis, jumlah, dan tanggal). setelah itu, program membuat objek baru dengan new preOrder((nama, jenis, jumlah, tanggal)); dan memasukannya ke daftar menggunakan daftarPreOrder.add(new PreOrder(nama, jenis, jumlah, tanggal));

<img width="1043" height="322" alt="image" src="https://github.com/user-attachments/assets/de059921-8c15-4e77-9142-4707a863fc9b" />

Pertama program memeriksa apakah daftar kosong dengan daftarPreOrder.isEmpty(). Jika kosong, tampil pesan khusus. Jika ada data, program melakukan perulangan for dari indeks nol sampai akhir list (daftarPreOrder.size()). Setiap data diambil dengan daftarPreOrder.get(i) lalu ditampilkan. Nomor ditampilkan dengan i+1 agar pengguna melihat nomor mulai dari satu, bukan nol.

<img width="932" height="656" alt="image" src="https://github.com/user-attachments/assets/9f8dca3b-1aae-4e75-bfdc-67e71affc3cf" />

Program meminta nomor data yang ingin diubah. Karena ArrayList dimulai dari indeks nol, maka input dikurangi satu dengan input.nextInt() - 1. Jika nomor valid, data lama diambil lalu ditampilkan dalam tanda kurung sebagai referensi. Program kemudian meminta data baru dari pengguna, dan langsung mengganti nilai atribut lama dengan nilai baru menggunakan perintaj seperti p.namaPemesan = input.nextLine();.

<img width="847" height="406" alt="image" src="https://github.com/user-attachments/assets/ea6878ce-9bf0-4ce0-906b-f8cde962e6dd" />

di baian ini cara kerjanya sama seperti update, yaitu meminta nomor data. jika valid, program menghapus data dari daftar dengan daftarPreOrder.remove(index);. Jika nomor salah, tampil pesan error pada outputnya.

<img width="856" height="102" alt="image" src="https://github.com/user-attachments/assets/319f168d-bf03-4c8c-910d-85d5546e83ab" />

Kode break digunakan untuk menghentikan perulangan while (true) sehhinga program tidak menampilkan menu lagi.
<img width="794" height="116" alt="image" src="https://github.com/user-attachments/assets/6702e720-61f2-48a1-be39-1c26cdc3a0c1" />

ptogram akan menampilkan pesan bahwa pilihan tidak tersedia dan kembali menampilkan menu utama.
<img width="514" height="96" alt="image" src="https://github.com/user-attachments/assets/cfef1711-2a49-4d98-9045-84b8abfaa8aa" />

Menutup scanner dengan kode input.close(); ini penting karena Scanner menggunakan resource input yang harus dilepaskan setelah digunakan.

<img width="480" height="183" alt="image" src="https://github.com/user-attachments/assets/ef9c92f9-357f-4a47-9623-d4b83ab98ece" />

Gambar di atas merupakan output yang keluar setelah program dijalankan, pengguna dapat memilih nomor menu yang ingin dituju

<img width="545" height="157" alt="image" src="https://github.com/user-attachments/assets/41fcb506-2268-417b-8ac4-21eb16f61a18" />

apabila pengguna memilih nomor 1, maka pengguna akan diminta menginput pesanan beserta keterangan yang diperlukan sesuai kebutuhan.

<img width="739" height="114" alt="image" src="https://github.com/user-attachments/assets/624066c4-5730-4687-8c13-036c44f064cb" />

Apabila memilih menu nomor 2, akan ditampilkan daftar pre-order yang sudah di masukan pada menu sebelumnya.

<img width="627" height="176" alt="image" src="https://github.com/user-attachments/assets/2e3126e3-cca5-44cd-91e5-5328b1a91cdf" />

Gambar di atas menampilkan output apabila memilih menu nomor 3, yaitu mengubah rincian pesanan.

<img width="566" height="281" alt="image" src="https://github.com/user-attachments/assets/8c7eabd7-36e0-456f-8580-16ed75a1452b" />

Pengguna juga dapat menghapus orderan dengan memilih menu nomor 4, dan apabila pengguna melihat daftar order dengan menu 2, dsaftar order yang di inputkan sebelumnya tidak tersedia lagi karena sudah dihapus.

<img width="839" height="122" alt="image" src="https://github.com/user-attachments/assets/93308b02-e3b7-448d-af6c-1bb52e71c4d9" />

Pengguna dapat memilih menu nomor 5 untuk keluar dari program pre-order.
