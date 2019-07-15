/*
 * Harmony Connect
 * An easy to use API that helps you access the Factom blockchain.
 *
 * OpenAPI spec version: 1.0.19
 * Contact: harmony-support@factom.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package harmony_connect_client.api;

import harmony_connect_client.ApiCallback;
import harmony_connect_client.ApiClient;
import harmony_connect_client.ApiException;
import harmony_connect_client.ApiResponse;
import harmony_connect_client.Configuration;
import harmony_connect_client.Pair;
import harmony_connect_client.ProgressRequestBody;
import harmony_connect_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import harmony_connect_client.model.AnchorLong;
import harmony_connect_client.model.ErrorMessage;
import harmony_connect_client.model.InlineResponse200;
import harmony_connect_client.model.ReceiptLong;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProofsApi {
    private ApiClient apiClient;

    public ProofsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProofsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAnchorbySearch
     * @param objectId Object identifier.  Used to identify an entry, chain, or block that has been published on the Factom blockchain. These objects can be identified by their hash, ID, height, or key Merkle root. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAnchorbySearchCall(String objectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/anchors/{object_id}"
            .replaceAll("\\{" + "object_id" + "\\}", apiClient.escapeString(objectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AppId", "AppKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAnchorbySearchValidateBeforeCall(String objectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'objectId' is set
        if (objectId == null) {
            throw new ApiException("Missing the required parameter 'objectId' when calling getAnchorbySearch(Async)");
        }
        

        com.squareup.okhttp.Call call = getAnchorbySearchCall(objectId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Object's Anchors
     * Retreive the blockchain anchors of an entry, chain, or block. Returns an array of anchors that may be of type ethereum, bitcoin, or factom. The valid identifiers for the objects that can be anchored are as follows:  * Entry - Entry Hash * Chain - Chain ID * Directory Block - Height or Key Merkle Root * Entry Block - Key Merkle Root * Factoid Block - Key Merkle Root
     * @param objectId Object identifier.  Used to identify an entry, chain, or block that has been published on the Factom blockchain. These objects can be identified by their hash, ID, height, or key Merkle root. (required)
     * @return AnchorLong
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnchorLong getAnchorbySearch(String objectId) throws ApiException {
        ApiResponse<AnchorLong> resp = getAnchorbySearchWithHttpInfo(objectId);
        return resp.getData();
    }

    /**
     * Get Object's Anchors
     * Retreive the blockchain anchors of an entry, chain, or block. Returns an array of anchors that may be of type ethereum, bitcoin, or factom. The valid identifiers for the objects that can be anchored are as follows:  * Entry - Entry Hash * Chain - Chain ID * Directory Block - Height or Key Merkle Root * Entry Block - Key Merkle Root * Factoid Block - Key Merkle Root
     * @param objectId Object identifier.  Used to identify an entry, chain, or block that has been published on the Factom blockchain. These objects can be identified by their hash, ID, height, or key Merkle root. (required)
     * @return ApiResponse&lt;AnchorLong&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnchorLong> getAnchorbySearchWithHttpInfo(String objectId) throws ApiException {
        com.squareup.okhttp.Call call = getAnchorbySearchValidateBeforeCall(objectId, null, null);
        Type localVarReturnType = new TypeToken<AnchorLong>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Object's Anchors (asynchronously)
     * Retreive the blockchain anchors of an entry, chain, or block. Returns an array of anchors that may be of type ethereum, bitcoin, or factom. The valid identifiers for the objects that can be anchored are as follows:  * Entry - Entry Hash * Chain - Chain ID * Directory Block - Height or Key Merkle Root * Entry Block - Key Merkle Root * Factoid Block - Key Merkle Root
     * @param objectId Object identifier.  Used to identify an entry, chain, or block that has been published on the Factom blockchain. These objects can be identified by their hash, ID, height, or key Merkle root. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAnchorbySearchAsync(String objectId, final ApiCallback<AnchorLong> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAnchorbySearchValidateBeforeCall(objectId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnchorLong>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getReceiptsbyEntry
     * @param entryHash The unique identitfier of the entry. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReceiptsbyEntryCall(String entryHash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/receipts/{entry_hash}"
            .replaceAll("\\{" + "entry_hash" + "\\}", apiClient.escapeString(entryHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AppId", "AppKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getReceiptsbyEntryValidateBeforeCall(String entryHash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entryHash' is set
        if (entryHash == null) {
            throw new ApiException("Missing the required parameter 'entryHash' when calling getReceiptsbyEntry(Async)");
        }
        

        com.squareup.okhttp.Call call = getReceiptsbyEntryCall(entryHash, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Entry's Receipts
     * Retrieve a receipt providing cryptographically verifiable proof that information was recorded in the Factom blockchain.
     * @param entryHash The unique identitfier of the entry. (required)
     * @return ReceiptLong
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReceiptLong getReceiptsbyEntry(String entryHash) throws ApiException {
        ApiResponse<ReceiptLong> resp = getReceiptsbyEntryWithHttpInfo(entryHash);
        return resp.getData();
    }

    /**
     * Get Entry's Receipts
     * Retrieve a receipt providing cryptographically verifiable proof that information was recorded in the Factom blockchain.
     * @param entryHash The unique identitfier of the entry. (required)
     * @return ApiResponse&lt;ReceiptLong&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReceiptLong> getReceiptsbyEntryWithHttpInfo(String entryHash) throws ApiException {
        com.squareup.okhttp.Call call = getReceiptsbyEntryValidateBeforeCall(entryHash, null, null);
        Type localVarReturnType = new TypeToken<ReceiptLong>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Entry's Receipts (asynchronously)
     * Retrieve a receipt providing cryptographically verifiable proof that information was recorded in the Factom blockchain.
     * @param entryHash The unique identitfier of the entry. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReceiptsbyEntryAsync(String entryHash, final ApiCallback<ReceiptLong> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getReceiptsbyEntryValidateBeforeCall(entryHash, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReceiptLong>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSearch
     * @param term The term that you are searching for. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID). (optional)
     * @param allowedStages When entered, filters chain and entry responses by immutability stage. Must be either &#x60;replicated&#x60;, &#x60;factom&#x60;, or &#x60;anchored&#x60;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSearchCall(String term, String allowedStages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (term != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("term", term));
        }

        if (allowedStages != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("allowed_stages", allowedStages));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AppId", "AppKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSearchValidateBeforeCall(String term, String allowedStages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSearchCall(term, allowedStages, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search
     * Search for something on the Factom blockchain. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID).
     * @param term The term that you are searching for. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID). (optional)
     * @param allowedStages When entered, filters chain and entry responses by immutability stage. Must be either &#x60;replicated&#x60;, &#x60;factom&#x60;, or &#x60;anchored&#x60;. (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 getSearch(String term, String allowedStages) throws ApiException {
        ApiResponse<InlineResponse200> resp = getSearchWithHttpInfo(term, allowedStages);
        return resp.getData();
    }

    /**
     * Search
     * Search for something on the Factom blockchain. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID).
     * @param term The term that you are searching for. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID). (optional)
     * @param allowedStages When entered, filters chain and entry responses by immutability stage. Must be either &#x60;replicated&#x60;, &#x60;factom&#x60;, or &#x60;anchored&#x60;. (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> getSearchWithHttpInfo(String term, String allowedStages) throws ApiException {
        com.squareup.okhttp.Call call = getSearchValidateBeforeCall(term, allowedStages, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * Search for something on the Factom blockchain. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID).
     * @param term The term that you are searching for. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID). (optional)
     * @param allowedStages When entered, filters chain and entry responses by immutability stage. Must be either &#x60;replicated&#x60;, &#x60;factom&#x60;, or &#x60;anchored&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSearchAsync(String term, String allowedStages, final ApiCallback<InlineResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSearchValidateBeforeCall(term, allowedStages, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}