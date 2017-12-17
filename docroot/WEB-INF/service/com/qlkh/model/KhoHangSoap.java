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
 * This class is used by SOAP remote services, specifically {@link com.qlkh.service.http.KhoHangServiceSoap}.
 *
 * @author apple
 * @see com.qlkh.service.http.KhoHangServiceSoap
 * @generated
 */
public class KhoHangSoap implements Serializable {
	public static KhoHangSoap toSoapModel(KhoHang model) {
		KhoHangSoap soapModel = new KhoHangSoap();

		soapModel.setMaKho(model.getMaKho());
		soapModel.setTenKho(model.getTenKho());
		soapModel.setDiaDiem(model.getDiaDiem());

		return soapModel;
	}

	public static KhoHangSoap[] toSoapModels(KhoHang[] models) {
		KhoHangSoap[] soapModels = new KhoHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhoHangSoap[][] toSoapModels(KhoHang[][] models) {
		KhoHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhoHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhoHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhoHangSoap[] toSoapModels(List<KhoHang> models) {
		List<KhoHangSoap> soapModels = new ArrayList<KhoHangSoap>(models.size());

		for (KhoHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhoHangSoap[soapModels.size()]);
	}

	public KhoHangSoap() {
	}

	public String getPrimaryKey() {
		return _MaKho;
	}

	public void setPrimaryKey(String pk) {
		setMaKho(pk);
	}

	public String getMaKho() {
		return _MaKho;
	}

	public void setMaKho(String MaKho) {
		_MaKho = MaKho;
	}

	public String getTenKho() {
		return _TenKho;
	}

	public void setTenKho(String TenKho) {
		_TenKho = TenKho;
	}

	public String getDiaDiem() {
		return _DiaDiem;
	}

	public void setDiaDiem(String DiaDiem) {
		_DiaDiem = DiaDiem;
	}

	private String _MaKho;
	private String _TenKho;
	private String _DiaDiem;
}