<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.qlkh.model.MatHang" %>
<%@page import="com.qlkh.service.MatHangLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.test.QuanLyKhoHang" %>
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
	String actionId = "VIEW_MATHANGS";
%>

<c:choose>
	<c:when test="<%= permissionChecker.hasPermission(groupId, name, primKey, actionId) %>">
		<%
 		PortletURL homeURL = renderResponse.createRenderURL();

		PortletURL matHangDetailsURL = renderResponse.createRenderURL();
		matHangDetailsURL.setParameter("mvcPath", "/html/quanlykhohang/mathang_detail.jsp");

		PortletURL addMatHang = renderResponse.createRenderURL();
		addMatHang.setParameter("mvcPath", "/html/quanlykhohang/add_mathang.jsp");

		PortletURL viewURL = renderResponse.createRenderURL();
		viewURL.setParameter("mvcPath", "/html/quanlykhohang/view.jsp");
	
		PortletURL timMatHangURL = renderResponse.createActionURL();
		timMatHangURL.setParameter(ActionRequest.ACTION_NAME, "timHangTheoTen");
		
		String tenMatHang = request.getParameter("TenHang");
		List<MatHang> matHangs = new ArrayList<MatHang>();
		if (tenMatHang == null || tenMatHang.equals("")) {
			matHangs = MatHangLocalServiceUtil.getMatHangs(-1, -1);
		} else {
			QuanLyKhoHang qlkh = new QuanLyKhoHang();
			matHangs = qlkh.timMatHangTheoTen(tenMatHang);	
		}
		 
		%>
			
		<liferay-ui:error key="matHang.errorMsg.coTrongKho" message="Xuat het hang trong kho truoc khi xoa"/>
		<liferay-ui:error key="matHang.errorMsg.coHang" message="Mat Hang da ton tai"/>

		<a href="<%=viewURL.toString()%>">Ve Trang Chu</a><br/>
		<a href="<%=addMatHang.toString()%>">Them Mat Hang</a><br/>

		</br>
	
		<aui:form action="<%=timMatHangURL.toString()%>" name="timMatHangForm" method="POST">
			<aui:input name="TenHang" ></aui:input>
			<aui:button type="submit" name="" value="Tim kiem"></aui:button>
		</aui:form>
		</br>
		</br>
		
		
		<liferay-ui:search-container delta="5" deltaConfigurable="true" emptyResultsMessage="Khong co du lieu">
	<liferay-ui:search-container-results
		results="<%= ListUtil.subList(matHangs, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= MatHangLocalServiceUtil.getMatHangsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.qlkh.model.MatHang"
		modelVar="aMatHang"
	>
		<portlet:renderURL var="rowURL">
		<portlet:param name="MaHang" value="<%=aMatHang.getMaHang() %>"></portlet:param>
		<portlet:param name="mvcPath" value="/html/quanlykhohang/mathang_detail.jsp"/>
		</portlet:renderURL>
	
		<liferay-ui:search-container-column-text property="maHang" />

		<liferay-ui:search-container-column-text property="tenHang" />

		<liferay-ui:search-container-column-text property="giaThanh" />
		
		<liferay-ui:search-container-column-text href="${rowURL}" name="Detail" value="Click Here For Detail"/>

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
		
		
		<%-- <table border="1">  
		    <tr>  
		        <th>Ma Hang</th>  
		        <th>Ten Hang </th>  
		        <th>Gia Thanh </th>  
		    </tr>  
		    <%for(MatHang matHang : matHangs){ %>
		        <tr>
		        	<td>
		        		<a href="<%=matHangDetailsURL.toString()+"&"+renderResponse.getNamespace()+"MaHang="+matHang.getMaHang()%>"><%=matHang.getMaHang() %></a>
		        	</td> 
		            <td><%=matHang.getTenHang() %></td>  
		            <td><%=matHang.getGiaThanh() %></td>  
		       </tr>  
		  <%} %>
		  
		</table>  --%> 
	</c:when>
	<c:otherwise>
		<p style="color:red;font-weight: bold;">BAN KHONG CO QUYEN TRUY CAP TRANG NAY</p>
	</c:otherwise>
</c:choose>

