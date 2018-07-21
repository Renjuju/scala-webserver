package events


import scala.collection.mutable.ArrayBuffer


case class Person(id:String, name:String)

object Main extends App {
  val perm = new Permutations
  val list = new ArrayBuffer[String]

  perm.permutate("RENJU", "", list=list)
  print("Unique objects in list", list.toSet.size)

}

class Permutations {
  def permutate(first: String, second: String, list: ArrayBuffer[String]): Unit = {
    var secondStr = second

    var builder = new StringBuilder(first)
    if(first.isEmpty) {
      list.append(secondStr)
    } else {
      var count:Int = 0
      for(x <- first) {
        secondStr = secondStr.concat(String.valueOf(x))
        val tempFirst =  builder.deleteCharAt(count).toString()

        permutate(tempFirst, secondStr, list)
        secondStr = second.substring(0, secondStr.length-1)

        builder = new StringBuilder(first)
        count = count + 1
      }
    }
  }
}