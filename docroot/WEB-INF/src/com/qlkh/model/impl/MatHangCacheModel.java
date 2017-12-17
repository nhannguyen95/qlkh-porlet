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

package com.qlkh.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.qlkh.model.MatHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MatHang in entity cache.
 *
 * @author apple
 * @see MatHang
 * @generated
 */
public class MatHangCacheModel implements CacheModel<MatHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{MaHang=");
		sb.append(MaHang);
		sb.append(", TenHang=");
		sb.append(TenHang);
		sb.append(", GiaThanh=");
		sb.append(GiaThanh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MatHang toEntityModel() {
		MatHangImpl matHangImpl = new MatHangImpl();

		if (MaHang == null) {
			matHangImpl.setMaHang(StringPool.BLANK);
		}
		else {
			matHangImpl.setMaHang(MaHang);
		}

		if (TenHang == null) {
			matHangImpl.setTenHang(StringPool.BLANK);
		}
		else {
			matHangImpl.setTenHang(TenHang);
		}

		if (GiaThanh == null) {
			matHangImpl.setGiaThanh(StringPool.BLANK);
		}
		else {
			matHangImpl.setGiaThanh(GiaThanh);
		}

		matHangImpl.resetOriginalValues();

		return matHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MaHang = objectInput.readUTF();
		TenHang = objectInput.readUTF();
		GiaThanh = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (MaHang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaHang);
		}

		if (TenHang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenHang);
		}

		if (GiaThanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GiaThanh);
		}
	}

	public String MaHang;
	public String TenHang;
	public String GiaThanh;
}