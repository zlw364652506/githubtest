package com.aj.frame.ydjwpt;

import com.aj.frame.api.F;

/**
 * 获取通知消息标题与内容（Web专用）
 * @author lhx
 *
 */
public class AppNoticeMsgWeb {
	
	/**
	 * 获取标题
	 * @param busType 状态
	 * @param objs  多个指定的提示信息
	 * @return
	 */
	public static String getTitle(Byte busType) {
		String title = null;
		
		switch (busType) {
		case 3:
			title = NoticeInfoTitle.t3;
			break;
		case 4:
			title = NoticeInfoTitle.t4;;
			break;
		case 5:
			title = NoticeInfoTitle.t5;
			break;
		case 6:
			title = NoticeInfoTitle.t6;;
			break;
		case 7:
			title = NoticeInfoTitle.t7;
			break;
		case 8:
			title = NoticeInfoTitle.t8;
			break;
		case 9:
			title = NoticeInfoTitle.t9;;
			break;
		case 10:
			title = NoticeInfoTitle.t10;;
			break;
		case 11:
			title = NoticeInfoTitle.t11;;
			break;
		case 12:
			title = NoticeInfoTitle.t12;;
			break;
		case 13:
			title = NoticeInfoTitle.t13;;
			break;
		case 14:
			title = NoticeInfoTitle.t14;
			break;
		case 15:
			title = NoticeInfoTitle.t15;
			break;
		case 16:
			title = NoticeInfoTitle.t16;
			break;
		case 17:
			title = NoticeInfoTitle.t17;
			break;
		default:
			F.log().e("app状态：" + busType);
			title = "未找到对应的状态";
			break;
		}
			return title;
	}

	/**
	 * 获取内容
	 * @param busType 状态
	 * @param showList  多个指定的提示信息
	 * @return
	 */
	public static String getMsg(Byte busType, Object... objs) {
		String msg = null;
		// 是否需要处理
		Boolean t = false;
		if(objs != null && objs.length > 0){
			 t = true;// 需要处理
		}
		switch (busType) {
		case 3:
			msg = NoticeInfoContent.c3;
			break;
		case 4:
			msg = NoticeInfoContent.c4;;
			break;
		case 5:
			msg = NoticeInfoContent.c5;
			break;
		case 6:
			msg = NoticeInfoContent.c6;;
			break;
		case 7:
			msg = NoticeInfoContent.c7;
			break;
		case 8:
			msg = NoticeInfoContent.c8;
			break;
		case 9:
			msg = NoticeInfoContent.c9web;
			break;
		case 10:
			msg = NoticeInfoContent.c10web;
			break;
		case 11:
			msg = NoticeInfoContent.c11web;
			break;
		case 12:
			msg = NoticeInfoContent.c12web;
			break;
		case 13:
			msg = NoticeInfoContent.c13web;
			break;
		case 14:
			msg = NoticeInfoContent.c14;
			break;
		case 15:
			msg = NoticeInfoContent.c15web;
			break;
		case 16:
			msg = NoticeInfoContent.c16web;
			break;
		case 17:
			msg = NoticeInfoContent.c17;
			break;
		default:
			F.log().e("app状态：" + busType);
			msg = "未找到对应的状态";
			t = false;
			break;
		}
		if (t){
			return String.format(msg, objs);
		}else{
			return msg;
		}
	}

	public static void main(String[] args) {
		System.out.println(getTitle((byte) 14));
		System.out.println(getMsg((byte) 14,"andy","jonee"));
	}
}
