/*
 * $Id: ImageProcessJob.java,v 1.1 2005/06/30 14:12:58 gummi Exp $
 * Created on 19.3.2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.airtightinteractive.simpleviewer.business;

import java.io.File;


/**
 * 
 *  Last modified: $Date: 2005/06/30 14:12:58 $ by $Author: gummi $
 * 
 * @author <a href="mailto:gummi@idega.com">Gudmundur Agust Saemundsson</a>
 * @version $Revision: 1.1 $
 */
public class ImageProcessJob {

	private String jobKey;
	private int newWidth;
	private int newHeight;
	String newExtension;
	private File input;
	private File output;
	
	public String getJobKey() {
		return jobKey;
	}
	public void setJobKey(String jobKey) {
		this.jobKey = jobKey;
	}

	
	public String getNewExtension() {
		return newExtension;
	}
	public void setNewExtension(String newExtension) {
		this.newExtension = newExtension;
	}
	public int getNewHeight() {
		return newHeight;
	}
	public void setNewHeight(int newHeight) {
		this.newHeight = newHeight;
	}
	public int getNewWidth() {
		return newWidth;
	}
	public void setNewWidth(int newWidth) {
		this.newWidth = newWidth;
	}
	
	/**
	 * @return Returns the input.
	 */
	public File getInputFile() {
		return input;
	}
	/**
	 * @param input The input to set.
	 */
	public void setInputFile(File input) {
		this.input = input;
	}
	/**
	 * @return Returns the output.
	 */
	public File getOutputFile() {
		return output;
	}
	/**
	 * @param output The output to set.
	 */
	public void setOutputFile(File output) {
		this.output = output;
	}
}
