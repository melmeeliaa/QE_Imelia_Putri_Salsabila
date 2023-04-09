# Summary (23) Fundamental Performance Test
## Tuliskan 3 poin yang dipelajari dari materi Fundamental Performance Test

- Performance testing : sebuah teknik non functional testing untuk menentukan parameter sistem dalam hal responsif & stabilitas di bawah berbagai beban (load) kerja
Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability) (ex : mengetes apakah sistem ini bisa tetep bekerja dengan baik meskipun diberikan request atau beban kerja yg cukup banyak) dan penggunaan sumber daya (kita ingin memastikan bahwa sistem dapat bekerja dg baik & dgn menggunakan sumber daya yg tersedia dg efektif & seefisien mungkin). Yang diukur dari performance testing :
1.	Performa suatu aplikasi sampai suatu batas tertentu
2.	Bukan merupakan functional test
3.	Bisa dalam berbagai macam bentuk u/ memahami reliability, stability, & avaibility
Yang perlu diperhatikan dari performance test :
1.	Throughput (sebuah satuan waktu misalnya berapa request/sekon )
2.	Response data

- Beberapa type Perfoma Test : 
1.	Smoke testing	: dilakukan untuk verify script yg sdh dibuat (apakah web yg kita buat sdh benar/blm, apakah sistem ini dpt menghandle load dg jmlh minimal). Biasanya 1-2 Vus (virtual user)
2.	Load test : pengujian yg plg sederhana yg dilakukan u/ memahami perilaku sistem dlm keadaan beban tertentu. Hsl dri load testing digunakan u/ mengukur kepentingan bisnis saat transaksi yg kritis dg memonitor dampak thdp database, application server atau pendukung lainnya. Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya kita mengetahui jumlah traffic yg ada di prod sbg nilai di load test.
Jika sistem blm pernah msk ke production,& tdk diketahui idealnya, kita bs menggunakan acuan tabel tier
3.	Stress testing : metode ini dilakukan u/ mengamati kemampuan & kestabilan sistem pd saat kondisi ekstrem. Cara kerjanya kita beri load work atau beban kerja yg normal, lalu dinaikkan work load tsb, lalu dinaikkan lg melebihi puncaknya. Lalu menambahkan skill down atau menurunkan work load u/ melihat proses recovery dr sistem tsb
4.	Spike testing (mirip dg stress testing namun disini kenaikan work loadnya lgsg drastis (tanpa bertahap))
Kenaikan langsung menuju melebihi puncak dlm waktu yg singkat. Tidak diberikan waktu u/ scale out.
Contoh : pd saat flash sale di suatu e-commerce, yg dmn byknya kunjungan user yg lgsg memuncak saat mengakses hlmn flash sale
5.	Soak testing (Endurance testing)
Memberikan beban kerja yang byk dlm waktu yg panjang. U/ mengetahui reliability ketika dlm tekanan di bwh puncak dlm jangka panjang(>= 1 jam). Dpt mengethui apakah tdpt bug pd race condition, memory leaks, db connection dsb. Tips : lakukan pd jam2 sepi tdk ada transaksi pd sistem jk test dilakukan di production

- Istilah penting dalam performance test : 
1. SUT (Sistem Under Test)  : melakukan test pada sistem
2. Load generator           : membuat request pada server
3. Throughput               : satuan kerja dlm satuan waktu (request/sekon atau /minute)
4. Performance treshold     : target maksimal nilai yg diperbolehkan
5. Saturation               : kondisi dmn SUT/load generator sudah dlm kondisi maksimum dlm merespon atau mengenerate
6. Virtual users            : simulasi dr users yg melakukan pengujian, dpt melakukan 1 atau > request dlm 1 iterasi
7. Response time            : lama waktu pengiriman request sampai menerima respon

