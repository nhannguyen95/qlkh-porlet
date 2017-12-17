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

import com.liferay.portal.service.persistence.BasePersistence;

import com.qlkh.model.HangTrongKho;

/**
 * The persistence interface for the hang trong kho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author apple
 * @see HangTrongKhoPersistenceImpl
 * @see HangTrongKhoUtil
 * @generated
 */
public interface HangTrongKhoPersistence extends BasePersistence<HangTrongKho> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HangTrongKhoUtil} to access the hang trong kho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the hang trong kho in the entity cache if it is enabled.
	*
	* @param hangTrongKho the hang trong kho
	*/
	public void cacheResult(com.qlkh.model.HangTrongKho hangTrongKho);

	/**
	* Caches the hang trong khos in the entity cache if it is enabled.
	*
	* @param hangTrongKhos the hang trong khos
	*/
	public void cacheResult(
		java.util.List<com.qlkh.model.HangTrongKho> hangTrongKhos);

	/**
	* Creates a new hang trong kho with the primary key. Does not add the hang trong kho to the database.
	*
	* @param hangTrongKhoPK the primary key for the new hang trong kho
	* @return the new hang trong kho
	*/
	public com.qlkh.model.HangTrongKho create(HangTrongKhoPK hangTrongKhoPK);

	/**
	* Removes the hang trong kho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hangTrongKhoPK the primary key of the hang trong kho
	* @return the hang trong kho that was removed
	* @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.qlkh.model.HangTrongKho remove(HangTrongKhoPK hangTrongKhoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchHangTrongKhoException;

	public com.qlkh.model.HangTrongKho updateImpl(
		com.qlkh.model.HangTrongKho hangTrongKho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hang trong kho with the primary key or throws a {@link com.qlkh.NoSuchHangTrongKhoException} if it could not be found.
	*
	* @param hangTrongKhoPK the primary key of the hang trong kho
	* @return the hang trong kho
	* @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.qlkh.model.HangTrongKho findByPrimaryKey(
		HangTrongKhoPK hangTrongKhoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchHangTrongKhoException;

	/**
	* Returns the hang trong kho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hangTrongKhoPK the primary key of the hang trong kho
	* @return the hang trong kho, or <code>null</code> if a hang trong kho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.qlkh.model.HangTrongKho fetchByPrimaryKey(
		HangTrongKhoPK hangTrongKhoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the hang trong khos.
	*
	* @return the hang trong khos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.qlkh.model.HangTrongKho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.qlkh.model.HangTrongKho> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.qlkh.model.HangTrongKho> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the hang trong khos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of hang trong khos.
	*
	* @return the number of hang trong khos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}