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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.qlkh.service.ClpSerializer;
import com.qlkh.service.HangTrongKhoLocalServiceUtil;
import com.qlkh.service.persistence.HangTrongKhoPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author apple
 */
public class HangTrongKhoClp extends BaseModelImpl<HangTrongKho>
	implements HangTrongKho {
	public HangTrongKhoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return HangTrongKho.class;
	}

	@Override
	public String getModelClassName() {
		return HangTrongKho.class.getName();
	}

	@Override
	public HangTrongKhoPK getPrimaryKey() {
		return new HangTrongKhoPK(_MaKho, _MaHang);
	}

	@Override
	public void setPrimaryKey(HangTrongKhoPK primaryKey) {
		setMaKho(primaryKey.MaKho);
		setMaHang(primaryKey.MaHang);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new HangTrongKhoPK(_MaKho, _MaHang);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((HangTrongKhoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MaKho", getMaKho());
		attributes.put("MaHang", getMaHang());
		attributes.put("SoLuong", getSoLuong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String MaKho = (String)attributes.get("MaKho");

		if (MaKho != null) {
			setMaKho(MaKho);
		}

		String MaHang = (String)attributes.get("MaHang");

		if (MaHang != null) {
			setMaHang(MaHang);
		}

		Long SoLuong = (Long)attributes.get("SoLuong");

		if (SoLuong != null) {
			setSoLuong(SoLuong);
		}
	}

	@Override
	public String getMaKho() {
		return _MaKho;
	}

	@Override
	public void setMaKho(String MaKho) {
		_MaKho = MaKho;

		if (_hangTrongKhoRemoteModel != null) {
			try {
				Class<?> clazz = _hangTrongKhoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaKho", String.class);

				method.invoke(_hangTrongKhoRemoteModel, MaKho);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaHang() {
		return _MaHang;
	}

	@Override
	public void setMaHang(String MaHang) {
		_MaHang = MaHang;

		if (_hangTrongKhoRemoteModel != null) {
			try {
				Class<?> clazz = _hangTrongKhoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHang", String.class);

				method.invoke(_hangTrongKhoRemoteModel, MaHang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoLuong() {
		return _SoLuong;
	}

	@Override
	public void setSoLuong(long SoLuong) {
		_SoLuong = SoLuong;

		if (_hangTrongKhoRemoteModel != null) {
			try {
				Class<?> clazz = _hangTrongKhoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", long.class);

				method.invoke(_hangTrongKhoRemoteModel, SoLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHangTrongKhoRemoteModel() {
		return _hangTrongKhoRemoteModel;
	}

	public void setHangTrongKhoRemoteModel(BaseModel<?> hangTrongKhoRemoteModel) {
		_hangTrongKhoRemoteModel = hangTrongKhoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _hangTrongKhoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_hangTrongKhoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HangTrongKhoLocalServiceUtil.addHangTrongKho(this);
		}
		else {
			HangTrongKhoLocalServiceUtil.updateHangTrongKho(this);
		}
	}

	@Override
	public HangTrongKho toEscapedModel() {
		return (HangTrongKho)ProxyUtil.newProxyInstance(HangTrongKho.class.getClassLoader(),
			new Class[] { HangTrongKho.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HangTrongKhoClp clone = new HangTrongKhoClp();

		clone.setMaKho(getMaKho());
		clone.setMaHang(getMaHang());
		clone.setSoLuong(getSoLuong());

		return clone;
	}

	@Override
	public int compareTo(HangTrongKho hangTrongKho) {
		HangTrongKhoPK primaryKey = hangTrongKho.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HangTrongKhoClp)) {
			return false;
		}

		HangTrongKhoClp hangTrongKho = (HangTrongKhoClp)obj;

		HangTrongKhoPK primaryKey = hangTrongKho.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{MaKho=");
		sb.append(getMaKho());
		sb.append(", MaHang=");
		sb.append(getMaHang());
		sb.append(", SoLuong=");
		sb.append(getSoLuong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.qlkh.model.HangTrongKho");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>MaKho</column-name><column-value><![CDATA[");
		sb.append(getMaKho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaHang</column-name><column-value><![CDATA[");
		sb.append(getMaHang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _MaKho;
	private String _MaHang;
	private long _SoLuong;
	private BaseModel<?> _hangTrongKhoRemoteModel;
}