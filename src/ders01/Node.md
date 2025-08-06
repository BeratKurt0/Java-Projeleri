**CİDDİ BİR PROBLEMİ ORTADAN KALDIRDIK:**

 <u> neydi o problem ?</u>

 * Veri yapısı oluşturmak istediğimizde `düğümler` bize gerekli olacak. 

 * Yani düğümleri kullanabilmek için her düğüm için bir sınıf oluşturduk ve bize sorun oldu.
 
 * `Tek düğüm` kurduk ve gösterici sorununu ortadan kaldırdık.
 
  <h5>AMA BİR SORUN DAHA VAR:</h5>

 * Fazla miktarda referans açıldı.
 
 * 4 tane veri için 4 referans açılırsa 100 veya daha sonrası için uzun şekilde referans tanımlaması
 yapılamaz.

 * İşte bunu bir `metod` haline (otomatiğe) çevirmemiz gerekiyor.
   
 * Tam bu noktada <u><font face="new times roman" size="5px" color="green">veri yapıları</font></u> devreye giriyor

 * Düğüm, ref işlemleri `Abstact` edilir.(Soyutlanır.)

 * Ekleme, silme, veri arama gibi metodlar; veri yapısına <mark>fonksiyonellik</mark> katar.

 * veri yapıları hız ve zaman kazandırır. JCF kütüphaneleri ile modüler bir yapı kazandırılır.

 * Ve daha sayamayacağımız birçok özellik veri yapılarında mevcuttur.

 > Diğer dersimizde `tek yönlü doğrusal bağlı liste` kavramını öğreneceğiz.

 **Hazırlayan:** Berat Kurt