package controller.ejb;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

public class HomeEJB<T> implements Serializable{
	private static final long serialVersionUID = -8838197216893074102L;

	private Class<T> classePersistente;

	@PersistenceContext(unitName = "homePU", type = PersistenceContextType.TRANSACTION)
	private EntityManager em;

	/*INICIAL*
	 ===================================================================*/
	@SuppressWarnings("unchecked")
	public HomeEJB(@SuppressWarnings("rawtypes") Class classePersistente) {
		this.classePersistente = classePersistente;
	}

	@SuppressWarnings("unchecked")
	public HomeEJB() {
		Class<?> cl = getClass();
		if (Object.class.getSimpleName().equals(
				cl.getSuperclass().getSimpleName())) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while (!HomeEJB.class.getSimpleName().equals(
				cl.getSuperclass().getSimpleName())) {
			if (cl.getGenericSuperclass() instanceof ParameterizedType) {
				break;
			}
			cl = cl.getSuperclass();
		}
		if (cl.getGenericSuperclass() instanceof ParameterizedType) {
			this.classePersistente = (Class<T>) ((ParameterizedType) cl
					.getGenericSuperclass()).getActualTypeArguments()[0];
		}

	}

	/*CRUD*
	 ===================================================================*/

	/*SELECT*/
	public T buscarPorId(Serializable id, String connection) throws Exception{
		try {
			return getEntityManager(connection).find(classePersistente, id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<T> buscarPorSql(String sql, String connection) throws Exception{
		try {
			return getEntityManager(connection).createQuery(sql, classePersistente).getResultList();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/*INSERIR*/
	public T inserir(T entidade, String connection) throws Exception {
		try {
			getEntityManager(connection).persist(entidade);
			getEntityManager(connection).flush();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return entidade;
	}
	
	/*ALTERAR*/
	public T alterar(T entidade, String connection) throws Exception {
		try {
			EntityManager em = getEntityManager(connection);
			entidade = em.merge(entidade);
			em.flush();

		} catch (OptimisticLockException eO) {
			eO.printStackTrace();
			throw new Exception(eO.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}

		return entidade;
	}
	
	/*EXCLUIR*/
	public void excluir(T entidade, String connection) throws Exception {
		try {
			getEntityManager(connection).remove(getEntityManager(connection).merge(entidade));
			getEntityManager(connection).flush();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/*CONEXÃO*/
	protected EntityManager getEntityManager(String connection) {
		return em;
	}
}