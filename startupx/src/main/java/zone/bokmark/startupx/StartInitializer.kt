package zone.bokmark.startupx

/**
 * 
 */
class StartInitializer private constructor() {
    companion object {
        val instance: StartInitializer by lazy {
            StartInitializer()
        }
    }


}