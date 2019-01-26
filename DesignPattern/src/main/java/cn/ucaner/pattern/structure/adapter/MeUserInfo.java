/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.adapter;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IUserInfo;

/**
* @Package：cn.ucaner.pattern.structure.adapter   
* @ClassName：MeUserInfo   
* @Description：   <p> 适配器模式  --- 我们自己的用户类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午6:02:39   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class MeUserInfo implements IUserInfo {

    
    public String getUserName() {
        System.out.print("员工姓名");
        return null;
    }

    
    public String getHomeAddress() {
        System.out.print("员工住址");
        return null;
    }

    
    public String getMobileNumber() {
        System.out.print("员工号码");
        return null;
    }

    
    public String getSex() {
        System.out.print("员工性别");
        return null;
    }

    
    public String getJobPosition() {
        System.out.print("员工公司地址");
        return null;
    }

	
	public String toString() {
		return "MeUserInfo [getUserName()=" + getUserName() + ", getHomeAddress()=" + getHomeAddress()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getSex()=" + getSex() + ", getJobPosition()="
				+ getJobPosition() + "]";
	}
    
    
}