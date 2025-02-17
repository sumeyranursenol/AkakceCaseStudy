# AkakceCaseStudy
---
1. Manuel Test Case Çalışması
Takip listem sayfasındaki manuel functional örnek test case’lerini çıkarınız.
Link: https://www.akakce.com/akakcem/takip-listem/
---
2. Test Otomasyonu – UI
• Kullanıcı akakce.com sitesine giriş yapar.
• Kullanıcı arama işlemi yapar (Örnek: “iphone” gibi popüler ve yorumu olan bir ürün)
• Kullanıcı arama sonucunda gelen ürün listesinden ürün seçer ve ürüne git seçeneğine
tıklar.
• Kullanıcı ürünü takip listesine ekler.(Belki arttırabiliriz)
---
3. Test Otomasyonu – API
Aşağıdaki linki kullanarak otel rezervasyon için postman kullanarak api testlerini
gerçekleştiriniz. http://restful-booker.herokuapp.com/apidoc/index.html
1. Dokümantasyondaki tüm çağrıları gerçekleştiriniz.
2. Her çağrı için en az 1 adet test yazınız.
---
4. Bug Raporlama
Akakce.com sitesinde gördüğünüz 3 adet bug bulunuz.
---
5. API Testi için Rest Assured Test otomasyonu
Test edeceğiniz JSON çıktısını sağlamak için
[JSONPlaceholder](https://jsonplaceholder.typicode.com/) sitesindeki `/posts` endpoint'ini
kullanabilirsiniz. Bu endpoint, bir blog gönderileri listesini JSON formatında dönecektir.
Aşağıdaki test senaryolarını REST Assured kullanarak gerçekleştirmenizi rica ediyoruz:
- **Status Code Testi:** API'nin başarılı bir şekilde `200 OK` durum kodu döndürüp
döndürmediğini kontrol edin.
- **JSON Yapısı Doğrulama:** JSON çıktısının bir dizi (array) içerdiğini ve her bir gönderinin belirli
alanlara (örneğin, `userId`, `id`, `title`, `body`) sahip olduğunu doğrulayın.
- **Belirli Bir Değerin Doğrulanması:** Örneğin, `id` değeri `1` olan gönderinin `title` değerini
doğrulayın.
- **Liste Uzunluğu Kontrolü:** JSON dizisinin en az 10 öğe içerdiğini doğrulayın.
- **Dinamik Veri Kontrolleri:** `userId` alanlarının pozitif tamsayılar olduğunu doğrulayın.
