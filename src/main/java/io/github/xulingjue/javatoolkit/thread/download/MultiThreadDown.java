package io.github.xulingjue.javatoolkit.thread.download;


/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// 初始化DownUtil对象
		final DownUtil downUtil = new DownUtil("http://a.vpimg2.com/upload/merchandise/171160/MARISFROLG-A11110606-1.jpg"
			, "MARISFROLG-A11110606-1.jpg", 4);
		// 开始下载
		downUtil.download();
		new Thread()
		{
			public void run()
			{
				while(downUtil.getCompleteRate() < 1)
				{
					// 每隔0.1秒查询一次任务的完成进度，
					// GUI程序中可根据该进度来绘制进度条
					System.out.println("已完成：" 
						+ downUtil.getCompleteRate());
					try
					{
						Thread.sleep(1000);
					}
					catch (Exception ex){}
				}
			}
		}.start();
	}
}
