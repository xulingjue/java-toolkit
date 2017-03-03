package io.github.xulingjue.memery;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import javax.management.MBeanServer;
import javax.management.ObjectName;
/**
 * 不同平台和版本下，Mbeans名字不一样。本例为win32+jdk 7_b07
 * Author:源自网络
 * Date:2012-12-9 下午7:18:29
 */
public class GCNum {
	public static void main(String[] args) throws Exception {
		//打印GC次数
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName youngMBean = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
		ObjectName tenuredMBean = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
		System.out.println("YGC:" + mbs.getAttribute(youngMBean, "CollectionCount"));
		System.out.println("FGC:" + mbs.getAttribute(tenuredMBean, "CollectionCount"));
		
		System.gc();
		System.gc();
		System.gc();
		
		System.out.println("YGC:" + mbs.getAttribute(youngMBean, "CollectionCount"));
		System.out.println("FGC:" + mbs.getAttribute(tenuredMBean, "CollectionCount"));
		
		int pid = getPid();  
        System.out.println("pid: " + pid);  
        //System.in.read(); // block the program so that we can do some probing on it  
	}
	
	private static int getPid() { 
		//获取进程的PID
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();  
        String name = runtime.getName(); // format: "pid@hostname"  
        try {  
            return Integer.parseInt(name.substring(0, name.indexOf('@')));  
        } catch (Exception e) {  
            return -1;  
        }  
    }  
}


