package com.example.takeorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class OrderHistoryFragmentDirections {
  private OrderHistoryFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOrderHistoryFragmentToOrderDetailsFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderHistoryFragment_to_orderDetailsFragment);
  }
}
