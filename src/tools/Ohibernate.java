/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import org.hibernate.SessionFactory;

/**
 *
 * @author HP
 */
public class Ohibernate {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
    }
}
