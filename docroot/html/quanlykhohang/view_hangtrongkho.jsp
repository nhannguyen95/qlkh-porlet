<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />


<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.qlkh.model.KhoHang" %>
<%@page import="com.qlkh.model.MatHang" %>
<%@page import="com.test.MatHangVaSoLuong" %>
<%@page import="com.test.QuanLyKhoHang" %>
<%@page import="com.qlkh.service.KhoHangLocalServiceUtil" %>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />


<%
 PortletURL homeURL = renderResponse.createRenderURL();

PortletURL qlkhURL = renderResponse.createRenderURL();
qlkhURL.setParameter("mvcPath", "/html/quanlykhohang/quanly_khohang.jsp");

PortletURL editHangTrongKhoURL = renderResponse.createActionURL();
editHangTrongKhoURL.setParameter(ActionRequest.ACTION_NAME, "editHangTrongKho");

%>


<%
	String maKho = request.getParameter("MaKho");
	editHangTrongKhoURL.setParameter("MaKho", maKho);

	QuanLyKhoHang qlkh = new QuanLyKhoHang();
   	List<MatHangVaSoLuong> mhsls = qlkh.showHangTrongMotKho(maKho);
%>

<liferay-ui:error key="matHang.errorMsg.khongCoHang" message="Mat Hang khong ton tai"/>

<a href="<%=qlkhURL.toString()%>">Back</a><br/>

</br>

<h3>Cac mat hang trong kho <%=maKho %></h3>

</br>

<table border="1">  
    <tr>  
        <th>Ma Hang </th>  
        <th>Ten Hang </th>  
        <th>So Luong </th>  

     
    </tr>  
    <%for(MatHangVaSoLuong mhsl : mhsls){ %>
        <tr> 
            <td><%=mhsl.matHang.getMaHang() %></td>  
            <td><%=mhsl.matHang.getTenHang() %></td>
            <td><%=mhsl.soLuong %></td>
       </tr>  
  <%} %>
</table>

</br>

<h4>Xuat Nhap kho</h4></br>
<aui:form action="<%=editHangTrongKhoURL.toString()%>" name="editHangTrongKhoForm" method="POST">

<aui:input name="MaHang" >

</aui:input> 

<aui:input name="SoLuong" >

</aui:input>

<aui:button type="submit" name="" value="Cap Nhap"></aui:button>

</aui:form>