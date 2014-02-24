
import java.util.{ Date, Locale }
import java.text.DateFormat
import java.text.DateFormat._
/*
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.CANADA)
    println(df format now)
  }
}


object TesteApplication extends Application{
  println("Aplicação sem main")
}

class Pessoa(val firstName:String, val lastName:String, val age:Int)
{
  override def toString = "[Pessoa: firstName=" + firstName + " lastName=" + lastName + " age="+age+"]"
}
 
object PersonApp
{
  def main(args : Array[String]) : Unit =
  {
    val person = new Pessoa("Rafael", "Pessoa Chaves", 30)
    System.out.println(person)
  }
}


abstract class Person(val name : String, val age : Int) {
  override def toString = "[Person name:" + name + " age:" + age + "]"
  def doSomething;
}
 
class Student(name : String, age : Int) extends Person(name,age) {
  override def doSomething = println(this + " I'm studying! I swear!")
}
 
class Worker(name : String, age : Int) extends Person(name,age) {
  override def doSomething = println(this + " I'm working!")
}
 
object PersonApp {
  def main(args : Array[String]) {
    val people = List(new Student("Junior", 10), new Student("Kelly", 12), new Worker("Jon Doe", 40))
    people.foreach {p => p.doSomething }
    
    val set = new scala.collection.mutable.HashSet[Any]
set += "This is a string"
set += 732
set += 'c'
set += true
set += (() => {})
set += new java.lang.Object
set.foreach {e => println(e.toString + " -- " + e.getClass) }
  }
}
//PersonApp.main(args)*/



trait Flyer {
  def fly = println("I can fly!")
}
trait Jumper {
  def jump = println("I can jump!")
}
trait Walker {
  def walk = println("I walk too!")
}
class Animal {
  def breathe = println("Dogs breath!")
}
//Dog herda de animal (breathe) e utiliza o jumper (jump)
class Dog extends Animal with Jumper {
}
//Birg herda de animal (breathe) e utiliza o flyer(fly) e o jumper (jump)
class Bird extends Animal with Flyer with Jumper{
}
//Airplane herda flyer(fly)
class Airplane extends Flyer {
}
//Object cria a class TraitsApp e já cria uma única instância herdando Application que já tem implicito o método main
object TraitsApp extends Application {
//Declaração da variavel dog que cria um Dog e adiciona um trait Walker (walk), ou seja Dog vai herdar da classe Animal (breathe),
//vai implementar a trait Jumper(jump) e adicionado a trait Walker(walk)
  val dog = new Dog with Walker

//declaração da variável Birg que herda de animal (breathe) e utiliza o flyer(fly) e o jumper (jump)
  val bird = new Bird
//declara a variável plane quer herda de Flyer(fly) - Que é extranho pois Flyer é uma trait e não uma classe, olhar isso com carinho
  val plane = new Airplane
//Utilização dos métodos
  dog.breathe
  dog.jump
  dog.walk
  bird.breathe
  bird.jump
  bird.fly
  plane.fly
}
