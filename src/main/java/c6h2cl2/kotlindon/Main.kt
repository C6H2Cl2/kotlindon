package c6h2cl2.kotlindon

import cuchaz.jfxgl.JFXGLLauncher

/**
 * @author C6H2Cl2
 */
object Main {
    @JvmStatic
    fun main(args:Array<String>) {
        // your app normally starts here
        // before you do anything else,
        // call the JFXGL launcher on this class
        JFXGLLauncher.launchMain(Main::class.java, args)
    }
    // JFXGL will then call this pseudo-main method
    // using the special classloader
    @JvmStatic
    fun jfxglmain(args:Array<String>) {
        // start your app here like usual
    }
}