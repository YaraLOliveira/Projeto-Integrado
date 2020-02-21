/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.repository;
import java.util.List;

/**
 *
 * @author Yara
 */ 
public interface DAO {
 
 public <T> void save(T entity);
 
 public <T> void update(T type); 
  
 public <T> T find(Integer i);
  
 public <T> List<T> getALL();
 
}

