package com.chirpit;

/**
* com/chirpit/LocationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

public final class LocationHolder implements org.omg.CORBA.portable.Streamable
{
  public com.chirpit.Location value = null;

  public LocationHolder ()
  {
  }

  public LocationHolder (com.chirpit.Location initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.chirpit.LocationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.chirpit.LocationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.chirpit.LocationHelper.type ();
  }

}
