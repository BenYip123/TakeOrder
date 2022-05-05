package com.example.takeorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class AdminFragmentDirections {
  private AdminFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAdminFragmentToAdminStaffFragment() {
    return new ActionOnlyNavDirections(R.id.action_adminFragment_to_adminStaffFragment);
  }

  @NonNull
  public static NavDirections actionAdminFragmentToAdminMenuFragment() {
    return new ActionOnlyNavDirections(R.id.action_adminFragment_to_adminMenuFragment);
  }
}
