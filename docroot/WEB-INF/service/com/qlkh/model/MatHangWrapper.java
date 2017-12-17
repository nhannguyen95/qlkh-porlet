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
 * This class is a wrapper for {@link MatHang}.
 * </p>
 *
 * @author apple
 * @see MatHang
 * @generated
 */
public class MatHangWrapper implements MatHang, ModelWrapper<MatHang> {
	public MatHangWrapper(MatHang matHang) {
		_matHang = matHang;
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

	/**
	* Returns the primary key of this mat hang.
	*
	* @return the primary key of this mat hang
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _matHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mat hang.
	*
	* @param primaryKey the primary key of this mat hang
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_matHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma hang of this mat hang.
	*
	* @return the ma hang of this mat hang
	*/
	@Override
	public java.lang.String getMaHang() {
		return _matHang.getMaHang();
	}

	/**
	* Sets the ma hang of this mat hang.
	*
	* @param MaHang the ma hang of this mat hang
	*/
	@Override
	public void setMaHang(java.lang.String MaHang) {
		_matHang.setMaHang(MaHang);
	}

	/**
	* Returns the ten hang of this mat hang.
	*
	* @return the ten hang of this mat hang
	*/
	@Override
	public java.lang.String getTenHang() {
		return _matHang.getTenHang();
	}

	/**
	* Sets the ten hang of this mat hang.
	*
	* @param TenHang the ten hang of this mat hang
	*/
	@Override
	public void setTenHang(java.lang.String TenHang) {
		_matHang.setTenHang(TenHang);
	}

	/**
	* Returns the gia thanh of this mat hang.
	*
	* @return the gia thanh of this mat hang
	*/
	@Override
	public java.lang.String getGiaThanh() {
		return _matHang.getGiaThanh();
	}

	/**
	* Sets the gia thanh of this mat hang.
	*
	* @param GiaThanh the gia thanh of this mat hang
	*/
	@Override
	public void setGiaThanh(java.lang.String GiaThanh) {
		_matHang.setGiaThanh(GiaThanh);
	}

	@Override
	public boolean isNew() {
		return _matHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_matHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _matHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_matHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _matHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _matHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_matHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _matHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_matHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_matHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_matHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MatHangWrapper((MatHang)_matHang.clone());
	}

	@Override
	public int compareTo(MatHang matHang) {
		return _matHang.compareTo(matHang);
	}

	@Override
	public int hashCode() {
		return _matHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<MatHang> toCacheModel() {
		return _matHang.toCacheModel();
	}

	@Override
	public MatHang toEscapedModel() {
		return new MatHangWrapper(_matHang.toEscapedModel());
	}

	@Override
	public MatHang toUnescapedModel() {
		return new MatHangWrapper(_matHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _matHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _matHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_matHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MatHangWrapper)) {
			return false;
		}

		MatHangWrapper matHangWrapper = (MatHangWrapper)obj;

		if (Validator.equals(_matHang, matHangWrapper._matHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MatHang getWrappedMatHang() {
		return _matHang;
	}

	@Override
	public MatHang getWrappedModel() {
		return _matHang;
	}

	@Override
	public void resetOriginalValues() {
		_matHang.resetOriginalValues();
	}

	private MatHang _matHang;
}