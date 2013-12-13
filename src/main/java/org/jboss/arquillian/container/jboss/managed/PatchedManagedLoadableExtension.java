package org.jboss.arquillian.container.jboss.managed;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.as.arquillian.container.managed.ManagedDeployableContainer;

public class PatchedManagedLoadableExtension implements LoadableExtension {

    @Override
    public void register(ExtensionBuilder builder) {
        builder.override(DeployableContainer.class, ManagedDeployableContainer.class, PatchedManagedDeployableContainer.class);
    }
}
