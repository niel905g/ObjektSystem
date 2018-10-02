package niel905g;

public class Main {

        public static void main( String[] arg ) {
            // Opbygning af objektsystem
            Linie line = new Linie( new Punkt( 3, 0 ), new Punkt( 0, 4 ) );

            // Client
            System.out.println( line.length() );
        }
    }