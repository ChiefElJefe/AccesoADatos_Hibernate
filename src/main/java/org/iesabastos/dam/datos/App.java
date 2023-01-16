package org.iesabastos.dam.datos;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HibernateUtil.buildSessionFactory();
        HibernateUtil.openSession();

        Granjero a = new Granjero();
        a.setId(1);
        a.setNivel(10);
        a.setDescripcion("Buena Casa");
        a.setDinero(100.50f);
        a.setNombre("Los pollos Hermanos BB");
        a.setPuntos(100);
        Session sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.save(a);
        sesion.getTransaction().commit();
        sesion.close();
    }
}
