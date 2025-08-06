<font face = "new times roman" color = "red"><h3>Proje: Öğrenci Veritabnı</h3></font>

 * bir okulda kayıt işlerinden sorumlusunuz ve gelen öğrencileri kayıt edeceksiniz..
 * gelen öğrencilerden isim soyisim ve Yaş bilgileri istenmektedir.
 
 okuldaki tüplü emektara herhangi bir program kuramadığımız için bu veritabanı yapısını
 bizim oluşturmamız gerekiyor.

 <font face = "new times roman" color = "red"><h3>Gereken Şartlar:</h3></font>

 * kaydolan öğrenciler tek yönlü bağlı liste şeklinde kaydolacaklar.

 * toplam seçenekler arasında:

  önceki gördüğümüz 6 yapı karşımıza çıkacak. ->addFirst, addLast.. vs.

 * ekstra olarak listenin <mark>n. indeksinde</mark> bulunan öğrenciyi bize bulup bilgilerini yazdıran metod da bulunmalı.
 meodun ismi `find()` olsun.

 * okuldaki öğrenci mevcut sayısını dönderen metod olmalı `number()` şeklinde

 * tüm kaydolan öğrencileri gösteren `print()` metodu olmalı.

 > önceden kaydedilen toplam 5 öğrenci bulunmaktadır. En baştan en sona doğru şöyledir:

 |İsim|Soyisim|Yaş|
 |----|-------|---|
 |Abdurrahman|Malkoç|20|
 |Melike|Gündüz|18|
 |Berkan|Mutlu|16|
 |Mercan|Kaya|19|
 |Kerim|Yılmaz|21|

 * Yapıcı metoda ekleme yapabilirsiniz.

 *Ekstra bilgi*

 konsol ekranınızı renklendirmek veya biçim vermek istiyorsanız `ANSI Escape Sequences` standartı kullanabilirsiniz.

 Eclipse' de doğrudan desteklenmez ama bir `Plugin` kurularak
 konsol ekranını renklendirebiliriz.

 * Beyaz renk için: `\u001B[0m`

 **Diğer renkler:**

 |Renk | Sayı |Arka plan  için|
 |-----|------|---------------|
 |siyah|  30  |      40       |
 |kırmızı| 31 |      41       |
 |yeşil|  32  |      42       |
 |sarı|   33  |      43       |
 |mavi|   34  |      44       |
 |mor|    35  |      45       |
 |camgöbeği|36|      46       |
 |beyaz|  37  |      47       |
 |reset|   0  |               |

 Örneğin: kırmızı rengi için `\u001B[31m` olacaktır.

 * parlak renkler `90-97` arası, arka plan parlak renkler ise `100-107` arası bulunur.

 **Yazı Biçimi:**

 |Biçim|Sayı|Özelliği kaldırmak için|
 |-----|----|-----------------------|
 |kalın yazı(bold)|  1  |     21    |
 |sönük yazı (bazı terminaller destekler)|2|22|
 |italik yazı|   3   |      23      |
 |altı çizgili|  4   |      24      |
 |yanıp sönen(blink) yazı|  5  | 25 |
 |renkleri ters çevir(inverse)|7| 27|
 |görünmez yazı(conceal)| 8 |  28   |
 |üstü çizgili(strike)|  9  |  29   |

 Başarılar.

 **Hazırlayan:** Berat Kurt

 ---

 ![piglin dance](images/piglin-dance.gif)
 
  