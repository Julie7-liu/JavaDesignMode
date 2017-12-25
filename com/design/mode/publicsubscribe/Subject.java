package com.design.mode.publicsubscribe;

import java.util.ArrayList;
import java.util.List;

/*
 * subject�࣬�ɷ���Ϊ��������֪ͨ�ߣ�һ����һ�����������һ���ӿ�ʵ�֡�
 * �������жԹ۲��߶�������ñ�����һ���ۼ��
 * ÿ�����ⶼ�������κ������Ĺ۲��ߣ����������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߶���*/
public abstract class Subject {
     private List<Observer> observers=new ArrayList<Observer>();
     
     //���ӹ۲���
     public void Attach(Observer observer)
     {
    	 observers.add(observer);
     }
     
     //�Ƴ��۲���
     public void Detach(Observer observer)
     {
    	 observers.remove(observer);
     }
     
     //֪ͨ
     public void Notify()
     {
    	 for(Observer o :observers)
    	 {
    		 o.Update();
    	 }
     }
}
