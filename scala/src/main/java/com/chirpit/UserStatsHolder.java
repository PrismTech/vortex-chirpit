package com.chirpit;

/**
* com/chirpit/UserStatsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

public final class UserStatsHolder implements org.omg.CORBA.portable.Streamable
{
  public com.chirpit.UserStats value = null;

  public UserStatsHolder ()
  {
  }

  public UserStatsHolder (com.chirpit.UserStats initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.chirpit.UserStatsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.chirpit.UserStatsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.chirpit.UserStatsHelper.type ();
  }

}
