//#yükle tr/sozcuk-dizinini-yukle
cleari; clearOutput
def dump(w: String) = { println(w); write(w); hop }
def load(implicit codec: scala.io.Codec): Dizin[Yazı] = {
    val istream = new java.io.FileInputStream(getFile)
    try {
        val s = scala.io.Source.fromInputStream(istream)(codec)
        s.getLines.toList
    }
    catch {
        case e: Exception =>
            println("Sözcük dizinini yükleyemedik: " + e)
            throw e
    }
    finally {
        istream.close
    }
}
val dict: List[String] = load
val word = "abacı"  // "ı" is a Turkish char
dump(dict(2))
val dict2 = load(scala.io.Codec.ISO8859)
dump(dict2(2))