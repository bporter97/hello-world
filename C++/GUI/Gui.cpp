#include "GUI.h"

using namespace Hello;

wxIMPLEMENT_APP(GUI);
GUI::GUI()
{

}

GUI::~GUI()
{

}


bool GUI::OnInit()
{
    m_frame1 = new Main();
    m_frame1->Show();

    return true;
}