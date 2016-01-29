package rmi.service;

import rmi.model.PersonEntity;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/25 14:09
 * Desc:
 */
public interface PersonService extends Remote {

    public List<PersonEntity> GetList() throws RemoteException;
}