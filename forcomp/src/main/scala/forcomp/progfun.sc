package forcomp

object progfun {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val w = "Robert"                                //> w  : String = Robert
  (w.toLowerCase() groupBy((element:Char) => element) toList) map (x => (x._1, x._2.length()))
                                                  //> res0: List[(Char, Int)] = List((e,1), (t,1), (b,1), (r,2), (o,1))
}