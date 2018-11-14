package Ventas;


/**
* Ventas/VentaHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from venta.idl
* s�bado 10 de noviembre de 2018 04:17:43 PM COT
*/

abstract public class VentaHelper
{
  private static String  _id = "IDL:Ventas/Venta:1.0";

  public static void insert (org.omg.CORBA.Any a, Ventas.Venta that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Ventas.Venta extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Ventas.VentaHelper.id (), "Venta");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Ventas.Venta read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_VentaStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Ventas.Venta value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Ventas.Venta narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Ventas.Venta)
      return (Ventas.Venta)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Ventas._VentaStub stub = new Ventas._VentaStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Ventas.Venta unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Ventas.Venta)
      return (Ventas.Venta)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Ventas._VentaStub stub = new Ventas._VentaStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}