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
import com.qlkh.service.MatHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author apple
 */
public class MatHangClp extends BaseModelImpl<MatHang> implements MatHang {
	public MatHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MatHang.class;
	}

	@Override
	public String getModelClassName() {
		return MatHang.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _MaHang;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setMaHang(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _MaHang;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MaHang", getMaHang());
		attributes.put("TenHang", getTenHang());
		attributes.put("GiaThanh", getGiaThanh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String MaHang = (String)attributes.get("MaHang");

		if (MaHang != null) {
			setMaHang(MaHang);
		}

		String TenHang = (String)attributes.get("TenHang");

		if (TenHang != null) {
			setTenHang(TenHang);
		}

		String GiaThanh = (String)attributes.get("GiaThanh");

		if (GiaThanh != null) {
			setGiaThanh(GiaThanh);
		}
	}

	@Override
	public String getMaHang() {
		return _MaHang;
	}

	@Override
	public void setMaHang(String MaHang) {
		_MaHang = MaHang;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHang", String.class);

				method.invoke(_matHangRemoteModel, MaHang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenHang() {
		return _TenHang;
	}

	@Override
	public void setTenHang(String TenHang) {
		_TenHang = TenHang;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTenHang", String.class);

				method.invoke(_matHangRemoteModel, TenHang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGiaThanh() {
		return _GiaThanh;
	}

	@Override
	public void setGiaThanh(String GiaThanh) {
		_GiaThanh = GiaThanh;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaThanh", String.class);

				method.invoke(_matHangRemoteModel, GiaThanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMatHangRemoteModel() {
		return _matHangRemoteModel;
	}

	public void setMatHangRemoteModel(BaseModel<?> matHangRemoteModel) {
		_matHangRemoteModel = matHangRemoteModel;
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

		Class<?> remoteModelClass = _matHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_matHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MatHangLocalServiceUtil.addMatHang(this);
		}
		else {
			MatHangLocalServiceUtil.updateMatHang(this);
		}
	}

	@Override
	public MatHang toEscapedModel() {
		return (MatHang)ProxyUtil.newProxyInstance(MatHang.class.getClassLoader(),
			new Class[] { MatHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MatHangClp clone = new MatHangClp();

		clone.setMaHang(getMaHang());
		clone.setTenHang(getTenHang());
		clone.setGiaThanh(getGiaThanh());

		return clone;
	}

	@Override
	public int compareTo(MatHang matHang) {
		String primaryKey = matHang.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MatHangClp)) {
			return false;
		}

		MatHangClp matHang = (MatHangClp)obj;

		String primaryKey = matHang.getPrimaryKey();

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

		sb.append("{MaHang=");
		sb.append(getMaHang());
		sb.append(", TenHang=");
		sb.append(getTenHang());
		sb.append(", GiaThanh=");
		sb.append(getGiaThanh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.qlkh.model.MatHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>MaHang</column-name><column-value><![CDATA[");
		sb.append(getMaHang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenHang</column-name><column-value><![CDATA[");
		sb.append(getTenHang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GiaThanh</column-name><column-value><![CDATA[");
		sb.append(getGiaThanh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _MaHang;
	private String _TenHang;
	private String _GiaThanh;
	private BaseModel<?> _matHangRemoteModel;
}