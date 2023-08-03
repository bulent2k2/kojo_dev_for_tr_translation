/* Ben bilgisayara karşı Siyah'la kazandım. Hata var!
 * Hamleler:

Siyah -> Oda(0,1),
Beyaz -> Oda(0,2),
Siyah -> Oda(0,3),
Beyaz -> Oda(2,0),
Siyah -> Oda(3,0),
Beyaz -> Oda(0,0),
Siyah -> Oda(1,0),
Beyaz -> Oda(3,3),

Hamle 2 B 3x1:
. . . .
. S B .
. S B .
. S B .
Hamle 3 S 4x1:
. . . .
. S B .
. S S .
. S S S
Vector((1x1,-4), (1x3,-13))
Alfa-beta DehadanÇok arama 0.079 saniye sürdü.
sayaç=618 Beyaz -> Oda(2,0),
Hamle 4 B 1x3:
. . . .
B B B .
. S S .
. S S S
Hamle 5 S 1x4:
S . . .
B S B .
. S S .
. S S S
Tek hamle var: (1x1,2)
Alfa-beta DehadanÇok arama 0.001 saniye sürdü.
sayaç=0 Beyaz -> Oda(0,0),
Hamle 6 B 1x1:
S . . .
B S B .
. B S .
B S S S
Hamle 7 S 1x2:
S . . .
S S B .
S S S .
B S S S
Yasal hamle yok. Sıra yine siyahın
Hamle 8 S 4x4:
S . . S
S S S .
S S S .
B S S S
Oyun bitti.
Beyazlar: 1
Siyahlar: 11

 */
//#yükle tr/anaTanimlar
//#yükle tr/eTahta
//#yükle tr/araYuz
//#yükle tr/alfabeta

çıktıyıSil
val çeşni = 0 // ya da 1
val odaSayısı = 4 // 4 // 6 // 8
val kimBaşlar = Siyah // Beyaz ya da Siyah başlayabilir. Seç :-)
val bilgisayar = Beyaz // Siyah ya da Beyaz oynar ya da Yok (yani oynamaz)

val tahta = new ETahta(odaSayısı, kimBaşlar, çeşni)
val bellek = new Bellek(tahta)
val düzey = Deha // Doktor // Usta // Kalfa // Çırak // Deha
//ABa.ustalık(düzey)
ABa.aramaDerinliğiSınırı = 13
ABa.hamleSayısıÜstSınırı = 1000000
// tümEkran()
val araYüz = new Arayüz(tahta, bellek, bilgisayar)
// 1) istersen bilgisayar çabucak bir oyunla başlayabilir
// araYüz.özdevin(0.02)

// 2) Burada ise daha ciddi bir bilgisayar motorunu kullanıyoruz.
// Epey çok zaman alıyor. Hamle başına 1, 3, 5 hatta 10 saniyeden çok bile
// sürebilir. Hızlandırmak için Usta yerine Er, Çırak ya da Kalfa kurabilirsin:
/*
zamanTut(s"$odaSayısı x $odaSayısı ustalık: $düzey") {
    araYüz.özdevinimliOyun(araYüz.abArama, 0.1)
}("sürdü")
*/
