// Class file for implementing a class and it's methods

#include "helloWorld.h"
#include <iostream>

using namespace Hello; /* Namespace declared in header file permits use of class and methods without fully qualifying them
For example, for the HelloPrint method below, we would have to put the namespace before the class name and method like so if the namespace
was not declared with the using statement:
Hello::Hellworld::HelloPrint()*/
using namespace std;

void HelloWorld::HelloPrint()
{
    cout << "Hello World!" << endl;
}