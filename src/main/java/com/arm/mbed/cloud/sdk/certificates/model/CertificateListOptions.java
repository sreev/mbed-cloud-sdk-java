package com.arm.mbed.cloud.sdk.certificates.model;

import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ListOptions;

@Preamble(description = "Options to use when listing certificates")
public class CertificateListOptions extends ListOptions {

    public static final String OWNER_ID_FILTER = "ownerId";
    public static final String EXPIRES_FILTER = "expires";
    public static final String TYPE_FILTER = "type";

    public CertificateListOptions() {
        super();
    }

    /**
     * @return the Owner Id Filter
     */
    public @Nullable Object getOwnerIdFilter() {
        return fetchFilter(OWNER_ID_FILTER);
    }

    /**
     * @return the Type Filter
     */
    public @Nullable Object getTypeFilter() {
        return fetchFilter(TYPE_FILTER);
    }

    /**
     * @return the Expires Filter
     */
    public @Nullable Object getExpiresFilter() {
        return fetchFilter(EXPIRES_FILTER);
    }

    /**
     * @param ownerIdFilter
     *            the ownerIdFilter to set
     */
    public void setOwnerIdFilter(String ownerIdFilter) {
        addFilter(OWNER_ID_FILTER, ownerIdFilter);
    }

    /**
     * @param typeFiler
     *            the typeFiler to set
     */
    public void setTypeFilter(CertificateType typeFiler) {
        addFilter(TYPE_FILTER, typeFiler);
    }

    /**
     * @param expiresfilter
     *            the expiresfilter (in days) to set
     */
    @SuppressWarnings("boxing")
    public void setExpiresFilter(int expiresfilter) {
        addFilter(EXPIRES_FILTER, expiresfilter);
    }

    @SuppressWarnings("boxing")
    public Integer getExecutionModeFilter() {
        CertificateType type = (CertificateType) fetchFilter(TYPE_FILTER);
        if (type == null) {
            return null;
        }
        return (type == CertificateType.DEVELOPER) ? 1 : 0;
    }

}
