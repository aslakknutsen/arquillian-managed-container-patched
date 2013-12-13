package org.jboss.arquillian.container.jboss.managed;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
public class VerifyPropertyTestCase {

    @Deployment
    public static WebArchive deploy() {
        return ShrinkWrap.create(WebArchive.class);
    }
    
    @Test
    public void shouldbeAbleToReadProperty() {
        String startupProperty = System.getProperty("TEST");
        
        Assert.assertNotNull("Verify startup property is set", startupProperty);
        Assert.assertEquals("Verify startup property has correct value", "A", startupProperty);
    }
    
}
