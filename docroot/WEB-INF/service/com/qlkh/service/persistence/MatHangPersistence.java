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

import com.qlkh.model.MatHang;

/**
 * The persistence interface for the mat hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author apple
 * @see MatHangPersistenceImpl
 * @see MatHangUtil
 * @generated
 */
public interface MatHangPersistence extends BasePersistence<MatHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MatHangUtil} to access the mat hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the mat hang in the entity cache if it is enabled.
	*
	* @param matHang the mat hang
	*/
	public void cacheResult(com.qlkh.model.MatHang matHang);

	/**
	* Caches the mat hangs in the entity cache if it is enabled.
	*
	* @param matHangs the mat hangs
	*/
	public void cacheResult(java.util.List<com.qlkh.model.MatHang> matHangs);

	/**
	* Creates a new mat hang with the primary key. Does not add the mat hang to the database.
	*
	* @param MaHang the primary key for the new mat hang
	* @return the new mat hang
	*/
	public com.qlkh.model.MatHang create(java.lang.String MaHang);

	/**
	* Removes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaHang the primary key of the mat hang
	* @return the mat hang that was removed
	* @throws com.qlkh.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.qlkh.model.MatHang remove(java.lang.String MaHang)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchMatHangException;

	public com.qlkh.model.MatHang updateImpl(com.qlkh.model.MatHang matHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hang with the primary key or throws a {@link com.qlkh.NoSuchMatHangException} if it could not be found.
	*
	* @param MaHang the primary key of the mat hang
	* @return the mat hang
	* @throws com.qlkh.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.qlkh.model.MatHang findByPrimaryKey(java.lang.String MaHang)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.qlkh.NoSuchMatHangException;

	/**
	* Returns the mat hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MaHang the primary key of the mat hang
	* @return the mat hang, or <code>null</code> if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.qlkh.model.MatHang fetchByPrimaryKey(java.lang.String MaHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mat hangs.
	*
	* @return the mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.qlkh.model.MatHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.qlkh.model.MatHang> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.qlkh.model.MatHang> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mat hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs.
	*
	* @return the number of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}