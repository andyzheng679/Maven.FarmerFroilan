package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;

public class Pilot<T> extends Person implements Rider {
    private Boolean isFlying = false;

    public Pilot(String name) {
        super(name);
    }

    public Boolean getFlying() {
        return isFlying;
    }

    public void fly(T ride) {
        this.isFlying = true;
    }

    @Override
    public void eat(Produce food, int amount) {
        super.setHasEaten(true);
    }

<<<<<<< HEAD
=======
//    @Override
//    public boolean hasEaten() {
//        return false;
//    }
>>>>>>> f5f3cced6e4a4fb722b999bb59e1cb08a57466c6

    @Override
    public String makeNoise() {
        return "Hey! I am a Pilot";
    }

    @Override
    public boolean mount(Rideable ride) {
        ride.setIsMounted(ride);
        return ride.getIsMounted();

    }

    @Override
    public boolean ride(Rideable ride) {
        ride.setIsBeingRidden(ride);
        return ride.getIsBeingRidden();
    }

    @Override
    public boolean dismount(Rideable ride) {
        ride.setIsDismounted(ride);
        return ride.getIsDismounted();
    }

}

