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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KhoHang}.
 * </p>
 *
 * @author apple
 * @see KhoHang
 * @generated
 */
public class KhoHangWrapper implements KhoHang, ModelWrapper<KhoHang> {
	public KhoHangWrapper(KhoHang khoHang) {
		_khoHang = khoHang;
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

	/**
	* Returns the primary key of this kho hang.
	*
	* @return the primary key of this kho hang
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _khoHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kho hang.
	*
	* @param primaryKey the primary key of this kho hang
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_khoHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma kho of this kho hang.
	*
	* @return the ma kho of this kho hang
	*/
	@Override
	public java.lang.String getMaKho() {
		return _khoHang.getMaKho();
	}

	/**
	* Sets the ma kho of this kho hang.
	*
	* @param MaKho the ma kho of this kho hang
	*/
	@Override
	public void setMaKho(java.lang.String MaKho) {
		_khoHang.setMaKho(MaKho);
	}

	/**
	* Returns the ten kho of this kho hang.
	*
	* @return the ten kho of this kho hang
	*/
	@Override
	public java.lang.String getTenKho() {
		return _khoHang.getTenKho();
	}

	/**
	* Sets the ten kho of this kho hang.
	*
	* @param TenKho the ten kho of this kho hang
	*/
	@Override
	public void setTenKho(java.lang.String TenKho) {
		_khoHang.setTenKho(TenKho);
	}

	/**
	* Returns the dia diem of this kho hang.
	*
	* @return the dia diem of this kho hang
	*/
	@Override
	public java.lang.String getDiaDiem() {
		return _khoHang.getDiaDiem();
	}

	/**
	* Sets the dia diem of this kho hang.
	*
	* @param DiaDiem the dia diem of this kho hang
	*/
	@Override
	public void setDiaDiem(java.lang.String DiaDiem) {
		_khoHang.setDiaDiem(DiaDiem);
	}

	@Override
	public boolean isNew() {
		return _khoHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khoHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khoHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khoHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khoHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khoHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khoHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khoHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khoHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khoHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khoHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhoHangWrapper((KhoHang)_khoHang.clone());
	}

	@Override
	public int compareTo(KhoHang khoHang) {
		return _khoHang.compareTo(khoHang);
	}

	@Override
	public int hashCode() {
		return _khoHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<KhoHang> toCacheModel() {
		return _khoHang.toCacheModel();
	}

	@Override
	public KhoHang toEscapedModel() {
		return new KhoHangWrapper(_khoHang.toEscapedModel());
	}

	@Override
	public KhoHang toUnescapedModel() {
		return new KhoHangWrapper(_khoHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khoHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khoHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khoHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhoHangWrapper)) {
			return false;
		}

		KhoHangWrapper khoHangWrapper = (KhoHangWrapper)obj;

		if (Validator.equals(_khoHang, khoHangWrapper._khoHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KhoHang getWrappedKhoHang() {
		return _khoHang;
	}

	@Override
	public KhoHang getWrappedModel() {
		return _khoHang;
	}

	@Override
	public void resetOriginalValues() {
		_khoHang.resetOriginalValues();
	}

	private KhoHang _khoHang;
}