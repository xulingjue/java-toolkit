package io.github.xulingjue.javatoolkit.event;

import java.util.Enumeration;
import java.util.Vector;

public class ComputeEventAdapter {
	private Vector repostory = new Vector();
	private ComputeEventListener cei ;
	public void addComputeListener(ComputeEventListener cel){
		repostory.add(cel);
	}
	public void notifyComlateEvent(){
		Enumeration enume = repostory.elements();
		while(enume.hasMoreElements()){
			cei = (ComputeEventListener)enume.nextElement();
			cei.complate(new ComputeEvent(this));
		}
	}
}
