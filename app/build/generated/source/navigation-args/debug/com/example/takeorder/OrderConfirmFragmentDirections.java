package com.example.takeorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class OrderConfirmFragmentDirections {
  private OrderConfirmFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOrderConfirmFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderConfirmFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionOrderConfirmFragmentToOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderConfirmFragment_to_orderFragment);
  }

  @NonNull
  public static NavDirections actionOrderConfirmFragmentToOrderHistoryFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderConfirmFragment_to_orderHistoryFragment);
  }
}
