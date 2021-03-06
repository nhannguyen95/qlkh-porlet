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

import com.qlkh.model.HangTrongKho;

import java.util.List;

/**
 * The persistence utility for the hang trong kho service. This utility wraps {@link HangTrongKhoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author apple
 * @see HangTrongKhoPersistence
 * @see HangTrongKhoPersistenceImpl
 * @generated
 */
public class HangTrongKhoUtil {
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
	public static void clearCache(HangTrongKho hangTrongKho) {
		getPersistence().clearCache(hangTrongKho);
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
	public static List<HangTrongKho> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HangTrongKho> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HangTrongKho> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static HangTrongKho update(HangTrongKho hangTrongKho)
		throws SystemException {
		return getPersistence().update(hangTrongKho);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static HangTrongKho update(HangTrongKho hangTrongKho,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hangTrongKho, serviceContext);
	}

	/**
	* Caches the hang trong kho in the entity cache if it is enabled.
	*
	* @param hangTrongKho the hang trong kho
	*/
	public static void cacheResult(com.qlkh.model.HangTrongKho hangTrongKho) {
		getPersistence().cacheResult(hangTrongKho);
	}

	/**
	* Caches the hang trong khos in the entity cache if it is enabled.
	*
	* @param hangTrongKhos the hang trong khos
	*/
	public static void cacheResult(
		java.util.List<com.qlkh.model.HangTrongKho> hangTrongKhos) {
		getPersistence().cacheResult(hangTrongKhos);
	}

	/**
	* Creates a new hang trong kho with the primary key. Does not add the hang trong kho to the database.
	*
	* @param hangTrongKhoPK the primary key for the new hang trong kho
	* @return the new hang trong kho
	*/
	public static com.qlkh.model.HangTrongKho create(
		HangTrongKhoPK hangTrongKhoPK) {
		return getPersistence().create(hangTrongKhoPK);
	}

	/**
	* Removes the hang trong kho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hangTrongKhoPK the primary key of the hang trong kho
	* @return the hang trong kho that was removed
	* @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.HangTrongKho remove(
		HangTrongKhoPK hangTrongKhoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchHangTrongKhoException {
		return getPersistence().remove(hangTrongKhoPK);
	}

	public static com.qlkh.model.HangTrongKho updateImpl(
		com.qlkh.model.HangTrongKho hangTrongKho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hangTrongKho);
	}

	/**
	* Returns the hang trong kho with the primary key or throws a {@link com.qlkh.NoSuchHangTrongKhoException} if it could not be found.
	*
	* @param hangTrongKhoPK the primary key of the hang trong kho
	* @return the hang trong kho
	* @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.HangTrongKho findByPrimaryKey(
		HangTrongKhoPK hangTrongKhoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchHangTrongKhoException {
		return getPersistence().findByPrimaryKey(hangTrongKhoPK);
	}

	/**
	* Returns the hang trong kho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hangTrongKhoPK the primary key of the hang trong kho
	* @return the hang trong kho, or <code>null</code> if a hang trong kho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.HangTrongKho fetchByPrimaryKey(
		HangTrongKhoPK hangTrongKhoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hangTrongKhoPK);
	}

	/**
	* Returns all the hang trong khos.
	*
	* @return the hang trong khos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.qlkh.model.HangTrongKho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the hang trong khos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.HangTrongKhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hang trong khos
	* @param end the upper bound of the range of hang trong khos (not inclusive)
	* @return the range of hang trong khos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.qlkh.model.HangTrongKho> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the hang trong khos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.HangTrongKhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hang trong khos
	* @param end the upper bound of the range of hang trong khos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hang trong khos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.qlkh.model.HangTrongKho> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the hang trong khos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hang trong khos.
	*
	* @return the number of hang trong khos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HangTrongKhoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HangTrongKhoPersistence)PortletBeanLocatorUtil.locate(com.qlkh.service.ClpSerializer.getServletContextName(),
					HangTrongKhoPersistence.class.getName());

			ReferenceRegistry.registerReference(HangTrongKhoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HangTrongKhoPersistence persistence) {
	}

	private static HangTrongKhoPersistence _persistence;
}