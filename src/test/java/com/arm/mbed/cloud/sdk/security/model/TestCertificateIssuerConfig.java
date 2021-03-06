// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfig.
 */
public class TestCertificateIssuerConfig {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("14e17975-25cd-4048-816e-403d44738384",
                                                                                       new java.util.Date(1541758614125l),
                                                                                       "9a99cdcb-aed2-4516-ad4e-13d344d548dc",
                                                                                       "a1098964-3e3c-4406-93b6-480b4c35d617",
                                                                                       new java.util.Date(1541758615976l));
        CertificateIssuerConfig certificateissuerconfig2 = certificateissuerconfig1.clone();
        assertNotNull(certificateissuerconfig1);
        assertNotNull(certificateissuerconfig2);
        assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
        assertEquals(certificateissuerconfig2, certificateissuerconfig1);
    }

    /**
     * Tests the isvalid method.
     */
    @Test
    public void testIsvalid() {
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("3bcade6e-6c5c-485e-a0bb-47b6efa1c37a",
                                                                                      new java.util.Date(1541758612813l),
                                                                                      "7f19bda9-cc47-46ed-8c6b-b970342bb898",
                                                                                      "9c060053-47a3-466c-8054-ed783912d45c",
                                                                                      new java.util.Date(1541758616520l));
        assertTrue(certificateissuerconfig.isValid());
    }

    /**
     * Tests the hashcode method.
     */
    @Test
    public void testHashcode() {
        CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("3e4e184e-5b54-4a37-b118-219e51774c01",
                                                                                       new java.util.Date(1541758614352l),
                                                                                       "290f53c0-fa26-4992-8ceb-ca897f9d2d50",
                                                                                       "8a1b62af-caa7-4c69-ad3c-29ec56033a56",
                                                                                       new java.util.Date(1541758622197l));
        CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("3e4e184e-5b54-4a37-b118-219e51774c01",
                                                                                       new java.util.Date(1541758614352l),
                                                                                       "290f53c0-fa26-4992-8ceb-ca897f9d2d50",
                                                                                       "8a1b62af-caa7-4c69-ad3c-29ec56033a56",
                                                                                       new java.util.Date(1541758622197l));
        assertNotNull(certificateissuerconfig1);
        assertNotNull(certificateissuerconfig2);
        assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
        assertEquals(certificateissuerconfig2, certificateissuerconfig1);
        assertEquals(certificateissuerconfig2.hashCode(), certificateissuerconfig1.hashCode());
        int hashCode = certificateissuerconfig1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, certificateissuerconfig1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("e3ab8423-698d-4017-8630-3795912febc8",
                                                                                       new java.util.Date(1541758615059l),
                                                                                       "e876f6fa-bcda-4bcc-8061-93bace2d713c",
                                                                                       "94a579c4-a1a4-4aa0-a9aa-9db2eb43e384",
                                                                                       new java.util.Date(1541758621786l));
        CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("e3ab8423-698d-4017-8630-3795912febc8",
                                                                                       new java.util.Date(1541758615059l),
                                                                                       "e876f6fa-bcda-4bcc-8061-93bace2d713c",
                                                                                       "94a579c4-a1a4-4aa0-a9aa-9db2eb43e384",
                                                                                       new java.util.Date(1541758621786l));
        CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("214e239f-f045-49e8-82d0-3d74633c901b",
                                                                                       new java.util.Date(1541758612960l),
                                                                                       "68968a6e-991b-47f3-a2c4-1425cf405450",
                                                                                       "25d55075-3891-4c91-97f4-bb6b6bb39883",
                                                                                       new java.util.Date(1541758617906l));
        assertNotNull(certificateissuerconfig1);
        assertNotNull(certificateissuerconfig2);
        assertNotNull(certificateissuerconfig3);
        assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
        assertNotSame(certificateissuerconfig3, certificateissuerconfig1);
        assertEquals(certificateissuerconfig2, certificateissuerconfig1);
        assertEquals(certificateissuerconfig2, certificateissuerconfig1);
        assertEquals(certificateissuerconfig1, certificateissuerconfig2);
        assertEquals(certificateissuerconfig1, certificateissuerconfig1);
        assertFalse(certificateissuerconfig1.equals(null));
        assertNotEquals(certificateissuerconfig3, certificateissuerconfig1);
    }
}
