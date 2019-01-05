/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Satish
 * @param <K>   Type Parameter of Key of Enum Constants
 * @param <T>   Type Parameter of Value of Enum Constants
 */
public interface RootEnum<K, T> {
    public K getKey(); 
    public T getType();
}
