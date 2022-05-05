package com.example.takeorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_orderFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToOrderHistoryFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_orderHistoryFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToAdminFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_adminFragment);
  }
}
