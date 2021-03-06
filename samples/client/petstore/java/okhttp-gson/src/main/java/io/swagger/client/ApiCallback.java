package io.swagger.client;

import java.io.IOException;

/**
 * Callback for asynchronous API call.
 *
 * @param <T> The return type
 */
public interface ApiCallback<T> {
  /**
   * This is called when the API call fails.
   */
  void onFailure(ApiException e);

  /**
   * This is called when the API call succeeded.
   *
   * @param result The result deserialized from response
   */
  void onSuccess(T result);
}
