package models.slick

/**
 * User: Huangshanqi
 * Date: 2015/3/16
 * Time: 14:46
 */
object TableGens extends App{

  scala.slick.codegen.SourceCodeGenerator.main(
    Array("scala.slick.driver.MySQLDriver",
      "com.mysql.jdbc.Driver",
      "jdbc:mysql://127.0.0.1:3306/slicktest?useUnicode=true&characterEncoding=utf-8",
      "./app/models",
      "slick", "root", "532489")
  )
}
