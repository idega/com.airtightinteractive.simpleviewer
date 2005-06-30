/*
 * $Id: SimpleViewer.java,v 1.1 2005/06/30 14:12:58 gummi Exp $
 * Created on 18.3.2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.airtightinteractive.simpleviewer.presentation;

import com.airtightinteractive.simpleviewer.business.SimpleViewerUtil;
import com.idega.presentation.Flash;
import com.idega.presentation.IWContext;


/**
 * 
 *  Last modified: $Date: 2005/06/30 14:12:58 $ by $Author: gummi $
 * 
 * @author <a href="mailto:gummi@idega.com">Gudmundur Agust Saemundsson</a>
 * @version $Revision: 1.1 $
 */
public class SimpleViewer extends Flash {

	/**
	 * 
	 */
	public SimpleViewer() {
		super();
		setClassId("clsid:d27cdb6e-ae6d-11cf-96b8-444553540000");
		
		setCodeBase("http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0");
		
		setPluginSpace("http://www.macromedia.com/go/getflashplayer");
		
		setParam("quality","high");
		
		setParamAndAttribute("play","true");
		
		setHeight("100%");
		setWidth("100%");
		
		
		setParamAndAttribute("scale","noscale");
		setParamAndAttribute("BGCOLOR","#828282");
		
		String bundleResourcePath = SimpleViewerUtil.getBundle().getResourcesVirtualPath();
		setURL(bundleResourcePath+"/viewer.swf");
		setGalleryPath(bundleResourcePath+"/imageData.xml");

	}

	public void setGalleryPath(String path){
		setParamAndAttribute("FlashVars","xmlDataPath="+path);
	}

	/**
	 * @param url
	 * @param name
	 */
	public SimpleViewer(String name) {
		this();
		setName(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param url
	 * @param name
	 * @param width
	 * @param height
	 */
	public SimpleViewer(String name, int width, int height) {
		this();
		setWidth(width);
		setHeight(height);
	}


	
	public void main(IWContext iwc) throws Exception {

		setParamAndAttribute("BGCOLOR","#000000");
//		setGalleryPath("/cms/content/files/cms/gallery/gallery2/imageData.xml");
		
		setHeight("100%");
	}
	
}
