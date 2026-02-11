package demo
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.reflect.KClass

class EventBus {
    private data class Sub<T: Any>(
        val type: KClass<T>,
        val handler: (T) -> Unit
    )

    private val subs = CopyOnWriteArrayList<Sub<*>>()

    fun <T: Any> on(type: KClass<T>, handler: (T) -> Unit) {
        subs += Sub(type, handler)
    }

    inline fun <reified T: Any> on(noinline handler: (T) -> Unit) =
        on(T::class, handler)

    fun publish(event: Any) {
        for (s in subs) {
            if (s.type.isInstance(event)) {
                @Suppress("UNCHECKED_CAST")
                (s.handler as (Any) -> Unit).invoke(event)
            }
        }
    }
}
