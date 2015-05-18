package ec.com.todocompu.shrimpcore.service;

import ec.com.todocompu.shrimpcore.entity.SisPcs;

public interface SisPcsService {

	void insertarPc(SisPcs sisPcs) throws Exception;

	SisPcs actualizarPc(SisPcs sisPcs) throws Exception;

	SisPcs obtenerPcPorMac(String mac) throws Exception;
}