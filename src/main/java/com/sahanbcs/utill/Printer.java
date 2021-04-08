package com.sahanbcs.utill;

import java.util.logging.Logger;

public class Printer {

    private Printer(){

    }

    public static  void print( String string ){
        Logger logger = Logger.getLogger(Printer.class.getName());
        logger.info(string);
    }
}
