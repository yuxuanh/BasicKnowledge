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
* @ClassName：UserAdapter   
* @Description：   <p> 适配器模式  --- 两种不同用户之间的适配    Other 适配 User</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午6:01:54   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class UserAdapter extends OtherUserInfo implements IUserInfo{
	
    
    public String getUserName() {
        System.out.println(getUserInfo().get("username"));
        return null;
    }

    
    public String getHomeAddress() {
        System.out.println(getUserInfo().get("address"));
        return null;
    }

    
    public String getMobileNumber() {
        System.out.println(getUserInfo().get("number"));
        return null;
    }

    
    public String getSex() {
        System.out.println(getUserInfo().get("sex"));
        return null;
    }

    
    public String getJobPosition() {
        System.out.println(getUserJobInfo().get("jobaddress"));
        return null;
    }

	
	public String toString() {
		return "UserAdapter [getUserName()=" + getUserName() + ", getHomeAddress()=" + getHomeAddress()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getSex()=" + getSex() + ", getJobPosition()="
				+ getJobPosition() + "]";
	}
    
}
