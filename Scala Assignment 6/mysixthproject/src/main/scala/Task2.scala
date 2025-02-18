//Resource Management
import scala.reflect.Selectable.reflectiveSelectable
object Task2 {
  def using[T <: { def close(): Unit }](resource: T)(block: T => Unit): Unit = {
    try {
      block(resource)
    } finally {
      resource.close()
    }
  }
}