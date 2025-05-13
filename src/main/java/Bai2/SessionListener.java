package Bai2;

import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;

public class SessionListener implements ServletRequestListener {
	    public void sessionCreated(HttpSessionEvent se) {
	        System.out.println("Phiên mới tạo: " + se.getSession().getId());
	    }

	    public void sessionDestroyed(HttpSessionEvent se) {
	        System.out.println("Phiên bị hủy: " + se.getSession().getId());
	    }
}
