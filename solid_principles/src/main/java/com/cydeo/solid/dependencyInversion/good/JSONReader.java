package com.cydeo.solid.dependencyInversion.good;

public class JSONReader implements Reader{

    /*

        Example JSON:

            {
                "username": "selmank101"
            }
     */

    @Override
    public String getUsername() {
        return "";
    }
}
