package com.chirpit;

/**
* com/chirpit/ChirpHeaderHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

public final class ChirpHeaderHolder implements org.omg.CORBA.portable.Streamable
{
  public com.chirpit.ChirpHeader value = null;

  public ChirpHeaderHolder ()
  {
  }

  public ChirpHeaderHolder (com.chirpit.ChirpHeader initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.chirpit.ChirpHeaderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.chirpit.ChirpHeaderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.chirpit.ChirpHeaderHelper.type ();
  }

}
