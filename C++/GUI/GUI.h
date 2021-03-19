
#include "wx/wx.h"
#include <iostream>
#include "Main.h"
#ifndef GUI_H //include guard
#define GUI_H

namespace Hello
{
    class GUI : public wxApp
    {
    public:
        GUI();
        ~GUI();
    private: Main* m_frame1 = nullptr;
    public:
        virtual bool OnInit();
    };
}
#endif /* HelloWorld_H */