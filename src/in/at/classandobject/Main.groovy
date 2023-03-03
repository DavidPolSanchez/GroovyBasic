package in.at.classandobject

class Laptop{
  def price
  def brand
  def isScreenWorkingCondition

  static void main(String[] args) {
    println "Hello world!"
    //*automatically cast
    def name = sayYourName()
    assert "3" == sayYourName()
    assert name == "3"
    assert name.class == String
    "logIn"()
    logOut()

  }

  static def logIn()
  {
    println ("System login!")
  }

  static def "logOut"()
  {
    println ("System logout!")
  }
  //*automatically cast
  static String sayYourName(){
     3
  }
}