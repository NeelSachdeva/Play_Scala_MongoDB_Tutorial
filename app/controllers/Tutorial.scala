package controllers
import play.api.mvc.Controller
import play.api.mvc.Action
import models.SaveData

object Tutorial extends Controller {

  def testMethodForPlayTutorial = Action { implicit request =>
    SaveData.saveTheDataInMongo                    //calling the method
    Ok("Stored data in database")
  }

}