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

import com.qlkh.NoSuchHangTrongKhoException;

import com.qlkh.model.HangTrongKho;
import com.qlkh.model.impl.HangTrongKhoImpl;
import com.qlkh.model.impl.HangTrongKhoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the hang trong kho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author apple
 * @see HangTrongKhoPersistence
 * @see HangTrongKhoUtil
 * @generated
 */
public class HangTrongKhoPersistenceImpl extends BasePersistenceImpl<HangTrongKho>
	implements HangTrongKhoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HangTrongKhoUtil} to access the hang trong kho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HangTrongKhoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
			HangTrongKhoModelImpl.FINDER_CACHE_ENABLED, HangTrongKhoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
			HangTrongKhoModelImpl.FINDER_CACHE_ENABLED, HangTrongKhoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
			HangTrongKhoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public HangTrongKhoPersistenceImpl() {
		setModelClass(HangTrongKho.class);
	}

	/**
	 * Caches the hang trong kho in the entity cache if it is enabled.
	 *
	 * @param hangTrongKho the hang trong kho
	 */
	@Override
	public void cacheResult(HangTrongKho hangTrongKho) {
		EntityCacheUtil.putResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
			HangTrongKhoImpl.class, hangTrongKho.getPrimaryKey(), hangTrongKho);

		hangTrongKho.resetOriginalValues();
	}

	/**
	 * Caches the hang trong khos in the entity cache if it is enabled.
	 *
	 * @param hangTrongKhos the hang trong khos
	 */
	@Override
	public void cacheResult(List<HangTrongKho> hangTrongKhos) {
		for (HangTrongKho hangTrongKho : hangTrongKhos) {
			if (EntityCacheUtil.getResult(
						HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
						HangTrongKhoImpl.class, hangTrongKho.getPrimaryKey()) == null) {
				cacheResult(hangTrongKho);
			}
			else {
				hangTrongKho.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all hang trong khos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HangTrongKhoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HangTrongKhoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hang trong kho.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HangTrongKho hangTrongKho) {
		EntityCacheUtil.removeResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
			HangTrongKhoImpl.class, hangTrongKho.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HangTrongKho> hangTrongKhos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HangTrongKho hangTrongKho : hangTrongKhos) {
			EntityCacheUtil.removeResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
				HangTrongKhoImpl.class, hangTrongKho.getPrimaryKey());
		}
	}

	/**
	 * Creates a new hang trong kho with the primary key. Does not add the hang trong kho to the database.
	 *
	 * @param hangTrongKhoPK the primary key for the new hang trong kho
	 * @return the new hang trong kho
	 */
	@Override
	public HangTrongKho create(HangTrongKhoPK hangTrongKhoPK) {
		HangTrongKho hangTrongKho = new HangTrongKhoImpl();

		hangTrongKho.setNew(true);
		hangTrongKho.setPrimaryKey(hangTrongKhoPK);

		return hangTrongKho;
	}

	/**
	 * Removes the hang trong kho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hangTrongKhoPK the primary key of the hang trong kho
	 * @return the hang trong kho that was removed
	 * @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HangTrongKho remove(HangTrongKhoPK hangTrongKhoPK)
		throws NoSuchHangTrongKhoException, SystemException {
		return remove((Serializable)hangTrongKhoPK);
	}

	/**
	 * Removes the hang trong kho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hang trong kho
	 * @return the hang trong kho that was removed
	 * @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HangTrongKho remove(Serializable primaryKey)
		throws NoSuchHangTrongKhoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HangTrongKho hangTrongKho = (HangTrongKho)session.get(HangTrongKhoImpl.class,
					primaryKey);

			if (hangTrongKho == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHangTrongKhoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(hangTrongKho);
		}
		catch (NoSuchHangTrongKhoException nsee) {
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
	protected HangTrongKho removeImpl(HangTrongKho hangTrongKho)
		throws SystemException {
		hangTrongKho = toUnwrappedModel(hangTrongKho);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hangTrongKho)) {
				hangTrongKho = (HangTrongKho)session.get(HangTrongKhoImpl.class,
						hangTrongKho.getPrimaryKeyObj());
			}

			if (hangTrongKho != null) {
				session.delete(hangTrongKho);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (hangTrongKho != null) {
			clearCache(hangTrongKho);
		}

		return hangTrongKho;
	}

	@Override
	public HangTrongKho updateImpl(com.qlkh.model.HangTrongKho hangTrongKho)
		throws SystemException {
		hangTrongKho = toUnwrappedModel(hangTrongKho);

		boolean isNew = hangTrongKho.isNew();

		Session session = null;

		try {
			session = openSession();

			if (hangTrongKho.isNew()) {
				session.save(hangTrongKho);

				hangTrongKho.setNew(false);
			}
			else {
				session.merge(hangTrongKho);
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

		EntityCacheUtil.putResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
			HangTrongKhoImpl.class, hangTrongKho.getPrimaryKey(), hangTrongKho);

		return hangTrongKho;
	}

	protected HangTrongKho toUnwrappedModel(HangTrongKho hangTrongKho) {
		if (hangTrongKho instanceof HangTrongKhoImpl) {
			return hangTrongKho;
		}

		HangTrongKhoImpl hangTrongKhoImpl = new HangTrongKhoImpl();

		hangTrongKhoImpl.setNew(hangTrongKho.isNew());
		hangTrongKhoImpl.setPrimaryKey(hangTrongKho.getPrimaryKey());

		hangTrongKhoImpl.setMaKho(hangTrongKho.getMaKho());
		hangTrongKhoImpl.setMaHang(hangTrongKho.getMaHang());
		hangTrongKhoImpl.setSoLuong(hangTrongKho.getSoLuong());

		return hangTrongKhoImpl;
	}

	/**
	 * Returns the hang trong kho with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hang trong kho
	 * @return the hang trong kho
	 * @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HangTrongKho findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHangTrongKhoException, SystemException {
		HangTrongKho hangTrongKho = fetchByPrimaryKey(primaryKey);

		if (hangTrongKho == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHangTrongKhoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return hangTrongKho;
	}

	/**
	 * Returns the hang trong kho with the primary key or throws a {@link com.qlkh.NoSuchHangTrongKhoException} if it could not be found.
	 *
	 * @param hangTrongKhoPK the primary key of the hang trong kho
	 * @return the hang trong kho
	 * @throws com.qlkh.NoSuchHangTrongKhoException if a hang trong kho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HangTrongKho findByPrimaryKey(HangTrongKhoPK hangTrongKhoPK)
		throws NoSuchHangTrongKhoException, SystemException {
		return findByPrimaryKey((Serializable)hangTrongKhoPK);
	}

	/**
	 * Returns the hang trong kho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hang trong kho
	 * @return the hang trong kho, or <code>null</code> if a hang trong kho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HangTrongKho fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		HangTrongKho hangTrongKho = (HangTrongKho)EntityCacheUtil.getResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
				HangTrongKhoImpl.class, primaryKey);

		if (hangTrongKho == _nullHangTrongKho) {
			return null;
		}

		if (hangTrongKho == null) {
			Session session = null;

			try {
				session = openSession();

				hangTrongKho = (HangTrongKho)session.get(HangTrongKhoImpl.class,
						primaryKey);

				if (hangTrongKho != null) {
					cacheResult(hangTrongKho);
				}
				else {
					EntityCacheUtil.putResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
						HangTrongKhoImpl.class, primaryKey, _nullHangTrongKho);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HangTrongKhoModelImpl.ENTITY_CACHE_ENABLED,
					HangTrongKhoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return hangTrongKho;
	}

	/**
	 * Returns the hang trong kho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hangTrongKhoPK the primary key of the hang trong kho
	 * @return the hang trong kho, or <code>null</code> if a hang trong kho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HangTrongKho fetchByPrimaryKey(HangTrongKhoPK hangTrongKhoPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)hangTrongKhoPK);
	}

	/**
	 * Returns all the hang trong khos.
	 *
	 * @return the hang trong khos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HangTrongKho> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<HangTrongKho> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<HangTrongKho> findAll(int start, int end,
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

		List<HangTrongKho> list = (List<HangTrongKho>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HANGTRONGKHO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HANGTRONGKHO;

				if (pagination) {
					sql = sql.concat(HangTrongKhoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HangTrongKho>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HangTrongKho>(list);
				}
				else {
					list = (List<HangTrongKho>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the hang trong khos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HangTrongKho hangTrongKho : findAll()) {
			remove(hangTrongKho);
		}
	}

	/**
	 * Returns the number of hang trong khos.
	 *
	 * @return the number of hang trong khos
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

				Query q = session.createQuery(_SQL_COUNT_HANGTRONGKHO);

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
	 * Initializes the hang trong kho persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.qlkh.model.HangTrongKho")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HangTrongKho>> listenersList = new ArrayList<ModelListener<HangTrongKho>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HangTrongKho>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HangTrongKhoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HANGTRONGKHO = "SELECT hangTrongKho FROM HangTrongKho hangTrongKho";
	private static final String _SQL_COUNT_HANGTRONGKHO = "SELECT COUNT(hangTrongKho) FROM HangTrongKho hangTrongKho";
	private static final String _ORDER_BY_ENTITY_ALIAS = "hangTrongKho.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HangTrongKho exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HangTrongKhoPersistenceImpl.class);
	private static HangTrongKho _nullHangTrongKho = new HangTrongKhoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HangTrongKho> toCacheModel() {
				return _nullHangTrongKhoCacheModel;
			}
		};

	private static CacheModel<HangTrongKho> _nullHangTrongKhoCacheModel = new CacheModel<HangTrongKho>() {
			@Override
			public HangTrongKho toEntityModel() {
				return _nullHangTrongKho;
			}
		};
}