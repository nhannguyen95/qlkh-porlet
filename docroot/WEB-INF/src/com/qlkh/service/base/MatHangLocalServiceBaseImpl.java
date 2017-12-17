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

package com.qlkh.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.qlkh.model.MatHang;

import com.qlkh.service.MatHangLocalService;
import com.qlkh.service.persistence.HangTrongKhoPersistence;
import com.qlkh.service.persistence.KhoHangPersistence;
import com.qlkh.service.persistence.MatHangPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the mat hang local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.qlkh.service.impl.MatHangLocalServiceImpl}.
 * </p>
 *
 * @author apple
 * @see com.qlkh.service.impl.MatHangLocalServiceImpl
 * @see com.qlkh.service.MatHangLocalServiceUtil
 * @generated
 */
public abstract class MatHangLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements MatHangLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.qlkh.service.MatHangLocalServiceUtil} to access the mat hang local service.
	 */

	/**
	 * Adds the mat hang to the database. Also notifies the appropriate model listeners.
	 *
	 * @param matHang the mat hang
	 * @return the mat hang that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MatHang addMatHang(MatHang matHang) throws SystemException {
		matHang.setNew(true);

		return matHangPersistence.update(matHang);
	}

	/**
	 * Creates a new mat hang with the primary key. Does not add the mat hang to the database.
	 *
	 * @param MaHang the primary key for the new mat hang
	 * @return the new mat hang
	 */
	@Override
	public MatHang createMatHang(String MaHang) {
		return matHangPersistence.create(MaHang);
	}

	/**
	 * Deletes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param MaHang the primary key of the mat hang
	 * @return the mat hang that was removed
	 * @throws PortalException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MatHang deleteMatHang(String MaHang)
		throws PortalException, SystemException {
		return matHangPersistence.remove(MaHang);
	}

	/**
	 * Deletes the mat hang from the database. Also notifies the appropriate model listeners.
	 *
	 * @param matHang the mat hang
	 * @return the mat hang that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MatHang deleteMatHang(MatHang matHang) throws SystemException {
		return matHangPersistence.remove(matHang);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(MatHang.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return matHangPersistence.findWithDynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return matHangPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return matHangPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return matHangPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return matHangPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public MatHang fetchMatHang(String MaHang) throws SystemException {
		return matHangPersistence.fetchByPrimaryKey(MaHang);
	}

	/**
	 * Returns the mat hang with the primary key.
	 *
	 * @param MaHang the primary key of the mat hang
	 * @return the mat hang
	 * @throws PortalException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang getMatHang(String MaHang)
		throws PortalException, SystemException {
		return matHangPersistence.findByPrimaryKey(MaHang);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return matHangPersistence.findByPrimaryKey(primaryKeyObj);
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
	@Override
	public List<MatHang> getMatHangs(int start, int end)
		throws SystemException {
		return matHangPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of mat hangs.
	 *
	 * @return the number of mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getMatHangsCount() throws SystemException {
		return matHangPersistence.countAll();
	}

	/**
	 * Updates the mat hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param matHang the mat hang
	 * @return the mat hang that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MatHang updateMatHang(MatHang matHang) throws SystemException {
		return matHangPersistence.update(matHang);
	}

	/**
	 * Returns the hang trong kho local service.
	 *
	 * @return the hang trong kho local service
	 */
	public com.qlkh.service.HangTrongKhoLocalService getHangTrongKhoLocalService() {
		return hangTrongKhoLocalService;
	}

	/**
	 * Sets the hang trong kho local service.
	 *
	 * @param hangTrongKhoLocalService the hang trong kho local service
	 */
	public void setHangTrongKhoLocalService(
		com.qlkh.service.HangTrongKhoLocalService hangTrongKhoLocalService) {
		this.hangTrongKhoLocalService = hangTrongKhoLocalService;
	}

	/**
	 * Returns the hang trong kho remote service.
	 *
	 * @return the hang trong kho remote service
	 */
	public com.qlkh.service.HangTrongKhoService getHangTrongKhoService() {
		return hangTrongKhoService;
	}

	/**
	 * Sets the hang trong kho remote service.
	 *
	 * @param hangTrongKhoService the hang trong kho remote service
	 */
	public void setHangTrongKhoService(
		com.qlkh.service.HangTrongKhoService hangTrongKhoService) {
		this.hangTrongKhoService = hangTrongKhoService;
	}

	/**
	 * Returns the hang trong kho persistence.
	 *
	 * @return the hang trong kho persistence
	 */
	public HangTrongKhoPersistence getHangTrongKhoPersistence() {
		return hangTrongKhoPersistence;
	}

	/**
	 * Sets the hang trong kho persistence.
	 *
	 * @param hangTrongKhoPersistence the hang trong kho persistence
	 */
	public void setHangTrongKhoPersistence(
		HangTrongKhoPersistence hangTrongKhoPersistence) {
		this.hangTrongKhoPersistence = hangTrongKhoPersistence;
	}

	/**
	 * Returns the kho hang local service.
	 *
	 * @return the kho hang local service
	 */
	public com.qlkh.service.KhoHangLocalService getKhoHangLocalService() {
		return khoHangLocalService;
	}

	/**
	 * Sets the kho hang local service.
	 *
	 * @param khoHangLocalService the kho hang local service
	 */
	public void setKhoHangLocalService(
		com.qlkh.service.KhoHangLocalService khoHangLocalService) {
		this.khoHangLocalService = khoHangLocalService;
	}

	/**
	 * Returns the kho hang remote service.
	 *
	 * @return the kho hang remote service
	 */
	public com.qlkh.service.KhoHangService getKhoHangService() {
		return khoHangService;
	}

	/**
	 * Sets the kho hang remote service.
	 *
	 * @param khoHangService the kho hang remote service
	 */
	public void setKhoHangService(
		com.qlkh.service.KhoHangService khoHangService) {
		this.khoHangService = khoHangService;
	}

	/**
	 * Returns the kho hang persistence.
	 *
	 * @return the kho hang persistence
	 */
	public KhoHangPersistence getKhoHangPersistence() {
		return khoHangPersistence;
	}

	/**
	 * Sets the kho hang persistence.
	 *
	 * @param khoHangPersistence the kho hang persistence
	 */
	public void setKhoHangPersistence(KhoHangPersistence khoHangPersistence) {
		this.khoHangPersistence = khoHangPersistence;
	}

	/**
	 * Returns the mat hang local service.
	 *
	 * @return the mat hang local service
	 */
	public com.qlkh.service.MatHangLocalService getMatHangLocalService() {
		return matHangLocalService;
	}

	/**
	 * Sets the mat hang local service.
	 *
	 * @param matHangLocalService the mat hang local service
	 */
	public void setMatHangLocalService(
		com.qlkh.service.MatHangLocalService matHangLocalService) {
		this.matHangLocalService = matHangLocalService;
	}

	/**
	 * Returns the mat hang remote service.
	 *
	 * @return the mat hang remote service
	 */
	public com.qlkh.service.MatHangService getMatHangService() {
		return matHangService;
	}

	/**
	 * Sets the mat hang remote service.
	 *
	 * @param matHangService the mat hang remote service
	 */
	public void setMatHangService(
		com.qlkh.service.MatHangService matHangService) {
		this.matHangService = matHangService;
	}

	/**
	 * Returns the mat hang persistence.
	 *
	 * @return the mat hang persistence
	 */
	public MatHangPersistence getMatHangPersistence() {
		return matHangPersistence;
	}

	/**
	 * Sets the mat hang persistence.
	 *
	 * @param matHangPersistence the mat hang persistence
	 */
	public void setMatHangPersistence(MatHangPersistence matHangPersistence) {
		this.matHangPersistence = matHangPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.qlkh.model.MatHang",
			matHangLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.qlkh.model.MatHang");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return MatHang.class;
	}

	protected String getModelClassName() {
		return MatHang.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = matHangPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.qlkh.service.HangTrongKhoLocalService.class)
	protected com.qlkh.service.HangTrongKhoLocalService hangTrongKhoLocalService;
	@BeanReference(type = com.qlkh.service.HangTrongKhoService.class)
	protected com.qlkh.service.HangTrongKhoService hangTrongKhoService;
	@BeanReference(type = HangTrongKhoPersistence.class)
	protected HangTrongKhoPersistence hangTrongKhoPersistence;
	@BeanReference(type = com.qlkh.service.KhoHangLocalService.class)
	protected com.qlkh.service.KhoHangLocalService khoHangLocalService;
	@BeanReference(type = com.qlkh.service.KhoHangService.class)
	protected com.qlkh.service.KhoHangService khoHangService;
	@BeanReference(type = KhoHangPersistence.class)
	protected KhoHangPersistence khoHangPersistence;
	@BeanReference(type = com.qlkh.service.MatHangLocalService.class)
	protected com.qlkh.service.MatHangLocalService matHangLocalService;
	@BeanReference(type = com.qlkh.service.MatHangService.class)
	protected com.qlkh.service.MatHangService matHangService;
	@BeanReference(type = MatHangPersistence.class)
	protected MatHangPersistence matHangPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private MatHangLocalServiceClpInvoker _clpInvoker = new MatHangLocalServiceClpInvoker();
}