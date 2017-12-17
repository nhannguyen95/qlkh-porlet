<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.qlkh.model.KhoHang" %>
<%@page import="com.qlkh.service.KhoHangLocalServiceUtil" %>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />

 <%
 PortletURL homeURL = renderResponse.createRenderURL();

 PortletURL viewHangTrongKhoURL = renderResponse.createRenderURL();
 viewHangTrongKhoURL.setParameter("mvcPath", "/html/quanlykhohang/view_hangtrongkho.jsp");
 
 PortletURL suaKhoHangURL = renderResponse.createRenderURL();
 suaKhoHangURL.setParameter("mvcPath", "/html/quanlykhohang/edit_khohang.jsp");
 
 PortletURL qlkhURL = renderResponse.createRenderURL();
 qlkhURL.setParameter("mvcPath", "/html/quanlykhohang/quanly_khohang.jsp");
 
 PortletURL xoaKhoHangURL = renderResponse.createActionURL();
 xoaKhoHangURL.setParameter(ActionRequest.ACTION_NAME, "xoaKhoHang");
 
%>

<a href="<%=qlkhURL.toString()%>">Back</a><br/>

<%
   	String maKho = request.getParameter("MaKho");
	KhoHang khoHang = KhoHangLocalServiceUtil.getKhoHang(maKho);
	
	xoaKhoHangURL.setParameter("MaKho", maKho);
%>
<h3>Thong tin kho hang</h3></br> 
<b>Ma Kho: </b><%=khoHang.getMaKho()%> </br>
<b>Ten Kho: </b> <%=khoHang.getTenKho() %></br>
<b>Dia Diem: </b> <%=khoHang.getDiaDiem() %></br>

</br>

<a href="<%=viewHangTrongKhoURL.toString()+"&"+renderResponse.getNamespace()+"MaKho="+khoHang.getMaKho()%>">Xem hang trong kho</a><br/>
<a href="<%=suaKhoHangURL.toString()+"&"+renderResponse.getNamespace()+"MaKho="+khoHang.getMaKho()%>">Sua thong tin kho</a><br/>
<a href="<%=xoaKhoHangURL%>">Xoa kho</a><br/>
