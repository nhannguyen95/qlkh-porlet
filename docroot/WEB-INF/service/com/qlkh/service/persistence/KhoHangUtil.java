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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.qlkh.model.KhoHang;

import java.util.List;

/**
 * The persistence utility for the kho hang service. This utility wraps {@link KhoHangPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author apple
 * @see KhoHangPersistence
 * @see KhoHangPersistenceImpl
 * @generated
 */
public class KhoHangUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(KhoHang khoHang) {
		getPersistence().clearCache(khoHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KhoHang> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KhoHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KhoHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KhoHang update(KhoHang khoHang) throws SystemException {
		return getPersistence().update(khoHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KhoHang update(KhoHang khoHang, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(khoHang, serviceContext);
	}

	/**
	* Caches the kho hang in the entity cache if it is enabled.
	*
	* @param khoHang the kho hang
	*/
	public static void cacheResult(com.qlkh.model.KhoHang khoHang) {
		getPersistence().cacheResult(khoHang);
	}

	/**
	* Caches the kho hangs in the entity cache if it is enabled.
	*
	* @param khoHangs the kho hangs
	*/
	public static void cacheResult(
		java.util.List<com.qlkh.model.KhoHang> khoHangs) {
		getPersistence().cacheResult(khoHangs);
	}

	/**
	* Creates a new kho hang with the primary key. Does not add the kho hang to the database.
	*
	* @param MaKho the primary key for the new kho hang
	* @return the new kho hang
	*/
	public static com.qlkh.model.KhoHang create(java.lang.String MaKho) {
		return getPersistence().create(MaKho);
	}

	/**
	* Removes the kho hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaKho the primary key of the kho hang
	* @return the kho hang that was removed
	* @throws com.qlkh.NoSuchKhoHangException if a kho hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang remove(java.lang.String MaKho)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchKhoHangException {
		return getPersistence().remove(MaKho);
	}

	public static com.qlkh.model.KhoHang updateImpl(
		com.qlkh.model.KhoHang khoHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(khoHang);
	}

	/**
	* Returns the kho hang with the primary key or throws a {@link com.qlkh.NoSuchKhoHangException} if it could not be found.
	*
	* @param MaKho the primary key of the kho hang
	* @return the kho hang
	* @throws com.qlkh.NoSuchKhoHangException if a kho hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang findByPrimaryKey(
		java.lang.String MaKho)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchKhoHangException {
		return getPersistence().findByPrimaryKey(MaKho);
	}

	/**
	* Returns the kho hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MaKho the primary key of the kho hang
	* @return the kho hang, or <code>null</code> if a kho hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang fetchByPrimaryKey(
		java.lang.String MaKho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(MaKho);
	}

	/**
	* Returns all the kho hangs.
	*
	* @return the kho hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.qlkh.model.KhoHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the kho hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kho hangs
	* @param end the upper bound of the range of kho hangs (not inclusive)
	* @return the range of kho hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.qlkh.model.KhoHang> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the kho hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kho hangs
	* @param end the upper bound of the range of kho hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kho hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.qlkh.model.KhoHang> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the kho hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of kho hangs.
	*
	* @return the number of kho hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KhoHangPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KhoHangPersistence)PortletBeanLocatorUtil.locate(com.qlkh.service.ClpSerializer.getServletContextName(),
					KhoHangPersistence.class.getName());

			ReferenceRegistry.registerReference(KhoHangUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KhoHangPersistence persistence) {
	}

	private static KhoHangPersistence _persistence;
}