>Önceki konularda:
>ekrana yazdırma, sona ekleme, sondan çıkarma işlemlerini gördük.

<font face="new times roman" color="red"><h3>Başa Ekleme/Silme İşlemleri:</h3></font>

---

* önceki gördüğümüz konular üzerinde biraz daha metod ekleyip listeyi <mark>geliştireceğiz.</mark>

<font face="Minecraft" color="red"><h3>Basa Ekleme:</h3></font>

* liste boşsa --> normal ekleme işlemi yapılır. 

* liste boş değilse:

1. Geçici düğüm `temp` tanımlanır.
2. `temp.next = head;` işlemi yapılır.
3. `head = temp;` işlemi yapılır.

---

**Görsel olarak da:**

![başa ekle](images/başa%20ekle.png)

Şeklinde oluşturulur.


---

<font face="Minecraft" color="red"><h3>Bastan Sil:</h3></font>

* liste boşsa --> düğüm <u>çıkarılamaz.</u>

* listede <mark>yanlız bir düğüm</mark> varsa --> `head = null` yazılır.

* listede birden fazla düğüm varsa:

1. `Node temp = head.next` yazılır.
2. `head.next = null` yazılır. Daha sonra,
3. `head = temp` yazılır.

---

**Görsel olarak da:**

![baştan çıkar](images/baştan%20çıkar.png)

Şeklinde oluşturulur.

Bir sonraki derste önemli bir örnek işleyeceğiz. Sonra da 
<mark>araya düğüm ekleme-çıkarma</mark> işlemlerine göz atacağız.

**Hazırlayan:** Berat Kurt