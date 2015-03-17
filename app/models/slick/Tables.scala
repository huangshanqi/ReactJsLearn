package models.slick
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = scala.slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: scala.slick.driver.JdbcProfile
  import profile.simple._
  import scala.slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import scala.slick.jdbc.{GetResult => GR}
  
  /** DDL for all tables. Call .create to execute. */
  lazy val ddl = Comment.ddl
  
  /** Entity class storing rows of table Comment
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param author Database column author DBType(VARCHAR), Length(255,true), Default(None)
   *  @param content Database column content DBType(VARCHAR), Length(255,true), Default(None) */
  case class CommentRow(id: Int, author: Option[String] = None, content: Option[String] = None)
  /** GetResult implicit for fetching CommentRow objects using plain SQL queries */
  implicit def GetResultCommentRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[CommentRow] = GR{
    prs => import prs._
    CommentRow.tupled((<<[Int], <<?[String], <<?[String]))
  }
  /** Table description of table comment. Objects of this class serve as prototypes for rows in queries. */
  class Comment(_tableTag: Tag) extends Table[CommentRow](_tableTag, "comment") {
    def * = (id, author, content) <> (CommentRow.tupled, CommentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, author, content).shaped.<>({r=>import r._; _1.map(_=> CommentRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column author DBType(VARCHAR), Length(255,true), Default(None) */
    val author: Column[Option[String]] = column[Option[String]]("author", O.Length(255,varying=true), O.Default(None))
    /** Database column content DBType(VARCHAR), Length(255,true), Default(None) */
    val content: Column[Option[String]] = column[Option[String]]("content", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Comment */
  lazy val Comment = new TableQuery(tag => new Comment(tag))
}