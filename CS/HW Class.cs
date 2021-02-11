using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;
using System.Text;
//C# class template
namespace HelloWorld
{
  class HWSupport
  {
    //PDDC
    public HWSupport()
    {
      Console.WriteLine("Hello World");
    }
    //private class attributes
    private string hello;
    private string world;
    this.hello = "Hello";
    this.world = "World";

    //public methods
    public void Message()
    {
      Console.WriteLine(hello + " " + world);
    }
  }
}
