# SimpleCalculator
Simple Calculator merupakan sebuah program kalkulator sederhana yang memungkinkan pengguna untuk melakukan operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian berdasarkan dua buah operand yang diinputkan user. Dengan antarmuka yang mudah digunakan, pengguna dapat dengan cepat memasukkan operand dan memilih operator yang ingin dikalkulasikan. Aplikasi ini juga dilengkapi dengan proses validasi untuk memastikan keakuratan perhitungan yang baik.


## Author 
* Aini Diah Rahmawati [211524033]
* Ghessa Theniana - [211524042]
* Mochamad Ferdy Fauzan - [211524049]

## Technologies & Tools 
* **Repository Management** : Git
* **IDE** : Visual Studio Code
* **CLI** : Command Prompt (CMD) / Powershell (Windows)
* **Build Tools** : [![Gradle](https://img.shields.io/badge/Gradle-8.7-blue)](https://gradle.org/)
  Kami menggunakan Tools Gradle untuk mengelola proyek Java kami secara lebih efisien. 
  Versi Gradle yang kelompok kami gunakan adalah 8.7. 
  Untuk informasi lebih lanjut -> [Kunjungi situs Gradle](https://gradle.org/).\

* **Programming Language** : [![Java](https://img.shields.io/badge/Java-17.0.10%202024--01--16%20LTS-red)](https://www.java.com/)
  Dalam pengembangan aplikasi kalkulator ini, kami menggunakan bahasa pemrograman Java. 
  Kami memilih bahasa pemrograman ini karena memudahkan dari segi pengembangan dan fungsionalitas yang diharapkan. Banyaknya referensi yang dapat kami gunakan juga menjadi faktor untuk penentuan penggunaan bahasa pemrograman ini.
  Versi java yang kami gunakan adalah Java 17.0.10 2024-01-16 LTS. 
  Untuk informasi lebih lanjut -> [Kunjungi situs Java](https://www.java.com/) untuk informasi lebih lanjut.

* **Unit Testing** : [![JUnit Jupiter](https://img.shields.io/badge/JUnit%20Jupiter-5.9.1-green)](https://junit.org/)
  JUnit membantu kami untuk membuat test script dan menjalankan unit test dalam proyek Java Kalkulator sederhana. 
  Versi JUnit yang digunakan adalah JUnit Jupiter 5.9.1. 
  Untuk informasi lebih lanjut -> [Kunjungi situs JUnit](https://junit.org/) untuk informasi lebih lanjut.

### Method Aplikasi
Program kalkulator sederhana kelompok kami diujikan secara methode per-method dengan daftar item uji sebagai berikut:
| No. | Nama Class | Nama Method |
| :---: | :--------- | :----------- |
| 1 | Calculator | main |
|   |         | getInput|
|   |         | validateOperation |
|   |         | validateDivision |
| 2 | CalculatorOperation | calculate |
|   |         | tambah|
|   |         | kurang |
|   |         | kali |
|   |         | bagi |

## Getting Started 
### How To Use
1. Lakukan instalasi Java JDK min versi 11 atau versi terbarunya (disarankan menggunakan versi 17 atau 21) pada halaman (https://www.oracle.com/id/java/technologies/downloads/) .
2. Lakukan instalasi Gradle (disarankan menggunakan versi 8.7) pada halaman (https://gradle.org/releases/).
3. Pastikan instalasi tersebut berhasil.
4. Tambahkan Java dan Gradle dengan melakukan set environment variables pada desktop anda.
5. Pastikan Java dan Gradle dapat digunakan pada perangkat anda dengan mengetikkan 'java --version' dan 'gradle --version'.
6. Jika sudah berhasil, clone repository ini ke perangkat anda dengan cara:
```
git clone https://github.com/frddyy/SimpleCalculator.git
```
7. Open project yang telah di clone menggunakan IDE favorit Anda. Saya sarankan menggunakan Visual Studio Code agar lebih mudah.

### How To Push Your Change
Untuk melakukan push setiap kali terdapat update atau perubahan kode anda, lakukan dengan step berikut : 
*Notes* Pastikan untuk selalu menjalankan perintah 'git pull' terlebih dahulu saat ingin melakukan perubahan.

1. Tambahkan file yang telah diubah 
```
git add .
```
2. Commit file yang ditambahkan menggunakan keterangan singkat setelah command -m 
```
git commit -m "keterangan singkat terhadap perubahan anda"
```
3. Lalu push commit anda ke repository 
```
git push 
```

### Script For Run Program
```
./gradle run
```
### Script For Testing Program   
Junit
```
./gradle test
```

### Generate Report
Setelah melakukan command untuk testing program kalkulator kami, hasil dan laporan testing tersebut akan di-generate dan disimpan pada lokasi :
```
app\build\reports\tests\test\index.html atau b11.calculator.html
```

### Test Report - Testing With Gradle & JUnit
Program kalkulator kami diujikan menggunakan tools Gradle & JUnit untuk memastikan fungsionalitasnya apakah sudah baik dan berjalan sesuai dengan yang diharapkan atau tidak. 

Adapun Hasil dari pengujian sebagai berikut:

  - Jumlah Total Tests: 18
  - Successful: 18 
  - Success Rate : 100%
  - Failures : 0
  - Ignored : 0
  - Total Duration : 0.038s

![Laporan Pengujian JUnit](https://drive.google.com/uc?export=view&id=1Gr4c0-1I3ZjpeaAAWlpLmqF99gbuNvUL)

Berdasarkan keterangan dari gambar diatas, dapat disimpulkan bahwa dari 18 tests (pengujian) yang tersedia : 
- 5 Tests dari Class CalculatorOperationsTest
- 13 Test dari Class CalculatorTest 

menghasilkan hasil pengujian dimana seluruhnya dapat dijalankan secara **PASSED** dibuktikan dengan keterangan pada **success rate 100%** pada setiap Class. Rincian pengujian pada setiap Class ditunjukkan pada gambar berikut : 

![Class CalculatorTest](https://drive.google.com/uc?export=view&id=1kw2S9IfE0r90WZpCx5we8idoSJ427c6r)

![Class CalculatorOperationsTest](https://drive.google.com/uc?export=view&id=1jFfBoJmuV0WzwtHLw4doeAbMcRpjKJFU)

Adapun keterangan tambahan lainnya yaitu : 
- Total duration yang dihasilkan adalah 0.038s dengan rincian pada Class CalculatorTest 0.025s dan Class CalculatorOperationsTest 0.013s.
- 0 Failures menunjukkan bahwa tidak ada test script (unit test) yang menghasilkan hasil pengujian berupa FAIL
- 0 Ignored menunjukkan bahwa tidak ada test script (unit test) yang terlewat atau dihiraukan.

Untuk membuktikan bahwa pengujian kami mendeteksi kesalahan atau tidak, dilakukan juga pengujian pada program yang salah dengan skenario seperti berikut :
1. Pada code program bagian operasi tambah kami ubah logika perhitunganya menjadi (-) sehingga yang seharusnya penjumlahan menjadi pengurangan
2. Test Dijalankan dengan ./gradlew test
3. Hasil nya didapatkan sebagai berikut

![Test Report Mendeteksi Failed](https://drive.google.com/uc?export=view&id=1IsxxU4OeZxWZDH37_QSOSFbSlQ_eCTLE)

4. Dari 18 tests yang tersedia, terdapat 2 failures yang artinya 2 unit test menghasilkan hasil pengujian **FAILED**, sehingga success rate menurun menjadi **88% successful**
5. Adapun rincian tampilan pada masing-masing Class nya yaitu

![Class CalculatorTest](https://drive.google.com/uc?export=view&id=14ljvd1SFBGUChLxzBbot0TCE99XKS3uF)

6. Mendeteksi 1 failures dengan tingkat success rate 92% successful pada testValidOperatorAddition() - (pengujian untuk validasi operator tambah)

![Class CalculatorOperationsTest](https://drive.google.com/uc?export=view&id=1eNkUhA8ENS6ovJH2trp2rWaIAPEcBH_s)

7. Mendeteksi 1 failures dengan tingkat success rate 80% successful pada testAddition() - (pengujian untuk operasi tambah)

## Dependencies Used
Kami menambahkan beberapa dependency yang digunakan untuk menunjang kebutuhan program kami untuk dapat dijalankan dengan baik, Dependency tersebut antara lain : 
1. *testImplementation* : 'org.junit.jupiter:junit-jupiter:5.9.1'
    - Digunakan untuk melakukan pengujian (testing) dalam project kami. Dengan dependency ini kami dapat menuliskan unit test apa saja yang ingin diujikan menggunakan fitur-fitur yang disediakan oleh JUnit Jupiter
2. *implementation* : 'com.google.guava:guava:31.1-jre'
    - Digunakan oleh aplikasi kami untuk mendukung class dan utility method yang tidak tersedia dalam JDK Standar. 

