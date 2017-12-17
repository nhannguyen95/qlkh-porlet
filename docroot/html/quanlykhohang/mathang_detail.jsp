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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	long groupId = scopeGroupId;
	String name = portletDisplay.getRootPortletId();
	String primKey = portletDisplay.getResourcePK();
	String actionId = "CRUD_MATHANG";
%>

<c:choose>
	<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId) %>">
		<%
 PortletURL homeURL = renderResponse.createRenderURL();
 
 PortletURL suaMatHangURL = renderResponse.createRenderURL();
 suaMatHangURL.setParameter("mvcPath", "/html/quanlykhohang/edit_mathang.jsp");
 
 PortletURL qlkhURL = renderResponse.createRenderURL();
 qlkhURL.setParameter("mvcPath", "/html/quanlykhohang/quanly_mathang.jsp");
 
 PortletURL xoaMatHangURL = renderResponse.createActionURL();
 xoaMatHangURL.setParameter(ActionRequest.ACTION_NAME, "xoaMatHang");
 
%>
<a href="<%=qlkhURL.toString()%>">Back</a><br/>

<%
   	String maHang = request.getParameter("MaHang");
	MatHang matHang = MatHangLocalServiceUtil.getMatHang(maHang);
	
	xoaMatHangURL.setParameter("MaHang", maHang);
%>
<h3>Thong tin mat hang</h3></br> 
<b>Ma Hang: </b><%=matHang.getMaHang()%> </br>
<b>Ten Hang: </b> <%=matHang.getTenHang() %></br>
<b>Gia Thanh: </b> <%=matHang.getGiaThanh() %></br>

</br>

<a href="<%=suaMatHangURL.toString()+"&"+renderResponse.getNamespace()+"MaHang="+matHang.getMaHang()%>">Sua thong tin mat hang</a><br/>
<a href="<%=xoaMatHangURL%>">Xoa mat hang</a><br/>

	</c:when>
	<c:otherwise>
		<p style="color:red;font-weight: bold;">BAN KHONG CO QUYEN TRUY CAP TRANG NAY</p>
	</c:otherwise>
</c:choose>

