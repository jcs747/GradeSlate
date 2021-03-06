package com.gradeslate.gradeslate.backend;

import com.gradeslate.gradeslate.BuildConfig;
import java.io.Serializable;

public class Person implements Serializable {
    private String email = "Email";
    private String name = "Name";

    Person() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
