# Summary (20) RESTful API Testing with Rest Assured
## Poin yang dipelajari dari materi RESTful API Testing with Rest Assured

- Fundamental API test process : API server, Mobile App, EXT Process, API Testing

- Test process dari sebuah API :
1.	Mendefinisikan API yang akan kita tes (Record, Define API information)
2.	lalu inputkan data yg dibutuhkan baik di header maupun di body requestnya (Parsing , Filter or recording API Data And Then Extract)
3.	Sent request ke server (Reconstruction API Calls, and sent them from a simulate client)
4.	lalu kita validasi thdp respon yg diberikan (Test Validation)

- REST Assured and features 
1.	Support for HTTP Methods
2.	Support for BDD/gherkin
3.	User of Hamcrest matches for checks
4.	User of Gpath for selecting element from JSON response

- API automation testing menggunakan katalon
API (Application Programming Interface) : mekanisme yang memungkinkan 2 komponen perangkat lunak untuk saling berhubungan dengan menggunakan serangkaian definisi & protokol.

- Konsep API :
User (mobile/web app) > (request) > waiter(API) > (request) > kitchen (application)
User (mobile/web app) < (response) < waiter(API) < (response) < kitchen (application/server)
User : client
Client : pengguna yg ingin mengakses informasi dr web. Clients dpt berupa orang atau software yg menggunakan API
Resources (response) : informasi yg diberikan oleh aplikasi yg berbeda kpd klien. Resources dpt berupa gambar, video, teks, angka, atau jenis data apa pun. Mesin yang memberikan resources ke client disebut juga server.

- Katalon (API Automation tool) : sebuah automation testing software yang dikembangkan oleh Katalon,Inc. Software ini dibangun berdasarkan open source Appium, selenium dengan interface IDE khusus. Katalon rilis penggunaan internal pada Januari 2015. Sedangkan untuk rilis publik pertamanya pada september 2016.

- Key features dari katalon : simple deployment, quick easy & setup, faster & better result, flexible models, ease of use, Multi OS application
1. Simple deployment : paket penerapan tunggal yg kohesif berisi semua yg kita butuhkan untuk menerapkan alat otomatisasi pengujian yg andal (udah terintegrasi dg github, postman, dll)
2. Quick easy & setup : tidak hny menyediakan instalasi sederhana, katalon studio jg memudahkan setting environment. Penguji dapat menjalankan script pengujian pertama mereka dengan cukup cepat menggunakan template & skrip pengujian yg dibuat sebelumnya, seperti repositori objek & pustaka kata kunci (Resources > documentation > Get started > Katalon Studio Installation)
3. Faster & Better results : template bawaan dg tutorial yg jelas membantu penguji membuat & menjalankan skrip pengujian otomatisasi dg cepat. Mrk dpt melakukan setiap langkah dg kecepatan & efisiensi, mulai dr penyiapan proyek,pembuatan pengujian, pelaksanaan, pembuatan laporan & pemeliharaan (1 test case akan diberi template u/ yg user dan juga diberi keyword2)
4. Flexible modes : penguji baru dapat menggunakan record dan kata kunci u/ membuat pengujian otomatisasi, sementara penguji ahli memiliki IDE lengkap u/ membuat skrip lanjutan (bisa milih record atau manual bikin skrip)
5. Ease of use : penguji baru dg pengalaman pemograman minimum jg dpt memanfaatkan manfaatnya dg mudah
6. Multi OS application : katalon studio mendukung berbagai macam platform :windows 32 and 64 (7,8, and 10) and OS X 10,5+, mac OS, linux
