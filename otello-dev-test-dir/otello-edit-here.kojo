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
