# Summary (28) Testing in CIorCD Pipeline
## Tuliskan 3 poin yang dipelajari dari materi Testing in CIorCD Pipeline

- CI (Continous Integration) : praktik pengembangan software dimana developer merubah kode serta melakukan merge pada sebuah repositori atau penyimpanan secara reguler dan terus menerus. Nantinya jika ada push ataupun commit yg baru maka automated build & test akan dijalankan sehingga hasilnya bisa langsung diketahui. Jadi jika ada kesalahan dlm proses CI ini mk pihak development bs lgsg mengambil tindakan/action, caranya adalah dengan memperbarui kode shg kualitasnya bs ditingkatkan skaligus menghemat waktu ketika melakukan validate update. CI : solusi u/ menyederhanakan tahapan pengembangan software sehingga isu bisa diperbaiki
Didlm CI ada 3 stage yg harus dilatih : build, unit test, integration test. Kmudian jk sukses CI akan dilanjutkan ke CD
- CD (Continous Delivery/Deployment) yg mana memiliki makna yg berbeda2. Continous Delivery : proses stlh continous integration dmn developer sdh menjalankan build & test namun memilih u/ tdk melimpahkannya ke environment production, jd biasanya ketika proses development sdh selesai, Cdelivery membutuhkan action u/ merilis ke production. Continous Delivery : perangkat lunak dpt dirilis kpn saja, seringkali ngepush perubahan scr otomatis ke sistem pementasan.
Continous Deployment : fase akhir dr CI/CD pipeline yaitu fase stlh continous integration & continous delivery slesai dijalankan. Continous deployment scr otomatis akan rilis ke production, jd ketika Continous Integration & Continous Delivery slsai dijalankan, otomatis Continous Deployment itu akan rilis ke production.
Perbedaan Continous Delivery & Continous Deployment :
Continous Delivery :
1.	Butuh manual action u/ rilis ke production
Continous Deployment :
1.	Akan otomatis rilis ke production tanpa perlu approval dr developer
2.	Lolos quality control
Persamaan Continous Delivery & Continous Deployment : praktek umumnya sama yaitu builds-test-acceptance test-deploy to staging-deploy to production, hny beda penerapan saja. Continous Delivery : kita brtujuan u/ memiliki SDLC scr otomatis smpe lingkungan trakhir sblm production shg kita bs siap setiap saat u/ rilis scr otomatis ke production. Continous Deployment : melangkah lbh jauh, hal ini memungkinkan kita u/ benar2 scr otomatis rilis ke production. Perbedaan keduanya hanya ada / tidak triger otomatis atau manual dr Continous Delivery ataupun Continous Deployment
Ada 3 hal membuat CI yg baik :
1.	Decouple stages : setiap step yg berjalan di CI harus mengerjakan single task atau lbh fokus dlm task tsb
2.	Repeatable : stage yg berulang2 bs dipakai lg scr otomatis & konsisten serta developer jg bs memakai tools tsb di lokal
3.	Fail Fast : ktika ada error di line pertama step tsb hrs sgera fail
Ada 3 hal membuat CD yg baik :
1.	Design with system in mind
Byk bagian yg hrs dicover dan dipikirkan dlm deployment spt aplikasi, infrastuktur, data, dan konfigurasinya
2.	Pipelines
Meningkatkan confidence u/ bs lanjut ke production
3.	Globally unique versions
Mengerti state2 setiap sistem kapan saja serta bs mendemokan perbedaan antara current state & future state 
- CI/CD : proses yg berkelanjutan & terus menerus dlm software deployment mulai dr awal hg software tsb mencapai customer & mendapatkan feedback. Scr garis besar tahapan dr proses CI/CD berikut ini :
1.	Commit : Developer akan memilih sejumlah code u/ kemudian dieksekusi menggunakan version control system misal git commit
2.	Build : developer akan menggabungkan code awal dg code yg baru kmudian dikompilenya dg kompiler 
3.	Testing : testing aplikasinya
4.	Deploy : menjalankan software di task server atau staging server. Jk tdk ada masalah pd tahap deploy mk developer bs melanjutkan ke tahap auto test. Jk kesuluruhan software sdh berfungsi sbgaimana mestinya, kta bs menjalankan software tsb ke production. Jk ada masalah ke dpnnya developer akan memperbarui version dr software itu melalui version control, hal ini akan berlgsg scr trs menerus shg software terhindar dr berbagai mslh
- Manfaat CI/CD dr pengembangan software :
1.	Dpt mendeteksi bug lbh cepat, CI/CD bekerja scr otomatis shg jk ada bug yg muncul pd aplikasi yg dikembangkan mk akan lgsg terdeteksi pd CI itu
2.	Dpt mengurangi bug2 yg muncul
3.	Dpt mempercepat proses rilis
4.	Efisien
- Tools CI/CD : Jenkins, bamboo, circleci, AWS code build, azure devops, CI/CD,  Travis CI, Github actions
- Github action (GA) : sbuah fitur CI/CD yg ada di github u/ melakukan automation build, test, & deployment
Ada beberapa fitur unggulan dr GA :
1.	Free kecuali melebihi batas pemakaian maksimal spt memakai proses action melebihi 2000menit/bulan atau penyimpanan paket melebihi 500mb
2.	Virtual machine yg disediakan dg berbagai mcm OS
3.	Sdh disediakan template CI
4.	Kemudahan container & OS u/ testing
Github action memiliki beberapa komponen diantaranya :
1.	Workflows : proses otomatis yg dpt dikonfigurasi & akan menjalankan 1 atau lbh jobs. Workflow jg dpt didefinisikan sbg file YAML yg diperiksa di repositori kita.  Dan akan berjalan saat ditriger oleh suatu event di repo kita, atau bs ditriger scr manual atau ada jadwal yg sdh ditentukan
2.	Events : aktivitas spesifik dlm repo yg mentriger workflow u/ berjalan. Ketika seseorang melakukan pull request, open an issue, push atau commit
3.	Runners : server yg menjalankan workflow kita saat ditriger. Setiap runner dpt menjlnkan 1 job pd suatu waktu. Github menyediakan ubuntu linux, windows, macOS u/ menjalankan worflow kita
4.	Jobs : serangkaian steps dlm worklow & dijalankan pd runner yg sama. Setiap step adalah script shell yg akan dijalankan. Step itu dijlnkan scr berurutan & slg bergantung satu sama lain krn setiap step dijlnkan pd runner yg sama, kita dpt berbagi data dr satu step ke step lainnya

