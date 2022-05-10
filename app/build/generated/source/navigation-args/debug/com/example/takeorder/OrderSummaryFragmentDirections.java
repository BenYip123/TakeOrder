package com.example.takeorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class OrderSummaryFragmentDirections {
  private OrderSummaryFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOrderSummaryFragmentToOrderConfirmFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderSummaryFragment_to_orderConfirmFragment);
  }
}
