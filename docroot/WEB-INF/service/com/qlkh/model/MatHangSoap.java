/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.qlkh.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.qlkh.service.http.MatHangServiceSoap}.
 *
 * @author apple
 * @see com.qlkh.service.http.MatHangServiceSoap
 * @generated
 */
public class MatHangSoap implements Serializable {
	public static MatHangSoap toSoapModel(MatHang model) {
		MatHangSoap soapModel = new MatHangSoap();

		soapModel.setMaHang(model.getMaHang());
		soapModel.setTenHang(model.getTenHang());
		soapModel.setGiaThanh(model.getGiaThanh());

		return soapModel;
	}

	public static MatHangSoap[] toSoapModels(MatHang[] models) {
		MatHangSoap[] soapModels = new MatHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MatHangSoap[][] toSoapModels(MatHang[][] models) {
		MatHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MatHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MatHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MatHangSoap[] toSoapModels(List<MatHang> models) {
		List<MatHangSoap> soapModels = new ArrayList<MatHangSoap>(models.size());

		for (MatHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MatHangSoap[soapModels.size()]);
	}

	public MatHangSoap() {
	}

	public String getPrimaryKey() {
		return _MaHang;
	}

	public void setPrimaryKey(String pk) {
		setMaHang(pk);
	}

	public String getMaHang() {
		return _MaHang;
	}

	public void setMaHang(String MaHang) {
		_MaHang = MaHang;
	}

	public String getTenHang() {
		return _TenHang;
	}

	public void setTenHang(String TenHang) {
		_TenHang = TenHang;
	}

	public String getGiaThanh() {
		return _GiaThanh;
	}

	public void setGiaThanh(String GiaThanh) {
		_GiaThanh = GiaThanh;
	}

	private String _MaHang;
	private String _TenHang;
	private String _GiaThanh;
}