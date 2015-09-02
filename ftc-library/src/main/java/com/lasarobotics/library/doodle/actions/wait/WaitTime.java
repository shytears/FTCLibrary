package com.lasarobotics.library.doodle.actions.wait;

import com.lasarobotics.library.doodle.DoodleRunData;
import com.lasarobotics.library.doodle.actions.Action;

/**
 * Waits a certain period of time
 */
public class WaitTime extends Action {

    long timems;

    public WaitTime(long ms)
    {
        super("Wait time");
    }

    public void run(DoodleRunData data)
    {
        try {
            Thread.sleep(timems);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public String toString()
    {
        return "Wait " + (float)timems + " milliseconds";
    }
}
