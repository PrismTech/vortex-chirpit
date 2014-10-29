package com.chirpit;


/**
* com/chirpit/ChirpAction.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:55 AM CEST
*/

/**
* Updated by idl2j
* from ../idl/chirpit.idl
* Wednesday, October 8, 2014 5:01:56 AM CEST
*/

import com.prismtech.cafe.dcps.keys.KeyList;

@KeyList(
    topicType = "ChirpAction",
    keys = {"header.id.cid"}
)
public final class ChirpAction implements org.omg.CORBA.portable.IDLEntity
{
  public com.chirpit.ChirpHeader header = null;
  public com.chirpit.ChirpBody body = null;

  public ChirpAction ()
  {
  } // ctor

  public ChirpAction (com.chirpit.ChirpHeader _header, com.chirpit.ChirpBody _body)
  {
    header = _header;
    body = _body;
  } // ctor

} // class ChirpAction