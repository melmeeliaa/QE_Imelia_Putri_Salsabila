# Summary (25) Post Processor & Understanding Jmeter Results
## Tuliskan poin yang dipelajari dari materi Post Processor & Understanding Jmeter Results

- Post Processor adalah bagian dari test plan yang merupakan sebuah aksi yg berjalan saat proses telah dilakukan, proses ini sendri adalah proses request ke sebuah halaman web. Proses yg dilakukan pd post prosessor ini pd umumnya adlh untuk mengekstrak value yang didapatkan dr hasil mengakses sebuah halaman web seperti data pada json, session, atau bagian respon yang lainnya. Post processor yg biasa digunakan : JSON extractor
- Untuk bisa menggunakan post processor, terdapat langkah-langkah berikut :
1.	Klik icon templates, lalu pilh recording, klik create
2.	Field hostToRecord :diisi lalu klik create
3.	Klik kanan pada threat group, ada menu add, pilih menu sampler, pilih HTTP Request
4.	Klik bagian HTTP Request, pada protocol isi https, server name or IP : reqres.in
5.	Pilih listdown HTTP Request apa yang ingin dijalani
6.	Isi field path
7.	Di bagian parameter bisa ditambahkan
8.	Klik menu run -> start pada HTTP request
9.	Lalu klik view results tree untuk melihat hasilnya, terdapat tameng
10.	Pilih salah satu tameng, lalu lihat bagian request -> request body
11.	Di bagian response data, kita melihat data dalam bentuk format JSON, data ini bisa diolah dengan JSON extractor
12.	Pada bagian HTTP Request, klik kanan, pilih add > Post Processors > JSON Extractor
13.	Isi nama variabel, JSON Path, default value (jika tdk mendapatkan data apa2)
14.	Tidak terdapat perbedaan
15.	Pada threat group, klik kanan, pilih add > sampler > debug sampler (dibiarkan default)
16.	Jalankan kembali (run > start)
17.	Kembali ke view results tree, akan muncul debug sampler
18.	Jika ingin menambahkan parameter pada JSON Extractor, maka pisahkan dengan titik koma (;)
19.	Jalankan kembali (run > start)
- Ada beberapa macam post processor : 
1. CSS Selector Extractor
2.	JSON Extractor
3.	Boundary Extractor
4.	Xpath Extractor
5.	Debug PostProcessor
6.	Dan masih banyak lagi
