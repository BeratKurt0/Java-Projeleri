> Önceki derste veri türlerini işlemiştik.
>ilerideki konuları daha rahat anlamak için sağlam bir temel attık.

* Beraber liste kavramını işleyelim.

<font face="new times roman" color="gray" size="25px"><h2> Liste Nedir : </h2></font>

* Birbiriyle `mantıksal ilişki` içerisinde bulunan öğelere denir.

* <u>Market listesi</u>, <u>bir otobüsteki yolcular listesi</u> vs. örnek olarak verilebilir.

![liste](images/liste.png)

---

**Liste, Java'da iki başlık altında incelenir:**

<font face = "chinese rocks" color="red" size="25px"><h3> Doğrusal Liste:</h3></font>

* `Diziler`in oluşturduğu yapıya denir.

* Dizilerde veriler tek tipte olur ve peşpeşe dizilirler.

* Dizi boyutu önceden belirlenir ve <mark>statiktir</mark>.

* sonradan eleman eklemek veya çıkarmak işleri karmaşıklaştırır.

* Doğrusal liste, dinamik bellek özelliğini sağlamadığı için veritabanı işlemlerinde
sürdürülebilir değildir.

![doğrusal liste](images/doğrusal%20liste.png)

---

<font face="chinese rocks" color = "red" size="25px"><h3> Bağlı Liste: </h3></font>

* `Nesneler`in oluşturduğu yapıya denir.

* Verilerin `birbirini gösterecek` şekilde dizilerek oluşturduğu yapıya denir. 

* her bir elemana `Düğüm (Node)` denir ve her bir <u>düğüm bir nesneye</u> karşılık gelir.

* Düğümler `Veri + Link` biçiminde hareket eder. Yani düğümler, bellekte rastgele dizilir
ve her bir link kendinden bir sonraki düğümü tutar.

* En son düğüm nesneye işaret etmez. (null.)

* Düğümler bellekte <mark>dinamik</mark> olarak davranır. Ekleme vaya silme işleminde yapı bozulmaz.

* Bağlı liste, dinamik bellek özelliğini sağladığı için veritabanı işlemlerinde
sürdürülebilir özelliktedir.


![bağlı liste](images/bağlı%20liste.png)

---

### Doğrusal Liste için:

|+ 'lar | - 'ler|
|-------|-------|
|Herhangi bir elemana kolayca ve hızlı bir biçimde ulaşabiliriz. (1. elemana da 1000. elemana da aynı birim sürede ulaşılır.) |  Geçersiz indeks değeri girilirse `java.lang.ArrayIndexOutOfBoundsException` hatası fırlatır.
|İşlemci ve bellek açısından gayet uygundur.|Eleman ekleme veya çıkarma işlemi için uygun yapıda değildir.
||Bellekte statik olarak kaldığı için bellek israfına yol açar.|

### Bağlı Liste için:

|+ 'lar|- 'ler|
|------|------|
|Gayet esneklik sağlar. (Veri çeşitlerini tutabilme )|Değer okumada işlemci yorulur.|
|Dinamik yapıdadır.|Karmaşık algoritmalara sahiptir.|

---

![spiderman](images/SPİDERMAN.jpg)

---
<font face="new times roman"><h4> Bağlı listeler temelde 4 tanedir: </h4></font>

- Tek yönlü doğrusal bağlı liste `(TYDoBL)`
- Çift yönlü doğrusal bağlı liste `(ÇYDoBL)`
- Tek yönlü dairesel bağlı liste `(TYDaBL)`
- Çifte yönlü dairesel bağlı liste `(ÇYDaBL)`

> Bu dersin devamında `Nesneleri Bağlama` kavramına değinip algoritmasını yazacağız.

> Diğer ders `tek yönlü doğrusal bağlı liste` kavramına değinip yine algoritmasını yazaağız.

**Hazırlayan:** Berat Kurt