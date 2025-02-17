Feature: Test Otomasyonu
  Scenario: Kullanıcı arama yapar ve ürün takip listesine ekler
    Given Kullanıcı akakce.com sitesine giriş yapar
    When Kullanıcı "iphone" ürününü arar
    And Kullanıcı ürünü seçer
    Then Kullanıcı ürünü takip listesine ekler