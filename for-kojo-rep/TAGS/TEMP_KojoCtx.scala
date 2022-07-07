+/bin/zsh:156> grep -r KojoCtx src
src/test/scala/net/kogics/kojo/turtle/TurtleTest2.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/turtle/TurtleTest2.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/turtle/TurtleTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/turtle/TurtleTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/util/UtilsTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/util/UtilsTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:class NoOpKojoCtx extends core.KojoCtx {
src/test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala:    implicit val kojoCtx = new KojoCtx(false)
src/test/scala/net/kogics/kojo/lite/LangMenuFactoryTest.scala:    implicit val kojoCtx = new KojoCtx(false)
src/test/scala/net/kogics/kojo/lite/TestEnv.scala:  def apply(kojoCtx: core.KojoCtx) = new {
src/test/scala/net/kogics/kojo/lite/CodeExecutionSupportTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureCollisionTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureCollisionTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureBounceTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureBounceTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureEqualsHashTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/PictureEqualsHashTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/ArcDoubleAngleTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/picture/ArcDoubleAngleTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/story/StoryTellerTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/story/StoryTellerTest.scala:  val kojoCtx = new NoOpKojoCtx
src/test/scala/net/kogics/kojo/story/LinkListenerTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/test/scala/net/kogics/kojo/story/LinkListenerTest.scala:  val kojoCtx = new NoOpKojoCtx
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/core/KojoCtx.scala:  def userLanguage: String
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/core/KojoCtx.scala:  def userLanguage_=(lang: String): Unit
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/lite/KojoCtx.scala:  @volatile var _userLanguage = LangInit.init(prefs)
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/lite/KojoCtx.scala:  def userLanguage: String = _userLanguage
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/lite/KojoCtx.scala:  def userLanguage_=(lang: String): Unit = {
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/lite/KojoCtx.scala:    _userLanguage = lang
src/TEMP_userLanguage.scala~:main/scala/net/kogics/kojo/lite/KojoCtx.scala:    prefs.put("user.language", _userLanguage)
src/TEMP_userLanguage.scala~:test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:  def userLanguage: String = "en"
src/TEMP_userLanguage.scala~:test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:  def userLanguage_=(lang: String): Unit = {}
src/itest/scala/net/kogics/kojo/xscala/InterpTest.scala:import net.kogics.kojo.lite.NoOpKojoCtx
src/itest/scala/net/kogics/kojo/xscala/InterpTest.scala:    val testEnv = TestEnv(new NoOpKojoCtx)
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/core/KojoCtx.scala:  def userLanguage: String
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/core/KojoCtx.scala:  def userLanguage_=(lang: String): Unit
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/lite/KojoCtx.scala:  @volatile var _userLanguage = LangInit.init(prefs)
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/lite/KojoCtx.scala:  def userLanguage: String = _userLanguage
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/lite/KojoCtx.scala:  def userLanguage_=(lang: String): Unit = {
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/lite/KojoCtx.scala:    _userLanguage = lang
src/TEMP_userLanguage.scala:main/scala/net/kogics/kojo/lite/KojoCtx.scala:    prefs.put("user.language", _userLanguage)
src/TEMP_userLanguage.scala:test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:  def userLanguage: String = "en"
src/TEMP_userLanguage.scala:test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala:  def userLanguage_=(lang: String): Unit = {}
src/TEMP_userLanguage.scala:// main/scala/net/kogics/kojo/core/KojoCtx.scala
src/TEMP_userLanguage.scala:// test/scala/net/kogics/kojo/lite/NoOpKojoCtx.scala
src/main/resources/ka-bridge/ka-bridge-bt.kojo:    val prefs = builtins.kojoCtx.asInstanceOf[net.kogics.kojo.lite.KojoCtx].prefs
src/main/resources/ka-bridge/ka-bridge.kojo:    val prefs = builtins.kojoCtx.asInstanceOf[net.kogics.kojo.lite.KojoCtx].prefs
src/main/java/net/kogics/kojo/util/FileChooser.java:import net.kogics.kojo.core.KojoCtx;
src/main/java/net/kogics/kojo/util/FileChooser.java:    KojoCtx ctx;
src/main/java/net/kogics/kojo/util/FileChooser.java:    public FileChooser(KojoCtx ctx) {
src/main/java/net/kogics/kojo/codex/CodeExchangeForm.java:import net.kogics.kojo.core.KojoCtx;
src/main/java/net/kogics/kojo/codex/CodeExchangeForm.java:    KojoCtx kojoCtx;
src/main/java/net/kogics/kojo/codex/CodeExchangeForm.java:    public CodeExchangeForm(KojoCtx kojoCtx, boolean modal) {
src/main/java/net/kogics/kojo/action/LoadFrom.java:import net.kogics.kojo.core.KojoCtx;
src/main/java/net/kogics/kojo/action/LoadFrom.java:	private KojoCtx ctx;
src/main/scala/net/kogics/kojo/music/Mp3Player.scala:import net.kogics.kojo.core.KojoCtx
src/main/scala/net/kogics/kojo/music/Mp3Player.scala:  val kojoCtx: KojoCtx
src/main/scala/net/kogics/kojo/music/Mp3Player.scala:class KMp3(val kojoCtx: KojoCtx) extends Mp3Player {
src/main/scala/net/kogics/kojo/music/FuguePlayer.scala:import net.kogics.kojo.core.KojoCtx
src/main/scala/net/kogics/kojo/music/FuguePlayer.scala:class FuguePlayer(kojoCtx: KojoCtx) {
src/main/scala/net/kogics/kojo/core/CodeExecutionSupport.scala:  def kojoCtx: KojoCtx
src/main/scala/net/kogics/kojo/core/KojoCtx.scala:trait KojoCtx {
src/main/scala/net/kogics/kojo/core/SCanvas.scala:  def kojoCtx: KojoCtx
src/main/scala/net/kogics/kojo/util/Utils.scala:import net.kogics.kojo.core.KojoCtx
src/main/scala/net/kogics/kojo/util/Utils.scala:  var kojoCtx: KojoCtx = _
src/main/scala/net/kogics/kojo/lite/CodeExecutionSupport.scala:  val kojoCtx:   core.KojoCtx
src/main/scala/net/kogics/kojo/lite/KojoCtx.scala:class KojoCtx(val subKojo: Boolean) extends core.KojoCtx {
src/main/scala/net/kogics/kojo/lite/trace/TracingGUI.scala:class TracingGUI(scriptEditor: ScriptEditor, kojoCtx: core.KojoCtx) {
src/main/scala/net/kogics/kojo/lite/Builtins.scala:  val kojoCtx:     core.KojoCtx,
src/main/scala/net/kogics/kojo/lite/NoOpSCanvas.scala:  def kojoCtx: KojoCtx = null
src/main/scala/net/kogics/kojo/lite/canvas/SpriteCanvas.scala:class SpriteCanvas(val kojoCtx: core.KojoCtx) extends PSwingCanvas with SCanvas {
src/main/scala/net/kogics/kojo/lite/action/actions.scala:import net.kogics.kojo.core.KojoCtx
src/main/scala/net/kogics/kojo/lite/action/actions.scala:  def apply(dch: => DrawingCanvasHolder, kojoCtx: KojoCtx) = {
src/main/scala/net/kogics/kojo/lite/action/actions.scala:class FullScreenCanvasAction(dch: => DrawingCanvasHolder, kojoCtx: KojoCtx)
src/main/scala/net/kogics/kojo/lite/ArithAerobicsPane.scala:class ArithAerobicsPane(frame: JFrame, kojoCtx: KojoCtx) extends JTabbedPane {
src/main/scala/net/kogics/kojo/lite/topc/DrawingCanvasHolder.scala:import net.kogics.kojo.core.KojoCtx
src/main/scala/net/kogics/kojo/lite/topc/DrawingCanvasHolder.scala:class DrawingCanvasHolder(val dc: SpriteCanvas, ctx: KojoCtx)
src/main/scala/net/kogics/kojo/lite/LangMenuFactory.scala:  def createLangMenu()(implicit kojoCtx: core.KojoCtx) = {
src/main/scala/net/kogics/kojo/lite/Theme.scala:  def loadDefaultPerspective(kojoCtx: core.KojoCtx): Unit
src/main/scala/net/kogics/kojo/lite/Theme.scala:  def loadDefaultPerspective(kojoCtx: core.KojoCtx): Unit = {
src/main/scala/net/kogics/kojo/lite/Theme.scala:  def loadDefaultPerspective(kojoCtx: core.KojoCtx): Unit = {
src/main/scala/net/kogics/kojo/lite/Main.scala:  @volatile implicit var kojoCtx: KojoCtx = _
src/main/scala/net/kogics/kojo/lite/Main.scala:    kojoCtx = new KojoCtx(args.length == 1 && args(0) == "subKojo") // context needs to be created right up front to set user language
src/main/scala/net/kogics/kojo/lite/BreakpointPane.scala:  def show(msg: Any, pauseMessage: String, resumeMsg: String, kojoCtx: core.KojoCtx) = {
src/main/scala/net/kogics/kojo/history/CommandHistory.scala:  def apply(kojoCtx: core.KojoCtx) = {
src/main/scala/net/kogics/kojo/story/StoryTeller.scala:class StoryTeller(val kojoCtx: core.KojoCtx) extends JPanel with music.Mp3Player {
