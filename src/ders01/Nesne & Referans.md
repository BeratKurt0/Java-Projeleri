>Basit bir bağlı liste yapısına göz atmadan önce...

<font face="new times roman"><h2>Nesne Nasıl oluşturulur ?</h3></font>

* nesne türetmek için `new` anahtar sözcüğü kullanılır.

* `new + sinif_ismi(yapici_metod);`  şeklinde tanımlanır.

Örneğin:

```java
new Listeler();
```

---

* bellekte <u>Listeler</u> isminde nesne için alan tahsis etti.
('Listeler' nesnesinin verileri tutuluyor.)

* parantezler `yapıcı method (Constructor)` 'u gösterir.

* referans ile bellekte oluşturulan nesneye erişim sağlanmalıdır. 

* Bir nesneye işaret eden `referans`, doğrudan veya dolaylı olarak bulunmazsa nesne bellekten silinir. (Garbage collector.)

<font face="new times roman" color="green"><h2>Referans Tanımlama:</h3></font>

* Referanslar `sınıf ismiyle` tanımlanır ve nesnenin veya `ilişkili olduğu diğer nesnelerin` verileri ile ilişkili olur.

* ilişkili olmayan bir referans ile nesneye ulaşım sağlanamaz.

* `sınıf_ismi + ref_ismi ;` şeklinde tanımlanır.

```java

Listeler liste;
```

---

* yani `liste` ismindeki referans, `Listeler` sınıfı türündendir.

* Referans, nesneyi işaret edecek şekilde konumlanmalıdır.

*Bu iki bilgiyi birleştirirsek:*

```java
Listeler liste =new Listeler();
```

>şeklinde yapı oluşur ve `sınıftan nesne` türetilmiş olur.

* Nesnenin verilerinin değerlerini değiştirmek için gösterici
(referans) üzerinden gidebiliriz.

<font color="red" face="new times roman" size="14px"><h4>Ulaşım Sağlama:</h4></font>

---

* Ulaşım `.` nokta eki ile sağlanır.

örneğin:

```java
public class Main{
    public static void main(String[] args){

        Geometri sekil1=new Geometri("kare");
        Geometri sekil2=new Geometri("cember");
        Geometri sekil3=new Geometri("ucgen");
        sekil1.sekilCiz();  //Kare çiziliyor...
        sekil2.sekilCiz();  //Çembeer çiziliyor...
        sekil3.sekilCiz();  //Şekil tanımlanamadı...
    }
}
class Geometri{
    String sekil;
    
    public Geometri(String sekil){
        this.sekil=sekil;
    }

    void sekilCiz(){
        if(this.sekil.equals("kare")){
            System.out.println("Kare çiziliyor...");
        }
        else if(this.sekil.equals("cember")){
            System.out.println("Çember çiziliyor...");
        }
        else{
            System.out.println("Şekil tanımlanamadı...");
        }
        
    }
}
```

---

***UYARI:***

* referans bir nesneyi işaret etmiyorsa `null` değerlidir. null referans üzerinden yine veriye ulaşılamaz. [Nesneye işaret etmelidir.]

* null değerlikli referans üzerinden veriye erişim `NullPointerException` hatası verir.

>Beraber birkaç yapı oluşturalım.

<mark><u>Örnek Kodlara bakmayı unutmayın..</u></mark>

***Hazırlayan:*** Berat Kurt






