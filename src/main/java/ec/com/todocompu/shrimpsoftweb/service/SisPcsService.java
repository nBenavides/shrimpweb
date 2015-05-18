package ec.com.todocompu.shrimpsoftweb.service;

import ec.com.todocompu.shrimpsoftweb.entity.SisPcs;

public interface SisPcsService {

	void insertarPc(SisPcs sisPcs) throws Exception;

	SisPcs actualizarPc(SisPcs sisPcs) throws Exception;

	SisPcs obtenerPcPorMac(String mac) throws Exception;
}