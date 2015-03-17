package models

import models.slick.{Tables, DBUtil}
import scala.slick.driver.MySQLDriver.simple._
import scala.slick.jdbc.{StaticQuery, GetResult}

/**
 * User: Huangshanqi
 * Date: 2015/3/16
 * Time: 15:41
 */
case class Comment(id:Int,author:String,content:String)
object Comment {

  lazy val db = DBUtil.db
  implicit var session = db.createSession()
  lazy val comment = Tables.Comment

  val resultParser = GetResult[Comment](r => Comment(r.<<, r.<<, r.<<))

  def insert(author:String,content:String) = {

    comment.map(c => (c.author, c.content))
      .insert((Some(author), Some(content)))
  }

  def getAll():Seq[Comment]= {
    implicit val rconv = GetResult[Comment](r => Comment(r.<<, r.<<, r.<<))
    val sql= "select * from comment"
   StaticQuery.queryNA[Comment](sql).list
//   comment.list.asInstanceOf[Seq[Comment]]
  }


}
