/*A Hello World program to scala GUI using scala swing library */

import swing._

object HelloWorld extends SimpleSwingApplication { //simple GUI program
  def top = new MainFrame {
    title = "Hello, World!"
    contents = new Button {
      text = "Click Me!.."
    }
  }
}