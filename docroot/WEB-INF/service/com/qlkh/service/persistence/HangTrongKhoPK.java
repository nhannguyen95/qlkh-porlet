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

package com.qlkh.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author apple
 */
public class HangTrongKhoPK implements Comparable<HangTrongKhoPK>, Serializable {
	public String MaKho;
	public String MaHang;

	public HangTrongKhoPK() {
	}

	public HangTrongKhoPK(String MaKho, String MaHang) {
		this.MaKho = MaKho;
		this.MaHang = MaHang;
	}

	public String getMaKho() {
		return MaKho;
	}

	public void setMaKho(String MaKho) {
		this.MaKho = MaKho;
	}

	public String getMaHang() {
		return MaHang;
	}

	public void setMaHang(String MaHang) {
		this.MaHang = MaHang;
	}

	@Override
	public int compareTo(HangTrongKhoPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = MaKho.compareTo(pk.MaKho);

		if (value != 0) {
			return value;
		}

		value = MaHang.compareTo(pk.MaHang);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HangTrongKhoPK)) {
			return false;
		}

		HangTrongKhoPK pk = (HangTrongKhoPK)obj;

		if ((MaKho.equals(pk.MaKho)) && (MaHang.equals(pk.MaHang))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(MaKho) + String.valueOf(MaHang)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("MaKho");
		sb.append(StringPool.EQUAL);
		sb.append(MaKho);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("MaHang");
		sb.append(StringPool.EQUAL);
		sb.append(MaHang);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}