# Summary (17) REST API Testing
## Tuliskan 3 poin yang dipelajari dari materi REST API Testing

- Data yang digunakan dalam REST API umumnya brupa JSON (JavaScript Object Notation) : adalah sebuah format data yang digunakan untuk pertukaran & penyimpanan data. JSON merupakan bagian dari javascript. 

- HTTP Respon code
200 (OK)          : request yang dikirim sukses 
201 (created)     : request yang dikirim sukses & resourcenya berhasil dibuat (biasanya dipake pada method post & put) 
204               : success respon delete
400 (bad request) : terjadi ketika melakukan req post atau put, kemudian datanya tidak sesuai ataupun ada salah dalam formatnya 
404 (not found)   : terjadi ketika resource yang diperlukan tidak ditemukan 
401 (unauthorized): terjadi ketika tidak melakukan autentifikasi terlebih dahulu sebelum melakukan request 
405 (method)      : request tidak support atau salah method http
500 (internal)    : eror ini karena ada kesalahan di server

- Ada tahapan proses melalui API testing
1.	Spesification review : untuk mereview dari spesifikasi API dan test case document
2.	Spesification development : untuk memastikan detail document mengenai test condition dan ekspektasi hasilnya dari setiap test case
3.	Tes framework development : harus memilih tools apa dalam API testing nanti
4.	Test case development : akan membuat test scenario ataupun test casenya
5.	Execution & report : mengeksekusi tes skenario yang sudah kita buat dan membuat report dari hasil testing yang sudah kita lakukan
