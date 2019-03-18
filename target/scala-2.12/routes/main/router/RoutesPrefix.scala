// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Graham/Desktop/CA1SDEV/conf/routes
// @DATE:Mon Mar 18 14:21:52 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
