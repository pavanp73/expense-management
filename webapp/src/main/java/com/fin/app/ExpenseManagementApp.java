package com.fin.app;

import com.fin.app.config.ExpenseManagementConfig;
import com.fin.app.healthcheck.ExpenseManagementHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class  ExpenseManagementApp extends Application<ExpenseManagementConfig> {

    public static void main(String[] args) throws Exception {
        new ExpenseManagementApp().run("server");
    }

    @Override
    public void run(ExpenseManagementConfig expenseManagementConfig, Environment environment) throws Exception {
        environment.healthChecks().register("expense-management", new ExpenseManagementHealthCheck());
    }
}
