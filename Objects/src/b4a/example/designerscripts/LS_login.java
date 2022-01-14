package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[login/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 5;BA.debugLine="logo.Top = 10%y"[login/General script]
views.get("logo").vw.setTop((int)((10d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="logo.Left = 25%x"[login/General script]
views.get("logo").vw.setLeft((int)((25d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="logo.Width = 50%x"[login/General script]
views.get("logo").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 8;BA.debugLine="logo.Height = 30%y"[login/General script]
views.get("logo").vw.setHeight((int)((30d / 100 * height)));
//BA.debugLineNum = 11;BA.debugLine="pnlUser.Top = logo.Bottom + 3%y"[login/General script]
views.get("pnluser").vw.setTop((int)((views.get("logo").vw.getTop() + views.get("logo").vw.getHeight())+(3d / 100 * height)));
//BA.debugLineNum = 12;BA.debugLine="pnlUser.Left = 7%x"[login/General script]
views.get("pnluser").vw.setLeft((int)((7d / 100 * width)));
//BA.debugLineNum = 13;BA.debugLine="pnlUser.Width = 63%x"[login/General script]
views.get("pnluser").vw.setWidth((int)((63d / 100 * width)));
//BA.debugLineNum = 14;BA.debugLine="pnlUser.Height = 11%y"[login/General script]
views.get("pnluser").vw.setHeight((int)((11d / 100 * height)));
//BA.debugLineNum = 16;BA.debugLine="txtUser.Top = pnlUser.Top + 3%y"[login/General script]
views.get("txtuser").vw.setTop((int)((views.get("pnluser").vw.getTop())+(3d / 100 * height)));
//BA.debugLineNum = 17;BA.debugLine="txtUser.Left = pnlUser.Left + 3%x"[login/General script]
views.get("txtuser").vw.setLeft((int)((views.get("pnluser").vw.getLeft())+(3d / 100 * width)));
//BA.debugLineNum = 18;BA.debugLine="txtUser.Width = 57%x"[login/General script]
views.get("txtuser").vw.setWidth((int)((57d / 100 * width)));
//BA.debugLineNum = 19;BA.debugLine="txtUser.Height = 7%y"[login/General script]
views.get("txtuser").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 23;BA.debugLine="pnlPassword.Top = txtUser.Bottom + 2%y"[login/General script]
views.get("pnlpassword").vw.setTop((int)((views.get("txtuser").vw.getTop() + views.get("txtuser").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 24;BA.debugLine="pnlPassword.Left = pnlUser.Left"[login/General script]
views.get("pnlpassword").vw.setLeft((int)((views.get("pnluser").vw.getLeft())));
//BA.debugLineNum = 25;BA.debugLine="pnlPassword.Width = pnlUser.Width"[login/General script]
views.get("pnlpassword").vw.setWidth((int)((views.get("pnluser").vw.getWidth())));
//BA.debugLineNum = 26;BA.debugLine="pnlPassword.Height = pnlUser.Height"[login/General script]
views.get("pnlpassword").vw.setHeight((int)((views.get("pnluser").vw.getHeight())));
//BA.debugLineNum = 28;BA.debugLine="txtPassword.Top = pnlPassword.Top + 3%y"[login/General script]
views.get("txtpassword").vw.setTop((int)((views.get("pnlpassword").vw.getTop())+(3d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="txtPassword.Left = pnlPassword.Left + 3%x"[login/General script]
views.get("txtpassword").vw.setLeft((int)((views.get("pnlpassword").vw.getLeft())+(3d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="txtPassword.Width = txtUser.Width"[login/General script]
views.get("txtpassword").vw.setWidth((int)((views.get("txtuser").vw.getWidth())));
//BA.debugLineNum = 31;BA.debugLine="txtPassword.Height = txtUser.Height"[login/General script]
views.get("txtpassword").vw.setHeight((int)((views.get("txtuser").vw.getHeight())));
//BA.debugLineNum = 35;BA.debugLine="btnLogin.Top = pnlUser.Top"[login/General script]
views.get("btnlogin").vw.setTop((int)((views.get("pnluser").vw.getTop())));
//BA.debugLineNum = 36;BA.debugLine="btnLogin.Left = pnlUser.Right + 2%x"[login/General script]
views.get("btnlogin").vw.setLeft((int)((views.get("pnluser").vw.getLeft() + views.get("pnluser").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 37;BA.debugLine="btnLogin.Width = 22%x"[login/General script]
views.get("btnlogin").vw.setWidth((int)((22d / 100 * width)));
//BA.debugLineNum = 38;BA.debugLine="btnLogin.Height = (pnlUser.Height * 2) + 2%x"[login/General script]
views.get("btnlogin").vw.setHeight((int)(((views.get("pnluser").vw.getHeight())*2d)+(2d / 100 * width)));
//BA.debugLineNum = 41;BA.debugLine="lblForgot.top = pnlPassword.Bottom + 20%y"[login/General script]
views.get("lblforgot").vw.setTop((int)((views.get("pnlpassword").vw.getTop() + views.get("pnlpassword").vw.getHeight())+(20d / 100 * height)));
//BA.debugLineNum = 42;BA.debugLine="lblForgot.Left = pnlPassword.Left"[login/General script]
views.get("lblforgot").vw.setLeft((int)((views.get("pnlpassword").vw.getLeft())));
//BA.debugLineNum = 43;BA.debugLine="lblForgot.Width = pnlPassword.Width + btnLogin.Width + 2%x"[login/General script]
views.get("lblforgot").vw.setWidth((int)((views.get("pnlpassword").vw.getWidth())+(views.get("btnlogin").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 44;BA.debugLine="lblForgot.height = txtUser.Height"[login/General script]
views.get("lblforgot").vw.setHeight((int)((views.get("txtuser").vw.getHeight())));

}
}