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
 * Provides the local service utility for KhoHang. This utility wraps
 * {@link com.qlkh.service.impl.KhoHangLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author apple
 * @see KhoHangLocalService
 * @see com.qlkh.service.base.KhoHangLocalServiceBaseImpl
 * @see com.qlkh.service.impl.KhoHangLocalServiceImpl
 * @generated
 */
public class KhoHangLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.qlkh.service.impl.KhoHangLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the kho hang to the database. Also notifies the appropriate model listeners.
	*
	* @param khoHang the kho hang
	* @return the kho hang that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang addKhoHang(
		com.qlkh.model.KhoHang khoHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addKhoHang(khoHang);
	}

	/**
	* Creates a new kho hang with the primary key. Does not add the kho hang to the database.
	*
	* @param MaKho the primary key for the new kho hang
	* @return the new kho hang
	*/
	public static com.qlkh.model.KhoHang createKhoHang(java.lang.String MaKho) {
		return getService().createKhoHang(MaKho);
	}

	/**
	* Deletes the kho hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaKho the primary key of the kho hang
	* @return the kho hang that was removed
	* @throws PortalException if a kho hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang deleteKhoHang(java.lang.String MaKho)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteKhoHang(MaKho);
	}

	/**
	* Deletes the kho hang from the database. Also notifies the appropriate model listeners.
	*
	* @param khoHang the kho hang
	* @return the kho hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang deleteKhoHang(
		com.qlkh.model.KhoHang khoHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteKhoHang(khoHang);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.qlkh.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.qlkh.model.KhoHang fetchKhoHang(java.lang.String MaKho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchKhoHang(MaKho);
	}

	/**
	* Returns the kho hang with the primary key.
	*
	* @param MaKho the primary key of the kho hang
	* @return the kho hang
	* @throws PortalException if a kho hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang getKhoHang(java.lang.String MaKho)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKhoHang(MaKho);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.qlkh.model.KhoHang> getKhoHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKhoHangs(start, end);
	}

	/**
	* Returns the number of kho hangs.
	*
	* @return the number of kho hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int getKhoHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKhoHangsCount();
	}

	/**
	* Updates the kho hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param khoHang the kho hang
	* @return the kho hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.qlkh.model.KhoHang updateKhoHang(
		com.qlkh.model.KhoHang khoHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKhoHang(khoHang);
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

	public static KhoHangLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					KhoHangLocalService.class.getName());

			if (invokableLocalService instanceof KhoHangLocalService) {
				_service = (KhoHangLocalService)invokableLocalService;
			}
			else {
				_service = new KhoHangLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(KhoHangLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(KhoHangLocalService service) {
	}

	private static KhoHangLocalService _service;
}