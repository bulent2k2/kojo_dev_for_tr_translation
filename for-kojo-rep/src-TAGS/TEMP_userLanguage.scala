// From: grep -r userLanguage *
// in  : ~/src/kojo/git/kojo/src/
/* raw:
main/scala/net/kogics/kojo/core/KojoCtx.scala:  def userLanguage: String
main/scala/net/kogics/kojo/core/KojoCtx.scala:  def userLanguage_=(lang: String): Unit
main/scala/net/kogics/kojo/lite/KojoCtx.scala:  @volatile var _userLanguage = LangInit.init(prefs)
main/scala/net/kogics/kojo/lite/KojoCtx.scala:  def userLanguage: String = _userLanguage
main/scala/net/kogics/kojo/lite/KojoCtx.scala:  def userLanguage_=(lang: String): Unit = {
main/scala/net/kogics/kojo/lite/KojoCtx.scala:    _userLanguage = lang
main/scala/net/kogics/kojo/lite/KojoCtx.scala:    prefs.put("user.language", _userLanguage)
main/scala/net/kogics/kojo/lite/LangMenuFactory.scala:        kojoCtx.userLanguage = lang
main/scala/net/kogics/kojo/lite/LangMenuFactory.scala:      if (kojoCtx.userLanguage == langCode) {
main/scala/net/kogics/kojo/lite/LangMenuFactory.scala:      // langIcon(kojoCtx.userLanguage)
main/scala/net/kogics/kojo/lite/i18n/LangInit.scala:    val userLanguage = prefs.get("user.language", System.getProperty("user.language"))
main/scala/net/kogics/kojo/lite/i18n/LangInit.scala:    if (userLanguage != null && userLanguage.trim != "") {
main/scala/net/kogics/kojo/lite/i18n/LangInit.scala:      java.util.Locale.setDefault(new java.util.Locale(userLanguage, oldLocale.getCountry, oldLocale.getVariant))
main/scala/net/kogics/kojo/lite/i18n/LangInit.scala:      System.setProperty("user.language", userLanguage)
main/scala/net/kogics/kojo/lite/i18n/LangInit.scala:    userLanguage
test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:  def userLanguage: String = "en"
test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:  def userLanguage_=(lang: String): Unit = {}
test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala:      kojoCtx.userLanguage = lang
test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala:    val currentLanguage = kojoCtx.userLanguage
test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala:    kojoCtx.userLanguage = "en"
test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala:    kojoCtx.userLanguage = currentLanguage
zsh:2: bad pattern: println(current language:  + currentL
 */
// But, also see:
// ~/src/kojo/git/kojo/src/test/scala/net/kogics/kojo/util/UtilsTest.scala
{
  import java.util.Locale //> import java.util.Locale
  val old = Locale.getDefault //> val old: java.util.Locale = de
    Locale.setDefault(Locale.GERMAN)
  val nnn = Locale.getDefault //> val nnn: java.util.Locale = de
}


// main/scala/net/kogics/kojo/core/KojoCtx.scala
{
  def userLanguage: String
  def userLanguage_=(lang: String): Unit
  @volatile var _userLanguage = LangInit.init(prefs)
  def userLanguage: String = _userLanguage
  def userLanguage_=(lang: String): Unit = {
    _userLanguage = lang
    prefs.put("user.language", _userLanguage)
  }
}
// main/scala/net/kogics/kojo/lite/LangMenuFactory.scala
{
  kojoCtx.userLanguage = lang
  if (kojoCtx.userLanguage == langCode) {
    // langIcon(kojoCtx.userLanguage)
  }
}
// main/scala/net/kogics/kojo/lite/i18n/LangInit.scala
    val userLanguage = prefs.get("user.language", System.getProperty("user.language"))
    if (userLanguage != null && userLanguage.trim != "") {
      java.util.Locale.setDefault(new java.util.Locale(userLanguage, oldLocale.getCountry, oldLocale.getVariant))
    }
  }
}
// main/scala/net/kogics/kojo/lite/i18n/LangInit.scala
{
  System.setProperty("user.language", userLanguage)
  userLanguage
}

/* 
 * TEST CODE
 */

// test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala
{
  def userLanguage: String = "en"
  def userLanguage_=(lang: String): Unit = {}
}
// test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala
{
  kojoCtx.userLanguage = lang
  val currentLanguage = kojoCtx.userLanguage
  kojoCtx.userLanguage = "en"
  kojoCtx.userLanguage = currentLanguage
  println(current language:  + currentLanguage)
}

