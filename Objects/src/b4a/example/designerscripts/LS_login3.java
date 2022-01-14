package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login3{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnluser").vw.setTop((int)((25d / 100 * height)));
views.get("pnluser").vw.setLeft((int)((18d / 100 * width)));
views.get("pnluser").vw.setWidth((int)((64d / 100 * width)));
views.get("pnluser").vw.setHeight((int)((13d / 100 * height)));
views.get("txtuser").vw.setTop((int)((views.get("pnluser").vw.getTop())+(3d / 100 * height)));
views.get("txtuser").vw.setLeft((int)((views.get("pnluser").vw.getLeft())));
views.get("txtuser").vw.setWidth((int)((views.get("pnluser").vw.getWidth())));
views.get("txtuser").vw.setHeight((int)((8d / 100 * height)));
views.get("pnlpassword").vw.setTop((int)((views.get("pnluser").vw.getTop() + views.get("pnluser").vw.getHeight())+(2d / 100 * height)));
views.get("pnlpassword").vw.setLeft((int)((18d / 100 * width)));
views.get("pnlpassword").vw.setWidth((int)((64d / 100 * width)));
views.get("pnlpassword").vw.setHeight((int)((13d / 100 * height)));
views.get("txtpassword").vw.setTop((int)((views.get("pnlpassword").vw.getTop())+(3d / 100 * height)));
views.get("txtpassword").vw.setLeft((int)((views.get("pnlpassword").vw.getLeft())));
views.get("txtpassword").vw.setWidth((int)((views.get("pnlpassword").vw.getWidth())));
views.get("txtpassword").vw.setHeight((int)((8d / 100 * height)));
views.get("btnlogin").vw.setTop((int)((5d / 100 * height)+(views.get("pnlpassword").vw.getTop() + views.get("pnlpassword").vw.getHeight())));
views.get("btnlogin").vw.setLeft((int)((35d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((30d / 100 * width)));
views.get("btnlogin").vw.setHeight((int)((views.get("btnlogin").vw.getWidth())));

}
}