package com.chirpit;

/**
* com/chirpit/ChirpIdHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

public final class ChirpIdHolder implements org.omg.CORBA.portable.Streamable
{
  public com.chirpit.ChirpId value = null;

  public ChirpIdHolder ()
  {
  }

  public ChirpIdHolder (com.chirpit.ChirpId initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.chirpit.ChirpIdHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.chirpit.ChirpIdHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.chirpit.ChirpIdHelper.type ();
  }

}
