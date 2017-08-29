package com.newsun.web.domain;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public interface BaseRepository<T,PK extends Serializable> {
    public Session getSession();
    public Session openSession();
    public void save(final T entity);
    public void delete(final T entity);
    public void delete(final PK id);
    public T get(final PK id);
    public List<T> get(final Collection<PK> ids);
    public List<T> getAll();
    public List<T> getAll(String orderByProperty,boolean isAsc);
    public List<T> findByProperty(final String propertyName,final Object value);
    public T findUniqueByProperty(final String propertyName,final Object value);
    public <X> List<X> find(final String hql,final Object... values);
    public <X> List<X> find(final String hql,final Map<String,?> values);
    public <X> X findUnique(final String hql,final Object... values);
    public <X> X findUnique(final String hql,final Map<String,?> values);
    public int batchExecute(final String hql,final Object... values);
    public int batchExecute(final String hql,final Map<String,?> values);
    public Query createQuery(final String queryString, final Object... values);
    public Query createQuery(final String queryString,final Map<String,?> values);
    public List<T> find(final Criterion... criterions);
    public T findUnique(final Criterion... criterions);
    public Criteria createCriteria(final Criterion... criterions);
    public void initProxyObject(Object proxy);
    public void flush();
    public Query distinct(Query query);
    public Criteria distinct(Criteria criteria);
    public String getIdName();
    public boolean isPropertyUnique(final String propertyName,final Object newValue,final Object oldValue);
}
