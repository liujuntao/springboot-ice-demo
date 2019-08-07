// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `test.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package slice2java;

public final class HelloIHolder extends Ice.ObjectHolderBase<HelloI>
{
    public
    HelloIHolder()
    {
    }

    public
    HelloIHolder(HelloI value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof HelloI)
        {
            value = (HelloI)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _HelloIDisp.ice_staticId();
    }
}
