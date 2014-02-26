
class Metodos {
}

  object metodos {
    class Upper {
      def upper(strings: String*): Seq[String] = {
        strings.map((s: String) => s.toUpperCase())
      }
    }
    def main(args: Array[String]) {
      val up = new Upper
      Console.println(up.upper("A", "First", "Scala", "Program"))

    }

  }