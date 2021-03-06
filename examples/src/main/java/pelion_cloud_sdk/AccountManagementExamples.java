package pelion_cloud_sdk;

import static org.junit.Assert.fail;

import com.arm.mbed.cloud.sdk.AccountManagement;
import com.arm.mbed.cloud.sdk.accountmanagement.model.Account;
import com.arm.mbed.cloud.sdk.accountmanagement.model.ApiKey;
import com.arm.mbed.cloud.sdk.accountmanagement.model.ApiKeyListOptions;
import com.arm.mbed.cloud.sdk.accountmanagement.model.Group;
import com.arm.mbed.cloud.sdk.accountmanagement.model.GroupListOptions;
import com.arm.mbed.cloud.sdk.accountmanagement.model.User;
import com.arm.mbed.cloud.sdk.accountmanagement.model.UserListOptions;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;

import utils.AbstractExample;
import utils.Configuration;
import utils.Example;

public class AccountManagementExamples extends AbstractExample {
    /**
     * Gets details of the account associated with this API key.
     */
    @Example
    public void getAccount() {
        ConnectionOptions config = Configuration.get();
        AccountManagement api = new AccountManagement(config);
        try {
            Account thisAccount;
            thisAccount = api.getAccount();
            log("This account", thisAccount);
        } catch (Exception e) {
            logError("last API Metadata", api.getLastApiMetadata());
            fail(e.getMessage());
        }
    }

    /**
     * Lists the first 5 API Keys.
     */
    @SuppressWarnings("boxing")
    @Example
    public void listApiKeys() {
        ConnectionOptions config = Configuration.get();
        AccountManagement api = new AccountManagement(config);
        try {
            // Defining query options
            ApiKeyListOptions options = new ApiKeyListOptions();
            options.setLimit(5);
            // Listing API keys.
            Paginator<ApiKey> apikeys = api.listAllApiKeys(options);
            for (ApiKey apiKey : apikeys) {
                log("API key", apiKey);
            }
        } catch (Exception e) {
            logError("last API Metadata", api.getLastApiMetadata());
            fail(e.getMessage());
        }
    }

    /**
     * Lists the last 5 groups and their contents.
     */
    @SuppressWarnings("boxing")
    @Example
    public void listGroups() {
        ConnectionOptions config = Configuration.get();
        AccountManagement api = new AccountManagement(config);
        try {
            // Defining query options
            GroupListOptions options = new GroupListOptions();
            options.setLimit(5);
            options.setOrder(Order.DESC);
            // Listing groups.
            ListResponse<Group> groups = api.listGroups(options);
            for (Group group : groups.getData()) {
                log("Group", group);
                Paginator<ApiKey> apiKeyIterator = api.listAllGroupApiKeys(group.getId(), null);
                while (apiKeyIterator.hasNext()) {
                    log("API key of group [" + group.getId() + "]", apiKeyIterator.next());
                }
                Paginator<User> userIterator = api.listAllGroupUsers(group.getId(), null);
                while (userIterator.hasNext()) {
                    log("User of group [" + group.getId() + "]", userIterator.next());
                }
            }
        } catch (Exception e) {
            logError("last API Metadata", api.getLastApiMetadata());
            fail(e.getMessage());
        }
    }

    /**
     * Lists the first 5 active users.
     */
    @SuppressWarnings("boxing")
    @Example
    public void listUsers() {
        ConnectionOptions config = Configuration.get();
        AccountManagement api = new AccountManagement(config);
        try {
            // Defining query options
            UserListOptions options = new UserListOptions();
            options.setLimit(5);
            // Listing users.
            Paginator<User> users = api.listAllUsers(options);
            for (User user : users) {
                log("User", user);
            }
        } catch (Exception e) {
            logError("last API Metadata", api.getLastApiMetadata());
            fail(e.getMessage());
        }
    }

}
