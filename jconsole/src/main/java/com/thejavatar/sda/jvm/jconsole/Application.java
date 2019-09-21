package com.thejavatar.sda.jvm.jconsole;

import java.util.concurrent.TimeUnit;

public class Application {

    public static void main( String args[] ) throws InterruptedException {
        for ( int i = 0; i < 1_000_000_000; i++ ) {

            long startTime = System.nanoTime();

            for ( int k = 0; k < 100_000; k++ ) {
                new Object();
            }

            long endTime = System.nanoTime();

            //System.out.printf( "%d) Time elapsed: %d ns %n", i, endTime - startTime );

            long timeInMilliSeconds = TimeUnit.NANOSECONDS.toMicros( endTime - startTime );
            System.out.printf( "%d) Time elapsed: %d us %n", i, timeInMilliSeconds );

        }
    }

}
