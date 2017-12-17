package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.qlkh.model.HangTrongKho;
import com.qlkh.model.KhoHang;
import com.qlkh.model.MatHang;
import com.qlkh.service.HangTrongKhoLocalServiceUtil;
import com.qlkh.service.KhoHangLocalServiceUtil;
import com.qlkh.service.MatHangLocalServiceUtil;
import com.qlkh.service.persistence.HangTrongKhoPK;

/**
 * Portlet implementation class QuanLyKhoHang
 */
public class QuanLyKhoHang extends MVCPortlet {
	
	public void timKhoTheoTen(ActionRequest actionRequest, ActionResponse actionResponse) {
		String tenHang = ParamUtil.getString(actionRequest, "TenKho");
		actionResponse.setRenderParameter("TenKho", tenHang);
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/quanly_khohang.jsp");
	}
	
	public List<KhoHang> timKhoHangTheoTen(String tenKhoHang) throws SystemException {
		List<KhoHang> matHangs = KhoHangLocalServiceUtil.getKhoHangs(-1, -1);
		List<KhoHang> result = new ArrayList<KhoHang>();
		for(KhoHang mh : matHangs) {
			if (mh.getTenKho().startsWith(tenKhoHang)) {
				result.add(mh);
			}
		}
		return result;
	}
	
	public void timHangTheoTen(ActionRequest actionRequest, ActionResponse actionResponse) {
		String tenHang = ParamUtil.getString(actionRequest, "TenHang");
		actionResponse.setRenderParameter("TenHang", tenHang);
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/quanly_mathang.jsp");
	}
	
	public List<MatHang> timMatHangTheoTen(String tenMatHang) throws SystemException {
		List<MatHang> matHangs = MatHangLocalServiceUtil.getMatHangs(-1, -1);
		List<MatHang> result = new ArrayList<MatHang>();
		for(MatHang mh : matHangs) {
			if (mh.getTenHang().startsWith(tenMatHang)) {
				result.add(mh);
			}
		}
		return result;
	}
	
