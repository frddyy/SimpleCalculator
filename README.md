# SimpleCalculator
Simple Calculator merupakan sebuah program kalkulator sederhana yang memungkinkan pengguna untuk melakukan operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian berdasarkan dua buah operand yang diinputkan user. Dengan antarmuka yang mudah digunakan, pengguna dapat dengan cepat memasukkan operand dan memilih operator yang ingin dikalkulasikan. Aplikasi ini juga dilengkapi dengan proses validasi untuk memastikan keakuratan perhitungan yang baik.


## Author 
* Aini Diah Rahmawati [211524033]
* Ghessa Theniana - [211524042]
* Mochamad Ferdy Fauzan - [211524049]

## Tools 
* [![Gradle](https://img.shields.io/badge/Gradle-8.7-blue)](https://gradle.org/)
  Kami menggunakan Tools Gradle untuk mengelola proyek Java kami secara lebih efisien. 
  Versi Gradle yang kelompok kami gunakan adalah 8.7. 
  Untuk informasi lebih lanjut -> [Kunjungi situs Gradle](https://gradle.org/).\

* [![Java](https://img.shields.io/badge/Java-17.0.10%202024--01--16%20LTS-red)](https://www.java.com/)
  Dalam pengembangan aplikasi kalkulator ini, kami menggunakan bahasa pemrograman Java. 
  Kami memilih bahasa pemrograman ini karena memudahkan dari segi pengembangan dan fungsionalitas yang diharapkan. Banyaknya referensi yang dapat kami gunakan juga menjadi faktor untuk penentuan penggunaan bahasa pemrograman ini.
  Versi java yang kami gunakan adalah Java 17.0.10 2024-01-16 LTS. 
  Untuk informasi lebih lanjut -> [Kunjungi situs Java](https://www.java.com/) untuk informasi lebih lanjut.

* [![JUnit Jupiter](https://img.shields.io/badge/JUnit%20Jupiter-5.9.1-green)](https://junit.org/)
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
1. Lakukan instalasi Java JDK versi 17 atau versi terbarunya.
2. Pastikan instalasi tersebut berhasil dan dapat digunakan pada perangkat anda.
3. Clone repository ini ke perangkat anda dengan cara:
```
git clone https://github.com/frddyy/SimpleCalculator.git
```
5. Open project yang telah di clone menggunakan IDE favorit Anda. Saya sarankan menggunakan Visual Studio Code agar lebih mudah.
   
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
Test Report With JUnit:
```
app\build\reports\tests\test\index.html
```

### Test Report - Testing With JUnit
- Program kalkulator kami diujikan menggunakan tools JUnit untuk memastikan fungsionalitasnya apakah sudah baik dan berjalan sesuai dengan yang diharapkan atau tidak. 
```
AdapunHasil dari pengujian sebagai berikut:
```
  - Jumlah Total Tests: 18
  - Successful: 18 
  - Success Rate : 100%
  - Failures : 0
  - Ignored : 0
  - Total Duration : 0.038s

![Laporan Pengujian JUnit](https://drive.google.com/file/d/1msJp6JQSRwXCq__KzydalcFOKy79ytHC/view?usp=drive_link)

## Dependencies Used
Kami menambahkan beberapa dependency yang digunakan untuk menunjang kebutuhan program kami untuk dapat dijalankan dengan baik, Dependency tersebut antara lain : 
1. *testImplementation* : 'org.junit.jupiter:junit-jupiter:5.9.1'
    - Digunakan untuk melakukan pengujian (testing) dalam project kami. Dengan dependency ini kami dapat menuliskan unit test apa saja yang ingin diujikan menggunakan fitur-fitur yang disediakan oleh JUnit Jupiter
2. *implementation* : 'com.google.guava:guava:31.1-jre'
    - Digunakan oleh aplikasi kami untuk mendukung class dan utility method yang tidak tersedia dalam JDK Standar. 

