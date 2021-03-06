package com.dantefung.concurrent.diy;

/**
 * Lock interface to extend different implementations
 * 
 * @author Kirana NS
 */
public interface Lock {
	void lock();
	void unlock();
}