package org.example.webserver;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class Configurator {

	ConfigurationAdmin configAdmin;

	@Reference
	protected void setConfigurationAdmin(ConfigurationAdmin configurationAdmin) {
		this.configAdmin = configurationAdmin;
	}

	protected void unsetConfigurationAdmin(ConfigurationAdmin configurationAdmin) {
		this.configAdmin = null;
	}

	@Activate
	public void start() throws IOException {
		System.out.println("config");
		configureJAXRS();
		configureSwagger();
	}

	private void configureJAXRS() throws IOException {
		Configuration configuration = configAdmin.getConfiguration("com.eclipsesource.jaxrs.connector", null);
		Dictionary<String, Object> props = new Hashtable<>();

		props.put("root", "/api");
		configuration.update(props);
	}

	private void configureSwagger() throws IOException {
		Configuration configuration = configAdmin.getConfiguration("com.eclipsesource.jaxrs.swagger.config", null);
		Dictionary<String, Object> props = new Hashtable<>();

		props.put("swagger.basePath", "/api");
		props.put("swagger.host", "localhost:8080");
		// swagger.filterClass
		//props.put("swagger.info.title", "A Swagger test API");
		//props.put("swagger.info.description", "This API only exist to test swagger support");
		//props.put("swagger.info.version", "1.0");
		//props.put("swagger.info.termsOfService", "Free to enjoy");
		//props.put("swagger.info.contact.name", "Holger Staudacher");
		//props.put("swagger.info.contact.url", "https://github.com/hstaudacher/osgi-jax-rs-connector");
		//props.put("swagger.info.contact.email", "holger.staudacher@gmail.com");
		//props.put("swagger.info.license.name", "Eclipse Public License, version 1.0");
		//props.put("swagger.info.license.url", "http://www.eclipse.org/legal/epl-v10.html");
		configuration.update(props);

	}

}
