/*
 * $Id: IWBundleStarter.java,v 1.1 2005/06/30 14:12:58 gummi Exp $
 * Created on 2.11.2004
 *
 * Copyright (C) 2004 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.airtightinteractive.simpleviewer;

import java.util.Collection;
import java.util.Iterator;
import com.idega.content.view.ContentViewManager;
import com.idega.core.view.DefaultViewNode;
import com.idega.core.view.ViewNode;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;
import com.idega.idegaweb.include.GlobalIncludeManager;


/**
 * 
 *  Last modified: $Date: 2005/06/30 14:12:58 $ by $Author: gummi $
 * 
 * @author <a href="mailto:tryggvil@idega.com">Tryggvi Larusson</a>
 * @version $Revision: 1.1 $
 */
public class IWBundleStarter implements IWBundleStartable {
	private static final String STYLE_SHEET_URL = "/style/simpleviewer.css";
	private static final String BUNDLE_IDENTIFIER="com.airtightinteractive.simpleviewer";

	/**
	 * 
	 */
	public IWBundleStarter() {
	}

	/* (non-Javadoc)
	 * @see com.idega.idegaweb.IWBundleStartable#start(com.idega.idegaweb.IWBundle)
	 */
	public void start(IWBundle starterBundle) {		
		addGalleryViews(starterBundle);
		//Add the stylesheet:
		GlobalIncludeManager.getInstance().addBundleStyleSheet(BUNDLE_IDENTIFIER,STYLE_SHEET_URL);
	}

	/* (non-Javadoc)
	 * @see com.idega.idegaweb.IWBundleStartable#stop(com.idega.idegaweb.IWBundle)
	 */
	public void stop(IWBundle starterBundle) {
	}
	
	public void addGalleryViews(IWBundle bundle){
		ContentViewManager cViewManager = ContentViewManager.getInstance(bundle.getApplication());
		ViewNode contentNode = cViewManager.getContentNode();
		
		ViewNode galleryNode = null;
		Collection childs = contentNode.getChildren();
		if(childs!=null){
			for (Iterator iter = childs.iterator(); iter.hasNext();) {
				ViewNode node = (ViewNode) iter.next();
				if("gallery".equals(node.getName())){
					galleryNode = node;
					break;
				}
			}
		}
		
		if(galleryNode== null){
			galleryNode = new DefaultViewNode("gallery",contentNode);
			((DefaultViewNode)galleryNode).setJspUri(bundle.getJSPURI("simpleviewer.jsp"));
		}
		
		DefaultViewNode imageGalleryNode = new DefaultViewNode("simpleviewer",galleryNode);
		imageGalleryNode.setJspUri(bundle.getJSPURI("simpleviewer.jsp"));
	}
}
