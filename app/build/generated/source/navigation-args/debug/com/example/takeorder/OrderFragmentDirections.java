package com.example.takeorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class OrderFragmentDirections {
  private OrderFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOrderFragmentToOrderSummaryFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderFragment_to_orderSummaryFragment);
  }
}
