# Cucumber Test Otomasyon Projesi

## 📌 Doküman Hakkında
Bu doküman, **Davranış Odaklı Geliştirme (BDD)** yaklaşımını kullanarak test otomasyonu sağlamak için oluşturulmuş bir **Cucumber tabanlı Test Otomasyon Çerçevesidir**. **Gherkin** dilinde senaryolar yazarak testleri daha anlaşılır ve yönetilebilir hale getirir. Bu dokümanı hazırlama sürecimdeki asıl amaç BDD yaklaşımı üzerine içerik oluşturmaktır ve bu sayede süreç içerisinde kendimi geliştirmektir.

## 🛠️ Kullanılan Teknolojiler
- **Programlama Dili**: Java
- **Test Çerçevesi**: Cucumber
- **Bağımlılık Yönetimi**: Maven/Gradle
- **Otomasyon Kütüphanesi**: Selenium WebDriver
- **Raporlama**: Extent Reports / Cucumber Reports
- **Geliştirme Ortamı**: IntelliJ IDEA

## 📂 Proje Yapısı
```
├── src
│   ├── main
│   │   ├── java (Gerekirse uygulama kodları burada yer alabilir)
│   ├── test
│   │   ├── java
│   │   │   ├── stepdefinitions  # Cucumber adım tanımlamaları
│   │   │   ├── runners          # Cucumber test çalıştırıcısı
│   │   ├── resources
│   │   │   ├── features        # Gherkin dilinde yazılmış test senaryoları
│   │   │   ├── config          # Konfigürasyon dosyaları (örneğin: properties dosyaları)
├── pom.xml (Maven bağımlılıkları için kullanıyoruz)
├── README.md
```

## 📖 Feature Dosyaları Nasıl Yazılır?
Feature dosyaları, `src/test/resources/features/` dizini altında **Gherkin** sözdizimi ile yazılır:
```gherkin
Feature: Login page Automation of Sauce Demo App
  Scenario:  Check login is successful with valid creds
    Given User is on login page
    When User enters valid username and password
    And Clicks on Login Button
    Then User is navigated to Home Page
    And Close the browser
```

## 📖 Sonuçlar

🚀 Kullanmış olduğumuz Intellij IDE üzerinde, projemizi çalıştırdığımızda, karşımıza çıkan başarılı sonuçlarımızı bu şekilde görebiliyoruz.

![image](https://github.com/user-attachments/assets/cac98262-adb7-4c46-bc43-510754fda69c)


🚀 Oluşturduğumuz "cucumber-reports.html" dosyası ile projemizi çalıştırdığımızda aldığımız sonuçları web üzerinden görüntüleyebiliyoruz.

![image](https://github.com/user-attachments/assets/4796b7c9-687e-45e7-adf4-d2ad14e7e56e)

