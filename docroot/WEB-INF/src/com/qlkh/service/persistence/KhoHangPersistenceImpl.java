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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.qlkh.NoSuchKhoHangException;

import com.qlkh.model.KhoHang;
import com.qlkh.model.impl.KhoHangImpl;
import com.qlkh.model.impl.KhoHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kho hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author apple
 * @see KhoHangPersistence
 * @see KhoHangUtil
 * @generated
 */
public class KhoHangPersistenceImpl extends BasePersistenceImpl<KhoHang>
	implements KhoHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhoHangUtil} to access the kho hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhoHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, KhoHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, KhoHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public KhoHangPersistenceImpl() {
		setModelClass(KhoHang.class);
	}

	/**
	 * Caches the kho hang in the entity cache if it is enabled.
	 *
	 * @param khoHang the kho hang
	 */
	@Override
	public void cacheResult(KhoHang khoHang) {
		EntityCacheUtil.putResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangImpl.class, khoHang.getPrimaryKey(), khoHang);

		khoHang.resetOriginalValues();
	}

	/**
	 * Caches the kho hangs in the entity cache if it is enabled.
	 *
	 * @param khoHangs the kho hangs
	 */
	@Override
	public void cacheResult(List<KhoHang> khoHangs) {
		for (KhoHang khoHang : khoHangs) {
			if (EntityCacheUtil.getResult(
						KhoHangModelImpl.ENTITY_CACHE_ENABLED,
						KhoHangImpl.class, khoHang.getPrimaryKey()) == null) {
				cacheResult(khoHang);
			}
			else {
				khoHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all kho hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KhoHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KhoHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the kho hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KhoHang khoHang) {
		EntityCacheUtil.removeResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangImpl.class, khoHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KhoHang> khoHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KhoHang khoHang : khoHangs) {
			EntityCacheUtil.removeResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
				KhoHangImpl.class, khoHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new kho hang with the primary key. Does not add the kho hang to the database.
	 *
	 * @param MaKho the primary key for the new kho hang
	 * @return the new kho hang
	 */
	@Override
	public KhoHang create(String MaKho) {
		KhoHang khoHang = new KhoHangImpl();

		khoHang.setNew(true);
		khoHang.setPrimaryKey(MaKho);

		return khoHang;
	}

	/**
	 * Removes the kho hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param MaKho the primary key of the kho hang
	 * @return the kho hang that was removed
	 * @throws com.qlkh.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang remove(String MaKho)
		throws NoSuchKhoHangException, SystemException {
		return remove((Serializable)MaKho);
	}

	/**
	 * Removes the kho hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the kho hang
	 * @return the kho hang that was removed
	 * @throws com.qlkh.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang remove(Serializable primaryKey)
		throws NoSuchKhoHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KhoHang khoHang = (KhoHang)session.get(KhoHangImpl.class, primaryKey);

			if (khoHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhoHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khoHang);
		}
		catch (NoSuchKhoHangException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected KhoHang removeImpl(KhoHang khoHang) throws SystemException {
		khoHang = toUnwrappedModel(khoHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khoHang)) {
				khoHang = (KhoHang)session.get(KhoHangImpl.class,
						khoHang.getPrimaryKeyObj());
			}

			if (khoHang != null) {
				session.delete(khoHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khoHang != null) {
			clearCache(khoHang);
		}

		return khoHang;
	}

	@Override
	public KhoHang updateImpl(com.qlkh.model.KhoHang khoHang)
		throws SystemException {
		khoHang = toUnwrappedModel(khoHang);

		boolean isNew = khoHang.isNew();

		Session session = null;

		try {
			session = openSession();

			if (khoHang.isNew()) {
				session.save(khoHang);

				khoHang.setNew(false);
			}
			else {
				session.merge(khoHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangImpl.class, khoHang.getPrimaryKey(), khoHang);

		return khoHang;
	}

	protected KhoHang toUnwrappedModel(KhoHang khoHang) {
		if (khoHang instanceof KhoHangImpl) {
			return khoHang;
		}

		KhoHangImpl khoHangImpl = new KhoHangImpl();

		khoHangImpl.setNew(khoHang.isNew());
		khoHangImpl.setPrimaryKey(khoHang.getPrimaryKey());

		khoHangImpl.setMaKho(khoHang.getMaKho());
		khoHangImpl.setTenKho(khoHang.getTenKho());
		khoHangImpl.setDiaDiem(khoHang.getDiaDiem());

		return khoHangImpl;
	}

	/**
	 * Returns the kho hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the kho hang
	 * @return the kho hang
	 * @throws com.qlkh.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhoHangException, SystemException {
		KhoHang khoHang = fetchByPrimaryKey(primaryKey);

		if (khoHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhoHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khoHang;
	}

	/**
	 * Returns the kho hang with the primary key or throws a {@link com.qlkh.NoSuchKhoHangException} if it could not be found.
	 *
	 * @param MaKho the primary key of the kho hang
	 * @return the kho hang
	 * @throws com.qlkh.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang findByPrimaryKey(String MaKho)
		throws NoSuchKhoHangException, SystemException {
		return findByPrimaryKey((Serializable)MaKho);
	}

	/**
	 * Returns the kho hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the kho hang
	 * @return the kho hang, or <code>null</code> if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KhoHang khoHang = (KhoHang)EntityCacheUtil.getResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
				KhoHangImpl.class, primaryKey);

		if (khoHang == _nullKhoHang) {
			return null;
		}

		if (khoHang == null) {
			Session session = null;

			try {
				session = openSession();

				khoHang = (KhoHang)session.get(KhoHangImpl.class, primaryKey);

				if (khoHang != null) {
					cacheResult(khoHang);
				}
				else {
					EntityCacheUtil.putResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
						KhoHangImpl.class, primaryKey, _nullKhoHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
					KhoHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khoHang;
	}

	/**
	 * Returns the kho hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param MaKho the primary key of the kho hang
	 * @return the kho hang, or <code>null</code> if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang fetchByPrimaryKey(String MaKho) throws SystemException {
		return fetchByPrimaryKey((Serializable)MaKho);
	}

	/**
	 * Returns all the kho hangs.
	 *
	 * @return the kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<KhoHang> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<KhoHang> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<KhoHang> list = (List<KhoHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KHOHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHOHANG;

				if (pagination) {
					sql = sql.concat(KhoHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KhoHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhoHang>(list);
				}
				else {
					list = (List<KhoHang>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the kho hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KhoHang khoHang : findAll()) {
			remove(khoHang);
		}
	}

	/**
	 * Returns the number of kho hangs.
	 *
	 * @return the number of kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_KHOHANG);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the kho hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.qlkh.model.KhoHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KhoHang>> listenersList = new ArrayList<ModelListener<KhoHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KhoHang>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(KhoHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KHOHANG = "SELECT khoHang FROM KhoHang khoHang";
	private static final String _SQL_COUNT_KHOHANG = "SELECT COUNT(khoHang) FROM KhoHang khoHang";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khoHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KhoHang exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KhoHangPersistenceImpl.class);
	private static KhoHang _nullKhoHang = new KhoHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KhoHang> toCacheModel() {
				return _nullKhoHangCacheModel;
			}
		};

	private static CacheModel<KhoHang> _nullKhoHangCacheModel = new CacheModel<KhoHang>() {
			@Override
			public KhoHang toEntityModel() {
				return _nullKhoHang;
			}
		};
}