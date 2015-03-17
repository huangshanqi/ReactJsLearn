package models.slick
import scala.slick.driver.MySQLDriver.simple._
/**
 * User: Huangshanqi
 * Date: 2015/3/16
 * Time: 15:12
 */
object DBUtil {

  def db = Database.forURL(
    url=play.api.Play.current.configuration.getString("db.default.url").getOrElse(""),
    user=play.api.Play.current.configuration.getString("db.default.user").getOrElse(""),
    password=play.api.Play.current.configuration.getString("db.default.password").getOrElse(""),
    driver=play.api.Play.current.configuration.getString("db.default.driver").getOrElse(""))
}
