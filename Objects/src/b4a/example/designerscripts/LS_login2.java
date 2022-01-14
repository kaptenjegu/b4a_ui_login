package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login2{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lbljudul").vw.setTop((int)((20d / 100 * height)));
views.get("lbljudul").vw.setLeft((int)((19d / 100 * width)));
views.get("lbljudul").vw.setWidth((int)((62d / 100 * width)));
views.get("lbljudul").vw.setHeight((int)((10d / 100 * height)));
views.get("pnluser").vw.setTop((int)((5d / 100 * height)+(views.get("lbljudul").vw.getTop() + views.get("lbljudul").vw.getHeight())));
views.get("pnluser").vw.setLeft((int)((19d / 100 * width)));
views.get("pnluser").vw.setWidth((int)((62d / 100 * width)));
views.get("pnluser").vw.setHeight((int)((11d / 100 * height)));
views.get("txtuser").vw.setTop((int)((views.get("pnluser").vw.getTop())+(3d / 100 * height)));
views.get("txtuser").vw.setLeft((int)((views.get("pnluser").vw.getLeft())));
views.get("txtuser").vw.setWidth((int)((views.get("pnluser").vw.getWidth())));
views.get("txtuser").vw.setHeight((int)((views.get("pnluser").vw.getHeight())-(4d / 100 * height)));
((TextViewWrapper)views.get("txtuser").vw).setText((BA.NumberToString(views.get("txtuser").vw.getHeight())));
views.get("pnlpassword").vw.setTop((int)((1d / 100 * height)+(views.get("pnluser").vw.getTop() + views.get("pnluser").vw.getHeight())));
views.get("pnlpassword").vw.setLeft((int)((views.get("pnluser").vw.getLeft())));
views.get("pnlpassword").vw.setWidth((int)((views.get("pnluser").vw.getWidth())));
views.get("pnlpassword").vw.setHeight((int)((views.get("pnluser").vw.getHeight())));
views.get("txtpassword").vw.setTop((int)((3d / 100 * height)+(views.get("pnlpassword").vw.getTop())));
views.get("txtpassword").vw.setLeft((int)((views.get("pnlpassword").vw.getLeft())));
views.get("txtpassword").vw.setWidth((int)((views.get("pnlpassword").vw.getWidth())));
views.get("txtpassword").vw.setHeight((int)((views.get("pnlpassword").vw.getHeight())-(4d / 100 * height)));
views.get("btnlogin").vw.setTop((int)((1d / 100 * height)+(views.get("pnlpassword").vw.getTop() + views.get("pnlpassword").vw.getHeight())));
views.get("btnlogin").vw.setLeft((int)((views.get("pnlpassword").vw.getLeft())));
views.get("btnlogin").vw.setWidth((int)((views.get("pnlpassword").vw.getWidth())));
views.get("btnlogin").vw.setHeight((int)((views.get("pnlpassword").vw.getHeight())));

}
}