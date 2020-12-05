package com.fin.app.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class ExpenseManagementHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
