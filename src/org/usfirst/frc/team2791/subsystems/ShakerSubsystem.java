package org.usfirst.frc.team2791.subsystems;

public abstract class ShakerSubsystem {

    abstract protected void init();

    abstract public void run();

    abstract public void update();

    abstract public void reset();

    abstract public void disable();
}