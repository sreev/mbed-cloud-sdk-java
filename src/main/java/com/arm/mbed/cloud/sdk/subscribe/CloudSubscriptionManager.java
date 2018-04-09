package com.arm.mbed.cloud.sdk.subscribe;

import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateFilterOptions;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateObserver;

import io.reactivex.BackpressureStrategy;

@Preamble(description = "Definition of the subscription manager for Mbed Cloud")
public interface CloudSubscriptionManager extends SubscriptionManager {

    /**
     * Creates an observer {@link Observer } which listens to device state changes that verify the filter.
     *
     * @param filter
     *            to apply for this channel.
     * @param strategy
     *            backpressure strategy to apply to underlying communication channel. @see {@link BackpressureStrategy}
     * @return a registered observer which listens to some device state changes.
     */
    @Nullable
    DeviceStateObserver deviceState(@Nullable DeviceStateFilterOptions filter, @NonNull BackpressureStrategy strategy);
    // TODO the following
    // @Nullable
    // Object currentResourceValue(...)
    // Observer resourceValues();

}