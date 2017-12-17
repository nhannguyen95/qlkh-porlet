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
import com.qlkh.service.KhoHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author apple
 */
public class KhoHangClp extends BaseModelImpl<KhoHang> implements KhoHang {
	public KhoHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KhoHang.class;
	}

	@Override
	public String getModelClassName() {
		return KhoHang.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _MaKho;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setMaKho(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _MaKho;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MaKho", getMaKho());
		attributes.put("TenKho", getTenKho());
		attributes.put("DiaDiem", getDiaDiem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String MaKho = (String)attributes.get("MaKho");

		if (MaKho != null) {
			setMaKho(MaKho);
		}

		String TenKho = (String)attributes.get("TenKho");

		if (TenKho != null) {
			setTenKho(TenKho);
		}

		String DiaDiem = (String)attributes.get("DiaDiem");

		if (DiaDiem != null) {
			setDiaDiem(DiaDiem);
		}
	}

	@Override
	public String getMaKho() {
		return _MaKho;
	}

	@Override
	public void setMaKho(String MaKho) {
		_MaKho = MaKho;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMaKho", String.class);

				method.invoke(_khoHangRemoteModel, MaKho);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenKho() {
		return _TenKho;
	}

	@Override
	public void setTenKho(String TenKho) {
		_TenKho = TenKho;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTenKho", String.class);

				method.invoke(_khoHangRemoteModel, TenKho);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaDiem() {
		return _DiaDiem;
	}

	@Override
	public void setDiaDiem(String DiaDiem) {
		_DiaDiem = DiaDiem;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaDiem", String.class);

				method.invoke(_khoHangRemoteModel, DiaDiem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhoHangRemoteModel() {
		return _khoHangRemoteModel;
	}

	public void setKhoHangRemoteModel(BaseModel<?> khoHangRemoteModel) {
		_khoHangRemoteModel = khoHangRemoteModel;
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

		Class<?> remoteModelClass = _khoHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_khoHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhoHangLocalServiceUtil.addKhoHang(this);
		}
		else {
			KhoHangLocalServiceUtil.updateKhoHang(this);
		}
	}

	@Override
	public KhoHang toEscapedModel() {
		return (KhoHang)ProxyUtil.newProxyInstance(KhoHang.class.getClassLoader(),
			new Class[] { KhoHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhoHangClp clone = new KhoHangClp();

		clone.setMaKho(getMaKho());
		clone.setTenKho(getTenKho());
		clone.setDiaDiem(getDiaDiem());

		return clone;
	}

	@Override
	public int compareTo(KhoHang khoHang) {
		String primaryKey = khoHang.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhoHangClp)) {
			return false;
		}

		KhoHangClp khoHang = (KhoHangClp)obj;

		String primaryKey = khoHang.getPrimaryKey();

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
		sb.append(", TenKho=");
		sb.append(getTenKho());
		sb.append(", DiaDiem=");
		sb.append(getDiaDiem());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.qlkh.model.KhoHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>MaKho</column-name><column-value><![CDATA[");
		sb.append(getMaKho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenKho</column-name><column-value><![CDATA[");
		sb.append(getTenKho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaDiem</column-name><column-value><![CDATA[");
		sb.append(getDiaDiem());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _MaKho;
	private String _TenKho;
	private String _DiaDiem;
	private BaseModel<?> _khoHangRemoteModel;
}