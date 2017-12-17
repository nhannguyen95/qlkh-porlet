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

import com.qlkh.service.persistence.HangTrongKhoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.qlkh.service.http.HangTrongKhoServiceSoap}.
 *
 * @author apple
 * @see com.qlkh.service.http.HangTrongKhoServiceSoap
 * @generated
 */
public class HangTrongKhoSoap implements Serializable {
	public static HangTrongKhoSoap toSoapModel(HangTrongKho model) {
		HangTrongKhoSoap soapModel = new HangTrongKhoSoap();

		soapModel.setMaKho(model.getMaKho());
		soapModel.setMaHang(model.getMaHang());
		soapModel.setSoLuong(model.getSoLuong());

		return soapModel;
	}

	public static HangTrongKhoSoap[] toSoapModels(HangTrongKho[] models) {
		HangTrongKhoSoap[] soapModels = new HangTrongKhoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HangTrongKhoSoap[][] toSoapModels(HangTrongKho[][] models) {
		HangTrongKhoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HangTrongKhoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HangTrongKhoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HangTrongKhoSoap[] toSoapModels(List<HangTrongKho> models) {
		List<HangTrongKhoSoap> soapModels = new ArrayList<HangTrongKhoSoap>(models.size());

		for (HangTrongKho model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HangTrongKhoSoap[soapModels.size()]);
	}

	public HangTrongKhoSoap() {
	}

	public HangTrongKhoPK getPrimaryKey() {
		return new HangTrongKhoPK(_MaKho, _MaHang);
	}

	public void setPrimaryKey(HangTrongKhoPK pk) {
		setMaKho(pk.MaKho);
		setMaHang(pk.MaHang);
	}

	public String getMaKho() {
		return _MaKho;
	}

	public void setMaKho(String MaKho) {
		_MaKho = MaKho;
	}

	public String getMaHang() {
		return _MaHang;
	}

	public void setMaHang(String MaHang) {
		_MaHang = MaHang;
	}

	public long getSoLuong() {
		return _SoLuong;
	}

	public void setSoLuong(long SoLuong) {
		_SoLuong = SoLuong;
	}

	private String _MaKho;
	private String _MaHang;
	private long _SoLuong;
}