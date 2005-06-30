/*
 * $Id: SimpleViewerTag.java,v 1.1 2005/06/30 14:12:58 gummi Exp $
 * Created on 31.1.2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.airtightinteractive.simpleviewer.presentation;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;


/**
 * 
 *  Last modified: $Date: 2005/06/30 14:12:58 $ by $Author: gummi $
 * 
 * @author <a href="mailto:gummi@idega.com">Gudmundur Agust Saemundsson</a>
 * @version $Revision: 1.1 $
 */
public class SimpleViewerTag extends UIComponentTag {
	
	/**
	 * 
	 */
	public SimpleViewerTag() {
		super();
	}
	
	
	
	public String getComponentType() {
		return "SimpleViewer";	
	}

	public String getRendererType() {
		return null;
	}
	
	public void release() {      
		super.release();
	}

	protected void setProperties(UIComponent component) {      
		super.setProperties(component);
	}

}
