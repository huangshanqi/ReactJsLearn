package utils

import java.text.SimpleDateFormat

/**
 * User: Huangshanqi
 * Date: 2015/3/16
 * Time: 15:55
 */
object TimeUtils {

  def long2Format(time:Long):String = {
    val myFormat  = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    myFormat.format( new java.util.Date(time))
  }

  def format2Long(time: String): Long = {
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val millionSeconds = sdf.parse(time).getTime //毫秒
    millionSeconds
  }
}
