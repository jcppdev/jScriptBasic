/**
 * 
 */
package com.scriptbasic.utility;

import com.scriptbasic.Function;
import com.scriptbasic.classification.System;

/**
 * Static methods in this class are registered in the interpreter when the
 * interpreter starts. The interpreter calls the static method {@see
 * #registerFunctions(MethodRegistry)} and that function registers the methods
 * in this class with their own name so that BASIC programs can call the
 * functions like BASIC built in functions.
 * 
 * @author Peter Verhas
 * @date Jul 15, 2012
 * 
 */
public class RuntimeUtility {
    private RuntimeUtility() {
        UtilityUtility.throwExceptionToEnsureNobodyCallsIt();
    }

    // TODO separate this utility class from the one that can be used to
    // register the methods and make the other one configurable via properties,
    // XML and API

    // TODO create function to instantiate an object
    @Function(alias = "new", classification = System.class)
    public static Object newObject(String klass) throws ClassNotFoundException {
        return Class.forName(klass);
    }

    // TODO create mathematical functions for DOUBLE arguments and values
    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double acos(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double asin(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double atan(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double atan2(double x, double y) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double cbrt(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double ceil(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double cos(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double cosh(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double floor(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double hypot(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double log(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double log10(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double pow(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double round(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double tan(double x) {
        return 0.0;
    }

    @Function(substituteClass = java.lang.Math.class, classification = com.scriptbasic.classification.Math.class)
    static public double tanh(double x) {
        return 0.0;
    }

    // TODO move the functions to a separate class and create code that
    // registers all the function with annotations for a class

    // TODO create function that returns null

    // TODO create functions for regular expression handling

    // TODO create functions using JODA time to handle date and time

}