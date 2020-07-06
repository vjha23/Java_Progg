package jsp_4;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class Mytag1 implements Tag {
	Tag parent;
	PageContext pageContext;
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
			out.print("<h1>Hello Vijay</h1>");
			out.print("<h2>159/2 Malviya Nagar</h2>");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		// TODO Auto-generated method stub
		this.pageContext=pageContext;
	}

	@Override
	public void setParent(Tag parent) {
		// TODO Auto-generated method stub
		this.parent=parent;
	}

}
