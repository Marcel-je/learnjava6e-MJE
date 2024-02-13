package ch02.examples;

import javax.swing.*;

/**
 * A bare bones graphical version of Hello World.
 */
public class HelloJava {
  public static void main( String[] args ) {
    JFrame framex = new JFrame( "Hello, Java!" );
    JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
    framex.add(label);
    framex.setSize( 500, 500 );
    framex.setVisible( true );
    framex.setLocation(500, 500);
    framex.setLocation(1000, 100);

  }
}
