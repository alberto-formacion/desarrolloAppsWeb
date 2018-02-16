package com.ipartek.model.service;

import java.rmi.RemoteException;

import eu.dataaccess.footballpool.InfoSoapType;
import eu.dataaccess.footballpool.InfoSoapTypeProxy;
import eu.dataaccess.footballpool.TGameInfo;

public class PartidoService {
	InfoSoapType footballPool;
	
	public PartidoService() {
		footballPool = new InfoSoapTypeProxy();
	}
	
	public TGameInfo[] getPartidos() {
		try {
			return footballPool.allGames();
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
