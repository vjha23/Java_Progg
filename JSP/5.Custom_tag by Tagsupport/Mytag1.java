package jsp_5;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class Mytag1 extends TagSupport {

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h1>Hello Vijay22</h1>");
			out.print("<h2>159/2 Malviya Nagar</h2>");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	

}
