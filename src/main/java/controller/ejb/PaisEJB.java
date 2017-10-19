package controller.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import model.entity.Pais;

@Stateless
public class PaisEJB extends HomeEJB<Pais>{
	private static final long serialVersionUID = 1860267318306225751L;
	
	@SuppressWarnings("unchecked")
    public List<Pais> buscarTodos(String connection) throws Exception {
        try {

            String sql = "select obj from Pais obj";
            
            Query query = getEntityManager(connection)
                    .createQuery(sql);

            return query.getResultList();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
	
}
