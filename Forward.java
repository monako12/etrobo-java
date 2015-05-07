/* 
*Forward.java
*/

import josx.platform.rcx.Motor;

public class Forward{
	public static void main(String[] args) {
	// 駆動輪のモータのパワーを設定
	Motor.C.setPower(3);
	// 駆動輪のモータを晴天させる
	Motor.C.forward();
	try{
		//メインスレッドを2秒間スリープする
		//この間モータは回転し続けている
		Thred.sleep(2000);
	} catch(Exception e){
	}
	// 駆動輪のモータを制止
	Motor.C.stop();
	}
	}