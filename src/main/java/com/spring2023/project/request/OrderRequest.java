package com.spring2023.project.request;

import jakarta.persistence.Column;
import org.springframework.lang.Nullable;

public class OrderRequest {
    @Nullable
    private long id;
    @Nullable
    private long employeeId;
    @Nullable
    private long customerId;
    @Nullable
    private long[] books;
}
