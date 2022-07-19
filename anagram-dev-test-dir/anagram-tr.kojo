// #yükle tr/sozcuk-dizinini-yukle
// Yazar: Bulent Basaran
type Sözcük = Yazı
type Tümce = Dizin[Sözcük]
type HarfSayıları = Dizin[(Harf, Sayı)]
val sözlük: Dizin[Sözcük] = sözcükDizininiYükle
def sözcüğünHarfSayıları(s: Sözcük): HarfSayıları = s.öbekle(_.küçükHarfe).işle { case (a, d) => (a, d.boyu) }.dizine.yinelemesiz
def tümceninHarfSayıları(t: Tümce): HarfSayıları = sözcüğünHarfSayıları(t.yazıYap)
lazy val harfSayılarındanSözcüklere: Eşlek[HarfSayıları, Dizin[Sözcük]] = sözlük.öbekle(sözcüğünHarfSayıları(_)) varsayılanDeğerle Boş
def evirmeceler(sözcük: Sözcük): Dizin[Sözcük] = harfSayılarındanSözcüklere(sözcüğünHarfSayıları(sözcük))
def kombinasyonlar(harfSayıları: HarfSayıları): Dizin[HarfSayıları] = {
    def tekHarfDurumu(harfVeSayısı: (Harf, Sayı)): Dizin[HarfSayıları] = Dizin() :: (harfVeSayısı match {
        case (harf, kaçTane) => (for (s <- 1 |-| kaçTane) yield Dizin(harf -> s)).dizine
    })
    harfSayıları match {
        case Boş         => Dizin(Dizin())
        case başı :: Boş => tekHarfDurumu(başı)
        case başı :: kuyruğu => for {
            öge <- tekHarfDurumu(başı)
            altKüme <- kombinasyonlar(kuyruğu)
        } yield öge ++ altKüme
    }
}
def çıkar(birinciDizin: HarfSayıları, ikinciDizin: HarfSayıları): HarfSayıları =
    ikinciDizin.soldanKatla(birinciDizin.eşleğe) { (eşlek, öge) =>
        öge match {
            case (harf, kaçTane) => {
                val ilkDeğer = eşlek(harf)
                if (ilkDeğer == kaçTane) eşlek - harf else eşlek.değiştirilmiş(harf, ilkDeğer - kaçTane)
            }
        }
    }.dizine.yinelemesiz
def tümceEvirmece(tümce: Tümce): Dizin[Tümce] = {
    def özyineleme(hs: HarfSayıları): Dizin[Tümce] =
        hs match {
            case Boş => Dizin(Boş)
            case _ => for {
                biri <- kombinasyonlar(hs)
                ilkSözcük <- harfSayılarındanSözcüklere(biri)
                tümceninGerisi <- özyineleme(çıkar(hs, biri))
            } yield ilkSözcük :: tümceninGerisi
        }
    özyineleme(tümceninHarfSayıları(tümce))
}

// Döngünün içindeki diziye başka tümceler de ekleyebilirsin. 
// Ama çok uzun olmasın. Yoksa çok zaman alabilir.
for (
    tümce <- Dizi(
        "al ver",
        "lütfen gel",
        "sevdim onu")
) {
    val evrik = zamanTut("Tümcenin evirmecelerinin hepsini bulmak") { tümceEvirmece(tümce.split(" ").dizine).işle(_.işle(_.küçükHarfe)) }()
    satıryaz(tümce.yazıYap(
        "Tümce: ", "", s".\n${evrik.boyu} evirmecesi var: ${evrik.işle(_.yazıYap(" ")).yazıYap("", ", ", ".\n")}"
    ))
}
