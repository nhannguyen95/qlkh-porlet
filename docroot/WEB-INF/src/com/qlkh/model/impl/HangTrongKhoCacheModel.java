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

import com.qlkh.model.HangTrongKho;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing HangTrongKho in entity cache.
 *
 * @author apple
 * @see HangTrongKho
 * @generated
 */
public class HangTrongKhoCacheModel implements CacheModel<HangTrongKho>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{MaKho=");
		sb.append(MaKho);
		sb.append(", MaHang=");
		sb.append(MaHang);
		sb.append(", SoLuong=");
		sb.append(SoLuong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HangTrongKho toEntityModel() {
		HangTrongKhoImpl hangTrongKhoImpl = new HangTrongKhoImpl();

		if (MaKho == null) {
			hangTrongKhoImpl.setMaKho(StringPool.BLANK);
		}
		else {
			hangTrongKhoImpl.setMaKho(MaKho);
		}

		if (MaHang == null) {
			hangTrongKhoImpl.setMaHang(StringPool.BLANK);
		}
		else {
			hangTrongKhoImpl.setMaHang(MaHang);
		}

		hangTrongKhoImpl.setSoLuong(SoLuong);

		hangTrongKhoImpl.resetOriginalValues();

		return hangTrongKhoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MaKho = objectInput.readUTF();
		MaHang = objectInput.readUTF();
		SoLuong = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (MaKho == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaKho);
		}

		if (MaHang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaHang);
		}

		objectOutput.writeLong(SoLuong);
	}

	public String MaKho;
	public String MaHang;
	public long SoLuong;
}