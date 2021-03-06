// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated model class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import java.util.Date;
import java.util.Map;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;

/**
 * Model for CertificateIssuer.
 */
@Preamble(description = "Model for CertificateIssuer.")
public class CertificateIssuer implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -202527614635182L;

    /**
     * Creation UTC time RFC3339.
     */
    private Date createdAt;

    /**
     * General description for the certificate issuer.
     */
    private String description;

    /**
     * The ID of the certificate issuer.
     */
    private String id;

    /**
     * General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value shall be
     * empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes.
     */
    private Map<String, String> issuerAttributes;

    /**
     * The type of the certificate issuer. - GLOBAL_SIGN: Certificates are issued by GlobalSign service. The users must
     * provide their own GlobalSign account credentials. - CFSSL_AUTH: Certificates are issued by CFSSL authenticated
     * signing service. The users must provide their own CFSSL host_url and credentials.
     */
    private CertificateIssuerType issuerType;

    /**
     * Certificate issuer name, unique per account.
     */
    @Required
    private String name;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #CertificateIssuer()} instead.
     * 
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param description
     *            General description for the certificate issuer.
     * @param id
     *            The ID of the certificate issuer.
     * @param issuerAttributes
     *            General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the
     *            value shall be empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes.
     * 
     * @param issuerType
     *            The type of the certificate issuer. - GLOBAL_SIGN: Certificates are issued by GlobalSign service. The
     *            users must provide their own GlobalSign account credentials. - CFSSL_AUTH: Certificates are issued by
     *            CFSSL authenticated signing service. The users must provide their own CFSSL host_url and credentials.
     * 
     * @param name
     *            Certificate issuer name, unique per account.
     * 
     * 
     */
    @Internal
    public CertificateIssuer(Date createdAt, String description, String id, Map<String, String> issuerAttributes,
                             CertificateIssuerType issuerType, String name) {
        super();
        setCreatedAt(createdAt);
        setDescription(description);
        setId(id);
        setIssuerAttributes(issuerAttributes);
        setIssuerType(issuerType);
        setName(name);

    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #CertificateIssuer()} instead.
     * 
     * @param certificateIssuer
     *            a certificateissuer.
     */
    @Internal
    public CertificateIssuer(CertificateIssuer certificateIssuer) {
        this(certificateIssuer == null ? new Date() : certificateIssuer.createdAt,
             certificateIssuer == null ? null : certificateIssuer.description,
             certificateIssuer == null ? null : certificateIssuer.id,
             certificateIssuer == null ? null : certificateIssuer.issuerAttributes,
             certificateIssuer == null ? CertificateIssuerType.getDefault() : certificateIssuer.issuerType,
             certificateIssuer == null ? null : certificateIssuer.name);
    }

    /**
     * Constructor.
     */
    public CertificateIssuer() {
        this(new Date(), null, null, null, null, null);
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The ID of the certificate issuer.
     */
    public CertificateIssuer(String id) {
        this();
        setId(id);
    }

    /**
     * Gets creation utc time rfc3339.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets creation utc time rfc3339.
     * 
     * @param createdAt
     *            Creation UTC time RFC3339.
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets general description for the certificate issuer.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets general description for the certificate issuer.
     * 
     * @param description
     *            General description for the certificate issuer.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the id of the certificate issuer.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the certificate issuer.
     * 
     * @param id
     *            The ID of the certificate issuer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id of the certificate issuer.
     * <p>
     * Similar to {@link #setId(String)}.
     * 
     * @param certificateissuerId
     *            The ID of the certificate issuer.
     */
    @Internal
    public void setCertificateissuerId(String certificateissuerId) {
        setId(certificateissuerId);
    }

    /**
     * Gets general attributes for connecting the certificate issuer. when the issuer_type is global_sign, the value
     * shall be empty. when the issuer_type is cfssl_auth, see definition of cfsslattributes.
     * 
     * @return issuerAttributes
     */
    public Map<String, String> getIssuerAttributes() {
        return issuerAttributes;
    }

    /**
     * Sets general attributes for connecting the certificate issuer. when the issuer_type is global_sign, the value
     * shall be empty. when the issuer_type is cfssl_auth, see definition of cfsslattributes.
     * 
     * @param issuerAttributes
     *            General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the
     *            value shall be empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes.
     * 
     */
    public void setIssuerAttributes(Map<String, String> issuerAttributes) {
        this.issuerAttributes = issuerAttributes;
    }

    /**
     * Gets the type of the certificate issuer. - global_sign: certificates are issued by globalsign service. the users
     * must provide their own globalsign account credentials. - cfssl_auth: certificates are issued by cfssl
     * authenticated signing service. the users must provide their own cfssl host_url and credentials.
     * 
     * @return issuerType
     */
    public CertificateIssuerType getIssuerType() {
        return issuerType;
    }

    /**
     * Sets the type of the certificate issuer. - global_sign: certificates are issued by globalsign service. the users
     * must provide their own globalsign account credentials. - cfssl_auth: certificates are issued by cfssl
     * authenticated signing service. the users must provide their own cfssl host_url and credentials.
     * 
     * @param issuerType
     *            The type of the certificate issuer. - GLOBAL_SIGN: Certificates are issued by GlobalSign service. The
     *            users must provide their own GlobalSign account credentials. - CFSSL_AUTH: Certificates are issued by
     *            CFSSL authenticated signing service. The users must provide their own CFSSL host_url and credentials.
     * 
     */
    public void setIssuerType(CertificateIssuerType issuerType) {
        this.issuerType = issuerType;
    }

    /**
     * Gets certificate issuer name, unique per account.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets certificate issuer name, unique per account.
     * 
     * @param name
     *            Certificate issuer name, unique per account.
     */
    @Required
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Calculates the hash code of this instance based on field values.
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((issuerAttributes == null) ? 0 : issuerAttributes.hashCode());
        result = prime * result + ((issuerType == null) ? 0 : issuerType.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        final CertificateIssuer other = (CertificateIssuer) obj;
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (issuerAttributes == null) {
            if (other.issuerAttributes != null) {
                return false;
            }
        } else if (!issuerAttributes.equals(other.issuerAttributes)) {
            return false;
        }
        if (issuerType == null) {
            if (other.issuerType != null) {
                return false;
            }
        } else if (!issuerType.equals(other.issuerType)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "CertificateIssuer [createdAt=" + createdAt + ", description=" + description + ", id=" + id
               + ", issuerAttributes=" + issuerAttributes + ", issuerType=" + issuerType + ", name=" + name + "]";
    }

    /**
     * Checks whether the model is valid or not.
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return name != null;
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return something
     */
    @Override
    public CertificateIssuer clone() {
        return new CertificateIssuer(this);
    }
}
