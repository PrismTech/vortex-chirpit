package com.chirpit;

/**
* com/chirpit/UserActionKindHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

public final class UserActionKindHolder implements org.omg.CORBA.portable.Streamable
{
  public com.chirpit.UserActionKind value = null;

  public UserActionKindHolder ()
  {
  }

  public UserActionKindHolder (com.chirpit.UserActionKind initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.chirpit.UserActionKindHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.chirpit.UserActionKindHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.chirpit.UserActionKindHelper.type ();
  }

}
