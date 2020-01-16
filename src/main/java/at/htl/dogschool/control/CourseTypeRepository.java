package at.htl.dogschool.control;

import at.htl.dogschool.entity.CourseType;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CourseTypeRepository {
    @PersistenceContext
    private EntityManager em;

    public CourseType findByAbbr(String abbr) {
    return em.createNamedQuery("CourseType.findByAbbr", CourseType.class)
            .setParameter("ABBR", abbr)
            .getSingleResult();


    }

    public List<CourseType> findAll() {
        return null;
    }

    public CourseType save(CourseType courseType) {
        return em.merge(courseType);
    }

    public CourseType findById(long id) {
        return em.createNamedQuery("CourseType.findById", CourseType.class)
                .setParameter("ID", id)
                .getSingleResult();
    }

    public void delete(long id) {
        em.createNamedQuery("CourseType.deleteById", CourseType.class)
                .setParameter("ID", id);
    }

    public void update(long id, CourseType courseType) {
        em.createNamedQuery("CourseType.updateById", CourseType.class)
                .setParameter("ID", id);

    }
}
