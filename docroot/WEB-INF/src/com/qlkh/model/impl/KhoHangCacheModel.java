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

import com.qlkh.model.KhoHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing KhoHang in entity cache.
 *
 * @author apple
 * @see KhoHang
 * @generated
 */
public class KhoHangCacheModel implements CacheModel<KhoHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{MaKho=");
		sb.append(MaKho);
		sb.append(", TenKho=");
		sb.append(TenKho);
		sb.append(", DiaDiem=");
		sb.append(DiaDiem);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KhoHang toEntityModel() {
		KhoHangImpl khoHangImpl = new KhoHangImpl();

		if (MaKho == null) {
			khoHangImpl.setMaKho(StringPool.BLANK);
		}
		else {
			khoHangImpl.setMaKho(MaKho);
		}

		if (TenKho == null) {
			khoHangImpl.setTenKho(StringPool.BLANK);
		}
		else {
			khoHangImpl.setTenKho(TenKho);
		}

		if (DiaDiem == null) {
			khoHangImpl.setDiaDiem(StringPool.BLANK);
		}
		else {
			khoHangImpl.setDiaDiem(DiaDiem);
		}

		khoHangImpl.resetOriginalValues();

		return khoHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MaKho = objectInput.readUTF();
		TenKho = objectInput.readUTF();
		DiaDiem = objectInput.readUTF();
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

		if (TenKho == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenKho);
		}

		if (DiaDiem == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DiaDiem);
		}
	}

	public String MaKho;
	public String TenKho;
	public String DiaDiem;
}