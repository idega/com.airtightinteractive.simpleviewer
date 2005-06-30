<?xml version="1.0"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
        xmlns:h="http://java.sun.com/jsf/html"
        xmlns:jsf="http://java.sun.com/jsf/core"
        xmlns:ws="http://xmlns.idega.com/com.idega.workspace"
        xmlns:wf="http://xmlns.idega.com/com.idega.webface"
        xmlns:simpleviewer="http://xmlns.idega.com/com.airtightinteractive.simpleviewer"
version="1.2">

	<jsf:view>
		<ws:page>
			<h:form>
				<wf:wfblock id="simple_viewer_block" title="SimpleViewer Image Gallery">
					<simpleviewer:SimpleViewer id="simpleviewer" />
				</wf:wfblock>
			</h:form>
		</ws:page>
	</jsf:view>
</jsp:root>