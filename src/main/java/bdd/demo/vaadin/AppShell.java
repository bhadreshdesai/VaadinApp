package bdd.demo.vaadin;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "VaadinApp", shortName = "vaadin-app", enableInstallPrompt = false)
public class AppShell implements AppShellConfigurator {
}
