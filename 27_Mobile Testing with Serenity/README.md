# Summary (27) Mobile Testing with Serenity
## Tuliskan poin yang dipelajari dari materi Mobile Testing with Serenity

- Mobile testing adalah proses dmn aplikasi dikembangkan pd perangkat mobile diuji u/ kegunaan & konsistensinya. Ada 2 macam testing yg hrs dilakukan u/ aplikasi pd perangkat mobile
1. Testing hardware : prosessor, memori internal, ukuran layar, besarnya RAM, blutooth, Wifi, kemampuan kamera, dll
2. Testing software : aplikasi mobile. Aplikasi mobile terbagi mnjadi 3 macam yaitu : aplikasi native, aplikasi hybrid, dan aplikasi mobile web. Ketiganya memiliki perbedaan dasar yg tentunya akan mempengaruhi proses pengujian
Pengujian aplikasi mobile jauh lebih kompleks dibanding pengujian aplikasi atau web untuk dekstop karena:
a.Perangkat mobile memiliki banyak macam ukuran layar konfigurasi hardware seperti keypad, virtual keypad (touch screen), trackball dan lain-lain.
b.Bermacam-macam sistem operasi yang di pakai, seperti android, windows, blackberry, dan iOS
c.Bermacam-macam versi dari sistem operasi
d.Bermacam-macam jenis jaringan mobile, seperti CDMA atau GSM, berkemampuan EDGE, 3G, atau 4G.
Untuk mengatasi semua masalah teknis di atas, ada beberapa macam testing yang selayaknya dilakukan pada aplikasi mobile.
a.	Usability testing, untuk memastikan bahwa aplikasi mobile mudah digunakan dan memberikan user experience yang baik untuk penggunanya.
b.	Compatibility testing, pengujian aplikasi dengan perangkat mobile yang berbeda, melalui browser, dengan ukuran layar yang berbeda serta versi OS sesuai dengan kebutuhan.
c.	Interface testing, pengujian pilihan menu, tombol, bookmark, history, pengaturan, dan navigasi dari aplikasi
d.	Service testing, pengujian aplikasi dalam keadaan online maupun offline
e.	Low leve resource testing, pengujian memori, auto-delete file-file sementara, masalah pertumbuhan database.
f.	Performance testing, pengujian kinerja aplikasi dengan mengubah koneksi dari 2G atau 3G ke wifi. Bagaimana kemampuan berbagi dokumennya dan bagaimana kapasitas baterai yang dibutuhkan.
g.	Operational testing, backup dan rencana recovery jika baterai melemah atau saat kehilangan data karena proses upgrade dari toko aplikasi.
h.	Installation testing, validasi aplikasi dengan menginstall atau menguninstall pada perangkat mobile.
i.	Security testing, pengujian aplikasi untuk memvalidasi apakah data terlindungi system informasi.
Untuk memastikan bahwa semua standart kualitas dan kinerja terpenuhi maka adanya strategi untuk testing aplikasi mobile sangat dibutuhkan.
a.	Pemilihan perangkat, menganalisis pasar dan memilih perangkat yang banyak digunakan. Keputusan ini sebagian besar bergantung pada pengguna, atau pada pengembang yang mempertimbangkan faktor popularitas sebuah perangkat tertentu.)
b.	Emulator, penggunaan emulator sangat membantu dalam tahap pengembangan awal. Emulator memungkinkan untuk melakukan pengecekan secara cepat dan efisien. Emulator sendiri merupakan sistem yang menjalankan software yang seolah-olah membawa kita pada sistem operasi lain.
Tools mobile automation testing : appium
- Tools mobile automation testing : appium. Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler. Appium support  banyak bahasa programming : java, javascript, ruby, phyton, dll. Appium library is created in top of selenium library. Appium juga support di beberapa platform seperti android, iOS, dan windows app. Appium adalah Mobile web, native dan hybrid software application test automation tool. Yang paling penting adalah : Appium bisa “cross-platform” automation tool , Jadi bisa membuat software automatios test script di IOS dan Android menggunakan API yang sama. Appium dapat membantu regression test aplikasi mobile menjadi lebih mudah. Khususnya untuk aplikasi mobile yang besar dimana Update-nya dilakukan secara berkelanjutan dengan fitur dan fungsi yang terus di perbaharui.
Keuntungan lainnya dari menggunakan appium adalah : Appium mendukung Multiple Platforms dan Bahasa. Serta bisa menggunakan testing framework apapun. Appium juga memiliki keunggulan seperti tidak membutuhkan source code untuk testing aplikasi dimana kita bisa testing langsung, juga kita bisa membangun “built-in” aplikasi seperti kamera , kalendar , dsb di dalam test script. Keterbatasan Appium
a.	Untuk versi Android, Tidak support untuk Android API level < 17.
b.	Eksekusi Script sangat lambat di IOS platform.
c.	Gestures support sangat terbatas
d.	Tidak mendukung untuk pop-up atau toast messages.

- Bagaimana appium bekerja di android?
Kalau android menggunakan driver UIautomator2/Espresso, iOS menggunakan XCUITest, u/ dekstop winAppDriver
android menggunakan driver UIautomator2/Espresso  u/ berinteraksi dg komponen UI application antar test, library klien mengkonversi perintah tertulis pengguna mjd permintaan  rest api, permintaan ini dikirim server appium menggunakan mobile JSON web Protocol, kemudian server web appium meneruskan permintaan ini ke perangkat atau emulator android. Perintah2 ini diinterpretasikan oleh bootstrap.jar yg mengubahnya menjadi format UIautomator yg dpt dimengrti oleh perangkat seluler atau emulator. Perintah UIautomator skrg dijalankan  di perangkat emulator. Perangkat emulator kemudian mengembalikan hasil dr printkey yg dilakukan ke server appium melalui bootstrap.jar. server appium akan meneruskan respon ini ke klien
sebenarnya hampir sama antara iOS dg WinAppDriver
Terdapat dua komponen besar di appium yg dpt kita gunakan :
a.	Appium server : Appium Server adalah komponen inti dari arsitektur Appium. Itu ditulis dalam Node.js dan berjalan di mesin atau di cloud. Server Appium menerima permintaan dari pustaka klien Appium melalui JSON Wire Protocol dan memanggil driver seluler (driver Android/driver iOS) untuk terhubung ke kerangka kerja otomatisasi pengujian asli yang sesuai untuk menjalankan operasi klien pada perangkat. Hasil tes kemudian diterima dan dikirim ke klien. Server Appium, memiliki kapasitas untuk membuat beberapa sesi untuk menjalankan tes secara bersamaan di beberapa perangkat. (DARI SLIDE : Appium Server dapat digunakan sebagai jembatan u/ mengontrol pengujian devices. Ada 2 versi, kita bisa menggunakan appium dekstop atau instal appium command menggunakan npm)
b.	Appium klien : Appium meminta server untuk memulai sesi otomatisasi pengujian menggunakan perintah createSession() melalui protokol JSON Wire, menjalankan pengujian pada beberapa perangkat seluler, dan menerima hasil lainnya dari Appium Server. Pustaka klien Appium menjangkau berbagai bahasa seperti PHP, Java, Ruby, JavaScript, C#, Python.
Untuk set up appium di lokal komputer kita, kita membutuhkan instal beberapa tools :
a.	Java JDK 8/11 (wajib set JAVA_HOME pd enviroment variable)
b.	Instal android studio (wajib set ANDROID_HOME pd enviroment variable)
c.	Instal android SDK platform tools & command line tools
d.	Instal appium dekstop
e.	Instal node.js (udah terisntal npm)
f.	Appium-doctor (optional)
