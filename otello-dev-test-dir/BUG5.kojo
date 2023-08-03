/* Ben bilgisayara karşı Siyah'la kazandım. Hata var!
 * Hamleler:

Siyah -> Oda(0,1),
Beyaz -> Oda(2,0),
Siyah -> Oda(3,0),
Beyaz -> Oda(0,0),
Siyah -> Oda(1,0),
Beyaz -> Oda(0,2),
Siyah -> Oda(0,3),
Beyaz -> Oda(2,3),
Siyah -> Oda(2,3),
Beyaz -> Oda(3,1),
Siyah -> Oda(3,1),
Siyah -> Oda(3,3),
Siyah -> Oda(3,2),
S S S S
S S S S
S B S S
B B B S
Oyun bitti.
Beyazlar: 4
Siyahlar: 12

 * Full log:
Yeni oyun:
. . . .
. S B .
. B S .
. . . .
Hamle 1 S 2x1:
. . . .
. S B .
. S S .
. S . .
Vector((1x1,-2), (3x1,-6), (1x3,-10))
Alfa-beta DehadanÇok arama 0.083 saniye sürdü.
sayaç=5062 Beyaz -> Oda(2,0),
Hamle 2 B 1x3:
. . . .
B B B .
. S S .
. S . .
Hamle 3 S 1x4:
S . . .
B S B .
. S S .
. S . .
Vector((1x1,0), (3x1,0))
Alfa-beta DehadanÇok arama 0.017 saniye sürdü.
sayaç=540 Beyaz -> Oda(0,0),
Hamle 4 B 1x1:
S . . .
B S B .
. B S .
B S . .
Hamle 5 S 1x2:
S . . .
S S B .
S S S .
B S . .
Tek hamle var: (3x1,0)
Alfa-beta DehadanÇok arama 0.000 saniye sürdü.
sayaç=0 Beyaz -> Oda(0,2),
Hamle 6 B 3x1:
S . . .
S S B .
S S B .
B B B .
Hamle 7 S 4x1:
S . . .
S S B .
S S S .
B B B S
Vector((4x3,0), (2x4,2))
Alfa-beta DehadanÇok arama 0.002 saniye sürdü.
sayaç=39 Beyaz -> Oda(2,3),
Hamle 8 B 4x3:
S . . .
S S B B
S S B .
B B B S
Hamle 9 S 4x2:
S . . .
S S B B
S S S S
B B B S
Tek hamle var: (2x4,-2)
Alfa-beta DehadanÇok arama 0.000 saniye sürdü.
sayaç=0 Beyaz -> Oda(3,1),
Hamle 10 B 2x4:
S B . .
S B B B
S B S S
B B B S
Hamle 11 S 4x4:
S B . S
S B B S
S B S S
B B B S
Yasal hamle yok. Sıra yine siyahın
Hamle 12 S 3x4:
S S S S
S S S S
S B S S
B B B S
Oyun bitti.
Beyazlar: 4
Siyahlar: 12
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
