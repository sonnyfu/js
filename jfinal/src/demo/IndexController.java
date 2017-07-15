package demo;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		Integer open_tbzd=getCookieToInt("open_tbzd");
		if(open_tbzd==null)
			setCookie("open_tbzd", "0", Integer.MAX_VALUE);
		else
			setCookie("open_tbzd", "1", Integer.MAX_VALUE);
		render("");
		//renderText("Hello JFinal World.");
	}
	
}