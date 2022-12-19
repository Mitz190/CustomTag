package com.tag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		JspWriter jspWriter = pageContext.getOut();
		try {
		jspWriter.print("Hello");
		} catch (Exception e) {
			
		}
		return SKIP_BODY;
	}
}
