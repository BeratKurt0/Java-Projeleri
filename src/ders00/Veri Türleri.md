>Veri türerini üç başlık altında inceleyebiliriz.

## 1. Temel(ilkel) Veri Türleri:

* Temel ve basit düzeyde bulunan verilere denir.

* Basit düzeyde bulunan verileri işlemek veya bellekte tutmak için sıkça kullanılır.

* Temel veriler `değişkenler` aracılığı ile
bellek hücrelerinde tutulur. Veriye, değişken üzerinden direkt erişim sağlanır.

* Hızlı işlem görürler. Ram'de
<abrr title="Ram'de bulunan ve hızlı erişim sağlanan bellek bölgesidir"><u>`Stack`</u></abrr> bellekte tutulur.

**Java da:**

```java
class TemelVeri{
    public static void main(String[] args){
        int x1 =5;
        double x2 =9.25;
        boolean x3 =false;
        System.out.println("x1 değeri: "+x1+", x2 değeri: "+x2+", x3 değeri: "+x3);
    }
}

```

* dikkat ettiğiniz üzere erişimi direkt <u>değişken</u> üzerinden gerçekleştirdik.

![ilkel veri](images/ilkel%20veri.png)

---

## 2. Basit Veri Türleri:

* temel verilerin oluşturduğu ufak `veri gruplarına` denir.

* Belli düzeyde bulunan veri grubunu oluşturmak, işlemek veya saklamak için kullanılır.

* İlkel veri türlerinden oluşurlar ve ilkel veri türlerine göre çok kullanışlıdırlar.

* `Diziler(Array)`, `Yapılar(Struct)`, `enum` örnek olarak gösterilebilir.

* erişim `referans` veya `indeks` ile yapılır.

* <abrr title="Ram'de bulunan ve biraz yavaş erişim sağlanan bellek bölgesidir."><u>`Heap`</u></abrr>
bellekte tutulurlar.

**Java'da:**

```java

class BasitVeri{
    public static void main(String[] args){
        int yaşDeğeri[]= {15,12,17};

        System.out.println("1. kişinin yaşı: "+yaşDeğeri[0]);
        System.out.println("2. kişinin yaşı: "+yaşDeğeri[1]);
        System.out.println("3. kişinin yaşı: "+yaşDeğeri[2]);
    }
}

```
---

**C++'da:**

```c++

#include<iostream>
using namespace std;
struct Login{
string isim;
string mail;
};

int main(){
    Login L1;
    Login L2;
    L1.isim="Berat";
    L1.mail="beratkurt@gmail.com";
    L2.isim="Hakan";
    L2.mail="hakanyilmaz@gmail.com";

    cout<<"1. kullanicinin ismi: "<<L1.isim<<endl;
    cout<<"1. kullanicinin maili: "<<L1.mail<<endl;
    cout<<"-----------------------"<<endl;
    cout<<"2. kullanicinin ismi: "<<L2.isim<<endl;
    cout<<"2. kullanicinin maili: "<<L2.mail<<endl;
    return 0;
}

```
* erişim `indeks` veya `referans` ile yapılabilir.

![basit veri](images/basit%20veri.png)

---

## 3. Bileşik Veri Türleri:

* `Nesne`lerin oluşturduğu verilere denir ve En karmaşık veri türüdür.

* Nesne içerisinde temel veri, basit veri ve metodlar olabilir.

* Nesnelerin içeriğine <abrr title="Nesnelerin veya yapıların tutulduğu bellek adresi değerini tutan değişken."><u>`referans`</u></abrr> yolu ile ulaşılır.

* referanslar `stack` bellekte, Nesneler `Heap` bellekte tutulur.

---

```java

class Main{
    public static void main(String[] args){
        Kullanıcı kullanıcı1 = new Kullanıcı("Berat","Kurt","beratkurt123@gmail.com");
        Kullanıcı kullanıcı2 = new Kullanıcı("Hakan","Yılmaz","hakanyilmaz123@gmail.com");
        kullanıcı1.oturum();
        kullanıcı2.oturun();
    }
}

class Kullanıcı{
    String isim;
    String soyisim;
    String mail;

    Kullanıcı(String isim, String soyisim, String mail){
        this.isim=isim;
        this.soyisim=soyisim;
        this.mail=mail;
    }

    void oturum(){
        System.out.println("----- Bilgiler -----\n");
        System.out.println("İsim: "+ isim);
        System.out.println("Soyisim: "+ soyisim);
        System.out.println("E-Mail: "+ mail + "\n");
        System.out.println("--------------------");
    }

}

```

---

>Örnek olarak:

* Linked List(Bağlı Liste), Stack(yığıt), Queue(kuyruk), Trees(Ağaçlar)

örnek olarak verilebilir.

![bileşik veri](images/bileşik%20veri.png)

* Veri yapıları dersimizde Özellikle karmaşık veri türleri üzerinden 
algoritma ve yapılar kuracağız.

**Hazırlayan:** Berat Kurt
