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

package com.qlkh.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MatHang. This utility wraps
 * {@link com.qlkh.service.impl.MatHangLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author apple
 * @see MatHangLocalService
 * @see com.qlkh.service.base.MatHangLocalServiceBaseImpl
 * @see com.qlkh.service.impl.MatHangLocalServiceImpl
 * @generated
 */
public class MatHangLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.qlkh.service.impl.MatHangLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mat hang to the database. Also notifies the appropriate model listeners.
	*
	* @param matHang the mat hang
	* @return the mat hang that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.MatHang addMatHang(
		com.qlkh.model.MatHang matHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMatHang(matHang);
	}

	/**
	* Creates a new mat hang with the primary key. Does not add the mat hang to the database.
	*
	* @param MaHang the primary key for the new mat hang
	* @return the new mat hang
	*/
	public static com.qlkh.model.MatHang createMatHang(java.lang.String MaHang) {
		return getService().createMatHang(MaHang);
	}

	/**
	* Deletes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaHang the primary key of the mat hang
	* @return the mat hang that was removed
	* @throws PortalException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.MatHang deleteMatHang(java.lang.String MaHang)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMatHang(MaHang);
	}

	/**
	* Deletes the mat hang from the database. Also notifies the appropriate model listeners.
	*
	* @param matHang the mat hang
	* @return the mat hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.MatHang deleteMatHang(
		com.qlkh.model.MatHang matHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMatHang(matHang);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.qlkh.model.MatHang fetchMatHang(java.lang.String MaHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMatHang(MaHang);
	}

	/**
	* Returns the mat hang with the primary key.
	*
	* @param MaHang the primary key of the mat hang
	* @return the mat hang
	* @throws PortalException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.MatHang getMatHang(java.lang.String MaHang)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatHang(MaHang);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.qlkh.model.MatHang> getMatHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatHangs(start, end);
	}

	/**
	* Returns the number of mat hangs.
	*
	* @return the number of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int getMatHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatHangsCount();
	}

	/**
	* Updates the mat hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param matHang the mat hang
	* @return the mat hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.MatHang updateMatHang(
		com.qlkh.model.MatHang matHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMatHang(matHang);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static MatHangLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MatHangLocalService.class.getName());

			if (invokableLocalService instanceof MatHangLocalService) {
				_service = (MatHangLocalService)invokableLocalService;
			}
			else {
				_service = new MatHangLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MatHangLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MatHangLocalService service) {
	}

	private static MatHangLocalService _service;
}