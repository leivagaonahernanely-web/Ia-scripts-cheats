// Config.kt — lee las claves sin escribirlas en el código
import java.util.Properties

object Config {
    private val props = Properties().apply {
        runCatching {
            load(javaClass.classLoader?.getResourceAsStream("local.properties"))
        }
    }
    
    val API_KEYS: List<String> = (0..17).mapNotNull { i ->
        props.getProperty("api.key.$i")
    }
    
    fun getRandomKey(): String = API_KEYS.random()
}
