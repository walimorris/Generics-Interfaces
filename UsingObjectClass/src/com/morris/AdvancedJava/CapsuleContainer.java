package com.morris.AdvancedJava;

import java.util.ArrayList;
import java.util.List;

/**
 * A CapsuleContainer is a small space capsule capable of holding a capacity of five crew members
 * of any type(example: five Persons, five Dogs, etc...)
 * @param <T> : must declare the type of crew members aboard the capsule
 */
public class CapsuleContainer<T> {
    private final List<T> capsuleManifest = new ArrayList<>();
    private int maxCapsuleCapacity = 5;

    /**
     * If the CapsuleContainer contains crew members, prints all crew members to stdout.
     * Does nothing if CapsuleContainer contains no crew members.
     */
    public void revealCrew() {
        if ( hasCrewMembers() ) {
            for (T t : this.capsuleManifest) {
                System.out.println(t);
            }
        }
    }

    /**
     * Test whether CapsuleContainer is empty by way of the capsule manifest holding all members
     * @return : returns true if there are crew members aboard, false otherwise.
     */
    private boolean hasCrewMembers() {
        return !(this.capsuleManifest.isEmpty());
    }

    /**
     * Adds crew member to CapsuleContainer, first checks if capsule has enough capacity to add
     * any new members. If so, max capacity of capsule is decremented by 1.
     * @param t : member to add to CapsuleContainer
     * @throws RuntimeException : If capacity has been reached
     */
    public void addCrewMember(T t) throws RuntimeException {
        if ( !hasCapacity() ) {
            throw new RuntimeException("Capsule Capacity reached: max Capacity is 5");
        }
        this.capsuleManifest.add(t);
        this.maxCapsuleCapacity -= 1;
    }

    /**
     * Ensures there's capacity to fit crew member into the CapsuleContainer
     * @return : true or false
     */
    private boolean hasCapacity() {
        return !(this.maxCapsuleCapacity == 0);
    }

    /**
     * Releases all members on ConsuleContainer manifest.
     */
    public void releaseCapsuleManifest() {
        this.capsuleManifest.clear();
        this.maxCapsuleCapacity = 5;
    }
}
