package com.arm.mbed.cloud.sdk.accountmanagement.adapters;

import com.arm.mbed.cloud.sdk.accountmanagement.model.Account;
import com.arm.mbed.cloud.sdk.accountmanagement.model.AccountStatus;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter.Mapper;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountInfo;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountInfo.StatusEnum;
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountUpdateReq;

@Preamble(description = "Adapter for account model")
@Internal
public final class AccountAdapter {

    private AccountAdapter() {
        super();
    }

    /**
     * Maps account objects.
     * 
     * @param accountInfo
     *            accountInfo.
     * @return an account.
     */
    public static Account map(AccountInfo accountInfo) {
        if (accountInfo == null) {
            return null;
        }
        final Account account = new Account(accountInfo.getId(), toStatus(accountInfo.getStatus()),
                TranslationUtils.toBool(accountInfo.getIsProvisioningAllowed(), true), accountInfo.getTier(),
                TranslationUtils.toDate(accountInfo.getCreatedAt()),
                TranslationUtils.toDate(accountInfo.getUpgradedAt()), accountInfo.getLimits(),
                accountInfo.getTemplateId());
        account.setDisplayName(accountInfo.getDisplayName());
        account.setContact(accountInfo.getContact());
        account.setCompany(accountInfo.getCompany());
        account.setPhoneNumber(accountInfo.getPhoneNumber());
        account.setPostCode(accountInfo.getPostalCode());
        account.setAddressLine1(accountInfo.getAddressLine1());
        account.setAddressLine2(accountInfo.getAddressLine2());
        account.setCity(accountInfo.getCity());
        account.setState(accountInfo.getState());
        account.setCountry(accountInfo.getCountry());
        account.setEmail(accountInfo.getEmail());
        account.setAliases(accountInfo.getAliases());
        return account;
    }

    /**
     * Gets mapper.
     * 
     * @return a mapper.
     */
    public static Mapper<AccountInfo, Account> getMapper() {
        return new Mapper<AccountInfo, Account>() {

            @Override
            public Account map(AccountInfo toBeMapped) {
                return AccountAdapter.map(toBeMapped);
            }

        };
    }

    private static AccountStatus toStatus(StatusEnum status) {
        AccountStatus correspondingStatus = null;
        switch (status) {
            case ACTIVE:
                correspondingStatus = AccountStatus.ACTIVE;
                break;
            case ENROLLING:
                correspondingStatus = AccountStatus.ENROLLING;
                break;
            case RESTRICTED:
                correspondingStatus = AccountStatus.RESTRICTED;
                break;
            case SUSPENDED:
                correspondingStatus = AccountStatus.SUSPENDED;
                break;
            default:
                correspondingStatus = AccountStatus.getDefault();
                break;
        }
        return correspondingStatus;
    }

    /**
     * Reverses mapping.
     * 
     * @param updateAccount
     *            an updated account.
     * @return an account update request.
     */
    public static AccountUpdateReq reverseMap(Account updateAccount) {
        if (updateAccount == null) {
            return null;
        }
        final AccountUpdateReq accountUpdateReq = new AccountUpdateReq();
        accountUpdateReq.setDisplayName(updateAccount.getDisplayName());
        accountUpdateReq.setAliases(updateAccount.getAliases());
        accountUpdateReq.setCompany(updateAccount.getCompany());
        accountUpdateReq.setContact(updateAccount.getContact());
        accountUpdateReq.setEmail(updateAccount.getEmail());
        accountUpdateReq.setPhoneNumber(updateAccount.getPhoneNumber());
        accountUpdateReq.setAddressLine1(updateAccount.getAddressLine1());
        accountUpdateReq.setAddressLine2(updateAccount.getAddressLine2());
        accountUpdateReq.setCity(accountUpdateReq.getCity());
        accountUpdateReq.setState(accountUpdateReq.getState());
        accountUpdateReq.setPostalCode(updateAccount.getPostCode());
        accountUpdateReq.setCountry(updateAccount.getCountry());
        return accountUpdateReq;
    }
}