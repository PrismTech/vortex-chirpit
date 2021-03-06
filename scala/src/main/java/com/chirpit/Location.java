package com.chirpit;


/**
* com/chirpit/Location.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

public final class Location implements org.omg.CORBA.portable.IDLEntity
{
  private com.chirpit.SomeLocation ___location;
  private com.chirpit.None ___none;
  private com.chirpit.LocationKind __discriminator;
  private boolean __uninitialized = true;

  public Location ()
  {
  }

  public com.chirpit.LocationKind discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public com.chirpit.SomeLocation location ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifylocation (__discriminator);
    return ___location;
  }

  public void location (com.chirpit.SomeLocation value)
  {
    __discriminator = com.chirpit.LocationKind.SOME_LOCATION_KIND;
    ___location = value;
    __uninitialized = false;
  }

  public void location (com.chirpit.LocationKind discriminator, com.chirpit.SomeLocation value)
  {
    verifylocation (discriminator);
    __discriminator = discriminator;
    ___location = value;
    __uninitialized = false;
  }

  private void verifylocation (com.chirpit.LocationKind discriminator)
  {
    if (discriminator != com.chirpit.LocationKind.SOME_LOCATION_KIND)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public com.chirpit.None none ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifynone (__discriminator);
    return ___none;
  }

  public void none (com.chirpit.None value)
  {
    __discriminator = com.chirpit.LocationKind.NONE_KIND;
    ___none = value;
    __uninitialized = false;
  }

  public void none (com.chirpit.LocationKind discriminator, com.chirpit.None value)
  {
    verifynone (discriminator);
    __discriminator = discriminator;
    ___none = value;
    __uninitialized = false;
  }

  private void verifynone (com.chirpit.LocationKind discriminator)
  {
    if (discriminator != com.chirpit.LocationKind.NONE_KIND)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

} // class Location
