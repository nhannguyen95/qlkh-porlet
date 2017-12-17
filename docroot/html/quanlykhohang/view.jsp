<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

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

PortletURL quanLyKhoHang = renderResponse.createRenderURL();
quanLyKhoHang.setParameter("mvcPath", "/html/quanlykhohang/quanly_khohang.jsp");

PortletURL quanLyMatHang = renderResponse.createRenderURL();
quanLyMatHang.setParameter("mvcPath", "/html/quanlykhohang/quanly_mathang.jsp");

%>

<%
   List<KhoHang> khoHangs = KhoHangLocalServiceUtil.getKhoHangs(-1, -1);
%>

<h3>Porlet Quan Ly Kho Hang</h3>

</br>

<a href="<%=quanLyKhoHang.toString()%>">Quan Ly Kho Hang</a><br/>
<a href="<%=quanLyMatHang.toString()%>">Quan Ly Mat Hang</a><br/>

</br>