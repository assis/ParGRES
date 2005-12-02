//#############################################
//## file: ParserIni.java
//## Generated by Byacc/j
//#############################################
package org.pargres.parser;

/**
 * BYACC/J Semantic Value for parser: ParserIni
 * This class provides some of the functionality
 * of the yacc/C 'union' directive
 */
public class ParserIniVal
{
/**
 * integer value of this 'union'
 */
public int ival;

/**
 * double value of this 'union'
 */
public double dval;

/**
 * string value of this 'union'
 */
public String sval;

/**
 * object value of this 'union'
 */
public Object obj;

//#############################################
//## C O N S T R U C T O R S
//#############################################
/**
 * Initialize me without a value
 */
public ParserIniVal()
{
}
/**
 * Initialize me as an int
 */
public ParserIniVal(int val)
{
  ival=val;
}

/**
 * Initialize me as a double
 */
public ParserIniVal(double val)
{
  dval=val;
}

/**
 * Initialize me as a string
 */
public ParserIniVal(String val)
{
  sval=val;
}

/**
 * Initialize me as an Object
 */
public ParserIniVal(Object val)
{
  obj=val;
}
}//end class

//#############################################
//## E N D    O F    F I L E
//#############################################