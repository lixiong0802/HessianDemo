package rmi;

import rmi.model.PersonEntity;
import rmi.service.PersonService;

import java.rmi.Naming;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/25 14:12
 * Desc:
 */
public class ProgramClient {

    public static void main(String[] args) {
        try {
//调用远程对象，注意RMI路径与接口必须与服务器配置一致
            PersonService personService = (PersonService) Naming.lookup("rmi://127.0.0.1:6600/PersonService");
            List<PersonEntity> personList = personService.GetList();
            for (PersonEntity person : personList) {
                System.out.println("ID:" + person.getId() + " Age:" + person.getAge() + " Name:" + person.getName());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
