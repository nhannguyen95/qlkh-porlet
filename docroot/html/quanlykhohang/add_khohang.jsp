
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
 	PortletURL addKhoHangURL = renderResponse.createActionURL();
	addKhoHangURL.setParameter(ActionRequest.ACTION_NAME, "addKhoHang");
%>

<aui:form action="<%=addKhoHangURL.toString()%>" name="khoHangForm" method="POST">

<aui:input name="MaKho" >

</aui:input>

<aui:input name="TenKho" >

</aui:input> 

<aui:input name="DiaDiem" >

</aui:input>

<aui:button type="submit" name="" value="Them"></aui:button>

</aui:form>

