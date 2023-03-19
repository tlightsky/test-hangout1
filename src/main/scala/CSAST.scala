import profiles.PostgresProfile.api._
import slick.collection.heterogeneous.HNil
import slick.lifted.{Rep}

class CSAST(_tableTag: Tag)
  extends Table[CSASR](_tableTag, Some("persistence"), "csas") {
  def * =
    (a :: b :: c :: d :: e ::
      f :: g :: h :: i :: j ::
      k :: l :: m :: n :: o :: p ::
      q :: r :: s :: t :: u :: v ::
      w :: x :: y :: z ::
      a1 :: b1 :: c1 :: d1 ::
      e1 :: f1 :: g1 :: h1 :: i1 :: j1 :: k1 ::
      HNil)
      .mapTo[CSASR]

  val a: Rep[java.util.UUID] = column[java.util.UUID]("a", O.PrimaryKey)
  val b: Rep[Long] = column[Long]("b")
  val c: Rep[String] = column[String]("c")
  val d: Rep[String] = column[String]("d")
  val e: Rep[String] = column[String]("e")
  val f: Rep[String] = column[String]("f")
  val g: Rep[String] = column[String]("g")
  val h: Rep[String] = column[String]("h")
  val i: Rep[Long] = column[Long]("i")
  val j: Rep[Long] = column[Long]("j")
  val k: Rep[Long] = column[Long]("k")
  val l: Rep[Long] = column[Long]("l")
  val m: Rep[Option[String]] = column[Option[String]]("m", O.Default(None))
  val n: Rep[Option[String]] = column[Option[String]]("n", O.Default(None))
  val o: Rep[Option[Short]] = column[Option[Short]]("o", O.Default(None))
  val p: Rep[Option[String]] = column[Option[String]]("p", O.Default(None))
  val q: Rep[Option[java.util.UUID]] =
    column[Option[java.util.UUID]]("q", O.Default(None))
  val r: Rep[Option[Long]] = column[Option[Long]]("r", O.Default(None))
  val s: Rep[Option[Long]] = column[Option[Long]]("s", O.Default(None))
  val t: Rep[Option[String]] = column[Option[String]]("t", O.Default(None))
  val u: Rep[Option[String]] = column[Option[String]]("u", O.Default(None))
  val v: Rep[Option[List[String]]] =
    column[Option[List[String]]]("v", O.Length(2147483647, varying = false), O.Default(None))
  val w: Rep[Option[List[String]]] =
    column[Option[List[String]]]("w", O.Length(2147483647, varying = false), O.Default(None))
  val x: Rep[Option[Int]] = column[Option[Int]]("x", O.Default(None))
  val y: Rep[Option[Long]] =
    column[Option[Long]]("y", O.Default(None))
  val z: Rep[Option[Int]] = column[Option[Int]]("z", O.Default(None))
  val a1: Rep[Option[Long]] =
    column[Option[Long]]("a1", O.Default(None))
  val b1: Rep[Option[Int]] = column[Option[Int]]("b1", O.Default(None))
  val c1: Rep[Option[Long]] =
    column[Option[Long]]("c1", O.Default(None))
  val d1: Rep[Option[Int]] = column[Option[Int]]("d1", O.Default(None))
  val e1: Rep[Option[Int]] = column[Option[Int]]("e1", O.Default(None))
  val f1: Rep[Option[String]] = column[Option[String]]("f1", O.Default(None))
  val g1: Rep[Option[Long]] = column[Option[Long]]("g1", O.Default(None))
  val h1: Rep[Option[Long]] = column[Option[Long]]("h1", O.Default(None))
  val i1: Rep[Option[Int]] = column[Option[Int]]("i1", O.Default(None))
  val j1: Rep[Option[String]] =
    column[Option[String]]("j1", O.Default(None))
  val k1: Rep[Option[Int]] = column[Option[Int]]("k1", O.Default(None))
}
