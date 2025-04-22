package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Google;

public class GoogleUser {
    private Google google;

    public GoogleUser(Google google) {
        this.google = google;
        System.out.println("constr in User");
    }

    public void browse() {
        if (this.google != null) {
            System.out.println("not null");
            this.google.search();
        } else {
            System.out.println("null");
        }
    }
}
