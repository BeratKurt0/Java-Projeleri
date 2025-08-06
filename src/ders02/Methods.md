
  <font face="new times roman" color="red"><h2>1. Node(düğüm):</h2></font>

  * verileri tutan ve kendinen sonraki düğüme işaretleme yapacak olan nesnelere, yani `bağlı liste elemanı`na denir.

  * her bir düğüm, içerisinde <mark>veri</mark> ve <mark>gösterici</mark> tutar.

  * Düğüm içerisinde constructor(yapıcı) metod bulunur.

  * Kendinden sonraki işaretçi değeri varsayılan olarak `null` seçilir.

---

```java
public class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        next = null;
    }
}
```

Şeklinde olur.

<font face="new times roman" color="red" ><h2>2. Liste Sınıfı:</h2></font>

Liste sınıfı içerisinde bulunan metodlar sayesinde bir Liste nesnesi oluşturup, metodlar aracılığı ile :

`ekleme`, `çıkarma`, `liste verilerini ekrana yazdırma` vs.
işlemleri yapılabilir.

<font face="chinese rocks" size="6px" color="pink"><h4>head (baş düğüm):</h4></font>

* Bağlı listeye eklenen *ilk düğümü* tanımlar ve eklenecek olan düğer tüm düğümler, **baş düğüm esas alınarak** sonraki düğümlere <u>eklenir</u>. 

* Baş düğüm çok önemlidir, baş düğüm kaybolursa Liste de kaybolmuş olur. İşlemler baş düğüm üzerinden yürütülür,
`bağlı listenin temelidir`.

* Liste ilk tanımlandığında, baş düğüm varsayılan olarak `null` değerliklidir.

```java
public class List {
    Node head;
    List() {
        this.head = null;
    }

}
```

Şeklinde olur.

> baş düğüm -veri gizliliği ve güvenliği açısından- genellikle <font color="yellow"><u>private</u></font> olarak tanımlanır.

----
<font face="chinese rocks" size="6px" color="pink"><h4>Düğüm oluşturma - Obj( ) metodu:</h4></font>

* ekleme işlemleri için bu metod `düğüm` oluşturur.

* değer döndüren bir metod oluşturacağımız için dönüş tipi `Node` türünden olmalıdır.

* eklenecek olan veriyi içerisine `parametre` olarak alır.

```java
public class List {

    Node obj(int data) {
        Node eleman = new Node(data);
        return eleman;
    }

}
```

<font face="chinese rocks" size="6px" color="pink"><h4>temp (dolaşım düğümü):</h4></font>

* ekleme, çıkarma, yazdırma, veya n. sıradaki düğümü tutma gibi tüm özellikler temp düğümüne geçici süreliğine atanır.

* temp olmazsa olmaz bir yapıdır.

<font face="chinese rocks" size="6px" color="pink"><h4>Düğüm ekleme metodu:</h4></font>

* Bu metod her çalıştığında listemize düğüm eklemesi yapacak. 

* Ekleme işlemi hep `son sıraya doğru` gerçekleşecek.

>Dikkat:

* eğer liste `boşsa` -düğüm yoksa- baş düğüm veri tutacak,

* eğer liste `boş değilse` -yani en az bir düğüm varsa- <font color= "purple"><u>temp</u></font> 
kullanılarak son düğüm bulunacak ve sağına ekleme yapılacak.

```java
public class List {
    void sonaEkle(int data) {
        if(head == null) {
            head = obj(data);
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = obj(data);
            System.out.println("Listenin sonuna düğüm eklendi.");
        }
    }
}
```
kaynak kodlarına bknz.

**Hazırlayan:** Berat Kurt


 