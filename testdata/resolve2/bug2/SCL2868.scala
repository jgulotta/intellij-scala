object test {
  class A; object A extends A

  trait AA {
    def a_=(x: A) {};
  }

  object Imp extends AA {
    def a: Any = 0
  }

  {
    import Imp._
    /*resolved: true, name: a_= */a = A
  }

  {
    import Imp.a_=
    /*resolved: false */a = A
  }

  {
    import Imp.a_=
    def a: Any = 0
    /*resolved: false */a = A
  }
}