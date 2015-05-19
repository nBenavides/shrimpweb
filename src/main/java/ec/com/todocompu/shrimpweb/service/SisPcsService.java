package ec.com.todocompu.shrimpweb.service;

import ec.com.todocompu.shrimpweb.entity.SisPcs;

public interface SisPcsService {

	void insertarPc(SisPcs sisPcs) throws Exception;

	SisPcs actualizarPc(SisPcs sisPcs) throws Exception;

	SisPcs obtenerPcPorMac(String mac) throws Exception;
}