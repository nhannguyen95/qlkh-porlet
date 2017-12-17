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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the MatHang service. Represents a row in the &quot;QLKH_MatHang&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.qlkh.model.impl.MatHangModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.qlkh.model.impl.MatHangImpl}.
 * </p>
 *
 * @author apple
 * @see MatHang
 * @see com.qlkh.model.impl.MatHangImpl
 * @see com.qlkh.model.impl.MatHangModelImpl
 * @generated
 */
public interface MatHangModel extends BaseModel<MatHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mat hang model instance should use the {@link MatHang} interface instead.
	 */

	/**
	 * Returns the primary key of this mat hang.
	 *
	 * @return the primary key of this mat hang
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this mat hang.
	 *
	 * @param primaryKey the primary key of this mat hang
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the ma hang of this mat hang.
	 *
	 * @return the ma hang of this mat hang
	 */
	@AutoEscape
	public String getMaHang();

	/**
	 * Sets the ma hang of this mat hang.
	 *
	 * @param MaHang the ma hang of this mat hang
	 */
	public void setMaHang(String MaHang);

	/**
	 * Returns the ten hang of this mat hang.
	 *
	 * @return the ten hang of this mat hang
	 */
	@AutoEscape
	public String getTenHang();

	/**
	 * Sets the ten hang of this mat hang.
	 *
	 * @param TenHang the ten hang of this mat hang
	 */
	public void setTenHang(String TenHang);

	/**
	 * Returns the gia thanh of this mat hang.
	 *
	 * @return the gia thanh of this mat hang
	 */
	@AutoEscape
	public String getGiaThanh();

	/**
	 * Sets the gia thanh of this mat hang.
	 *
	 * @param GiaThanh the gia thanh of this mat hang
	 */
	public void setGiaThanh(String GiaThanh);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(MatHang matHang);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MatHang> toCacheModel();

	@Override
	public MatHang toEscapedModel();

	@Override
	public MatHang toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}