	public void addKhoHang(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, SystemException {

		String maKho = ParamUtil.getString(actionRequest, "MaKho");
		String tenKho = ParamUtil.getString(actionRequest, "TenKho");
		String diaDiem = ParamUtil.getString(actionRequest, "DiaDiem");
		
		KhoHang khoHang;
		try {
			khoHang = KhoHangLocalServiceUtil.getKhoHang(maKho);
			SessionErrors.add(actionRequest, "khoHang.errorMsg.coKho");
		} catch (PortalException e) {
			khoHang = KhoHangLocalServiceUtil.createKhoHang(maKho);
			khoHang.setMaKho(maKho);
			khoHang.setTenKho(tenKho);
			khoHang.setDiaDiem(diaDiem);
			KhoHangLocalServiceUtil.addKhoHang(khoHang);
		}
	

		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/quanly_khohang.jsp");

	}
	
	public List<MatHangVaSoLuong> showHangTrongMotKho(String maKho)
			throws IOException, PortletException, SystemException, PortalException {
		List<HangTrongKho> hangTrongKhos = HangTrongKhoLocalServiceUtil.getHangTrongKhos(-1, -1);
		
		List<MatHangVaSoLuong> mhsls = new ArrayList<MatHangVaSoLuong>();
		for(HangTrongKho htk: hangTrongKhos) {
			if(htk.getMaKho().equals(maKho)) {
				mhsls.add(new MatHangVaSoLuong(MatHangLocalServiceUtil.getMatHang(htk.getMaHang()), htk.getSoLuong()));
			}
		}
		
		return mhsls;
	}
	
	public void editKhoHang(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		String maKho = ParamUtil.getString(actionRequest, "MaKho");
		String tenKho = ParamUtil.getString(actionRequest, "TenKho");
		String diaDiem = ParamUtil.getString(actionRequest, "DiaDiem");
		
		KhoHang khoHang = null;
		khoHang = KhoHangLocalServiceUtil.getKhoHang(maKho);
		khoHang.setTenKho(tenKho);
		khoHang.setDiaDiem(diaDiem);
		
		
		khoHang = KhoHangLocalServiceUtil.updateKhoHang(khoHang);

		actionResponse.setRenderParameter("MaKho", maKho);
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/khohang_detail.jsp");
	}
	
	public void xoaKhoHang(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		String maKho = ParamUtil.getString(actionRequest, "MaKho");
		KhoHangLocalServiceUtil.deleteKhoHang(maKho);
		
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/quanly_khohang.jsp");
	}
	
	private boolean coHang(String maHang) throws SystemException {
		List<MatHang> matHangs = MatHangLocalServiceUtil.getMatHangs(-1, -1);
		for(MatHang matHang : matHangs) {
			if (matHang.getMaHang().equals(maHang)) {
				return true;
			}
		}
		return false;
	}
	
	public void editHangTrongKho(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException {
		String maKho = ParamUtil.getString(actionRequest, "MaKho");
		String maHang = ParamUtil.getString(actionRequest, "MaHang");
		Long soLuong = ParamUtil.getLong(actionRequest, "SoLuong");
		
		if (coHang(maHang)) { 
			
			HangTrongKhoPK keys = new HangTrongKhoPK(maKho, maHang);
			HangTrongKho hangTrongKho;
			try {
				hangTrongKho = HangTrongKhoLocalServiceUtil.getHangTrongKho(keys);
			} catch (PortalException e) {
				hangTrongKho = HangTrongKhoLocalServiceUtil.createHangTrongKho(keys);
			}
			
			hangTrongKho.setSoLuong(soLuong);
			HangTrongKhoLocalServiceUtil.updateHangTrongKho(hangTrongKho);
		} else {
			SessionErrors.add(actionRequest, "matHang.errorMsg.khongCoHang");
		}
		
		actionResponse.setRenderParameter("MaKho", maKho);
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/view_hangtrongkho.jsp");
	}
	
	public void addMatHang(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, SystemException {

		String maHang = ParamUtil.getString(actionRequest, "MaHang");
		String tenHang = ParamUtil.getString(actionRequest, "TenHang");
		String giaThanh = ParamUtil.getString(actionRequest, "GiaThanh");
		
		MatHang matHang = null;
		try {
			matHang = MatHangLocalServiceUtil.getMatHang(maHang);
			SessionErrors.add(actionRequest, "matHang.errorMsg.coHang");
		} catch (PortalException e) {
			matHang = MatHangLocalServiceUtil.createMatHang(maHang);
			matHang.setMaHang(maHang);
			matHang.setTenHang(tenHang);
			matHang.setGiaThanh(giaThanh);
			MatHangLocalServiceUtil.addMatHang(matHang);
		}
		
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/quanly_mathang.jsp");
	}
	
	private boolean coTrongKho(String maHang) throws SystemException {
		List<HangTrongKho> hangTrongKhos = HangTrongKhoLocalServiceUtil.getHangTrongKhos(-1, -1);
		for(HangTrongKho hangTrongKho : hangTrongKhos) {
			if (hangTrongKho.getMaHang().equals(maHang)) {
				return true;
			}
		}
		return false;
	}
	
	public void xoaMatHang(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		String maHang = ParamUtil.getString(actionRequest, "MaHang");
		
		if (!coTrongKho(maHang)) {
			MatHangLocalServiceUtil.deleteMatHang(maHang);
		} else {
			SessionErrors.add(actionRequest, "matHang.errorMsg.coTrongKho");
		}
		
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/quanly_mathang.jsp");
	}
	
	public void editMatHang(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		String maHang = ParamUtil.getString(actionRequest, "MaHang");
		String tenHang = ParamUtil.getString(actionRequest, "TenHang");
		String giaThanh = ParamUtil.getString(actionRequest, "GiaThanh");
		
		MatHang matHang = null;
		matHang = MatHangLocalServiceUtil.getMatHang(maHang);
		matHang.setTenHang(tenHang);
		matHang.setGiaThanh(giaThanh);
		
		
		matHang = MatHangLocalServiceUtil.updateMatHang(matHang);

		actionResponse.setRenderParameter("MaHang", maHang);
		actionResponse.setRenderParameter("mvcPath", "/html/quanlykhohang/mathang_detail.jsp");
	}
	

}
