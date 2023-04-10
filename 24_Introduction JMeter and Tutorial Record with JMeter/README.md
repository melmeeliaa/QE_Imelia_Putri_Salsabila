# Summary (24) Introduction JMeter and Tutorial Record with JMeter
## Tuliskan 3 poin yang dipelajari dari materi Introduction JMeter and Tutorial Record with JMeter

- Jmeter : sebuah tool yg dapat membantu kita dalam melakukan pengujian pada sebuah website untuk mengetahui seperti apa performanya. Jmeter adalah software berlisensi Apache yg merupakan sbuah perangkat lunak dg sumber terbuka shg semua orang dpt ikut serta dlm mengembangkan aplikasi ini. Jmeter jg terbuat dr aplikasi dekstop berbasis java 100% murni yg dirancang untuk menguji perilaku suatu website shg pengguna dpt melihat apakah website tersebut memiliki fungsionalitas & kinerja yg sudah sesuai. Keuntungan menggunakan Jmeter : open source & Easy to use with GUI/ non GUI 
- Tutorial Record with JMeter :
1. Download JDK dan Jmeter
2. Instal JDK
3. Extract file apache-jmeter.zip
4. Buka dan run jmeter.bat pada directory ..../apache-jmeter-version/bin
5. Muncul jendela command prompt
6. pada jmeter klik menu file -> restart
7. Install plugin (plugin-manager.jar)
8. Pindahkan  file plugin-manager.jar pada .../apache-jmeter-version/lib/ext
9. Klik icon templates, lalu muncul jendela templates
10. Pada listdown, kita milih template yg bernama recording, klik create
11. Isi pada field hostToRecord dengan halaman web yg ingin kita tes (cukup domain saja), klik create
12. Klik toggle pada HTTP(S) Test Script Recorder untuk mengaktifkannya
13. Pada target controller kita pilih Test plan > Thread Group > Recording controller
14. Klik start
15. Mengatur proxy pada web browser firefox dengan mengklik manual proxy configuration. Portnya harus sesuai dengan port di Jmeter
16. Tes Web yang akan dites
17. Pada HTTP(S) Test Script Recorder terdapat view results tree yang isinya terdapat tameng hijau dan merah, tameng hijau yang artinya terjadi sebuah request

- Komponen-komponen yang terdapat pada Jmeter :
1.	Test plan : rencana besar dr sebuah pengujian yg akan dilakukan (parent)
2.	Thread groups : kumpulan thread yg menjalankan skenario yg sama
3.	Samplers : sebutan u/ request yg dikirim ke server
4.	Config elements : elemen yg digunakan u/ konfigurasi atau modifikasi sampler request yang dikirim ke server
5.	Listeners : merekam apapun yg terjadi saat tes dilakukan
6.	Timers : u/ mencatat waktu saat testing dilakukan (fitur ini akan jalan duluan sebelum semua fitur yg lain berjalan)
7.	Assertions : sebuah kegiatan yg menguji kriteria apakah sdh sesuai dg kenyataan yg terjadi atau blm (sperti assert pada API/Web/Testing. Merupakan kriteria tambahan apakah pass/tidak)
8.	Pre-post processors : fitur yg memproses respon data sebelum/sesudah tes

