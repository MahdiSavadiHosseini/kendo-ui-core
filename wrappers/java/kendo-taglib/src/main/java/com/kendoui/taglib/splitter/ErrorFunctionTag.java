
package com.kendoui.taglib.splitter;

import com.kendoui.taglib.FunctionTag;

import com.kendoui.taglib.SplitterTag;


import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class ErrorFunctionTag extends FunctionTag /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        SplitterTag parent = (SplitterTag)findParentWithClass(SplitterTag.class);


        parent.setError(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes
//<< Attributes

}
