<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.qlkh.model.KhoHang" %>
<%@page import="com.test.QuanLyKhoHang" %>
<%@page import="com.qlkh.service.KhoHangLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
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
	String actionId = "QUANLY_KHOHANG";
%>

<c:choose>
	<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId) %>">
		<%
 		PortletURL homeURL = renderResponse.createRenderURL();

		PortletURL khoHangDetailsURL = renderResponse.createRenderURL();
		khoHangDetailsURL.setParameter("mvcPath", "/html/quanlykhohang/khohang_detail.jsp");

		PortletURL addKhoHang = renderResponse.createRenderURL();
		addKhoHang.setParameter("mvcPath", "/html/quanlykhohang/add_khohang.jsp");

		PortletURL viewURL = renderResponse.createRenderURL();
		viewURL.setParameter("mvcPath", "/html/quanlykhohang/view.jsp");

		PortletURL timKhoHangURL = renderResponse.createActionURL();
		timKhoHangURL.setParameter(ActionRequest.ACTION_NAME, "timKhoTheoTen");
		
		String tenKhoHang = request.getParameter("TenKho");
		List<KhoHang> khoHangs = new ArrayList<KhoHang>();
		if (tenKhoHang == null || tenKhoHang.equals("")) {
			khoHangs = KhoHangLocalServiceUtil.getKhoHangs(-1, -1);
		} else {
			QuanLyKhoHang qlkh = new QuanLyKhoHang();
			khoHangs = qlkh.timKhoHangTheoTen(tenKhoHang);	
		}
   
		%>
		
		<liferay-ui:error key="khoHang.errorMsg.coKho" message="Kho hang da ton tai"/>

<a href="<%=viewURL.toString()%>">Ve Trang Chu</a><br/>
<a href="<%=addKhoHang.toString()%>">Them Kho Hang</a><br/>

</br>

<aui:form action="<%=timKhoHangURL.toString()%>" name="timKhoHangForm" method="POST">
			<aui:input name="TenKho" ></aui:input>
			<aui:button type="submit" name="" value="Tim kiem"></aui:button>
		</aui:form>
		</br>
		</br>
	
		<liferay-ui:search-container delta="5" deltaConfigurable="true" emptyResultsMessage="Khong co du lieu">
	<liferay-ui:search-container-results
		results="<%= ListUtil.subList(khoHangs, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= KhoHangLocalServiceUtil.getKhoHangsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.qlkh.model.KhoHang"
		modelVar="aKhoHang"
	>
		<portlet:renderURL var="rowURL">
		<portlet:param name="MaKho" value="<%=aKhoHang.getMaKho() %>"></portlet:param>
		<portlet:param name="mvcPath" value="/html/quanlykhohang/khohang_detail.jsp"/>
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text property="maKho" />
		<liferay-ui:search-container-column-text property="tenKho" />
		<liferay-ui:search-container-column-text property="diaDiem" />
		<liferay-ui:search-container-column-text href="${rowURL}" name="Detail" value="Click Here For Detail"/>
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
<%-- <table border="1">  
    <tr>  
        <th>Ma Kho </th>  
        <th>Ten Kho </th>  
        <th>Dia Diem </th>  

     
    </tr>  
    <%for(KhoHang khoHang : khoHangs){ %>
      
        <tr>
        	<td>
        		<a href="<%=khoHangDetailsURL.toString()+"&"+renderResponse.getNamespace()+"MaKho="+khoHang.getMaKho()%>"><%=khoHang.getMaKho() %></a>
        	</td> 
            <td><%=khoHang.getTenKho() %></td>  
            <td><%=khoHang.getDiaDiem() %></td>  
       </tr>  
  <%} %>
  
</table>  
 --%>	</c:when>
	<c:otherwise>
		<p style="color:red;font-weight: bold;">BAN KHONG CO QUYEN TRUY CAP TRANG NAY</p>
	</c:otherwise>
</c:choose>

