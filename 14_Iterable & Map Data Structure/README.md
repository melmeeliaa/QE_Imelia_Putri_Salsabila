# Summary (14) Iterable & Map Data Structure
## Tuliskan 3 poin yang dipelajari dari materi Iterable & Map Data Structure

- Iterable merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi/perulangan kepadanya. Iterable memiliki sebuah method yang dinamakan iterator.
Iterator : class yg memanage iterasi dari sebuah iterable.

- Macam -macam interface iterable:
1.	collection : kumpulan dari objek atau data yang diletakkan dalam 1 tempat yang sama & ini dikenal sebagai collects of object. & juga merupakan turunan dari interface iterable
2.	List : sebuah interface yang menyediakan cara untuk menyimpan data secara linear. List ini merupakan turunan dari interface collections. Implementasi dr interface list : abstract list, array list, LinkedList dan stack 
3.	Set : struktur data yang dapat menyimpan sekumpulan data secara linear sama seperti list, tetapi set tidak dapat menerima data yg duplikat
4.	SortedSet : dapat mengelola urutan dari data
5.	NavigableSet : akan menampilkan data yang terbalik/dari terbesar ke terkecil
6.	Queue :mengimplementasi first in first out yang artinya data yang lebih dulu dimasukkan  akan lebih dulu diambil sehingga queue ini diibaratkan sebagai sebuah antrian. 
7.	Deque : sebuah queue tapi memiliki 2 ujung (double ended queue)
8.	Blockingdeque
9.	Transferqueue

- Perbedaan arrayList & linkedlist :
Pada arraylist seperti terlihat ada ruang kosong terisi data, sedangkan pada linked list bentuknya seperti gerbong kereta api, jadi pada bagian 1 sebuah elemen akan menyimpan nilai dari data yang disimpan. Selain nilai data, disini juga akan menyimpan alamat memori dari data yg berikutnya, maka disini akan terhubung antara elemen 1 dg yang lainnya
Jika dilihat dr sisi time complexity, Dpt dilihat pada saat mengambil data, arraylist mendapatkan O(1) yg artinya konstan, pd linkedlist mdptkan O(n) artinya ktika mengambil elemen linkedlist mungkin memerlukan waktu yg lbh lama. Menghapus/ menambah data pd bagian awal, arraylist bisa mengalami waktu yg lbh lama dr linkedlist
Persamaan keduanya adalah ketika Menghapus/ menambah data pd bagian tengah dan akhir arraylist & linkedlist memiliki time kompleksitas yg sama

- Map merupakan struktur data yang ada di java yang digunakan untuk menyimpan banyak data didalamnya. Data-data yang tersimpan di dalam map diidentifikasi menggunakan key. dan setiap key akan memiliki datanya sndiri yg disebut value. Bentuk/implementasi map yg terdapat di java : 
1. HashMap (implementasi dari map yang menggunakan algoritma struktur data HashTable) ,
2. WeakHashMap (masih menggunakan hash table, tetapi bedanya keynya dapat dihilangkan jika sudah tidak digunakan, memanggil system.gc(), akan menyebabkan beberapa key yang tidak digunakan lagi datanya akan hilang dari map), 
3. IdentityHashMap (masih menggunakan hash table tetapi jika key menerapkan referensi pada memori yang berbeda maka akan dianggap sebagai data yg berbeda),
4. LinkedHashMap (tidak ada perbedaan yang signifikan dengan HashMap biasa tetapi secara internal Linked HashMap menerapkan doublelyLinkedList & Hash Table sebagai struktur data di dalam mapnya),dan
5. ImmutableMap (tidak dapat diubah isinya baik menambah atau mengubah isi yang udah ada)
6. SortedMap (Map yang dapat diurutkan baik ascending atau descending & masing-masing penerapan dari sorted map ini memiliki cara sortingnya sendiri-sendiri)
7. Navigable Map (masih termasuk Sorted Map tetapi dengan method-method untuk menavigasi yang lebih lengkap mulai dr key yang paling rendah hingga key yg paling tinggi lalu key yang paling awal hingga key yang paling akhir
