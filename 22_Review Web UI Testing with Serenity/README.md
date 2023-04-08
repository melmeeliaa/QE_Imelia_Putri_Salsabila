# Summary (22) Review Web UI Testing with Serenity
## Tuliskan 3 poin yang dipelajari dari materi Review Web UI Testing with Serenity

- Web automation testing adalah suatu cara yg dilakukan testing terhadap web yg dibuat, cara kerjanya spt layaknya manusia yg melakukan kegiatan di suatu website. Web automation testing ini dilakukan scr terpisah dg unit test dari developer, jd QE tdk bergantung pd basedcode apa yg digunakan oleh developer. Tools yg digunakan u/ web automation testing : Katalon, Cypress, robot framework, serenity BDD, dll. Serenity merupakan kerangka kerja BDD sumber terbuka yang membantu membuat tes penerimaan otomatis yang terstruktur dengan baik dan dapat dipelihara.
- Ada 5 langkah Jbehave u/ automation :
1.	Menulis story/skenario (write story). Skenario QE menggunakan bhs Gherkin syntax (Given : initial condition, when : aksi yg akan dilakukan, Then : validasi)
2.	Configure stories : menentukan story mana yg akan dijalankan & jg format output yg digunakan jk hny menggunakan jbehave. Story yang dijalankan dapat di setup dengan mengoverride method storyPath dari class configuration yang dibuat,
3.	Map Story / Scenario dengan Java Code : Mapping disini berati melakukan mapping antara story yang dibuat dengan logic automation dengan menggunakan bahasa java. Menariknya di framework jbehave terdapat Dependency injection tersendiri. Sehingga pada framework jbehave tidak perlu melakukan pembuatan object yang biasa dilakukan di java.
4.	Run Stories : Langkah Terakhir adalah menjalankan Story, Cara menjalankan storynya bisa menggunakan Junit ataupun Maven , dan karena bisa dijalankan melalui Junit , sebagian besar IDE sudah mensupport nya ( Termasuk Debugging Automation). Kita menggunakan IntellijIDEA menggunakan Intellij Idea sebagai standard IDE yang digunakan untuk melakukan build Automation dan Maven sebagai runnernya. Setelah di run maka akan muncul report standard dari jbehave
5.	View Reports : dalam serenity report akan memberikan skenario mana yg lulus & tidak serta memberitahu durasi pengujian yg dilakukan, dan menampilkan hasil tangkapan layar saat dilakukan pengujian aplikasi
- Langkah -langkah untuk web automation testing :
1. Membuat file serenity cucumber (CucumberTestSuite.java)
2. Membuat file test stories (file.feature)
3. Membuat file test class
4. Membuat file test step
5. Membuat file Page Object
6. Run the test (command di terminal mvn verify)
- Function untuk step di starter.page
7.	Type : untuk mengetik atau inputkan
8.	Click() : u/ mengklik
9.	IsDisplayed() : u/ melihat no validated atau apakah lokator atau elemen ini ada
10.	Clear() : u/ menghapus
11.	GetText() : u/ dapat teksnya
12.	isDisabled(): biasanya di button, misal kita blm inputkan username/password, button itu disabled

