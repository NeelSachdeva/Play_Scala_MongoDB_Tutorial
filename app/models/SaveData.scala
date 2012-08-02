package models
import com.novus.salat.dao.SalatDAO
import org.bson.types.ObjectId
import models.MongoDBSetup
import com.novus.salat.global._

case class SaveData(username: String,
  Marks: Int,
  email: String)                                 // Save Data Model

object SaveData {

  def saveTheDataInMongo {
    val dataToSave = new SaveData("Neelkanth", 87, "neelkanth@knoldus.com")
    SaveDataDAO.insert(dataToSave)
  }

}

object SaveDataDAO extends SalatDAO[SaveData, ObjectId](collection = MongoDBSetup.mongoDB("saved_data"))