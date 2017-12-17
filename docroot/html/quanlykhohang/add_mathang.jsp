
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
 	PortletURL addMatHangURL = renderResponse.createActionURL();
	addMatHangURL.setParameter(ActionRequest.ACTION_NAME, "addMatHang");
%>

<aui:form action="<%=addMatHangURL.toString()%>" name="matHangForm" method="POST">

<aui:input name="MaHang" >

</aui:input>

<aui:input name="TenHang" >

</aui:input> 

<aui:input name="GiaThanh" >

</aui:input>

<aui:button type="submit" name="" value="Them"></aui:button>

</aui:form>

