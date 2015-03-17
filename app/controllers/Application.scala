package controllers

import models.Comment
import play.api._
import play.api.libs.json.Json
import play.api.mvc._


object Application extends Controller {

  implicit val CommentFormat = Json.format[Comment]

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def createComment = Action{
    implicit request =>
      val json = request.body.asFormUrlEncoded
      val author = json.get("author")(0)
      val content = json.get("content")(0)
    Comment.insert(author,content)
    val all = Comment.getAll
    Ok(Json.toJson(all)).as("application/json")
  }

  def getAll = Action {implicit request =>
  val all = Comment.getAll
    Ok(Json.toJson(all)).as("application/json")
  }

}