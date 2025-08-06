<font face="new times roman" size="15px"><h3>Neler Öğrendik ?</h3></font>
 
 * Bağlı listelerdeki düğümlerin birbirinin `adreslerini` gösterecek şekilde dizildiğini,
 
 * Her bir elemanın `düğüm` olup ve düğümün de bir nesne olduğunu,

 * Bir nesnenin sınıf adıyla beraber kullanıldığını,

 * Bağlama işlemi için mevcut nesnenin `next` göstericisinin ,kendinden bir sonraki `sınıfın türünden` olması gerektiğini öğrendik.
  
 **ÖNEMLİ BİR PROBLEM ORTAYA ÇIKIYOR:**
  
 * Diyelim ki 100 tane farklı düğümümüz olursa  bu düğümleri meydana getiren sınıfları  oluşturup hepsinin referanslarını teker teker ayarlamak gerekecek ve bu acayip zahmet alacak.

>Demek istediğim:

* Önceki örnekte görüldüğü üzere bir düğümü diğeri ile bağlarken gösterici olarak `sonraki düğümün türünden`bir gösterici yaptım.

* Şimdi <u>sayılamayacak</u> derece düğümüm varsa bunları nasıl dizeceğim ?

* ->düğümleri teker teker sonraki düğüm türünden yazmak yerine ne yapabilirim ??

<mark><u>bu problemin çözümü için aşağıdaki yöntem kullanılır.</u></mark>

**DEVRİM NİTELİĞİNDE FİKİR:**
 
* İşte bu durumda `tek bir sınıf` tanımlanır. Her bir düğüm için tek bir sınıf üzerinden nesne türetilir. 
 
* Sürekli olarak nesne türeteceğim sınıf içerisinde 
sonraki düğümü hep `kendi türünden` olacak.(Devrimsel fikir.)

* [doğal olarak sonraki düğümün ref. türünü belirlemek için endişe etmeye gerek kalmayacak.

* Çünkü Her bir düğüm tek sınıftan türetilmiştir.]
 
* özellikle bu düğümün sonraki göstericisi kendi türünden olduğu için ciddi derecede kolaylık sağlayacak.

* yani `bir sınıf,çoklu nesne` ; dolayısıyla çoklu düğüm demektir.
 
* Sonraki göstericisi hep kendi türünden olacak. 
 
* Bu bahtettiğimiz fikir doğrultusunda artık düğüm sayısı ile ilgili bir sınırlama kalmayacak.
 
> Daha rahat anlayabilmek için bir örnek yapalım...
  
sorumuz, 

* bir sınıfta a,b,c,d ve e öğrencileri bulunmaktadır.
* Bu öğrencilerden 1 ile 10 arasında sayı tutması isteniyor.
* a öğrencisi tuttuğu sayıyı, yanlız b öğrencisine söylüyor.
* b öğrencisi tuttuğu sayıyı, yanlız c öğrencisine söylüyor.
* bu biçimde `e` öğrencisinde kadar geliyorlar.

e öğrencisinin tuttuğu sayıyı, a öğrencisini kullanarak bulan veri yapısını oluşturunuz ?

>oluşturalım.. Kaynak kodlarına bknz.

**Hazırlayan:** Berat Kurt

---