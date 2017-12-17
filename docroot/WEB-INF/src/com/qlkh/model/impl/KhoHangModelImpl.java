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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.qlkh.model.KhoHang;
import com.qlkh.model.KhoHangModel;
import com.qlkh.model.KhoHangSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the KhoHang service. Represents a row in the &quot;QLKH_KhoHang&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.qlkh.model.KhoHangModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KhoHangImpl}.
 * </p>
 *
 * @author apple
 * @see KhoHangImpl
 * @see com.qlkh.model.KhoHang
 * @see com.qlkh.model.KhoHangModel
 * @generated
 */
@JSON(strict = true)
public class KhoHangModelImpl extends BaseModelImpl<KhoHang>
	implements KhoHangModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kho hang model instance should use the {@link com.qlkh.model.KhoHang} interface instead.
	 */
	public static final String TABLE_NAME = "QLKH_KhoHang";
	public static final Object[][] TABLE_COLUMNS = {
			{ "MaKho", Types.VARCHAR },
			{ "TenKho", Types.VARCHAR },
			{ "DiaDiem", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table QLKH_KhoHang (MaKho VARCHAR(75) not null primary key,TenKho VARCHAR(75) null,DiaDiem VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table QLKH_KhoHang";
	public static final String ORDER_BY_JPQL = " ORDER BY khoHang.MaKho ASC";
	public static final String ORDER_BY_SQL = " ORDER BY QLKH_KhoHang.MaKho ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.qlkh.model.KhoHang"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.qlkh.model.KhoHang"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static KhoHang toModel(KhoHangSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		KhoHang model = new KhoHangImpl();

		model.setMaKho(soapModel.getMaKho());
		model.setTenKho(soapModel.getTenKho());
		model.setDiaDiem(soapModel.getDiaDiem());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<KhoHang> toModels(KhoHangSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<KhoHang> models = new ArrayList<KhoHang>(soapModels.length);

		for (KhoHangSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.qlkh.model.KhoHang"));

	public KhoHangModelImpl() {
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

	@JSON
	@Override
	public String getMaKho() {
		if (_MaKho == null) {
			return StringPool.BLANK;
		}
		else {
			return _MaKho;
		}
	}

	@Override
	public void setMaKho(String MaKho) {
		_MaKho = MaKho;
	}

	@JSON
	@Override
	public String getTenKho() {
		if (_TenKho == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenKho;
		}
	}

	@Override
	public void setTenKho(String TenKho) {
		_TenKho = TenKho;
	}

	@JSON
	@Override
	public String getDiaDiem() {
		if (_DiaDiem == null) {
			return StringPool.BLANK;
		}
		else {
			return _DiaDiem;
		}
	}

	@Override
	public void setDiaDiem(String DiaDiem) {
		_DiaDiem = DiaDiem;
	}

	@Override
	public KhoHang toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (KhoHang)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		KhoHangImpl khoHangImpl = new KhoHangImpl();

		khoHangImpl.setMaKho(getMaKho());
		khoHangImpl.setTenKho(getTenKho());
		khoHangImpl.setDiaDiem(getDiaDiem());

		khoHangImpl.resetOriginalValues();

		return khoHangImpl;
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

		if (!(obj instanceof KhoHang)) {
			return false;
		}

		KhoHang khoHang = (KhoHang)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<KhoHang> toCacheModel() {
		KhoHangCacheModel khoHangCacheModel = new KhoHangCacheModel();

		khoHangCacheModel.MaKho = getMaKho();

		String MaKho = khoHangCacheModel.MaKho;

		if ((MaKho != null) && (MaKho.length() == 0)) {
			khoHangCacheModel.MaKho = null;
		}

		khoHangCacheModel.TenKho = getTenKho();

		String TenKho = khoHangCacheModel.TenKho;

		if ((TenKho != null) && (TenKho.length() == 0)) {
			khoHangCacheModel.TenKho = null;
		}

		khoHangCacheModel.DiaDiem = getDiaDiem();

		String DiaDiem = khoHangCacheModel.DiaDiem;

		if ((DiaDiem != null) && (DiaDiem.length() == 0)) {
			khoHangCacheModel.DiaDiem = null;
		}

		return khoHangCacheModel;
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

	private static ClassLoader _classLoader = KhoHang.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			KhoHang.class
		};
	private String _MaKho;
	private String _TenKho;
	private String _DiaDiem;
	private KhoHang _escapedModel;
}