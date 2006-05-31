/*
 * $Id: SimpleViewerUtil.java,v 1.2 2006/05/31 12:37:44 eiki Exp $
 * Created on 7.2.2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.airtightinteractive.simpleviewer.business;

import javax.faces.context.FacesContext;
import com.idega.content.business.ContentUtil;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWContext;


/**
 * 
 *  Last modified: $Date: 2006/05/31 12:37:44 $ by $Author: eiki $
 * 
 * @author <a href="mailto:gummi@idega.com">Gudmundur Agust Saemundsson</a>
 * @version $Revision: 1.2 $
 */
public class SimpleViewerUtil {
	

	protected static final String SIMPLE_VIEWER_CONTENT_PATH = "/airtightinteractive/simpleviewer";

	public static final String IW_BUNDLE_IDENTIFIER = "com.airtightinteractive.simpleviewer";
	public static final String MODULE_PREFIX = "simpleviewer_";

	private static IWBundle bundle = null;
	
	public static IWBundle getBundle() {
		if (bundle == null) {
			setupBundle();
		}
		return bundle;
	}

	private static void setupBundle() {
		FacesContext context = FacesContext.getCurrentInstance();
		IWContext iwContext = IWContext.getIWContext(context);
		bundle = iwContext.getIWMainApplication().getBundle(IW_BUNDLE_IDENTIFIER);
	}
	
	public static String getContentRootPath(){
		return ContentUtil.getContentBaseFolderPath();
	}

	
	public static String getSimpleViewerRootPath(){
		return ContentUtil.getContentBaseFolderPath()+SIMPLE_VIEWER_CONTENT_PATH;
	}

}
