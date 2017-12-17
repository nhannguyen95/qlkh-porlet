
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.qlkh.model.MatHang" %>
<%@page import="com.qlkh.service.MatHangLocalServiceUtil" %>
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
	String maHang = request.getParameter("MaHang");
	MatHang matHang = MatHangLocalServiceUtil.getMatHang(maHang);

 	PortletURL editMatHangURL = renderResponse.createActionURL();
	editMatHangURL.setParameter(ActionRequest.ACTION_NAME, "editMatHang");
%>

<aui:form action="<%=editMatHangURL.toString()%>" name="matHangForm" method="POST">

<aui:input name="MaHang" readonly="true">

</aui:input>

<aui:input name="TenHang" value="<%=matHang.getTenHang() %>">

</aui:input> 

<aui:input name="GiaThanh" value="<%=matHang.getGiaThanh() %>">

</aui:input>

<aui:button type="submit" name="" value="Cap nhap"></aui:button>

</aui:form>

