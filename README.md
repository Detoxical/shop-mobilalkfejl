# Clothing shop !! OLVASS EL LÉGYSZI !!

A projekt outdated dependencyket, android gradle plugint és egyebeket használ, pontosan olyan verziók vannak mint a youtubeos playlistbe is van, Pixel 2 API 32-n futtattam. Nálam minden működik és fordul, DE HA valamiért neked nem működik az apk vagy android studioban sem fordul le a projekt légy szíves ne 0 pontot adj hanem vegyél fel discordon és segítek beüzemelni vagy valami megoldást találunk, felh. nevem: detoxical

A firebases google-services.json-t benne hagytam a projektben, nem kell semmit csinálnod.

Hogy megkönnyítsem az értékelést leírom ide pontokba, hogy miket csináltam meg és hol vannak a kódban:

- Firebase autentikáció
    - src/main/java/com.example.shop/MainActivity, RegisterActivity
- Adatmodell
    - src/main/java/com.example.shop/ShopProduct, ShopProductAdapter
- 3 különböző activity
    - src/main/java/com.example.shop/MainActivity, RegisterActivity, ShopListActivity
- Beviteli mezők típusa mindenhol megfelelő
- Constraint Layout, Relative layout, Frame layout
    - src/main/res/layout/activity_main.xml
    - src/main/res/layout/activity_register.xml
    - src/main/res/layout/custom_menu_item.xml
- Reszponzív kellene legyen, nem bomlik szét semmi forgatásnál sem
- Animációk
    - src/main/java/com.example.shop/MainActivity 42. sor (Loginnál a gombok)
    - src/main/java/com.example.shop/ShopProductAdapter 50. sor (Shoppingolásnál a productok)
- Minden activity elérhető intentekkel
- Notification
    - src/main/java/com.example.shop/NotificationHandler
- CRUD-ből csak CRD van
    - src/main/java/com.example.shop/ShopListActivity

Képek forrása:

- https://www.zalando.hu
