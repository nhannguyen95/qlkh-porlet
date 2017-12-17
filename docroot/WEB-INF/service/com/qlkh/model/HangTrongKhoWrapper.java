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
 * This class is a wrapper for {@link HangTrongKho}.
 * </p>
 *
 * @author apple
 * @see HangTrongKho
 * @generated
 */
public class HangTrongKhoWrapper implements HangTrongKho,
	ModelWrapper<HangTrongKho> {
	public HangTrongKhoWrapper(HangTrongKho hangTrongKho) {
		_hangTrongKho = hangTrongKho;
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

	/**
	* Returns the primary key of this hang trong kho.
	*
	* @return the primary key of this hang trong kho
	*/
	@Override
	public com.qlkh.service.persistence.HangTrongKhoPK getPrimaryKey() {
		return _hangTrongKho.getPrimaryKey();
	}

	/**
	* Sets the primary key of this hang trong kho.
	*
	* @param primaryKey the primary key of this hang trong kho
	*/
	@Override
	public void setPrimaryKey(
		com.qlkh.service.persistence.HangTrongKhoPK primaryKey) {
		_hangTrongKho.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma kho of this hang trong kho.
	*
	* @return the ma kho of this hang trong kho
	*/
	@Override
	public java.lang.String getMaKho() {
		return _hangTrongKho.getMaKho();
	}

	/**
	* Sets the ma kho of this hang trong kho.
	*
	* @param MaKho the ma kho of this hang trong kho
	*/
	@Override
	public void setMaKho(java.lang.String MaKho) {
		_hangTrongKho.setMaKho(MaKho);
	}

	/**
	* Returns the ma hang of this hang trong kho.
	*
	* @return the ma hang of this hang trong kho
	*/
	@Override
	public java.lang.String getMaHang() {
		return _hangTrongKho.getMaHang();
	}

	/**
	* Sets the ma hang of this hang trong kho.
	*
	* @param MaHang the ma hang of this hang trong kho
	*/
	@Override
	public void setMaHang(java.lang.String MaHang) {
		_hangTrongKho.setMaHang(MaHang);
	}

	/**
	* Returns the so luong of this hang trong kho.
	*
	* @return the so luong of this hang trong kho
	*/
	@Override
	public long getSoLuong() {
		return _hangTrongKho.getSoLuong();
	}

	/**
	* Sets the so luong of this hang trong kho.
	*
	* @param SoLuong the so luong of this hang trong kho
	*/
	@Override
	public void setSoLuong(long SoLuong) {
		_hangTrongKho.setSoLuong(SoLuong);
	}

	@Override
	public boolean isNew() {
		return _hangTrongKho.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_hangTrongKho.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _hangTrongKho.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hangTrongKho.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _hangTrongKho.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _hangTrongKho.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_hangTrongKho.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _hangTrongKho.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_hangTrongKho.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_hangTrongKho.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_hangTrongKho.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HangTrongKhoWrapper((HangTrongKho)_hangTrongKho.clone());
	}

	@Override
	public int compareTo(HangTrongKho hangTrongKho) {
		return _hangTrongKho.compareTo(hangTrongKho);
	}

	@Override
	public int hashCode() {
		return _hangTrongKho.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<HangTrongKho> toCacheModel() {
		return _hangTrongKho.toCacheModel();
	}

	@Override
	public HangTrongKho toEscapedModel() {
		return new HangTrongKhoWrapper(_hangTrongKho.toEscapedModel());
	}

	@Override
	public HangTrongKho toUnescapedModel() {
		return new HangTrongKhoWrapper(_hangTrongKho.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _hangTrongKho.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hangTrongKho.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_hangTrongKho.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HangTrongKhoWrapper)) {
			return false;
		}

		HangTrongKhoWrapper hangTrongKhoWrapper = (HangTrongKhoWrapper)obj;

		if (Validator.equals(_hangTrongKho, hangTrongKhoWrapper._hangTrongKho)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HangTrongKho getWrappedHangTrongKho() {
		return _hangTrongKho;
	}

	@Override
	public HangTrongKho getWrappedModel() {
		return _hangTrongKho;
	}

	@Override
	public void resetOriginalValues() {
		_hangTrongKho.resetOriginalValues();
	}

	private HangTrongKho _hangTrongKho;
}