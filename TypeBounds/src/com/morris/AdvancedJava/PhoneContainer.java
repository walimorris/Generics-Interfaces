package com.morris.AdvancedJava;

import java.util.ArrayList;
import java.util.List;

public class PhoneContainer<T extends LandLinePhone> {
    private final int maxCapacity = 10;
    private final List<T> phoneContainer = new ArrayList<>(maxCapacity);

    public PhoneContainer() {
    }

    public String viewContainer() {
        if ( !isEmpty() ) {
            StringBuilder container = new StringBuilder();
            for (T phone : this.phoneContainer) {
                container.append(phone).append("\n");
            }
            return container.toString();
        }
        return "Empty Container";
    }

    public boolean isEmpty() {
        return this.phoneContainer.size() == 0;
    }

    public void addPhone(T phone) {
        if ( hasCapacity() ) {
            this.phoneContainer.add(phone);
        }
    }

    public boolean hasCapacity() {
        return this.phoneContainer.size() < this.maxCapacity;
    }
}
